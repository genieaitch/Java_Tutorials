package com.kh.loopEx;

import java.util.Scanner;

public class LoopRun {
    public static void main(String[] args) {
//        ForEx forEx = new ForEx();
//        forEx.method1();
//        forEx.method2();

        WhileEx we = new WhileEx();
        Scanner sc = new Scanner(System.in);
        System.out.print("더할 숫자를 입력해주세요 : ");
        int input = sc.nextInt();
        sc.nextLine();
        we.method1(input);
    }
}
