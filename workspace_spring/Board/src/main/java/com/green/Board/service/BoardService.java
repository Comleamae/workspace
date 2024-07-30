package com.green.Board.service;

import com.green.Board.vo.BoardVO;
import com.green.Board.vo.SearchVO;

import java.util.List;

public interface BoardService {
    /*전체 리스트 얻기*/
    List<BoardVO> getAllBoard(SearchVO searchVO);
    /*하나 얻기*/
    BoardVO getOneBoard(int boardNum);
    //게시글 추가
    void regBoard(BoardVO boardVO);
    //삭제
    void deleteBoard(int boardNum);
    //수정
    void updateBoard(BoardVO boardVO);
}
