package com.springboot.mycgv.repository;

import com.springboot.mycgv.dto.NoticeDto;
import com.springboot.mycgv.dto.PageDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface NoticeMapper {
    NoticeDto content(String nid);
    List<NoticeDto> list(PageDto pageDto);
}
