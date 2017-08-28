package com.example.jun.testapplication.struct;

/**
 * Created by 陈志军 on 2017/8/27.
 */

public abstract class FunctionWithParmasOnly<Param> extends Function{
    public String functionName;

    public FunctionWithParmasOnly(String functionName) {
        super(functionName);
    }
    public abstract   void  function(Param a);
}
