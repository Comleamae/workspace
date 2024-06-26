package com.green.DB_Member.service;

import com.green.DB_Member.vo.MemberVO;

//TEST_MEMBER 테이블의 DB 조작 기능 정의
public interface MemberService {
    // INSERT, UPDATE, DELETE 의 리턴 타입은 int, void 중 하나 사용
    //


    //회원 목록 조회 SELECT

    //회원 상세 정보 조회 SELECT
    //회원 정보 등록 INSERT
    void insertMember(MemberVO memberVO);
    //회원 삭제 DELETE
    //회원 정보 수정 UPDATE
}
