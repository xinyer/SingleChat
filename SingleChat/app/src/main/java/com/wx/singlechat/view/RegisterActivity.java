package com.wx.singlechat.view;

import android.os.Bundle;
import android.widget.EditText;

import com.wx.singlechat.R;
import com.wx.singlechat.presenter.RegisterPresenter;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.OnClick;

public class RegisterActivity extends BaseActivity {

    @BindView(R.id.et_username)
    EditText etUsername;

    @BindView(R.id.et_password)
    EditText etPassword;

    @BindView(R.id.et_password_again)
    EditText etPasswordAgain;

    @Inject
    RegisterPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getActivityComponent().inject(this);
    }

    @OnClick(R.id.btn_register)
    public void register() {
        String username = etUsername.getText().toString();
        String password = etPassword.getText().toString();
        String passwordAgain = etPasswordAgain.getText().toString();

        presenter.register(username, password);
    }

    @Override
    public int getLayoutResId() {
        return R.layout.activity_register;
    }
}
