package com.green.NewTest.service;

import com.green.NewTest.vo.CarVO;

import java.util.List;

public interface CarService {
    //전체 차 리스트
    List<CarVO> getCarList();
    //차 등록
    void regCar(CarVO carVO);
}
