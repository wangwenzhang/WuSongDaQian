package com.wangshen.daqian.api;

import com.wangshen.daqian.utils.RetrofitFactory;

import retrofit2.Retrofit;


/**
 * 该类用于调用网络请求并且返回相应的数据类
 * Created by wangwenzhang on 2017/11/9.
 */

public class ApiService {
    private static TestApi model;
    private static LoginApi loginApi;
    public static TestApi getBaseModle(){
        if (model==null){
            Retrofit retrofit = RetrofitFactory.getRetrofit();
            model = retrofit.create(TestApi.class);
        }
        return model;
    }
    public static LoginApi getLoginApi(){
        if (null==loginApi){
            Retrofit retrofit=RetrofitFactory.getRetrofit();
            loginApi=retrofit.create(LoginApi.class);
        }
        return loginApi;
    }
}
