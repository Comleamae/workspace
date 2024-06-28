package com.green.practice.service;

import com.green.practice.vo.PracticeVO;

import java.util.List;

public interface PracticeService {
    //모든 실험목록을 보여주는 인터페이스
    List<PracticeVO> getSubjectList ();

}
