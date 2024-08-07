package com.green.Shop.member.controller;

import com.green.Shop.member.service.MemberServiceImpl;
import com.green.Shop.member.vo.MemberVO;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api_member")
@RestController
public class MemberController {
    @Resource(name = "memberService")
    private MemberServiceImpl memberService;


    @PostMapping("/login")
    public MemberVO getLogin(@RequestBody MemberVO memberVO){
        return memberService.getLogin(memberVO);
    }

    @GetMapping("/isEnableId/{memId}")
    public boolean isEnableId(@PathVariable("memId") String memId){
        //사용가능 id -> result:true
        boolean result = memberService.isEnableId(memId);
        return result;
    }

    @PostMapping("/join")
    public void regMem(@RequestBody MemberVO memberVO){
        memberService.regMem(memberVO);
    }

}
