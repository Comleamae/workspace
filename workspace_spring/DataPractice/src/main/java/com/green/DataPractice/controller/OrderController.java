package com.green.DataPractice.controller;

import com.green.DataPractice.vo.DeliverlyVO;
import com.green.DataPractice.vo.OrderVO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class OrderController {

    @GetMapping("/orderMain")
    public String goMain(){
        return "order";
    }

    @PostMapping("/order2")
    public String goOrder2(OrderVO orderVO){
        System.out.println(orderVO);
        return "delivery";
    }
    @PostMapping("/order3")
    public String goOrder3(DeliverlyVO deliverlyVO, OrderVO orderVO,Model model){
        System.out.println(deliverlyVO);
        int total = 10000 * orderVO.getMenuNum() + (orderVO.getMenuAdd().length) * 1000;
        model.addAttribute("total", total);
        return "order_info";
    }
}
