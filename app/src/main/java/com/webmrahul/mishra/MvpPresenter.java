package com.webmrahul.mishra;

public interface MvpPresenter<V extends MvpView> {

    void onAttach(V mvpView);

}