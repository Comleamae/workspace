package com.green.BasicBoard.controller;

import com.green.BasicBoard.service.BoardService;
import com.green.BasicBoard.service.BoardServiceImpl;
import com.green.BasicBoard.vo.BoardVO;
import com.green.BasicBoard.vo.SearchVO;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class BoardController {
    @Resource(name = "BoardService")
    BoardServiceImpl boardService;

    // 게시글을 보여줄 컨트롤러
    @RequestMapping("/")
    public String main(SearchVO searchVO, Model model){
        //searchVO 데이터 검사
        System.out.println(searchVO);

        //목록 조회
        List<BoardVO> boardLists = boardService.getBoardList(searchVO);
        model.addAttribute("boardList", boardLists);
        //model.addAttribute("boardList", boardService.getBoardList());
        return "board_list";
    }

    // 게시글을 등록할 장소로 가는 컨트롤러
    @GetMapping("/writeForm")
    public String goWriteForm(){
        return "board_write_form";
    }

    // 게시글을 등록하고 메인으로가서 보여줄 컨트롤러
    @PostMapping("/regBoard")
    public String goRegBoard(BoardVO boardVO, Model model){
        BoardVO vo = new BoardVO();

        boardService.regBoard(boardVO);

        vo.setBoardNum(boardVO.getBoardNum());
        vo.setTitle(boardVO.getTitle());
        vo.setWriter(boardVO.getWriter());
        vo.setContent(boardVO.getContent());
        vo.setCreateDate(boardVO.getCreateDate());

        model.addAttribute("boards", vo);
        return "redirect:/";
    }

    //조회수를 증가시키고 게시글 상세 조회창으로 가는 컨트롤러
    @GetMapping("/goDetail")
    public String goDetail(BoardVO boardVO, Model model){
        //조회수 증가
        boardService.updateView(boardVO.getBoardNum());

        BoardVO vo= boardService.detailBoard(boardVO);
        model.addAttribute("boards", vo);
        return "board_detail";
    }

    //게시글 상세 수정창으로 가는 컨트롤러
    @GetMapping("/goUpdateForm")
    public String goUpdateForm(BoardVO boardVO, Model model){
        BoardVO vo = boardService.detailBoard(boardVO);
        model.addAttribute("boards", vo);
        return "update_form";
    }

    //게시글 상세 수정하고 조회창으로 가는 컨트롤러
    @PostMapping("/goUpdate")
    public String goUpdate(BoardVO boardVO, Model model){
        BoardVO vo = new BoardVO();
        boardService.updateBoard(boardVO);

        vo.setBoardNum(boardVO.getBoardNum());
        vo.setTitle(boardVO.getTitle());
        vo.setContent(boardVO.getContent());

        model.addAttribute("boards", vo);

        return "redirect:/goDetail?boardNum="+boardVO.getBoardNum();
    }

    //게시글 삭제하고 조회창으로 가는 컨트롤러
    @GetMapping("/goDelete")
    public String goDelete(@RequestParam (name = "boardNum") int boardNum){
        boardService.deleteBoard(boardNum);
        return "redirect:/";
    }

    //게시글 검색 후에 검색결과를 메인리스트에 띄운다
    @PostMapping("/goSearch")
    public String goSearch(){

        return "redirect:/";
    }
}
