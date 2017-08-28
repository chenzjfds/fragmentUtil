package com.example.jun.testapplication.struct;

/**
 * Created by 陈志军 on 2017/8/27.
 */

public abstract class FunctionWithParmasAndResult<Param,Result> extends Function{
    public String functionName;

    public FunctionWithParmasAndResult(String functionName) {
        super(functionName);
    }
    public abstract   Result  function(Param a);
}
