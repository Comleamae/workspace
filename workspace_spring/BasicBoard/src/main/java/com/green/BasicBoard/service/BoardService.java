package com.green.BasicBoard.service;

import com.green.BasicBoard.vo.BoardVO;
import com.green.BasicBoard.vo.SearchVO;

import java.util.List;

public interface BoardService {
    //게시글을 보여줄 인터페이스
    List<BoardVO> getBoardList(SearchVO searchVO);
    //게시글 조회수 상승 인터페이스
    void updateView(int boardNum);
    //게시글을 등록할 인터
    void regBoard(BoardVO boardVO);
    //게시글을 상세보기할 인터
    BoardVO detailBoard(BoardVO boardVO);
    //게시글 상세보기 수정 인터
    void updateBoard(BoardVO boardVO);
    //게시글 삭제 인터
    void deleteBoard(int boardNum);
}
