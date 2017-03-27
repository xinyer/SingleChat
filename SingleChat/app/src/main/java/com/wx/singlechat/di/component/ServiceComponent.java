package com.wx.singlechat.di.component;

import com.wx.singlechat.di.Scopes;
import com.wx.singlechat.di.module.ServiceModule;

import dagger.Component;

@Scopes.Service
@Component(dependencies = {ApplicationComponent.class}, modules = {ServiceModule.class})
public interface ServiceComponent {
//    void inject(PusherService pusherService);

//    void inject(SwipeCardService swipeCardService);

//    void inject(NetworkCheckService networkCheckService);

//    void inject(LauncherService launcherService);
}
