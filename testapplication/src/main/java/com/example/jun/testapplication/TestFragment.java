package com.example.jun.testapplication;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by 陈志军 on 2017/8/27.
 */

public class TestFragment extends BaseFragment {
    public static final String INTERFACE = TestFragment.class.getName() + "NPNR";
    private MainActivity mainActivity;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        if (activity instanceof MainActivity) {
            mainActivity = (MainActivity) activity;
            mainActivity.setFunctionForFragment(getTag(), INTERFACE);
        }
    }
}
