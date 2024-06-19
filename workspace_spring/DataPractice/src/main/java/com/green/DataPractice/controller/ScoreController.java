package com.green.DataPractice.controller;

import com.green.DataPractice.vo.Main1VO;
import com.green.DataPractice.vo.Main2VO;
import com.green.DataPractice.vo.Main3VO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ScoreController {

    @PostMapping("/title")
    public String goTitle(){
        return "main_1";
    }

    @PostMapping("/input1")
    public String goInput1(Main1VO main1VO, Model model){
        System.out.println(main1VO);
        model.addAttribute("iName", main1VO.getName());
        return "main_2";
    }

    /*@PostMappting("/input1")
    public String goInput1(@RequestParma(name = "name") String name, Model model){
        System.out.println(name);
        model.addAttribute("iName", main1VO.getName());
        return "main_2";
    }
    */

    @PostMapping("/input2")
    public String goInput2(Main1VO main3VO, Main2VO main2VO, Model model){
        System.out.println(main2VO);
        model.addAttribute("iEtc1", main2VO);
        return "main_3";
    }

    @PostMapping("/input3")
    public String goInput3(Main3VO main3VO, Main2VO main2VO, Main1VO main1VO){
        System.out.println(main3VO);
        return "main_4";
    }
}
