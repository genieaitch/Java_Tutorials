package com.kh.StringEx;

public class StringBuilderEx {
    public static void main(String[] args) {

    }
    public void method1(){
        StringBuilder s1 = new StringBuilder();
        s1.append("hello"); //s1공간에 hello 작성되고
        s1.append("world"); //s1공간에 hello world가 작성됨
        System.out.println(s1);
        //String에서는 +=을 작성하지 않으면 이어서 작성한 다음 객체생성을 하지 않고 단독 작성

        //StringBuilder는 이어서 작성
    }
}
