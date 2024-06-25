package com.green.DataPractice.vo;

public class ReNameVO {
    private String name;
    private int telNum;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTelNum() {
        return telNum;
    }

    public void setTelNum(int telNum) {
        this.telNum = telNum;
    }

    @Override
    public String toString() {
        return "ReNameVO{" +
                "name='" + name + '\'' +
                ", telNum=" + telNum +
                '}';
    }
}
