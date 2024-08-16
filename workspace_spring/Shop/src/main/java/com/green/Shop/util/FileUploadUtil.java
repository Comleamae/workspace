package com.green.Shop.util;

import com.green.Shop.item.vo.ImgVO;

import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

//첨부파일과 관련된 기능
public class FileUploadUtil {

    //파일 업로드 *static이 잇을 경우 객체를 만들 필요 없이 사용 가능
    public static ImgVO fileUpload(MultipartFile uploadFile){
        //원본 파일명 및 첨부된 파일명을 저장하기 위한 객체
        ImgVO imgVO = null;

        //input 태그에 파일을 선택했을 때만 첨부기능 실행
        if(!uploadFile.isEmpty()){
            imgVO = new ImgVO();

            //업로드 될 경로 *\:특수문자를 문자로 출력하고 싶을 때 앞에 넣어라
            String uploadPath = "D:\\01-STUDY\\dev\\workspace\\workspace_spring\\Shop\\src\\main\\resources\\static\\upload\\";

            //첨부될 파일명(내가 선택한 원본 파일명)
            String originFileName = uploadFile.getOriginalFilename();


            //첨부될 파일명을 랜덤하게 생성
            String uuid = UUID.randomUUID().toString();

            //원본 파일에서 확장자만 추출
            int dotIndex = originFileName.lastIndexOf(".");
            String extension = originFileName.substring(dotIndex);

            //첨부될 파일명
            String attachedFileName = uuid+extension;

            /* String a = "abc.jpg";
            //substring(찾기 시작하는 순서, 앞에서 부터 몇번째까지)
            a.substring(3);
            String b = "ab.cd.ef";
            //indexOf(찾는 문자, index):찾는 문자의 index(위치)
            b.indexOf(".");//2
            //가장 마지막에 있는 문자열의 인덱스
            b.lastIndexOf(".");//5
            b.substring(b.lastIndexOf("."), b.length()-b.lastIndexOf(".")); */

            //첨부될 파일 생성()
            File file = new File(uploadPath + attachedFileName);

            //첨부 기능 실행 + 예외처리
            try {
                uploadFile.transferTo(file);

                //첨부된 파일 정보를 imgVO에 저장
                imgVO.setOriginFileName(originFileName);
                imgVO.setAttachedFileName(attachedFileName);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return imgVO;
    }
}
