package com.green.DB_Member.service;

import com.green.DB_Member.vo.MemberVO;

import java.util.List;

//인터페이스에서는 작성한 쿼리를 실행할 메서드를 정의
//매서드의 매개변수 : 실행할 쿼리에 빈값을 채워주는 데이터
//메서드의 리턴타입 : 쿼리 실행결과 데이터베이스에서 가져오는 데이터 타입
public interface DBService {

    //회원번호가 1인 회원의 이름을 조회하는 쿼리를 실행할 메서드
    String select1();

    //전달된 회원번호를 지닌 회원의 나이를 조회
    int select2(int memNum);

    //전달 받은 나이 이상인 회원들의 이름을 조회
    //조회받은 회원들의 이름을 리스트로 받아야함
    List<String> select3(int memAge);

    //전달 받은 회원 번호를 지닌 회원의 회원번호, 이름, 나이, 주소 조회
    MemberVO select4(int memNum);

    //모든 회원의 회원번호, 이름, 나이, 주소 조회
    List<MemberVO> select5();

    //delete, update, insert = 리턴 타입 : void or int(행의 갯수)
    //전달 받은 회원번호를 가진 회원을 삭제
    int delete(int memNum);

    void insert(MemberVO memberVO);

    int update(MemberVO memberVO);
}
