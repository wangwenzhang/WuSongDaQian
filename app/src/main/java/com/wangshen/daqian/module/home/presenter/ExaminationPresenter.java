package com.wangshen.daqian.module.home.presenter;

import com.wangshen.daqian.base.BasePresenter;
import com.wangshen.daqian.module.home.view.ExaminationView;

/**
 * 创建者： wangwenzhang 时间： 2018/3/5.
 */

public class ExaminationPresenter extends BasePresenter<ExaminationView> {
    public void loadData(){
        baseview.setData();
    }
}
