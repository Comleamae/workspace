package com.green.DataPractice.vo;

import ch.qos.logback.core.model.INamedModel;

import javax.lang.model.element.Name;

public class Main2VO {
    private String grade;
    private String stNum;
    private String ndNum;
    private String gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public String getStNum() {
        return stNum;
    }

    public void setStNum(String stNum) {
        this.stNum = stNum;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getNdNum() {
        return ndNum;
    }

    public void setNdNum(String ndNum) {
        this.ndNum = ndNum;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }



    @Override
    public String toString() {
        return "Main2VO{" +
                "grade='" + grade + '\'' +
                ", stNum='" + stNum + '\'' +
                ", ndNum='" + ndNum + '\'' +
                ", gender='" + gender + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
