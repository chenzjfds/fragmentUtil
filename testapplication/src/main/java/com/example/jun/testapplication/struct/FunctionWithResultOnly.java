package com.example.jun.testapplication.struct;

/**
 * Created by 陈志军 on 2017/8/27.
 */

public abstract class FunctionWithResultOnly<Param> extends Function{
    public String functionName;

    public FunctionWithResultOnly(String functionName) {
        super(functionName);
    }
    public abstract   Param  function();
}
