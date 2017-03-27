package com.wx.singlechat.presenter;

import android.content.Context;
import android.os.Handler;

import com.wx.singlechat.view.SplashViewInterface;

import javax.inject.Inject;

public class SplashPresenter {

    private Context context;
    private Handler handler;
    private SplashViewInterface viewInterface;

    @Inject
    public SplashPresenter(Context context,
                           Handler handler) {
        this.context = context;
        this.handler = handler;
    }

    public void setViewInterface(SplashViewInterface viewInterface) {
        this.viewInterface = viewInterface;
    }

    public void init(){
        if (hasLogin()) {
            handler.postDelayed(() -> viewInterface.jumpToHome(), 1000);
        } else {
            handler.postDelayed(() -> viewInterface.jumpToLogin(), 1000);
        }
    }

    private boolean hasLogin() {
        return false;
    }


}
