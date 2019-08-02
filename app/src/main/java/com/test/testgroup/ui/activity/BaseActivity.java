package com.test.testgroup.ui.activity;

import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.v7.widget.Toolbar;
import android.widget.FrameLayout;

import com.arellomobile.mvp.MvpAppCompatActivity;
import com.test.testgroup.R;
import com.test.testgroup.ui.fragment.BaseFragment;

public abstract class BaseActivity extends MvpAppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_base);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FrameLayout parent = (FrameLayout) findViewById(R.id.main_wrapper);
        getLayoutInflater().inflate(getMainContentLayout(), parent);    }

    @LayoutRes
    protected abstract int getMainContentLayout();

    public void fragmetnOnScreen(BaseFragment fragment){

    };


}
