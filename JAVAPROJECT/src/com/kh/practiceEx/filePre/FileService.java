package com.kh.practiceEx.filePre;

import java.io.*;
import java.nio.file.Path;

public class FileService {
    //File FileWriter 이용해서 바탕화면에 food.docs 생성하기
    //try-catch

    /**
     * 파일 생성 및 작성하기 메서드
     * void createFile(String content)
     *
     * @param content
     */
    public void createFile(String content) {
        //사용자 바탕화면 경로 가져오기
        String path = System.getProperty("user.home") + "/Desktop/";
        String fileName = "food.docs";

        File file = new File(path + fileName); //파일경로와 파일명 가져오기

        //try()안에 FileWriter 나 FileReader BufferdReader 를 작성하면 close 따로 작성X
        try (FileWriter fw = new FileWriter(file)) {
            fw.write(content); //내용 작성하기
            System.out.println("파일이 성공적으로 생성되고, 내용이 작성되었습니다.");
        } catch (Exception e) {
            System.out.println("파일생성 / 작성 중 오류 발생 : " + e.getMessage());
        }
    }

    /*TODO : File FileReder BufferedReader 이용해서 파일 읽기 기능 설정
             try - resource - catch 작성
     */
    public void readFile() {
        String path = System.getProperty("user.home") + "/Desktop/";
        String fileName = "food.docs";

        File file = new File(path + fileName);
        try (FileReader fr = new FileReader(file);
             BufferedReader br = new BufferedReader(fr)) {
            System.out.println("[" + file + "] 내용");
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {
            System.out.println("파일 읽기 모드 중 오류 발생 : " + e.getMessage());
        }


    }

    /*
     TODO : 바탕화면에 있는 food.docs 파일에 이어쓰기 기능 설정해서 이어서 음식 작성
            \n- 햄버거 \n- 돈까스 \n- 쌀국수 \n- 카레
            File File Writer
            FileServiceRun에서 readFile 한 번 더 불러와 이어서 잘 작성되었는지 확인
     */

    /**
     * 파일 이어쓰기 기능 설정
     * public void appendToFile(String content)
     *
     * @param content 파일내용
     */
    public void appendToFile(String content) {
        //System.getProperty("user.home") = C/users/user1 까지의 경루 + user1 안에 있는 desktop = 바탕화면 폴더 이어쓰기
        String path = System.getProperty("user.home") + "/Desktop/";
        String fileName = "food.docs";

        File file = new File(path + fileName);
        String addContent = "\n- 햄버거 \n- 돈까스 \n- 쌀국수 \n- 카레";

        if(file.exists()) {
        try (FileWriter fileWriter = new FileWriter(file, true)) {
            fileWriter.write(addContent);
            System.out.println("성공적으로 내용을 이어붙였습니다.");
        } catch (Exception e) {
            System.out.println("내용 작성 중 오류 발생 : " + e.getMessage());
        }
    } else {
            System.out.println("파일이 존재하지 않습니다.");
        }
    }
}
