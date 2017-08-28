package com.example.jun.testapplication.struct;

/**
 * Created by 陈志军 on 2017/8/27.
 */

public abstract class FunctionNoParmasNoResult extends Function{
    public String functionName;

    public FunctionNoParmasNoResult(String functionName) {
        super(functionName);
    }
    public abstract   void  function();
}
