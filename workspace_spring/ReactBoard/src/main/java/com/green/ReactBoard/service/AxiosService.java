package com.green.ReactBoard.service;

import com.green.ReactBoard.vo.BoardVO;

import java.util.List;

public interface AxiosService {
    //쿼리를 실행할 메서드 정의
    List<BoardVO> getList();
}
