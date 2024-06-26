package com.green.DBTest.service;

//Impl = implements 데이터베이스에 대한 기능

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//TEST_MEMBER 테이블에 데이터를 조작하는 DB 작업을 하는 클래스
// MemberServiceImpl memberServiceImpl = new MemberServiceImpl();
@Service("memberService") //@Service("자동으로 만들어줄 객체명")
public class MemberServiceImpl implements MemberService {
    //SqlSessionTemplate 객체 : 쿼리 실행을 위한 메서드를 가지고 있는 객체
    //쿼리 실행을 위한 메서드 ->의 매개변수는 같다.
    //데이터 삽입(INSERT) : sqlSession.insert("쿼리가 있는 mapper 파일의 namespace.쿼리 id", [실행할 쿼리의 빈 값을 채울 데이터]);
    //데이터 삭제(DELETE) : sqlSession.delete("쿼리가 있는 mapper 파일의 namespace.쿼리 id", [실행할 쿼리의 빈 값을 채울 데이터]);
    //데이터 수정(UPDATE) : sqlSession.update("쿼리가 있는 mapper 파일의 namespace.쿼리 id", [실행할 쿼리의 빈 값을 채울 데이터]);
    //데이터 조회(SELECT) : sqlSession.selectOne("쿼리가 있는 mapper 파일의 namespace.쿼리 id", [실행할 쿼리의 빈 값을 채울 데이터]);
    //                    sqlSession.selectList("쿼리가 있는 mapper 파일의 namespace.쿼리 id", [실행할 쿼리의 빈 값을 채울 데이터]);

    @Autowired
    //MyBatis 안에 있는 클래스의 객체 선언만 함
    private SqlSessionTemplate sqlSession;

    //TEST_MEMBER 테이블에 데이터 1개 삽입
    @Override
    public void insertMember() {
        sqlSession.insert("memberMapper.insert1");
    }
    //TEST_MEMBER 테이블에 나이 데이터만 없는 데이터 1개 삽입
    @Override
    public void insertMember2() {
        //쿼리가 있는 mapper 파일의 namespace.쿼리 id
        sqlSession.insert("memberMapper.insert2", 20);
    }
}
