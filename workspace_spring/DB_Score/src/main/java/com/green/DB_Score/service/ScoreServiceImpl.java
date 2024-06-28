package com.green.DB_Score.service;


import com.green.DB_Score.vo.ScoreVO;
import jakarta.annotation.Resource;
import org.apache.ibatis.jdbc.SQL;
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

    @Override
    public ScoreVO getStuDetail(int stuNum) {
        ScoreVO student= sqlSession.selectOne("scoreMapper.getStuDetail", stuNum);
        return student;
    }

    @Override
    public void updateStuDetail(ScoreVO scoreVO) {
        sqlSession.update("scoreMapper.updateStuDetail", scoreVO);
    }

    @Override
    public void deleteStu(int stuNum) {
        sqlSession.delete("scoreMapper.deleteStu", stuNum);
    }


}
