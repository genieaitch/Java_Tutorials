package com.kh.polymorphismEX;

/*
다형성 : 다양한 형태를 지니는 성질

1. 상속 관계의 자식 객체의 모습이 여러 모습으로 보임
   자식 객체, 부모 객체, Object 객체 등으로 변하는 것처럼 보임

2. 오버 로딩
   같은 클래스에서 같은 이름의 메서드를 여러번 작성하는 기술
   조건 : 메서드명 동일, 매개변수 개수, 타입 순서 하나라도 달라야함
   목적 : 전달 받은 매개 변수에 따른 상황별 처리 방법 구현
sum(a,b) → 두 수 더하기
sum(a,b,c) → 세 수 더하기
sum(배열) → 배열 내 요소 모두 더하기
*/
public class PolymorphismEX {

    /*오버로딩문제
    public void sum(int a, int b){
        System.out.println(a+b);
    };
    public void sum(int a, int b, int c){
        System.out.println(a+b+c);
    };
    public void sum(double a, double b){
        System.out.println(a+b);
    };
    public void sum(String a, String b){
        System.out.println(a+b);
    };
    */


    /*기준*/
    public void method1(int i) {
    }

    //1 매개변수 타입이 달라서 적용 가능
    public void method1(String str) {
    }

    //2 매개변수 개수와 타입이 달라서 적용 가능
    public void method1(int i, String str) {
    }

    //3 기준과 매개변수의 타입과 개수가 같아서 적용 불가
//public void method1(int num){} → 오버로딩 되지 않음(int 1개 동일 사용/기준)

    //4 기준과 3번과 메서드명과 매개변수의 타입, 개수가 같아서 오버로딩 적용 불가
    // 매개변수명과 반환형은 오버로딩이 되는 조건과 상관이 없음
//public char method1(int point){} → 오버로딩 되지 않음(int 1개 동일 사용/기준, 3)

    //5 기준과 매개변수 개수가 달라서 적용 가능
    public void method1(int i, int k) {
    }

//6 2번 메서드와 순서와 자료형명칭 개수가 모두 동일하기 때문에 적용 불가
//public void method1(int num, String string){} → 오버로딩 되지 않음(int String 동일 사용/2)

    //7 매개변수명 앞에 존재하는 자료형이 작성된 순서가 다르기 때문에 적용 가능
    public void method1(String str, int i) {
    }

}
