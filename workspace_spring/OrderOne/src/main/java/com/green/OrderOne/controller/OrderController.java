package com.green.OrderOne.controller;

import com.green.OrderOne.service.OrderServiceImpl;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
    @Resource(name = "orderService")
    private OrderServiceImpl orderService;
}
