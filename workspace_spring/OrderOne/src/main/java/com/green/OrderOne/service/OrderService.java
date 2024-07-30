package com.green.OrderOne.service;

import com.green.OrderOne.vo.OrderVO;

import java.util.List;

public interface OrderService {

    List<OrderVO> getAllOrder();

    OrderVO getOneOrder(int orderNum);

    void regOrder(OrderVO orderVO);
}
