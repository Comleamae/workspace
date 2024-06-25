package com.green.ListPractice.service;

import com.green.ListPractice.vo.StudentVO;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

//학생관리 프로그램의 핵심 기능 정의 - Model
public class StudentService {
    //학생을 여러명 저장할 수 있는 공간
    List<StudentVO> list = new ArrayList<>();

    //학생 목록 조회
    public List<StudentVO> getStuList(){

        return list;
    }
    //학생 등록
    public void regStudent(StudentVO studentVO){
        list.add(studentVO);
    }

    //학생 상세 조회
    public StudentVO detailStudent(int stuNum){
        //학번이 일치하는 학생을 저장할 공간
        StudentVO findStudent = null;
        for(StudentVO studentVO :  list){
            if(studentVO.getStuNum() == stuNum){
                findStudent = studentVO;
            }
        }
        return findStudent;
    }
    //학생 삭제
    public void deleteStudent(int stuNum){
        //삭제를 위해서는 삭제할 학생의 index(list 내에서의 위치) 번호 필요
        //index를 알기위서 학번 데이터 필요
        int index = 0;
        for (int i = 0; i < list.size(); i++){
            if(list.get(i).getStuNum() == stuNum){
                index = i;
            }
        }
        list.remove(index);
    }

    //정보 수정
    public void updateStu(StudentVO studentVO){
        //list 에서 정보를 수정하고자 하는 학생을 찾아
        for (StudentVO student: list){
            if(student.getStuNum()==studentVO.getStuNum()){
                student.setStuName(studentVO.getStuName());
                student.setKrNum(studentVO.getKrNum());
                student.setEnNum(studentVO.getEnNum());
                student.setIntro(studentVO.getIntro());
            }
        }
        //그 학생의 정보를 input 태그 및 textarea 에서 입력한 정보로 변경
    }

}
