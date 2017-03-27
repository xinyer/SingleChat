package com.wx.singlechat.di.component;

import com.wx.singlechat.di.Scopes;
import com.wx.singlechat.di.module.ReceiverModule;

import dagger.Component;

@Scopes.Receiver
@Component(dependencies = ApplicationComponent.class, modules = {ReceiverModule.class})
public interface ReceiverComponent {

//    void inject(PusherReceiver receiver);

//    void inject(MessageReceiver receiver);

//    void inject(AppStatusChangeReceiver appStatusChangeReceiver);

//    void inject(DIOReceiver receiver);
}
