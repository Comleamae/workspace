package com.green.BasicBoard.controller;

import com.green.BasicBoard.service.BoardServiceImpl;
import com.green.BasicBoard.vo.BoardVO;
import com.green.BasicBoard.vo.SearchVO;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ReactController {
    @Resource(name = "BoardService")
    BoardServiceImpl boardService;

    // 게시글을 보여줄 컨트롤러
    @RequestMapping("/list")
    public List<BoardVO> main(SearchVO searchVO){

        //목록 조회
        List<BoardVO> boardLists = boardService.getBoardList(searchVO);

        return  boardLists;
    }
}
