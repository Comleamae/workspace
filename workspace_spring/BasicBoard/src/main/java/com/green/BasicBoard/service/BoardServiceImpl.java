package com.green.BasicBoard.service;

import com.green.BasicBoard.vo.BoardVO;
import com.green.BasicBoard.vo.SearchVO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service("BoardService")
public class BoardServiceImpl implements BoardService{
    @Autowired
    SqlSessionTemplate sqlSession;

    //게시글을 보여줄 메소드
    @Override
    public List<BoardVO> getBoardList(SearchVO searchVO) {
        List<BoardVO> boardlists= sqlSession.selectList("boardMapper.getBoardList", searchVO);
        return boardlists;
    }
    //게시글 조회수 상승 메소드
    @Override
    public void updateView(int boardNum) {
        sqlSession.update("boardMapper.updateView", boardNum);
    }

    //게시글을 등록할 메소드
    @Override
    public void regBoard(BoardVO boardVO) {
        sqlSession.insert("boardMapper.regBoard", boardVO);
    }

    //게시글 상세보기 메소드
    @Override
    public BoardVO detailBoard(BoardVO boardVO) {
        BoardVO board = sqlSession.selectOne("boardMapper.getBoard", boardVO);
        return board;
    }
    //게시글 업데이트 메소드
    @Override
    public void updateBoard(BoardVO boardVO) {
        sqlSession.update("boardMapper.updateBoard", boardVO);
    }
    //게시글 삭제 메소드
    @Override
    public void deleteBoard(int boardNum) {
        sqlSession.delete("boardMapper.deleteBoard", boardNum);
    }


}
