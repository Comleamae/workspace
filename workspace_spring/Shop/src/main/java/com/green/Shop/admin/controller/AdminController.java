package com.green.Shop.admin.controller;

import com.green.Shop.admin.service.AdminServiceImpl;
import com.green.Shop.item.vo.CategoryVO;
import com.green.Shop.item.vo.ItemVO;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api-admin")
@RestController
public class AdminController {
    @Resource(name = "adminService")
    private AdminServiceImpl adminService;

    @GetMapping("/cateList")
    List<CategoryVO> getCateList(){
       return adminService.getCateList();
    }

    @PostMapping("/regItem")
    void regItem(@RequestBody ItemVO itemVO){
        adminService.regItem(itemVO);
    }

    @DeleteMapping("/deleteItem/{itemCode}")
    void deleteItem(@PathVariable(name = "itemCode") int itemCode){
        adminService.deleteItem(itemCode);
    }
}
