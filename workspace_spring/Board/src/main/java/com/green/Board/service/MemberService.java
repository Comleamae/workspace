package com.green.Board.service;

import com.green.Board.vo.MemberVO;
import org.springframework.stereotype.Service;

import java.util.List;

public interface MemberService {

    //전체
    List<MemberVO> getAllMem();
    //개인
    MemberVO getOneMem(String memId);
    //중복검사
    boolean isGetOneMem(String memId);
    //회원가입
    void regMem(MemberVO memberVO);
    //중복검사
    MemberVO searchMem(MemberVO memberVO);
}
