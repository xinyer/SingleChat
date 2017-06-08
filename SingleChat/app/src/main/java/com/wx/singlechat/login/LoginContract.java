package com.wx.singlechat.login;


import com.wx.singlechat.base.BasePresenter;
import com.wx.singlechat.base.BaseView;

public interface LoginContract {

    interface View extends BaseView<Presenter> {

        void loginSuccess();

        void loginFail();
    }

    interface Presenter extends BasePresenter {

        void login(String userName, String password);

    }
}
