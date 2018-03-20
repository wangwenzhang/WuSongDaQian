package com.wangshen.daqian.module.login.presenter;

import com.wangshen.daqian.api.ApiService;
import com.wangshen.daqian.base.BasePresenter;
import com.wangshen.daqian.module.login.view.LoginView;

/**
 * Created by wangshen on 2018/3/20.
 */

public class LoginPresenter extends BasePresenter<LoginView> {
    public void login(String mobile,String password){
        ApiService.getLoginApi().getTestContent(mobile,password);
    }
}
