package com.green.ReactStudent.service;

import com.green.ReactStudent.vo.StudentVO;

import java.util.List;

public interface StudentService {
    //전체 학생목록
    List<StudentVO> getAllStu();
    //학생 한명 상세 정보
    StudentVO getOneStu(int stuNum);
    //학생등록
    void regStu(StudentVO studentVO);
    //학생 삭제
    void delStu(int stuNum);
    //성적 세부조회
    StudentVO score(int stuNum);
    //성적 수정
    void updateScore(StudentVO studentVO);
}
