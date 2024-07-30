package com.green.NewTest.service;

import com.green.NewTest.vo.SalesVO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("salesService")
public class SalesServiceImpl implements SalesService {
    @Autowired
    private SqlSessionTemplate sqlSession;

    @Override
    public List<SalesVO> getSalesList() {
        return sqlSession.selectList("salesMapper.getSalesList");
    }

    @Override
    public void regSales(SalesVO salesVO) {
        sqlSession.insert("salesMapper.regSales", salesVO);
    }

    @Override
    public List<SalesVO> getAllList() {
        return sqlSession.selectList("salesMapper.getAllList");
    }
}
