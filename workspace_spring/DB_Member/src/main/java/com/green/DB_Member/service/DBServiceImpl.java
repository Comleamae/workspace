package com.green.DB_Member.service;

import com.green.DB_Member.vo.MemberVO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.w3c.dom.NameList;

import java.util.List;

@Service("dbService")
public class DBServiceImpl implements DBService {
    //쿼리의 기능을 가져오는 사전 생성된 객체
    @Autowired
    private SqlSessionTemplate sqlSession;

    //실행할 쿼리가 select면 selectOne(), selectList() 메서드 중 하나 사용
    //조회 결과 데이터가 0행 or 1행이면 selectOne() 사용
    //조회 결과 데이터의 행 개수가 고정되지 않으면 selectList() 사용
    //회원번호가 1인 회원의 이름을 조회하는 쿼리를 실행할 메서드
    @Override
    public String select1() {
      //쿼리의 실행결과로 나온 문자열을 name에 받아 리턴한다
      String name = sqlSession.selectOne("dbMapper.select1");
        return name;
    }

    //전달된 회원번호를 지닌 회원의 나이를 조회
    @Override
    public int select2(int memNum) {
        int age = sqlSession.selectOne("dbMapper.select2", memNum);
        return age;
    }

    //전달 받은 나이 이상인 회원의 이름을 조회
    @Override
    public List<String> select3(int memAge) {
        List<String> nameList = sqlSession.selectList("dbMapper.select3", memAge);
        return nameList;
    }

    //전달 받은 회원 번호를 지닌 회원의 회원번호, 이름, 나이, 주소 조회
    @Override
    public MemberVO select4(int memNum) {
        MemberVO member = sqlSession.selectOne("dbMapper.select4", memNum);
        return member;
    }

    //모든 회원의 회원번호, 이름, 나이, 주소 조회
    @Override
    public List<MemberVO> select5() {
        List<MemberVO> memberList = sqlSession.selectList("dbMapper.select5");
        return memberList;
    }

    //전달 받은 회원번호를 가진 회원을 삭제
    @Override
    public int delete(int memNum) {
        //삭제된 행 갯수
        int result = sqlSession.delete("dbMapper.delete", memNum);
        return result;
    }

    @Override
    public void insert(MemberVO memberVO) {
        sqlSession.insert("dbMapper.insert", memberVO);
    }

    @Override
    public int update(MemberVO memberVO) {
        int result = sqlSession.update("dbMapper.update", memberVO);
        return result;
    }


}
