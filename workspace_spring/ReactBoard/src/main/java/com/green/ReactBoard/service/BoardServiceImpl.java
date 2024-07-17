package com.green.ReactBoard.service;

import com.green.ReactBoard.vo.BoardVO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("boardService")
public class BoardServiceImpl implements BoardService{

    @Autowired
    private SqlSessionTemplate sqlSession;

    //게시글 목록 조회 메서드
    @Override
    public List<BoardVO> getBoardList() {
        //sqlSession.selectList("실행시킬 매퍼의 이름과 아이디", 매개변수)
        return sqlSession.selectList("boardMapper.getBoardList");
    }
    //게시글 상세 조회 메서드
    @Override
    public BoardVO getOneBoard(int boardNum) {
        return sqlSession.selectOne("boardMapper.getOneBoard", boardNum);
    }

    //게시글 등록 메서드
    @Override
    public void regBoard(BoardVO boardVO) {
        sqlSession.insert("boardMapper.regBoard", boardVO);
    }

    //게시글 삭제 메서드
    @Override
    public void deleteBoard(int boardNum) {
        sqlSession.delete("boardMapper.deleteBoard", boardNum);
    }

    //게시글 수정 메서드
    @Override
    public void updateBoard(BoardVO boardVO) {
        sqlSession.update("boardMapper.updateBoard", boardVO);
    }


}
