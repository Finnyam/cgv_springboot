package com.springboot.mycgv.service;

import com.springboot.mycgv.dto.PageDto;
import com.springboot.mycgv.repository.PageMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PageService {
    @Autowired
    private PageMapper pageMapper;


    public PageDto getPageResult(PageDto pageDto){
        //페이징 처리 - startCount, endCount 구하기
        int startCount = 0;
        int endCount = 0;
        int pageSize = 0;	//한페이지당 게시물 수
        int reqPage = 1;	//요청페이
        int pageCount = 1;	//전체 페이지 수
        int dbCount = 0;	//DB에서 가져온 전체 행수

        dbCount = pageMapper.totalRowCount(pageDto);

        if(pageDto.getServiceName().equals("notice")) {
            pageSize = 3;
        }else if(pageDto.getServiceName().equals("member")) {
            pageSize = 5;
        }else if(pageDto.getServiceName().equals("board")) {
            pageSize = 10;
        }

        //총 페이지 수 계산
        if(dbCount % pageSize == 0){
            pageCount = dbCount/pageSize;
        }else{
            pageCount = dbCount/pageSize+1;
        }

        //요청 페이지 계산
        if(pageDto.getPage() != null){
            reqPage = Integer.parseInt(pageDto.getPage());
            startCount = (reqPage-1) * pageSize+1;
            endCount = reqPage *pageSize;
        }else{
            startCount = 1;
            endCount = pageSize;
        }

        //pageDto 객체에 데이터 put
        pageDto.setStartCount(startCount);
        pageDto.setEndCount(endCount);
        pageDto.setDbCount(dbCount);
        pageDto.setPageSize(pageSize);
        pageDto.setPageCount(pageCount);
        pageDto.setReqPage(reqPage);

        return pageDto;
    }

}
