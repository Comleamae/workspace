package com.green.practice.service;

import com.green.practice.vo.PracticeVO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("practiceService")
public class PracticeServiceImpl implements PracticeService{

    @Autowired
    private SqlSessionTemplate sqlSession;


    @Override
    public List<PracticeVO> getSubjectList() {
        List<PracticeVO> getSubject = sqlSession.selectList("practiceMapper.getSubjectList");
        return List.of();
    }
}
