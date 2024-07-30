package com.green.Board.service;

import com.green.Board.vo.BoardVO;
import com.green.Board.vo.SearchVO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("boardService")
public class BoardServiceImpl implements BoardService{
    @Autowired
    private SqlSessionTemplate sqlSession;

    @Override
    public List<BoardVO> getAllBoard(SearchVO searchVO) {
        return sqlSession.selectList("boardMapper.getAllBoard", searchVO);
    }

    @Override
    public BoardVO getOneBoard(int boardNum) {
        return sqlSession.selectOne("boardMapper.getOneBoard", boardNum);
    }

    @Override
    public void regBoard(BoardVO boardVO) {
        sqlSession.insert("boardMapper.regBoard", boardVO);
    }

    @Override
    public void deleteBoard(int boardNum) {
        sqlSession.delete("boardMapper.deleteBoard", boardNum);
    }

    @Override
    public void updateBoard(BoardVO boardVO) {
        sqlSession.update("boardMapper.updateBoard", boardVO);
    }
}
