package com.green.OrderOne.vo;

import lombok.Data;

@Data
public class ItemVO {
    private int itemNum;
    private String itemName;
    private int itemPrice;
    private String seller;
    private String itemIntro;
    private String regDate;
}
