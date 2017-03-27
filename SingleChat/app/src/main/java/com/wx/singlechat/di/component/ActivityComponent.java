package com.wx.singlechat.di.component;

import com.wx.singlechat.di.Scopes;
import com.wx.singlechat.di.module.ActivityModule;
import com.wx.singlechat.view.HomeActivity;
import com.wx.singlechat.view.LoginActivity;
import com.wx.singlechat.view.RegisterActivity;
import com.wx.singlechat.view.SplashActivity;

import dagger.Component;

@Scopes.Activity
@Component(dependencies = ApplicationComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {

    void inject(HomeActivity activity);

    void inject(SplashActivity activity);

    void inject(LoginActivity activity);

    void inject(RegisterActivity activity);
}