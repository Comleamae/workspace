package com.green.OrderOne.controller;

import com.green.OrderOne.service.OrderServiceImpl;
import com.green.OrderOne.vo.OrderVO;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OrderController {
    @Resource(name = "orderService")
    private OrderServiceImpl orderService;

    @GetMapping("/orderList")
    public List<OrderVO> getAllOrder(){
        return orderService.getAllOrder();
    }

    @GetMapping("/orderOne/{orderNum}")
    public OrderVO getOneOrder(@PathVariable int orderNum){
        return orderService.getOneOrder(orderNum);
    }

    @PostMapping("/regOrder")
    public void regOrder(@RequestBody OrderVO orderVO){
        orderService.regOrder(orderVO);
    }
}
