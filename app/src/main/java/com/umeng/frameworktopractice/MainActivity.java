package com.umeng.frameworktopractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.umeng.frameworktopractice.base.BaseActivity;
import com.umeng.frameworktopractice.interfaces.IBasePresenter;

public class MainActivity extends BaseActivity {


    @Override
    protected int getLayout() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initData() {

    }

    @Override
    protected IBasePresenter persenter() {
        return null;
    }
}
