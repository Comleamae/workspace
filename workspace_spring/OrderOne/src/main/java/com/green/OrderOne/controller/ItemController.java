package com.green.OrderOne.controller;

import com.green.OrderOne.service.ItemServiceImpl;
import com.green.OrderOne.vo.ItemVO;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ItemController {
    @Resource(name = "itemService")
    private ItemServiceImpl itemService;

    @GetMapping("/itemList")
    List<ItemVO> getAllItem(){
        return itemService.getAllItem();
    }
}
