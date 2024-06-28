package com.green.DB_Score.controller;

import com.green.DB_Score.service.ScoreServiceImpl;
import com.green.DB_Score.vo.ScoreVO;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

    @GetMapping("/stuInsertForm")
    public String insertForm(){

        return "reg_student";
    }

    @PostMapping ("/stuInsert")
    public String insert(ScoreVO scoreVO, Model model){

        ScoreVO vo = new ScoreVO();

        vo.setStuNum(scoreVO.getStuNum());
        vo.setStuName(scoreVO.getStuName());
        vo.setKorScore(scoreVO.getKorScore());
        vo.setEngScore(scoreVO.getEngScore());
        vo.setIntro(scoreVO.getIntro());
        scoreService.insert(vo);
        model.addAttribute("students", vo);
        return "redirect:/";
    }

    @GetMapping ("/stuDetail")
    public String detail(ScoreVO scoreVO, Model model){
        ScoreVO vo = new ScoreVO();
        vo = scoreService.getStuDetail(scoreVO.getStuNum());
        model.addAttribute("students", vo);
        return  "stu_detail";
    }

    @GetMapping ("/stuUpdateForm")
    public String updateForm(ScoreVO scoreVO, Model model){
        ScoreVO vo = new ScoreVO();
        vo = scoreService.getStuDetail(scoreVO.getStuNum());
        model.addAttribute("students", vo);
        return  "update_student";
    }

    @PostMapping ("/stuUpdate")
    public String update(@RequestParam (name = "stuNum") int stuNum, ScoreVO scoreVO, Model model){
        ScoreVO vo = new ScoreVO();

        vo.setStuName(scoreVO.getStuName());
        vo.setKorScore(scoreVO.getKorScore());
        vo.setEngScore(scoreVO.getEngScore());
        vo.setIntro(scoreVO.getIntro());

        scoreService.updateStuDetail(scoreVO);

        model.addAttribute("students", vo);

        return "redirect:/stuDetail?stuNum="+scoreVO.getStuNum();
    }

    @GetMapping("/stuDelete")
    public String delete(@RequestParam (name = "stuNum") int stuNum){
        scoreService.deleteStu(stuNum);
        return "redirect:/";
    }





}
