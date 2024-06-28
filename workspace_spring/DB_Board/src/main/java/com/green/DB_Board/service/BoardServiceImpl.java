package com.green.DB_Board.service;

import com.green.DB_Board.vo.BoardVO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("boardService")
public class BoardServiceImpl implements BoardService{
    @Autowired
    private SqlSessionTemplate sqlSession;

    //첫 화면에서 리스트를 보여주기위한 메소드
    @Override
    public List<BoardVO> getBoardList() {
        List<BoardVO> boardList = sqlSession.selectList("boardMapper.getBoardList");
        return boardList;
    }

    @Override
    public void insertBoard(BoardVO boardVO) {
        sqlSession.insert("boardMapper.regBoard", boardVO);
    }

    @Override
    public BoardVO getBoardDetail(int boardNum) {
        BoardVO board = sqlSession.selectOne("boardMapper.boardDetail", boardNum);
        return board;
    }

    @Override
    public void updateBoard(BoardVO boardVO) {
        sqlSession.update("boardMapper.boardUpdate", boardVO);
    }

    @Override
    public void deleteBoard(int boardNum) {
        sqlSession.delete("boardMapper.boardDelete", boardNum);
    }

    @Override
    public void updateViewCnt(int boardNum) {
        sqlSession.update("boardMapper.updateView",boardNum);
    }
}
