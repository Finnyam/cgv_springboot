package com.springboot.mycgv.service;

import com.springboot.mycgv.dto.MemberDto;
import com.springboot.mycgv.dto.SessionDto;
import com.springboot.mycgv.repository.MemberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {
    @Autowired
    MemberMapper memberMapper;
    /* join */
    public int join(MemberDto memberDto){
        return memberMapper.join(memberDto);
    }



    /* idcheck*/
    public int idcheck(String id){
        return memberMapper.idcheck(id);
    }

    /*login*/
    public SessionDto login(MemberDto memberDto){
        return memberMapper.login(memberDto);
    }

}
