package com.springboot.mycgv.repository;

import com.springboot.mycgv.dto.BoardDto;
import com.springboot.mycgv.dto.PageDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {
    int delete(String bid);
    String getBsfile(String bid);
    int update(BoardDto boardDto);
    int insert(BoardDto boardDto);
    BoardDto content(String bid);
    List<BoardDto> list(PageDto pageDto);

}
