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

    @PostMapping("/regStu")
    public void regStu(@RequestBody StudentVO studentVO){
        studentService.regStu(studentVO);
    }

    @DeleteMapping("/delStu/{stuNum}")
    public void delStu(@PathVariable("stuNum") int stuNum){
        System.out.println(stuNum);
        studentService.delStu(stuNum);
    }

    @

}
