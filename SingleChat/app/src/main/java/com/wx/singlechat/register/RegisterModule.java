package com.wx.singlechat.register;


import dagger.Module;
import dagger.Provides;

@Module
public class RegisterModule {

    private final RegisterContract.View mView;

    public RegisterModule(RegisterContract.View view) {
        mView = view;
    }

    @Provides
    public RegisterContract.View provideRegisterContractView() {
        return mView;
    }
}
