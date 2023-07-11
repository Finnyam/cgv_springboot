package com.springboot.mycgv.controller;

import com.springboot.mycgv.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MycgvRestController {
    @Autowired
    MemberService memberService;

    @GetMapping("idcheck/{id}")
    public String idcheck(@PathVariable String id){
        return String.valueOf(memberService.idcheck(id));
    }

}
