package com.green.DataPractice.vo;

import java.util.Arrays;

public class OrderVO {
    private String menu;
    private int menuNum;
    private String[] menuAdd;
    private String tel;

    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

    public int getMenuNum() {
        return menuNum;
    }

    public void setMenuNum(int menuNum) {
        this.menuNum = menuNum;
    }

    public String[] getMenuAdd() {
        return menuAdd;
    }

    public void setMenuAdd(String[] menuAdd) {
        this.menuAdd = menuAdd;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    @Override
    public String toString() {
        return "OrderVO{" +
                "menu='" + menu + '\'' +
                ", menuNum=" + menuNum +
                ", menuAdd=" + Arrays.toString(menuAdd) +
                ", tel='" + tel + '\'' +
                '}';
    }
}
