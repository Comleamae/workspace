package com.green.Shop.item.service;

import com.green.Shop.item.vo.ItemVO;

import java.util.List;

public interface ItemService {
    //아이템 목록
    List<ItemVO> getItemList(int cateCode);
    //아이템 상세
    ItemVO itemDetail(int itemCode);

}
