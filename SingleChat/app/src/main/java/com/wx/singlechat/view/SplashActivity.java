package com.wx.singlechat.view;

import android.content.Intent;
import android.os.Bundle;

import com.wx.singlechat.R;
import com.wx.singlechat.presenter.SplashPresenter;

import javax.inject.Inject;

public class SplashActivity extends BaseActivity implements SplashViewInterface {

    @Inject
    SplashPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getActivityComponent().inject(this);
        presenter.init();
        presenter.setViewInterface(this);
    }

    @Override
    public int getLayoutResId() {
        return R.layout.activity_splash;
    }

    @Override
    public void jumpToHome() {
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);
    }

    @Override
    public void jumpToLogin() {
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }
}
