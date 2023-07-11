package com.springboot.mycgv.controller;

import com.springboot.mycgv.dto.BoardDto;
import com.springboot.mycgv.dto.PageDto;
import com.springboot.mycgv.service.BoardService;
import com.springboot.mycgv.service.FileUploadService;
import com.springboot.mycgv.service.PageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BoardController {
    @Autowired
    private BoardService boardService;
    @Autowired
    private PageService pageService;
    @Autowired
    private FileUploadService fileUploadService;

    @PostMapping("board_write")
    public String board_write_proc(BoardDto boardDto) throws Exception{
        //file upload service & insert
        boardDto = (BoardDto) fileUploadService.fileCheck(boardDto);
        int result = boardService.insert(boardDto);
        if(result == 1) fileUploadService.fileSave(boardDto);
        return "redirect:/board_list/1/";
    }

    @GetMapping("board_write")
    public String board_write(){
        return "/board/board_write";
    }

    @GetMapping("board_content/{bid}/{page}")
    String board_content(@PathVariable String bid,@PathVariable String page, Model model){
        model.addAttribute("board",boardService.content(bid));
        model.addAttribute("page",page);
        return "/board/board_content";
    }

    @GetMapping("board_list/{page}")
    public String board_list(@PathVariable String page, Model model){
        PageDto pageDto = pageService.getPageResult(new PageDto(page, "board"));
        model.addAttribute("list",boardService.list(pageDto));
        model.addAttribute("page",pageDto);
        return "/board/board_list";
    }
}
