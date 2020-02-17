package com.umeng.frameworktopractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.umeng.frameworktopractice.base.BaseActivity;
import com.umeng.frameworktopractice.interfaces.IBasePresenter;
import com.umeng.frameworktopractice.interfaces.data.Info;
import com.umeng.frameworktopractice.model.bean.InfoBean;
import com.umeng.frameworktopractice.persenter.InfoPersenter;

import java.util.List;

public class MainActivity extends BaseActivity<Info.V, Info.P> implements Info.V {


    private TextView tv;

    @Override
    protected int getLayout() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView() {
        tv = findViewById(R.id.tvv);
        tv.setText("测试控件");
    }





    @Override
    protected void initData() {
        percenter.getData();
    }

    @Override
    protected Info.P Createpersenter() {
        return new InfoPersenter();
    }

    @Override
    public void returnData(InfoBean infoBean) {
        List<InfoBean.DataBean.DatasBean> datas = infoBean.getData().getDatas();
        tv.setText(datas.get(0).getDesc());

    }
}
