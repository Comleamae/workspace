package com.green.Shop.item.controller;

import com.green.Shop.item.service.ItemServiceImpl;
import com.green.Shop.item.vo.ItemVO;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api-item")
@RestController
public class ItemController {
    @Resource(name = "itemService")
    private ItemServiceImpl itemService;

    @GetMapping("/list")
    List<ItemVO> getItemList(){
        return itemService.getItemList();
    }
}
