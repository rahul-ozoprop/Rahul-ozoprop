package com.webmrahul.mishra.Splash;

import com.webmrahul.mishra.MvpPresenter;

public interface SplashMvpPresenter<V extends SplashMvpView> extends MvpPresenter<V> {

    void decideNextActivity();

}