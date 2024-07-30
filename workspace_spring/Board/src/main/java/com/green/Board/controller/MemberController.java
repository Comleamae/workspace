package com.green.Board.controller;

import com.green.Board.service.MemberServiceImpl;
import com.green.Board.vo.BoardVO;
import com.green.Board.vo.MemberVO;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j //로그 남길때 쓰는 어노테이션->모든 클래스 위에서 사용 가능
@RestController
@RequestMapping("/member")
public class MemberController {
    @Resource(name = "memberService")
    private MemberServiceImpl memberService;

    @GetMapping("/list")
    List<MemberVO> getAllMem(){
        return memberService.getAllMem();
    }

    @GetMapping("/one")
    MemberVO getOneMem(String memId){
        return memberService.getOneMem(memId);
    }

    @GetMapping("/checkId/{inputId}")
    boolean isGetOneMem(@PathVariable("inputId") String inputId){
        log.info("로그 인포가 뭔데");
        //true=>아이디 사용불가능
        //false=>아이디 사용가능
        return memberService.isGetOneMem(inputId);
    }
    @PostMapping("/regMem")
    void regMem(@RequestBody MemberVO memberVO){
        log.info("==========================메서드실행==============================");
        log.info("==========================전달된 데이터==============================");
        log.info(memberVO.toString());
        log.info("데이터 확인 끝=========");
        memberService.regMem(memberVO);
    }
    @PostMapping("/login")
    MemberVO login(@RequestBody MemberVO memberVO){
        return memberService.searchMem(memberVO);
    }
}
