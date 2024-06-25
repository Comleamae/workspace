package com.green.ListPractice.controller;

import com.green.ListPractice.service.StudentService;
import com.green.ListPractice.vo.StudentVO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class StudentController {
    //모듈 객체 생성
    StudentService studentService = new StudentService();

    @GetMapping ("/stuMain")
    public String goMain(Model model){

        //학생 목록 데이터 받아오기
        List<StudentVO> list = studentService.getStuList();
        //학생 목록을 html로 전달
        model.addAttribute("stuList", list);
        return "stu_list";
    }
    //학생 등록 페이지
    @GetMapping("/regMain")
    public String goRegMain(){
        return "reg_student";
    }
    //학생 등록 + 학생 목록
    @PostMapping("/reg")
    public String goReg(StudentVO studentVO){
        studentService.regStudent(studentVO);
        return "redirect:/stuMain";
    }

    //학생 상세 조회
    @GetMapping("/stuDetail")
    public String goDetail(@RequestParam(name = "stuNum") int stuNum, Model model){
        //내가 클릭한 학생 한명을 검색(학번을 알면 된다)
        StudentVO student = studentService.detailStudent(stuNum);
        //학생 상세정보 데이터를 hmtl로 전달
        model.addAttribute("student", student);
        return "student_detail";
    }

    //학생 삭제 + 목록페이지로 이동
    @GetMapping("/stuDelete")
    public String Delete(@RequestParam(name = "stuNum") int stuNum){
        //학생 삭제
        studentService.deleteStudent(stuNum);
        return "redirect:/stuMain";
    }

    //학생 정보 수정 페이지로 이동
    @GetMapping("/updateForm")
    public String updateForm(@RequestParam(name = "stuNum") int stuNum, Model model){
        //정보를 수정할 학생의 원래 정보를 html 에 전달
        //1.정보를 수정할 학생 한 명을 선택
        StudentVO student = studentService.detailStudent(stuNum);
        //2.수정할 학생을 html로 전달
        model.addAttribute("student", student);
        return "update_student";
    }

    //정보 수정 + 상세페이지로 이동
    @PostMapping("/updateStu")
    public String update(StudentVO studentVO){
        //학생 정보 수정
        studentService.updateStu(studentVO);

        //
        return "redirect:/stuDetail?stuNum=" + studentVO.getStuNum();
    }
}
