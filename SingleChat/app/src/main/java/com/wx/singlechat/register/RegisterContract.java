package com.wx.singlechat.register;


import com.wx.singlechat.base.BasePresenter;
import com.wx.singlechat.base.BaseView;

public interface RegisterContract {

    interface View extends BaseView<Presenter> {

        void registerSuccess();

        void registerFail();
    }

    interface Presenter extends BasePresenter {

        void register(String userName, String password);
    }
}
