package com.springboot.mycgv.dto;

import lombok.Data;

@Data
public class MemberDto {
    //폼에서 넘어오는 모든 name/value 저장
    String id, pass, name, gender, email1, email2, addr1, addr2, tel,
            phone1, phone2, phone3, intro;
    String[] hobby;

    //member 테이블 컬럼 매핑
    int rno;
    String email, addr, pnumber, hobbyList, mdate, grade;



    public String getEmail() {
        if(email1 != null) {  //폼에서 email주소가 넘어온 경우
            email = email1 + "@" + email2;
        }
        return email;
    }

    public String getAddr() {
        if(addr1 != null) {
            addr = addr1 + addr2;
        }
        return addr;
    }

    public String getPnumber() {
        if(phone1 != null) {
            pnumber = phone1 +"-"+ phone2 +"-"+ phone3;
        }
        return pnumber;
    }

    public String getHobbyList() {
        if(hobby != null) {
            hobbyList = String.join(",", hobby);
        }
        return hobbyList;
    }


}
