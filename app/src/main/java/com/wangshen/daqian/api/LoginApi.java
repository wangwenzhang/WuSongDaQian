package com.wangshen.daqian.api;

import com.wangshen.daqian.module.login.model.LoginBean;
import com.wangshen.daqian.module.reference.model.FindModle;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by wangshen on 2018/3/20.
 */

public interface LoginApi {
    @GET("ww")
    Observable<LoginBean> getTestContent(@Query("page") String  page, @Query("pagesize") String pagesize);
}
