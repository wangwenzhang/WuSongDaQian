package com.wangshen.daqian.app;

import android.app.Application;
import android.content.Context;

import com.wangshen.daqian.utils.LogUtils;
import com.wangshen.daqian.utils.SharedPreferencesUtil;
import com.zhy.autolayout.config.AutoLayoutConifg;

/**
 * APP初始化类
 * Created by wangwenzhang on 2017/11/9.
 */

public class App extends Application {
    public static Context AppContext;
    @Override
    public void onCreate() {
        super.onCreate();
        LogUtils.isShow=true;
        AppContext = getApplicationContext();
        initPrefs();
        AutoLayoutConifg.getInstance().useDeviceSize();
    }
    /**
     * 初始化SharedPreference
     */
    protected void initPrefs() {
        SharedPreferencesUtil.init(getApplicationContext(), getPackageName() + "_preference", Context.MODE_MULTI_PROCESS);
    }
}
