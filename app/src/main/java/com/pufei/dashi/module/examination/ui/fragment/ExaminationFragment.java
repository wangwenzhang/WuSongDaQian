package com.pufei.dashi.module.examination.ui.fragment;

import com.pufei.dashi.base.BaseMvpFragment;
import com.pufei.dashi.module.examination.presenter.ExaminationPresenter;
import com.pufei.dashi.module.examination.view.ExaminationView;

/**
 * 创建者： wangwenzhang 时间： 2018/3/5.
 */

public class ExaminationFragment extends BaseMvpFragment<ExaminationPresenter> implements ExaminationView{
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
    public void setPresenter(ExaminationPresenter presenter) {
        if (null==presenter){
            this.presenter=new ExaminationPresenter();
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

    @Override
    public void setData() {

    }
}
