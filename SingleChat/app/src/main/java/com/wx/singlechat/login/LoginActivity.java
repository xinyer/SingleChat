package com.wx.singlechat.login;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.wx.singlechat.AppApplication;
import com.wx.singlechat.R;
import com.wx.singlechat.base.BaseActivity;
import com.wx.singlechat.main.MainActivity;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.OnClick;

public class LoginActivity extends BaseActivity implements LoginContract.View {

    @BindView(R.id.et_username)
    EditText etUserName;

    @BindView(R.id.et_password)
    EditText etPassword;

    @Inject
    LoginPresenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        DaggerLoginComponent.builder()
                .loginModule(new LoginModule(this))
                .applicationComponent(((AppApplication) getApplication()).getApplicationComponent())
                .build().inject(this);
    }

    @Override
    public int getLayoutResId() {
        return R.layout.activity_login;
    }

    @OnClick(R.id.btn_login)
    public void login(View v) {
        String userName = etUserName.getText().toString();
        String password = etPassword.getText().toString();
        mPresenter.login(userName, password);
    }

    @Override
    public void loginSuccess() {
        Toast.makeText(this, "登录成功", Toast.LENGTH_SHORT).show();
        Intent mainIntent = new Intent(this, MainActivity.class);
        startActivity(mainIntent);
        finish();
    }

    @Override
    public void loginFail() {
        Toast.makeText(this, "登录成功", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void setPresenter(LoginContract.Presenter presenter) {

    }
}
