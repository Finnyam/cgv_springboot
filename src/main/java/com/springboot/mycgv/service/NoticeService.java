package com.springboot.mycgv.service;

import com.springboot.mycgv.dto.NoticeDto;
import com.springboot.mycgv.dto.PageDto;
import com.springboot.mycgv.repository.NoticeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.List;


@Service
public class NoticeService {

    @Autowired
    private NoticeMapper noticeMapper;

    public NoticeDto content (String nid){
        return noticeMapper.content(nid);
    }

    public List<NoticeDto> list(PageDto pageDto){
        return noticeMapper.list(pageDto);
    }
}
