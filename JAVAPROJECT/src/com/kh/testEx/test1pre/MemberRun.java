package com.kh.testEx.test1pre;

import java.util.Scanner;

public class MemberRun {
    public static void main(String[] args) {
        Member m = new Member();

        m.setId("user1");
        m.setName("강길자");
        m.setPassword("pass1");

        if(m.login("user1", "pass1")){
            System.out.println("로그인 성공! " + m.getName() + "님 환영합니다.");
        } else {
            System.out.println("로그인 실패! 아이디 또는 비밀번호를 확인해 주세요");
        }
    }
}
