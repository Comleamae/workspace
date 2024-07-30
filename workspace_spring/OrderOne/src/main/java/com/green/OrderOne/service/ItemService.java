package com.green.OrderOne.service;

import com.green.OrderOne.vo.ItemVO;

import java.util.List;

public interface ItemService {

    //전체 아이템
    List<ItemVO> getAllItem();

    //하나의 아이템
    ItemVO getOneItem(int itemNum);

    //아이템 추가
    void regItem(ItemVO itemVO);
}
