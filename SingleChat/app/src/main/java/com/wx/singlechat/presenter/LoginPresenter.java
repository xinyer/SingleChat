package com.wx.singlechat.presenter;

import com.tencent.TIMUser;
import com.tencent.mm.sdk.modelmsg.SendAuth;

public class LoginPresenter {

    public void sendWXReq() {
        SendAuth.Req req = new SendAuth.Req();
        req.scope = "";
        req.state = "";
    }

    public void login() {
        TIMUser user = new TIMUser();
        user.setAccountType("6902");
        user.setAppIdAt3rd("");
        user.setIdentifier("test001");
    }
}
