package com.wx.singlechat.di;

import android.content.Context;

import com.wx.singlechat.view.BaseActivity;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {
    void inject(BaseActivity baseActivity);

    Context context();
//    ThreadExecutor threadExecutor();
//    PostExecutionThread postExecutionThread();
//    UserRepository userRepository();
}

