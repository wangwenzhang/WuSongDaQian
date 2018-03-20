package com.wangshen.daqian.module.login.activity;

import com.wangshen.daqian.R;
import com.wangshen.daqian.base.BaseMvpActivity;
import com.wangshen.daqian.module.login.presenter.LoginPresenter;
import com.wangshen.daqian.module.login.view.LoginView;

/**
 * Created by wangshen on 2018/3/20.
 */

public class LoginActivity extends BaseMvpActivity <LoginPresenter> implements LoginView{
    @Override
    public void onShowLoading() {

    }

    @Override
    public void onHideLoading() {

    }

    @Override
    public void onShowNetError() {

    }

    @Override
    public void setPresenter(LoginPresenter presenter) {

    }

    @Override
    public void onShowNoMore() {

    }

    @Override
    public void initView() {

    }

    @Override
    public void getData() {

    }

    @Override
    public int getLayout() {
        return R.layout.activity_login;
    }

    @Override
    public void loginResult() {

    }
}
