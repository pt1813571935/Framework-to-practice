package com.umeng.frameworktopractice.interfaces;

public interface IBasePresenter<V extends IBaseView> {
    void attachView(V view);

    void detachView();
}
