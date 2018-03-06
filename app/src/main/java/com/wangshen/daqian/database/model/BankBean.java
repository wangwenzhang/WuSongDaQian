package com.wangshen.daqian.database.model;

import com.j256.ormlite.field.DatabaseField;

/**
 * 创建者： wangwenzhang 时间： 2018/3/2.
 */

public class BankBean {
    @DatabaseField(columnName = "id")
    private int id;
    @DatabaseField(columnName = "title")
    private String title;
    @DatabaseField(columnName = "options")
    private String options;
    @DatabaseField(columnName = "answer")
    private String answer;
    @DatabaseField(columnName = "img")
    private String img;
    @DatabaseField(columnName = "typeid")
    private int typeid;
    @DatabaseField(columnName = "cid")
    private int cid;
    @DatabaseField(columnName = "subject")
    private int subject;
    @DatabaseField(columnName = "analysis")
    private String analysis;
    @DatabaseField(columnName = "star")
    private int star;
    @DatabaseField(columnName = "errorrate")
    private float errorrate;

    public BankBean(int id, String title, String options, String answer, String img, int typeid, int cid, int subject, String analysis, int star, float errorrate) {
        this.id = id;
        this.title = title;
        this.options = options;
        this.answer = answer;
        this.img = img;
        this.typeid = typeid;
        this.cid = cid;
        this.subject = subject;
        this.analysis = analysis;
        this.star = star;
        this.errorrate = errorrate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getOptions() {
        return options;
    }

    public void setOptions(String options) {
        this.options = options;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public int getTypeid() {
        return typeid;
    }

    public void setTypeid(int typeid) {
        this.typeid = typeid;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public int getSubject() {
        return subject;
    }

    public void setSubject(int subject) {
        this.subject = subject;
    }

    public String getAnalysis() {
        return analysis;
    }

    public void setAnalysis(String analysis) {
        this.analysis = analysis;
    }

    public int getStar() {
        return star;
    }

    public void setStar(int star) {
        this.star = star;
    }

    public float getErrorrate() {
        return errorrate;
    }

    public void setErrorrate(float errorrate) {
        this.errorrate = errorrate;
    }
}
