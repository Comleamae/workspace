package com.green.DataPractice.controller;

import com.green.DataPractice.vo.ReEtcVo;
import com.green.DataPractice.vo.ReNameVO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RecruitController {

    @GetMapping("/re1")
    public String goRe1(){
        return "recruit1";
    }

    @PostMapping("/re2")
    public String goRe2(ReNameVO reNameVO){
        System.out.println(reNameVO);
        return "recruit2";
    }
    @PostMapping("/re3")
    public String goRe3(ReNameVO reNameVO, ReEtcVo reEtcVo){
        System.out.println(reEtcVo);
        return "recruit3";
    }

}
