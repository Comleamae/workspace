package com.green.ShopParc.member.service;

import com.green.ShopParc.member.vo.MemberVO;

import java.util.List;
import java.util.Map;

public interface MemberService {
    //모든 멤버
    List<MemberVO> getAllMem();
    //중복 검사를 위한 하나 얻기
    MemberVO getOne(String memId);
    //로그인을 위한 하나 얻기
    MemberVO getOneMem(MemberVO memberVO);
    //멤버 등록
    void regMem(MemberVO memberVO);

}
