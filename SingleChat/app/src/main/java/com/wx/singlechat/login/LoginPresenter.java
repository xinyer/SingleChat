package com.wx.singlechat.login;

import android.support.annotation.NonNull;

import com.avos.avoscloud.AVException;
import com.avos.avoscloud.AVUser;
import com.avos.avoscloud.LogInCallback;
import com.avos.avoscloud.SignUpCallback;

import javax.inject.Inject;

class LoginPresenter implements LoginContract.Presenter {

    @NonNull
    private final LoginContract.View loginView;

    @Inject
    LoginPresenter(LoginContract.View loginView) {
        this.loginView = loginView;
    }

    @Inject
    void setupListener() {
        loginView.setPresenter(this);
    }

    @Override
    public void login(String userName, String password) {
        AVUser user = new AVUser();
        user.setUsername(userName);
        user.setPassword(password);
        AVUser.logInInBackground(userName, password, new LogInCallback<AVUser>() {
            @Override
            public void done(AVUser avUser, AVException e) {
                if (e == null) {
                    loginView.loginSuccess();
                } else {
                    loginView.loginFail();
                }
            }
        });
    }

}
