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

    @GetMapping("/list/{form}")
    List<ItemVO> getItemList(@PathVariable("form") int cateCode){
        return itemService.getItemList(cateCode);
    }

    @GetMapping("/detail/{itemCode}")
    ItemVO itemDetail(@PathVariable("itemCode") int itemCode){
        return itemService.itemDetail(itemCode);
    }

}
