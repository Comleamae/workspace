package com.green.DataPractice.controller;

import com.green.DataPractice.vo.RegMemVO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class JoinController {
    @GetMapping("/reg_mem")
    public String goRegMem(){
        return "reg_member";
    }
    //커맨드 객체는 model을 사용하지 않아도 자동으로 html로 전달된다
    //이때 넘어가는 데이터는 클래스명에서 앞글자만 소문자로 바꾼이름으로 넘어가게 정해짐
    @PostMapping("/mem_info")
    public String goMemInfo(RegMemVO regMemVO) {
        System.out.println(regMemVO);
        return "member_info";
    }
}
