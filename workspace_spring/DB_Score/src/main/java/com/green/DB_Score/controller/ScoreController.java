package com.green.DB_Score.controller;

import com.green.DB_Score.service.ScoreServiceImpl;
import com.green.DB_Score.vo.ScoreVO;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;


@Controller
public class ScoreController {
    @Resource(name = "scoreService")
    private ScoreServiceImpl scoreService;

    //학생 목록 페이지
    @GetMapping("/")
    public String mainList(Model model){

        //학생 목록 데이터를 db에서 조회
        List<ScoreVO> stuList = scoreService.getStuList();
        model.addAttribute("stuList", stuList);

        return "stu_list";
    }

    @GetMapping("/insertForm")
    public String insertForm(){

        return "reg_student";
    }

    @PostMapping ("/insert")
    public String insert(ScoreVO scoreVO, Model model){

        ScoreVO vo = new ScoreVO();

        vo.setStuNum(scoreVO.getStuNum());
        vo.setStuName(scoreVO.getStuName());
        vo.setKorScore(scoreVO.getKorScore());
        vo.setEngScore(scoreVO.getEngScore());
        vo.setIntro(scoreVO.getIntro());
        scoreService.insert(vo);
        model.addAttribute("stu", vo);
        return "redirect:/";
    }


}
