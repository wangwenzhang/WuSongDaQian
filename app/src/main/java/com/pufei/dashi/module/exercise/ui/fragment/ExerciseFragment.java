package com.pufei.dashi.module.exercise.ui.fragment;

import com.pufei.dashi.base.BaseMvpFragment;
import com.pufei.dashi.module.examination.view.ExaminationView;
import com.pufei.dashi.module.exercise.presenter.ExercisePresenter;
import com.pufei.dashi.module.exercise.view.ExerciseView;

/**
 * 创建者： wangwenzhang 时间： 2018/3/5.
 */

public class ExerciseFragment extends BaseMvpFragment<ExercisePresenter> implements ExerciseView {
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
