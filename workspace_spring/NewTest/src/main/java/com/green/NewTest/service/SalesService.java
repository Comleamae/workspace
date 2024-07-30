package com.green.NewTest.service;

import com.green.NewTest.vo.CarVO;
import com.green.NewTest.vo.SalesVO;

import java.util.List;

public interface SalesService {

    //세일즈 리스트
    List<SalesVO> getSalesList();
    //세일즈 추가
    void regSales(SalesVO salesVO);
    //모든 리스트
    List<SalesVO> getAllList();
}
