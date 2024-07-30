package com.green.NewTest.controller;

import com.green.NewTest.service.SalesServiceImpl;
import com.green.NewTest.vo.SalesVO;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/sales")
@RestController
public class SalesController {
    @Resource(name = "salesService")
    private SalesServiceImpl salesService;

    @GetMapping("/list")
    List<SalesVO> getSalesList(){
        return salesService.getSalesList();
    }

    @GetMapping("/one/{modelNum}")
    SalesVO getOneSales(@PathVariable("modelNum") int modelNum){
        return salesService.getOneSales(modelNum);
    }

    @PostMapping("/reg")
    void regSales(@RequestBody SalesVO salesVO){
        salesService.regSales(salesVO);
    }

    @GetMapping("/allList")
    List<SalesVO> getAllList(){
        return salesService.getAllList();
    }
}
