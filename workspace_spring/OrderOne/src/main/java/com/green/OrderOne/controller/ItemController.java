package com.green.OrderOne.controller;

import com.green.OrderOne.service.ItemServiceImpl;
import com.green.OrderOne.vo.ItemVO;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ItemController {
    @Resource(name = "itemService")
    private ItemServiceImpl itemService;

    @GetMapping("/itemList")
    List<ItemVO> getAllItem(){
        return itemService.getAllItem();
    }

    @GetMapping("/itemOne/{itemNum}")
    ItemVO getOneItem(@PathVariable int itemNum){
        return itemService.getOneItem(itemNum);
    }

    @PostMapping("/regItem")
    void regItem(@RequestBody ItemVO itemVO){
        itemService.regItem(itemVO);
    }
}
