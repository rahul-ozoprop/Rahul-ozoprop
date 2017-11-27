package com.webmrahul.mishra.Base;

import com.webmrahul.mishra.DataManager;
import com.webmrahul.mishra.MvpPresenter;
import com.webmrahul.mishra.MvpView;

public class BasePresenter<V extends MvpView> implements MvpPresenter<V> {

    private V mMvpView;

    DataManager mDataManager;


    public BasePresenter(DataManager dataManager){
        mDataManager = dataManager;
    }

    @Override
    public void onAttach(V mvpView) {
        mMvpView = mvpView;
    }

    public V getMvpView() {
        return mMvpView;
    }

    public DataManager getDataManager() {
        return mDataManager;
    }
}