package com.green.Board.service;

import com.green.Board.vo.BoardVO;
import com.green.Board.vo.ReplyVO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("replyService")
public class ReplyServiceImpl implements ReplyService{
    @Autowired
    private SqlSessionTemplate sqlSession;

    @Override
    public List<ReplyVO> getAllReply() {
        return sqlSession.selectList("replyMapper.getAllReply");
    }

    @Override
    public List<ReplyVO> getSelectReply(int boardNum) {
        return sqlSession.selectList("replyMapper.getSelectReply", boardNum);
    }

    @Override
    public void deleteReply(int replyNum) {
        sqlSession.delete("replyMapper.deleteReply", replyNum);

    }

    @Override
    public void regReply(ReplyVO replyVO) {
        sqlSession.insert("replyMapper.regReply", replyVO);
    }

    @Override
    public void deleteSelectReply(int boardNum) {
        sqlSession.delete("replyMapper.deleteSelectReply", boardNum);
    }
}
