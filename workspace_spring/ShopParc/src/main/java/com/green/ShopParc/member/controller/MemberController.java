package com.green.ShopParc.member.controller;

import com.green.ShopParc.member.service.MemberServiceImpl;
import com.green.ShopParc.member.vo.MemberVO;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/member")
@RestController
public class MemberController {
    @Resource(name = "memberService")
    private MemberServiceImpl memberService;


    @PostMapping("/login")
    public MemberVO getOneMem(@RequestBody MemberVO memberVO){
        return memberService.getOneMem(memberVO);
    }

    @GetMapping("/one")
    public MemberVO getOne(@PathVariable("memId") String memId){
        return memberService.getOne(memId);
    }
    
    @PostMapping("/reg")
    public void regMem(@RequestBody MemberVO memberVO){
        memberService.regMem(memberVO);
    }

}
