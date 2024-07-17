package com.green.ReactBoard.controller;

import com.green.ReactBoard.service.AxiosServiceImpl;
import com.green.ReactBoard.vo.BoardVO;
import com.green.ReactBoard.vo.MemberVO;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AxiosController {
    @Resource(name = "axiosService")
    private AxiosServiceImpl axiosService;

    //1번 버튼 클릭 시 호출되는 메서드
    @GetMapping("/getList")
    public List<BoardVO> getList(){
        return axiosService.getList();
    }

    //2번 버튼 클릭 시 호출되는 메서드
    @GetMapping("/detail")
    public void detail(@PathVariable("boardNum") int boardNum){
        System.out.println(boardNum);
    }

    //데이터 삽입하는 메서드
    @PostMapping ("/insertBoard")
    /* @RequestBody 는 리액트에서 선언한 객체를 받아오기 위한 어노테이션*/
    public void insertBoard(@RequestBody MemberVO memberVO){
        System.out.println(memberVO);
    }

    //데이터 수정하는 메서드
    @PutMapping ("/upBoard")
    public BoardVO updateBoard(@RequestBody BoardVO boardVO){
        System.out.println(boardVO);
        //데이터베이스 update 쿼리 실행
        return boardVO;
    }
}
