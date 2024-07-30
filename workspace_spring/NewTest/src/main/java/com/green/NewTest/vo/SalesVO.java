package com.green.NewTest.vo;

import lombok.Data;

import java.util.List;

@Data
public class SalesVO {
    private int salesNum;
    private String salesName;
    private String salesTel;
    private String color;
    private String salesDate;
    private int modelNum;
    private List<CarVO> carVO;
}
