package com.springboot.mycgv.repository;

import com.springboot.mycgv.dto.MemberDto;
import com.springboot.mycgv.dto.SessionDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberMapper {

    int join(MemberDto memberDto);

    int idcheck(String id);
    SessionDto login(MemberDto memberDto);
}
