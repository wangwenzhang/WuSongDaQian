package com.wangshen.daqian.module.reference.ui.fragment;

import com.wangshen.daqian.base.BaseMvpFragment;
import com.wangshen.daqian.module.reference.presenter.ExercisePresenter;
import com.wangshen.daqian.module.reference.view.ExerciseView;

/**
 * 创建者： wangwenzhang 时间： 2018/3/5.
 */

public class ReferenceFragment extends BaseMvpFragment<ExercisePresenter> implements ExerciseView {
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
    public void setPresenter(ExercisePresenter presenter) {
        if (null==presenter){
            presenter=new ExercisePresenter();
        }
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
        return 0;
    }
}
