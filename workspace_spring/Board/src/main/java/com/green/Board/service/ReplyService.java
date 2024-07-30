package com.green.Board.service;

import com.green.Board.vo.BoardVO;
import com.green.Board.vo.ReplyVO;

import java.util.List;

public interface ReplyService {
    List<ReplyVO> getAllReply();
    List<ReplyVO> getSelectReply(int boardNum);
    void deleteReply(int replyNum);
    void regReply(ReplyVO replyVO);
    void deleteSelectReply(int boardNum);
}