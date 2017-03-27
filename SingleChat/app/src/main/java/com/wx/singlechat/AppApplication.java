package com.wx.singlechat;

import android.app.Application;

import com.wx.singlechat.di.component.ApplicationComponent;
import com.wx.singlechat.di.component.DaggerApplicationComponent;
import com.wx.singlechat.di.module.ApplicationModule;

public class AppApplication extends Application {

    private ApplicationComponent applicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        initializeInjector();
    }


    private void initializeInjector() {
        applicationComponent = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .build();
        applicationComponent.inject(this);
    }

    public ApplicationComponent getApplicationComponent() {
        return this.applicationComponent;
    }


}
