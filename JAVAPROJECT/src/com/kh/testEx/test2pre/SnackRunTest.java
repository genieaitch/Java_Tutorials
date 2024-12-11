package com.kh.testEx.test2pre;

import java.util.ArrayList;

public class SnackRunTest {
    public static void main(String[] args) {
        //배열
        ArrayList<Snack> snacks = new ArrayList<Snack>();

        //정보 입력
        Snack sn1 = new Snack("포테이토칩", "짠맛", 1500);
        Snack sn2 = new Snack("초코파이", "단맛", 2000);
        Snack sn3 = new Snack("허니버터칩", "허니버터맛", 2500);

        //배열 입력
        snacks.add(sn1);
        snacks.add(sn2);
        snacks.add(sn3);

        //출력
        for(Snack sn : snacks){
            System.out.println(sn);
        }
    }
}
