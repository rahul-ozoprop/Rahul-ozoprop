package com.webmrahul.mishra.Main;

import com.webmrahul.mishra.MvpPresenter;

public interface MainMvpPresenter<V extends MainMvpView> extends MvpPresenter<V> {

    String getEmailId();

    void setUserLoggedOut();

}