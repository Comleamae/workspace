package com.green.DataPractice.vo;

import java.util.Arrays;

public class ReEtcVo {
    private String grade;
    private String schoolName;
    private String how;

    private String liName;
    private String liDate;
    private String liWhere;

    private String comName;
    private String comWhat;
    private String[] during;

    private String intro;

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getHow() {
        return how;
    }

    public void setHow(String how) {
        this.how = how;
    }

    public String getLiName() {
        return liName;
    }

    public void setLiName(String liName) {
        this.liName = liName;
    }

    public String getLiDate() {
        return liDate;
    }

    public void setLiDate(String liDate) {
        this.liDate = liDate;
    }

    public String getLiWhere() {
        return liWhere;
    }

    public void setLiWhere(String liWhere) {
        this.liWhere = liWhere;
    }

    public String getComName() {
        return comName;
    }

    public void setComName(String comName) {
        this.comName = comName;
    }

    public String getComWhat() {
        return comWhat;
    }

    public void setComWhat(String comWhat) {
        this.comWhat = comWhat;
    }

    public String[] getDuring() {
        return during;
    }

    public void setDuring(String[] during) {
        this.during = during;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    @Override
    public String toString() {
        return "ReEtcVo{" +
                "grade='" + grade + '\'' +
                ", schoolName='" + schoolName + '\'' +
                ", how=" + how +
                ", liName='" + liName + '\'' +
                ", liDate='" + liDate + '\'' +
                ", liWhere='" + liWhere + '\'' +
                ", comName='" + comName + '\'' +
                ", comWhat='" + comWhat + '\'' +
                ", during=" + Arrays.toString(during) +
                ", intro='" + intro + '\'' +
                '}';
    }
}
