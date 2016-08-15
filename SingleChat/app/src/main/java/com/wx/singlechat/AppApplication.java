package com.wx.singlechat;

import android.app.Application;

import com.tencent.TIMManager;
import com.tencent.mm.sdk.openapi.IWXAPI;
import com.tencent.mm.sdk.openapi.WXAPIFactory;
import com.wx.singlechat.di.ApplicationComponent;
import com.wx.singlechat.di.ApplicationModule;
import com.wx.singlechat.di.DaggerApplicationComponent;

public class AppApplication extends Application {

    public static String TENCENT_IM_SDK_APPID = "1400013433";
    public static String TENCENT_IM_ACCOUNT_TYPE = "6902";

    public static IWXAPI wxapi;
    private ApplicationComponent applicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        initializeInjector();
//        initTencentIMSDK();
//        registerWXApi();
    }

    private void initTencentIMSDK() {
        TIMManager.getInstance().init(this);
    }

    private void registerWXApi() {
        wxapi = WXAPIFactory.createWXAPI(this, "", true);
        wxapi.registerApp("");
    }


    private void initializeInjector() {
        this.applicationComponent = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .build();
    }

    public ApplicationComponent getApplicationComponent() {
        return this.applicationComponent;
    }
}
