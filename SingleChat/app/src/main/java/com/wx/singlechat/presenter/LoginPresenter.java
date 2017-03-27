package com.wx.singlechat.presenter;

import com.wx.singlechat.view.LoginViewInterface;

import javax.inject.Inject;


public class LoginPresenter {

    private static final String TAG = "LoginPresenter";

    private LoginViewInterface viewInterface;

    @Inject
    public LoginPresenter() {

    }

    public void setViewInterface(LoginViewInterface viewInterface) {
        this.viewInterface = viewInterface;
    }

    public void login(String identifier, String password) {
    }
}
