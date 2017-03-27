package com.wx.singlechat.view;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

import com.wx.singlechat.R;
import com.wx.singlechat.presenter.LoginPresenter;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.OnClick;

public class LoginActivity extends BaseActivity implements LoginViewInterface {

    @BindView(R.id.et_username)
    EditText etUsername;

    @BindView(R.id.et_password)
    EditText etPassword;

    @Inject
    LoginPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getActivityComponent().inject(this);
    }

    @Override
    public int getLayoutResId() {
        return R.layout.activity_login;
    }

    @OnClick(R.id.btn_login)
    public void login() {
        String username = etUsername.getText().toString();
        String password = etPassword.getText().toString();
        presenter.login(username, password);
    }

    @OnClick(R.id.tv_register)
    public void jumpToRegister() {
        Intent intent = new Intent(this, RegisterActivity.class);
        startActivity(intent);
    }

    @Override
    public void onLoginSuccess() {

    }

    @Override
    public void onLoginFail() {

    }
}
