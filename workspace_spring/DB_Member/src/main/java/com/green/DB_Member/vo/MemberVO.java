package com.green.DB_Member.vo;

import lombok.Data;

@Data
public class MemberVO {
    //DB의 테이블 컬럼 네임을 옮긴것
    private int memNum;
    private String memName;
    private int memAge;
    private String memAddr;
}
