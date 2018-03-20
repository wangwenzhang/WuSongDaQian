package com.wangshen.daqian.module.login.view;

import com.wangshen.daqian.base.BaseView;
import com.wangshen.daqian.module.login.presenter.LoginPresenter;

/**
 * Created by wangshen on 2018/3/20.
 */

public interface LoginView extends BaseView<LoginPresenter> {
    void loginResult();
}
