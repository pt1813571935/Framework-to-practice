package com.umeng.frameworktopractice.base;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.umeng.frameworktopractice.interfaces.IBasePresenter;
import com.umeng.frameworktopractice.interfaces.IBaseView;

public abstract class BaseActivity<V extends IBaseView,P extends IBasePresenter> extends AppCompatActivity implements IBaseView {
    protected Context context;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayout());
        context = this;
        initView();
        initData();
    }
    //获取布局
    protected abstract int getLayout();

    //初始化布局
    protected abstract void initView();

    //初始化数据
    protected abstract void initData();

    //创建P
    protected abstract P persenter();

    @Override
    public void showError(String error) {

    }
}
