package com.green.AxiosTest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

//RestController : 컨트롤러 안의 메서드 리턴이 html 파일명이 아니다!
@RestController
public class AxiosController {


    @GetMapping("/test1")
    public String test1(){

        return "집에 가고 싶다";
    }

    @GetMapping("/test2")
    public int test2(){

        return 100;
    }

    @GetMapping("/test3")
    public int[] test3(){
        int[] arr = {1,2,3,4,5};
        return arr;
    }

    @GetMapping("/test4")
    public List<ItemVO> test4(){
        List<ItemVO> list = new ArrayList<>();
        //Item 객체 세개를 리액트로 전달
        ItemVO item = new ItemVO(1, "처음 만나는 자바", 20000, "소개1", "book_1.jpg");
        ItemVO item2 = new ItemVO(2, "처음 만나는 자바", 20000, "소개1", "book_2.jpg");
        ItemVO item3 = new ItemVO(3, "처음 만나는 자바", 20000, "소개1", "book_3.jpg");

        for(int i=1;  i < 4; i++){
            
        }

        list.add(item);
        list.add(item2);
        list.add(item3);

        return list;
    }
}
