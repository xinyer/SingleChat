package com.wx.singlechat.login;


import dagger.Module;
import dagger.Provides;

@Module
public class LoginModule {

    private final LoginContract.View mView;

    public LoginModule(LoginContract.View view) {
        mView = view;
    }

    @Provides
    public LoginContract.View provideLoginContractView() {
        return mView;
    }
}
