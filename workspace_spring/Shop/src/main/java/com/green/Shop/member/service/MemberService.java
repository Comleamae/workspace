package com.green.Shop.member.service;

import com.green.Shop.member.vo.MemberVO;

import java.util.List;

public interface MemberService {
    //모든 멤버
    List<MemberVO> getAllMem();
    //중복 검사를 위한 하나 얻기
    MemberVO getOne(String memId);
    //로그인을 위한 하나 얻기
    MemberVO getLogin(MemberVO memberVO);
    //멤버 등록
    void regMem(MemberVO memberVO);

}
