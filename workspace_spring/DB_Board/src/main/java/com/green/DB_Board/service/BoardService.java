package com.green.DB_Board.service;

import com.green.DB_Board.vo.BoardVO;

import java.util.List;

public interface BoardService {
    //첫 화면에서 리스트를 보여주기위한 인터페이스
    List<BoardVO> getBoardList();
    //입력받은 글을 리스트에 추가하기 위한 인터페이스
    void insertBoard(BoardVO boardVO);
    //선택한 글의 상세 정보를 보여주긴 위한 인터페이스
    BoardVO getBoardDetail(int boardNum);
    //글을 수정하기위한 인터페이스
    void updateBoard(BoardVO boardVO);
    //글을 삭제하기위한 인터페이스
    void deleteBoard(int boardNum);
    //글을 조회하면서 조회수를 증가시키는 인터페이스
    void updateViewCnt(int boardNum);

}
