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
    public boolean isEnableId(String memId) {
        //사용 가능한 아이디면 selectedId:null
        String selectedId = sqlSession.selectOne("memberMapper.isEnableId", memId);
        return selectedId==null;
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
