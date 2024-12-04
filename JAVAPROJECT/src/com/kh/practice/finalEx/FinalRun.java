package com.kh.practice.finalEx;

import java.util.Scanner;

public class FinalRun {
    public static void main(String[] args) {
                Final f = new Final();
        System.out.println("===홀수더하기 기능===");
        f.oddSUm();
        System.out.println("===첫 번째 글자가 A로 시작하는 단어 찾기===");
        f.filterNames();
        System.out.println("===나눗셈 결과 출력===");
        f.division();
        System.out.println("===파일 안에 있는 숫자 더하고, 더한 숫자 result.txt에 저장하기===");
        f.fileSum();
        System.out.println("===계산기 실행하기===");
        f.method7();


        }
    }

