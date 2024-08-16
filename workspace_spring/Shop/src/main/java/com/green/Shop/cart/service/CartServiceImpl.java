package com.green.Shop.cart.service;

import com.green.Shop.cart.vo.CartVO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("cartService")
public class CartServiceImpl implements CartService {
    @Autowired
    private SqlSessionTemplate sqlSession;

    @Override
    public void regCart(CartVO cartVO) {
        sqlSession.insert("cartMapper.regCart", cartVO);
    }

    @Override
    public List<CartVO> getMyCart(String memId) {
        return sqlSession.selectList("cartMapper.getMyCart", memId);
    }

    @Override
    public void deleteCart(int cartCode) {
        sqlSession.delete("cartMapper.deleteCart", cartCode);
    }

    @Override
    public void updateCart(CartVO cartVO) {
        sqlSession.update("cartMapper.updateCart", cartVO);
    }

}
