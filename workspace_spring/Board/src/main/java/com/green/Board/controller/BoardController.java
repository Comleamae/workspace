package com.green.Board.controller;

import com.green.Board.service.BoardServiceImpl;
import com.green.Board.vo.BoardVO;
import com.green.Board.vo.PageVO;
import com.green.Board.vo.SearchVO;
import jakarta.annotation.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/board")
public class BoardController {
    private static final Logger log = LoggerFactory.getLogger(BoardController.class);
    @Resource(name = "boardService")
    private BoardServiceImpl boardService;

    //게시글 목록
    @PostMapping("/list")                          /*(required = false):넘어오는 값의 존재 여부에 따라 실행되는*/
    // public Map<String, Object> getBoardList(@RequestBody SearchVO searchVO){
    public Map<String, Object> getBoardList(@RequestBody(required = false) SearchVO searchVO){
        log.info("==================넘어온 페이지 번호:" + searchVO.getPageNo());



        //전체 게시글 수
        int totalDataCnt = boardService.getBoardNum();
        //페이지 정보를 담을 수 있는 PageVO 객체 생성
        PageVO pageInfo = new PageVO(totalDataCnt);
        pageInfo.setNowPage(searchVO.getPageNo());
        pageInfo.setPageInfo();

        //전체 게시글 목록
        List<BoardVO> boardList = boardService.getAllBoard(pageInfo);

        //두 개의 데이터를 담아서 한번에 리턴할 map 생성
        //리액ㅌ로 가져갈 모든 데이터를 담을 변수
        Map<String, Object> mapData = new HashMap<>();
        //페이징 정보가 담긴 데이터
        mapData.put("pageInfo", pageInfo);
        //게시글 목록 데이터
        mapData.put("boardList", boardList);

        return mapData;
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
