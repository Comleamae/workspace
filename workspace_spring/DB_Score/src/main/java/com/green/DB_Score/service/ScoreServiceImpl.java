package com.green.DB_Score.service;


import com.green.DB_Score.vo.ScoreVO;
import jakarta.annotation.Resource;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("scoreService")
public class ScoreServiceImpl implements ScoreService{

    @Autowired
    private SqlSessionTemplate sqlSession;

    @Override
    public void insert(ScoreVO scoreVO) {
        sqlSession.insert("scoreMapper.regStu", scoreVO);
    }

    @Override
    public List<ScoreVO> getStuList() {

        List<ScoreVO> list = sqlSession.selectList("scoreMapper.getStuList");
        return list;
    }


}
