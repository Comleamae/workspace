package com.green.DB_Score.service;

import com.green.DB_Score.vo.ScoreVO;
import org.springframework.stereotype.Service;

import java.util.List;


public interface ScoreService {
    //더하기만 하면서 리턴값 매개변수필요
    void insert(ScoreVO scoreVO);

    //학생 목록 조회
    List<ScoreVO> getStuList();

    //학생 상세 조회
    ScoreVO getStuDetail(int stuNum);

    //학생 상세 수정
    void updateStuDetail(ScoreVO scoreVO);

    //학생 정보 삭제
    void deleteStu(int stuNum);

}
