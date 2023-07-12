package com.springboot.mycgv.service;

import com.springboot.mycgv.dto.BoardDto;
import org.springframework.stereotype.Service;

import java.io.File;
import java.util.UUID;

@Service
public class FileUploadService {
    /*
       fileDelete
     */
    public void fileDelete(String oldBsFile) throws Exception{
        //파일의 저장위치
        String projectPath = System.getProperty("user.dir")+"/src/main/resources/static/upload/";
        File deleteFile = new File(projectPath+oldBsFile);
        if(deleteFile.exists()) deleteFile.delete();
    }


    /**
     *  fileSave 기능  - 파일이 존재하면 서버에 저장하는 메소드
     */
    public void fileSave(BoardDto boardDto) throws Exception{
        //파일의 저장위치
        String projectPath = System.getProperty("user.dir")+"/src/main/resources/static/upload/";

        //파일이 존재하면 서버에 저장
        if(boardDto.getFile1().getOriginalFilename() != null && !boardDto.getFile1().getOriginalFilename().equals("")) {
            File saveFile = new File(projectPath+boardDto.getBsfile());
            boardDto.getFile1().transferTo(saveFile);
        }
    }

    /**
     * fileCheck 기능
     */
    public Object fileCheck(BoardDto boardDto) {
        if(boardDto.getFile1().getOriginalFilename() != null
                && !boardDto.getFile1().getOriginalFilename().equals("")) { //파일이 존재하면
            //BSFILE 파일 중복 처리
            UUID uuid = UUID.randomUUID();
            String bfile =  boardDto.getFile1().getOriginalFilename();
            String bsfile = uuid + "_" + bfile;
            boardDto.setBfile(bfile);
            boardDto.setBsfile(bsfile);
        }else {
            System.out.println("파일 없음");
            //boardVo.setBfile("");
            //boardVo.setBsfile("");
        }
        return boardDto;
    }
}
