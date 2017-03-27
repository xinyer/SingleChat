package com.wx.singlechat.register;

import android.support.annotation.NonNull;

import com.avos.avoscloud.AVException;
import com.avos.avoscloud.AVUser;
import com.avos.avoscloud.SignUpCallback;

import javax.inject.Inject;

class RegisterPresenter implements RegisterContract.Presenter {

    @NonNull
    private final RegisterContract.View registerView;

    @Inject
    RegisterPresenter(RegisterContract.View registerView) {
        this.registerView = registerView;
    }

    @Inject
    void setupListener() {
        registerView.setPresenter(this);
    }

    @Override
    public void register(String userName, String password) {
        AVUser user = new AVUser();
        user.setUsername(userName);
        user.setPassword(password);
        user.signUpInBackground(new SignUpCallback() {
            @Override
            public void done(AVException e) {
                if (e == null) {
                    registerView.registerSuccess();
                } else {
                    registerView.registerFail();
                }
            }
        });
    }

    @Override
    public void start() {

    }
}
