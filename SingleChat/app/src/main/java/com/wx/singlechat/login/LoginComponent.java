package com.wx.singlechat.login;


import com.wx.singlechat.ApplicationComponent;
import com.wx.singlechat.base.ActivityScoped;

import dagger.Component;

@ActivityScoped
@Component(dependencies = ApplicationComponent.class, modules = LoginModule.class)
public interface LoginComponent {

    void inject(LoginActivity activity);
}
