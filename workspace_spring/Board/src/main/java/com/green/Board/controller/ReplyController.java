package com.green.Board.controller;

import com.green.Board.service.ReplyServiceImpl;
import com.green.Board.vo.BoardVO;
import com.green.Board.vo.ReplyVO;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reply")
public class ReplyController {
    @Resource(name = "replyService")
    private ReplyServiceImpl replyService;

    //댓글 목록
    @GetMapping("/list")
    public List<ReplyVO> getReplyList(){
        return replyService.getAllReply();
    }

    @GetMapping("/one/{boardNum}")
    public List<ReplyVO> getSelectReply(@PathVariable("boardNum") int boardNum){
        return replyService.getSelectReply(boardNum);
    }

    @DeleteMapping("/delete/{replyNum}")
    public void deleteReply(@PathVariable("replyNum") int replyNum){
        replyService.deleteReply(replyNum);
    }

    @PutMapping("/regReply")
    public void regReply(@RequestBody ReplyVO replyVO){
        replyService.regReply(replyVO);
    }

    @DeleteMapping("/deleteSel/{boardNum}")
    public void deleteSelectReply(@PathVariable("boardNum") int boardNum){
        replyService.deleteSelectReply(boardNum);
    }
}
