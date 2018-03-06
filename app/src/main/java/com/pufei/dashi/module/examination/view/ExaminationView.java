package com.pufei.dashi.module.examination.view;

import com.pufei.dashi.base.BaseView;
import com.pufei.dashi.module.examination.presenter.ExaminationPresenter;

/**
 * 创建者： wangwenzhang 时间： 2018/3/5.
 */

public interface ExaminationView extends BaseView<ExaminationPresenter> {
    void setData();
}
