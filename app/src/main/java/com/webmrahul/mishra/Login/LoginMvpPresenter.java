package com.webmrahul.mishra.Login;

import com.webmrahul.mishra.MvpPresenter;

public interface LoginMvpPresenter<V extends LoginMvpView> extends MvpPresenter<V> {

    void startLogin(String emailId);

}