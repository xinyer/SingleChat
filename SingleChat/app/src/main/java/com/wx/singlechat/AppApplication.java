package com.wx.singlechat;

import android.app.Application;

import com.avos.avoscloud.AVOSCloud;

public class AppApplication extends Application {

    private ApplicationComponent applicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        initializeInjector();
        init();
    }

    private void init() {
        AVOSCloud.initialize(this, "R36OkJjtuztK6wv4J91wOjQ5-gzGzoHsz", "pgGO8nT0gOt9uiopQO4hqaS4");
        AVOSCloud.setDebugLogEnabled(true);
    }

    private void initializeInjector() {
        applicationComponent = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .build();
    }

    public ApplicationComponent getApplicationComponent() {
        return this.applicationComponent;
    }


}
