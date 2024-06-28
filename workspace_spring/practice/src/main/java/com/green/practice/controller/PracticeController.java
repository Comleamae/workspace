package com.green.practice.controller;

import com.green.practice.service.PracticeServiceImpl;
import com.green.practice.vo.PracticeVO;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class PracticeController {
    @Resource(name = "practiceService")
    private PracticeServiceImpl practiceService;
    //실험 자료 목록을 보여주는 화면
    @GetMapping("/")
    public String main(Model model){
        List<PracticeVO> list = practiceService.getSubjectList();
        model.addAttribute("subjectList", list);
        return "main";
    }
    //실험자료를 등록하는 폼으로 가기
    @GetMapping("/")
}
