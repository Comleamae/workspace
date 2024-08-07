package com.green.Shop.admin.service;

import com.green.Shop.item.vo.CategoryVO;
import com.green.Shop.item.vo.ItemVO;

import java.util.List;

public interface AdminService {
    //카테고리 전체를 받아와
    List<CategoryVO> getCateList();
    //상품 등록 쿼리
    void regItem(ItemVO itemVO);
    //아이템 삭제
    void deleteItem(int itemCode);
}
