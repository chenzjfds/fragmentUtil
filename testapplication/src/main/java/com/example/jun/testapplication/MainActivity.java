package com.example.jun.testapplication;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Bundle;
import android.widget.Toast;

import com.example.jun.testapplication.struct.FunctionNoParmasNoResult;
import com.example.jun.testapplication.struct.FunctionsManager;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void setFunctionForFragment(String tag, String interf) {
        FragmentManager fm = getFragmentManager();
        BaseFragment fraggment = (BaseFragment) fm.findFragmentByTag(tag);
        FunctionsManager  fragM=FunctionsManager.getInstance();
        fraggment.setFunctionManger(fragM);
        fragM.addFunction(new FunctionNoParmasNoResult(interf ) {
            @Override
            public void function() {
                Toast.makeText(MainActivity.this,"成功调用无参无返回接口",Toast.LENGTH_SHORT).show();;
            }
        });
    }
}
