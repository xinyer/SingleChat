package com.wx.singlechat.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.wx.singlechat.AppApplication;
import com.wx.singlechat.di.component.ActivityComponent;
import com.wx.singlechat.di.component.ApplicationComponent;
import com.wx.singlechat.di.component.DaggerActivityComponent;

import butterknife.ButterKnife;

public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutResId());
        ButterKnife.bind(this);
    }

    public abstract int getLayoutResId();

    protected ApplicationComponent getApplicationComponent() {
        return ((AppApplication) getApplication()).getApplicationComponent();
    }

    protected ActivityComponent getActivityComponent() {
        return DaggerActivityComponent.builder()
                .applicationComponent(getApplicationComponent())
                .build();
    }

}
