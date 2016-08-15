package com.wx.singlechat;

import android.app.Application;

import com.tencent.TIMManager;
import com.tencent.mm.sdk.openapi.IWXAPI;
import com.tencent.mm.sdk.openapi.WXAPIFactory;

public class AppApplication extends Application {

    public static String TENCENT_IM_SDK_APPID = "1400013433";
    public static String TENCENT_IM_ACCOUNT_TYPE = "6902";

    public static IWXAPI wxapi;

    @Override
    public void onCreate() {
        super.onCreate();
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
}
