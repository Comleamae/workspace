package com.green.DB_Board.controller;

import com.green.DB_Board.service.BoardServiceImpl;
import com.green.DB_Board.vo.BoardVO;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class BoardController {
    @Resource(name = "boardService")
    private BoardServiceImpl boardService;

    //메인화면에서 정보 띄우기
    @GetMapping ("/")
    public String mainBoard(Model model){
        List<BoardVO> boardList = boardService.getBoardList();
        model.addAttribute("boardList", boardList);
        return "board_list";
    }
    //글쓰러가기
    @GetMapping ("/writeForm")
    public String writeForm(){
        return "board_write_form";
    }
    //글등록하기
    @PostMapping ("/regWrite")
    public String regWrite(BoardVO boardVO, Model model){

        BoardVO vo = new BoardVO();

        vo.setBoardNum(boardVO.getBoardNum());
        vo.setTitle(boardVO.getTitle());
        vo.setWriter(boardVO.getWriter());
        vo.setContent(boardVO.getContent());

        boardService.insertBoard(vo);
        model.addAttribute("contents", vo);

        return "redirect:/";
    }

    //글 상세보기+조회수 증가
    @GetMapping("/boardDetail")
    public String detail(BoardVO boardVO, Model model){
        BoardVO vo = new BoardVO();

        boardService.updateViewCnt(boardVO.getBoardNum());
        vo = boardService.getBoardDetail(boardVO.getBoardNum());

        model.addAttribute("contents", vo);

        return "board_detail";
    }

    //글 수정하는 페이지로
    @GetMapping("/updateForm")
    public String updateForm(BoardVO boardVO, Model model){
        BoardVO vo = new BoardVO();
        vo = boardService.getBoardDetail(boardVO.getBoardNum());

        model.addAttribute("contents", vo);
        return "update_form";
    }

    //글 삭제
    @GetMapping("/boardDelete")
    public String boardDelete(@RequestParam (name = "boardNum") int boardNum){
        boardService.deleteBoard(boardNum);
        return "redirect:/";
    }

    //글 수정하고 등록해서 목록으로
    @PostMapping("/boardUpdate")
    public String boardUpdate(BoardVO boardVO, Model model){
        BoardVO vo = new BoardVO();

        vo.setTitle(boardVO.getTitle());
        vo.setContent(boardVO.getContent());

        boardService.updateBoard(boardVO);

        model.addAttribute("contents", vo);

        return "redirect:/boardDetail?boardNum="+ boardVO.getBoardNum();
    }

}
