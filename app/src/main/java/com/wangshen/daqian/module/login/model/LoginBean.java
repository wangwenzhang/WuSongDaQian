package com.wangshen.daqian.module.login.model;

/**
 * Created by wangshen on 2018/3/20.
 */

public class LoginBean {
    private String masg;
    private int code;

    public LoginBean(String masg, int code) {
        this.masg = masg;
        this.code = code;
    }

    public String getMasg() {
        return masg;
    }

    public void setMasg(String masg) {
        this.masg = masg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
