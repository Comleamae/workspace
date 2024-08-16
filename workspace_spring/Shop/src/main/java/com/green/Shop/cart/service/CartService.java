package com.green.Shop.cart.service;

import com.green.Shop.cart.vo.CartVO;

import java.util.List;

public interface CartService {
    //장바구니 추가
    void regCart(CartVO cartVO);
    //장바구니 리스트
    List<CartVO> getMyCart(String memId);
    //장바구니 버튼삭제
    void deleteCart(int cartCode);
    //장바구니 수정
    void updateCart(CartVO cartVO);
}
