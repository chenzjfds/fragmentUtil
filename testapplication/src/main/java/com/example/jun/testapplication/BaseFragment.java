package com.example.jun.testapplication;

import android.app.Fragment;

import com.example.jun.testapplication.struct.FunctionsManager;

/**
 * Created by 陈志军 on 2017/8/27.
 */

public class BaseFragment extends Fragment {
    protected FunctionsManager mFunctionsManager;

    public void setFunctionManger(FunctionsManager functionManger) {
        this.mFunctionsManager = functionManger;
    }

}
