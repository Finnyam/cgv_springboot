package com.springboot.mycgv.dto;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

@Data
public class BoardDto {
	String page;
	int rno, bhits;
	String bid, btitle, bcontent, id, bdate, bfile, bsfile;
	MultipartFile file1; //폼에서 넘어오는 파일 객체
	
}
