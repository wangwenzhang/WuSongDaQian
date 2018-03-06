package com.wangshen.daqian.base;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

import butterknife.ButterKnife;

/**
 * 创建者： wangwenzhang 时间： 2018/1/26.
 */

public abstract class BaseActivity extends Activity {
    protected String TAG=getClass().getSimpleName();
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayout());
        ButterKnife.bind(this);
        initView();
        getData();
        initListener();
    }

    /**
     * 初始化布局
     */
    public abstract void initView();

    /**
     * 获取数据
     */
    public abstract void getData();

    /**
     * 设置布局文件id
     * @return
     */
    public abstract int getLayout();
    /**
     * 设置控件点击事件
     */
    public abstract void initListener();
}
