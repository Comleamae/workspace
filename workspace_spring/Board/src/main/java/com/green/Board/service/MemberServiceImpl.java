package com.green.Board.service;

import com.green.Board.vo.MemberVO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("memberService")
public class MemberServiceImpl implements MemberService{
    @Autowired
    private SqlSessionTemplate sqlSession;

    @Override
    public List<MemberVO> getAllMem() {
        return sqlSession.selectList("memberMapper.getAllMem");
    }

    @Override
    public MemberVO getOneMem(String memId) {
        return sqlSession.selectOne("memberMapper.getOneMem", memId);
    }
    //아이디 중복이면 true
    @Override
    public boolean isGetOneMem(String memId) {
        //id가 null이면 회원가입 가능
        //id가 조회가되면 (null 아니면) 회원가입 불가능
        String result = sqlSession.selectOne("memberMapper.isGetOneMem", memId);
        return result != null;
    }

    @Override
    public void regMem(MemberVO memberVO) {
        sqlSession.insert("memberMapper.regMem", memberVO);
    }

    @Override
    public MemberVO searchMem(MemberVO memberVO) {
       return sqlSession.selectOne("memberMapper.searchMem", memberVO);
    }
}
