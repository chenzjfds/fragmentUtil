package com.example.jun.testapplication.struct;

import android.text.TextUtils;

import java.util.HashMap;

/**
 * Created by 陈志军 on 2017/8/27.
 */

public class FunctionsManager {
    private HashMap<String, FunctionNoParmasNoResult> mFunctionNoParmasNoResult;
    private HashMap<String, FunctionWithParmasAndResult> mFunctionWithParmasAndResult;
    private HashMap<String, FunctionWithParmasOnly> mFunctionWithParmasOnly;
    private HashMap<String, FunctionWithResultOnly> mFunctionWithResultOnly;
    private static FunctionsManager  instance;

    public static FunctionsManager getInstance() {
        if(instance==null){
            instance=new FunctionsManager();
        }
        return instance;
    }

    private FunctionsManager() {
        mFunctionNoParmasNoResult = new HashMap<>();
        mFunctionWithParmasAndResult = new HashMap<>();
        mFunctionWithParmasOnly = new HashMap<>();
        mFunctionWithResultOnly = new HashMap<>();
    }

    public FunctionsManager addFunction(FunctionNoParmasNoResult function) {
        mFunctionNoParmasNoResult.put(function.functionName, function);
        return this;
    }

    public FunctionsManager addFunction(FunctionWithParmasAndResult function) {
        mFunctionWithParmasAndResult.put(function.functionName, function);
        return this;
    }

    public FunctionsManager addFunction(FunctionWithParmasOnly function) {
        mFunctionWithParmasOnly.put(function.functionName, function);
        return this;
    }

    public FunctionsManager addFunction(FunctionWithResultOnly function) {
        mFunctionWithResultOnly.put(function.functionName, function);
        return this;
    }

    public void invokeFunction(String name) {
        if (TextUtils.isEmpty(name)) return;
        if (mFunctionNoParmasNoResult != null) {
            FunctionNoParmasNoResult f = mFunctionNoParmasNoResult.get(name);
            if (f == null){
                try {
                    throw new FunctionException("Has no this  function:"+name);
                } catch (FunctionException e) {
                    e.printStackTrace();
                }
                return;
            }
            f.function();
        }

    }
}
