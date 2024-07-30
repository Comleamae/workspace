package com.green.Board.controller;

import com.green.Board.service.BoardServiceImpl;
import com.green.Board.vo.BoardVO;
import com.green.Board.vo.SearchVO;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/board")
public class BoardController {
    @Resource(name = "boardService")
    private BoardServiceImpl boardService;

    //게시글 목록
    @PostMapping("/list")                          /*(required = false):넘어오는 값의 존재 여부에 따라 실행되는*/
    public List<BoardVO> getBoardList(@RequestBody SearchVO searchVO){
        return boardService.getAllBoard(searchVO);
    }

    //게시글 등록
    @PostMapping("/reg")
    public void regBoard(@RequestBody BoardVO boardVO){
        boardService.regBoard(boardVO);
    }

    //게시글 상세 조회
    @GetMapping("/detail/{boardNum}")
    public BoardVO getDetail(@PathVariable("boardNum") int boardNum){
        BoardVO boardVO = boardService.getOneBoard(boardNum);
        return boardService.getOneBoard(boardNum);
    }

    //삭제
    @DeleteMapping("/delete/{boardNum}")
    public void deleteBoard(@PathVariable("boardNum") int boardNum){
        boardService.deleteBoard(boardNum);
    }
    //수정
    @PutMapping("/update")
    public void updateBoard(@RequestBody BoardVO boardVO){
        boardService.updateBoard(boardVO);
    }
}
