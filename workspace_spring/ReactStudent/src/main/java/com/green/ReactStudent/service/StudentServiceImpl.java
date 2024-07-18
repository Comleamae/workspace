package com.green.ReactStudent.service;

import com.green.ReactStudent.vo.StudentVO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("studentService")
public class StudentServiceImpl implements StudentService{

    @Autowired
    private SqlSessionTemplate sqlSession;

    //전체 학생목록
    @Override
    public List<StudentVO> getAllStu() {
        return sqlSession.selectList("stuMapper.getAllStu");
    }
    //학생 상세 정보
    @Override
    public StudentVO getOneStu(int stuNum) {
        return sqlSession.selectOne("stuMapper.getOneStu", stuNum);
    }

    //학생 등록
    @Override
    public void regStu(StudentVO studentVO) {
        sqlSession.insert("stuMapper.regStu", studentVO);
    }

    //학생 삭제
    @Override
    public void delStu(int stuNum) {
        sqlSession.delete("stuMapper.delStu", stuNum);
    }

    //성적
    @Override
    public StudentVO score(int stuNum) {
        return sqlSession.selectOne("stuMapper.score", stuNum);
    }

    //성적 수정
    @Override
    public void updateScore(StudentVO studentVO) {
        sqlSession.update("stuMapper.upScore", studentVO);
    }


}
