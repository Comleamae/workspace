package com.green.OrderOne.vo;

import lombok.Data;

@Data
public class OrderVO {
    private int orderNum;
    private String buyItemName;
    private int buyItemPrice;
    private String buyer;
    private int buyCnt;
    private int buyPrice;
    private String buyDate;
}
