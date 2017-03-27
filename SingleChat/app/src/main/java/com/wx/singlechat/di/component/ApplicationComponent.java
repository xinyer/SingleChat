package com.wx.singlechat.di.component;

import android.content.Context;
import android.os.Handler;

import com.wx.singlechat.AppApplication;
import com.wx.singlechat.di.module.ApplicationModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    void inject(AppApplication appApplication);

    Context context();

    Handler handler();

}

