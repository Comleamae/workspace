package com.green.OrderOne.service;

import com.green.OrderOne.vo.OrderVO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("orderService")
public class OrderServiceImpl implements OrderService {
    @Autowired
    private SqlSessionTemplate sqlSession;


    @Override
    public List<OrderVO> getAllOrder() {
        return sqlSession.selectList("orderMapper.getAllOrder");
    }

    @Override
    public OrderVO getOneOrder(int orderNum) {
        return sqlSession.selectOne("orderMapper.getOneOrder", orderNum);
    }

    @Override
    public void regOrder(OrderVO orderVO) {
        sqlSession.insert("orderMapper.regOrder", orderVO);
    }


}
