package com.umeng.frameworktopractice.base;

import com.umeng.frameworktopractice.interfaces.IBasePresenter;
import com.umeng.frameworktopractice.interfaces.IBaseView;

import java.lang.ref.WeakReference;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;

public class BasePresenter <V extends IBaseView> implements IBasePresenter<V> {
    protected V mView;

    //弱引用 view
    private WeakReference<V> weakReference;

    //rxjava2 数据加载的时候，界面回收一起的数据内存泄漏
    protected CompositeDisposable compositeDisposable;

    @Override
    public void attachView(V view) {
        weakReference = new WeakReference<>(view);
        this.mView = weakReference.get();
    }

    @Override
    public void detachView() {
        this.mView = null;
        unSubscribe();
    }
    //解绑观察者和被观察者
    protected void unSubscribe(){
        if(compositeDisposable != null){
            compositeDisposable.clear();
        }
    }
    //添加观察者和被观察者的操作类
    //Disposable
    protected void addSubscribe(Disposable disposable){
        if(compositeDisposable == null) compositeDisposable = new CompositeDisposable();
        compositeDisposable.add(disposable);
    }

}
