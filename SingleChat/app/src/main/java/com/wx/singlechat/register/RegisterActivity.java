package com.wx.singlechat.register;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

import com.wx.singlechat.AppApplication;
import com.wx.singlechat.R;
import com.wx.singlechat.base.BaseActivity;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.OnClick;

public class RegisterActivity extends BaseActivity implements RegisterContract.View {

    @BindView(R.id.et_username)
    EditText etUsername;

    @BindView(R.id.et_password)
    EditText etPassword;

    @BindView(R.id.et_password_again)
    EditText etPasswordAgain;

    @Inject
    RegisterPresenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        DaggerRegisterComponent.builder()
                .registerModule(new RegisterModule(this))
                .applicationComponent(((AppApplication) getApplication()).getApplicationComponent())
                .build().inject(this);
    }

    @OnClick(R.id.btn_register)
    public void register() {
        String username = etUsername.getText().toString();
        String password = etPassword.getText().toString();
        String passwordAgain = etPasswordAgain.getText().toString();
        mPresenter.register(username, password);
    }

    @Override
    public int getLayoutResId() {
        return R.layout.activity_register;
    }

    @Override
    public void registerSuccess() {
        Toast.makeText(this, "注册成功", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void registerFail() {
        Toast.makeText(this, "注册失败" , Toast.LENGTH_SHORT).show();
    }

    @Override
    public void setPresenter(RegisterContract.Presenter presenter) {

    }
}
