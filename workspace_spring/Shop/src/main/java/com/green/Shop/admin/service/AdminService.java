package com.green.Shop.admin.service;

import com.green.Shop.item.vo.CategoryVO;
import com.green.Shop.item.vo.ItemVO;
import com.green.Shop.member.vo.MemberVO;

import java.util.List;

public interface AdminService {
    //카테고리 전체를 받아와
    List<CategoryVO> getCateList();
    //상품 등록 쿼리
    void regItem(ItemVO itemVO);
    //아이템 삭제
    void deleteItem(int itemCode);
    //이미지 등록
    void insertImgs(ItemVO itemVO);
    //다음에 들어갈 item_code 조회
    int getNextItemCode();
    //카테고리 등록
    void regCategory(CategoryVO categoryVO);
    //카테고리 삭제
    void deleteCategory(int cateCode);
    //전체 유저 얻기
    List<MemberVO> getAllUser();
}
