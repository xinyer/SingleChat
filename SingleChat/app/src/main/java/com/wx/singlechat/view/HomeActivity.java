package com.wx.singlechat.view;

import android.content.Intent;
import android.os.Bundle;

import com.wx.singlechat.R;

import butterknife.OnClick;

public class HomeActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public int getLayoutResId() {
        return R.layout.activity_home;
    }

    @OnClick(R.id.tv_register)
    public void jumpToRegister() {
        Intent intent = new Intent(this, RegisterActivity.class);
        startActivity(intent);
    }
}
