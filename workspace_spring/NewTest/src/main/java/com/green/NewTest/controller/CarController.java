package com.green.NewTest.controller;

import com.green.NewTest.service.CarServiceImpl;
import com.green.NewTest.vo.CarVO;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/car")
@RestController
public class CarController {
    @Resource(name = "carService")
    private CarServiceImpl carService;

    @GetMapping("/list")
    public List<CarVO> getCarList(){
        return carService.getCarList();
    }
    @PostMapping("/reg")
    public void regCar(@RequestBody CarVO carVO){
        carService.regCar(carVO);
    }
}
