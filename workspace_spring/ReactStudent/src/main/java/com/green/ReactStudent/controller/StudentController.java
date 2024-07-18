package com.green.ReactStudent.controller;

import com.green.ReactStudent.service.StudentServiceImpl;
import com.green.ReactStudent.vo.StudentVO;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Resource(name = "studentService")
    private StudentServiceImpl studentService;

    @GetMapping("/stuList")
    public List<StudentVO> getAllStu(){
        return studentService.getAllStu();
    }

    @GetMapping("/oneStu/{stuNum}")
    public StudentVO getOneStu(@PathVariable("stuNum") int stuNum){
        return studentService.getOneStu(stuNum);
    }

    @PostMapping("/regStu")
    public void regStu(@RequestBody StudentVO studentVO){
        studentService.regStu(studentVO);
    }

    @DeleteMapping("/delStu/{stuNum}")
    public void delStu(@PathVariable("stuNum") int stuNum){
        studentService.delStu(stuNum);
    }

    @PutMapping("/regScore")
    public void regScore(@RequestBody StudentVO studentVO){
        studentService.updateScore(studentVO);
    }


}
