package com.green.DataPractice.vo;

public class Main3VO {
    private int krScore;
    private int enScore;
    private int maScore;

    private String grade;
    private String stNum;
    private String ndNum;
    private String gender;

    private String name;

    public int getKrScore() {
        return krScore;
    }

    public void setKrScore(int krScore) {
        this.krScore = krScore;
    }

    public int getEnScore() {
        return enScore;
    }

    public void setEnScore(int enScore) {
        this.enScore = enScore;
    }

    public int getMaScore() {
        return maScore;
    }

    public void setMaScore(int maScore) {
        this.maScore = maScore;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getStNum() {
        return stNum;
    }

    public void setStNum(String stNum) {
        this.stNum = stNum;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Main3VO{" +
                "krScore=" + krScore +
                ", enScore=" + enScore +
                ", maScore=" + maScore +
                ", grade='" + grade + '\'' +
                ", stNum='" + stNum + '\'' +
                ", ndNum='" + ndNum + '\'' +
                ", gender='" + gender + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
