package com.springboot.mycgv.controller;

import com.springboot.mycgv.dto.MemberDto;
import com.springboot.mycgv.dto.SessionDto;
import com.springboot.mycgv.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;

@Controller
public class MemberController {
    @Autowired
    MemberService memberService;

    /* logout */
    @GetMapping("logout")
    public String logout(){

    }

    /*join process*/
    @PostMapping("join")
    public String join_proc(MemberDto memberDto,Model model){
        if(memberService.join(memberDto) == 1){
            model.addAttribute("join_result","ok");
        }
        return "/login/login";
    }

    /* join form */
    @GetMapping("join")
    public String join(){
        return "/join/join";
    }

    /* login process*/
    @PostMapping("login")
    public String login_proc(MemberDto memberDto, Model model, HttpSession session){
        SessionDto sessionDto = memberService.login(memberDto);
        if(sessionDto.getLoginresult() == 1){
            session.setAttribute("svo",sessionDto);
            model.addAttribute("login_result","ok");
        }
        return "index";
    }

    /* login form*/
    @GetMapping("login")
    public String login(){
        return "/login/login";
    }
}
