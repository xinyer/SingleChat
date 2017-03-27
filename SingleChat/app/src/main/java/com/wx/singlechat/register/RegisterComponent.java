package com.wx.singlechat.register;


import com.wx.singlechat.ApplicationComponent;
import com.wx.singlechat.base.ActivityScoped;

import dagger.Component;

@ActivityScoped
@Component(dependencies = ApplicationComponent.class, modules = RegisterModule.class)
public interface RegisterComponent {

    void inject(RegisterActivity activity);
}
