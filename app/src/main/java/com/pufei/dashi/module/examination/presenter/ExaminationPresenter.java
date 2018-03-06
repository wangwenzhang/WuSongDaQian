package com.pufei.dashi.module.examination.presenter;

import com.pufei.dashi.base.BasePresenter;
import com.pufei.dashi.module.examination.view.ExaminationView;

/**
 * 创建者： wangwenzhang 时间： 2018/3/5.
 */

public class ExaminationPresenter extends BasePresenter<ExaminationView> {
    public void loadData(){
        baseview.setData();
    }
}
