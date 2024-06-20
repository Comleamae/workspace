package com.green.DataPractice.controller;

import com.green.DataPractice.vo.Main3VO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ScoreController {

    //시작 페이지로 이동
    @GetMapping("/title")
    public String goTitle(){
        return "main_1";
    }
    //첫번째 페이지에 넘어온 데이터를 받아 두번째 페이지 실행
    @PostMapping("/input1")
    public String goInput1(Main3VO main3VO){
        System.out.println(main3VO);
        return "main_2";
    }

    /*@PostMappting("/input1")
    public String goInput1(@RequestParma(name = "name") String name, Model model){
        System.out.println(name);
        model.addAttribute("iName", main1VO.getName());
        return "main_2";
    }
    */
    //세번째 페이지로 이동
    @PostMapping("/input2")
    public String goInput2(Main3VO main3VO){
        System.out.println(main3VO);

        return "main_3";
    }
    //네번째 페이지로 이동
    @PostMapping("/input3")
    public String goInput3(Main3VO main3VO, Model model){
        System.out.println(main3VO);

        //평균(연산 1번)
        double avg = (main3VO.getEnScore() + main3VO.getKrScore() + main3VO.getMaScore()) / 3.0;
        model.addAttribute("avg", avg);
        return "main_4";
    }
}
