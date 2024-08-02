package com.green.Shop.member.service;

import com.green.Shop.member.vo.MemberVO;
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
    public MemberVO getOne(String memId) {
        return sqlSession.selectOne("memberMapper.getOne", memId);
    }

    @Override
    public MemberVO getLogin(MemberVO memberVO) {
        return sqlSession.selectOne("memberMapper.getLogin", memberVO);
    }

    @Override
    public void regMem(MemberVO memberVO) {
        sqlSession.insert("memberMapper.regMem", memberVO);
    }
}
