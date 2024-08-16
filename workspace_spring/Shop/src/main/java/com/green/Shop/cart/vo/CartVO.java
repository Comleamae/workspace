package com.green.Shop.cart.vo;

import com.green.Shop.item.vo.ItemVO;
import com.green.Shop.member.vo.MemberVO;
import lombok.Data;

@Data
public class CartVO {
    private int cartCode;
    private int cartCnt;
    private String cartDate;
    private int itemCode;
    private String memId;
    private ItemVO itemVO;
    private MemberVO memberVO;
}
