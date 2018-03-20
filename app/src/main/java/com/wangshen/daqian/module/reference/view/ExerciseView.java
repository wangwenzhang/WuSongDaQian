package com.wangshen.daqian.module.reference.view;

import com.wangshen.daqian.base.BaseView;

import com.wangshen.daqian.module.reference.presenter.ExercisePresenter;

/**
 * View都应该根据界面类型继承BaseView 跟 BaseListView,并且根据自身特点增加回调方法
 * Created by wangwenzhang on 2017/11/9.
 */

public interface ExerciseView extends BaseView<ExercisePresenter> {
  
}
