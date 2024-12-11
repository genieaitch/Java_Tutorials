package com.kh.testEx.test1pre;

public class MemberRunTest {
    public static void main(String[] args) {
        MemberTest mt = new MemberTest();

        //정보 입력
        mt.setId("user1");
        mt.setName("강길자");
        mt.setPassword("pass1");

        //로그인 진행
        if(mt.login("user1", "pass1")){
            System.out.println("로그인 성공! " + mt.getName() + "님 환영합니다.");
        } else {
            System.out.println("로그인 실패! 아이디 또는 비밀번호를 확인하세요.");
        }
    }
}
