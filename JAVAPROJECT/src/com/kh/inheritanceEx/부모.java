package com.kh.inheritanceEx;

public class 부모 {
    public String 성씨 = "강";
    
    private int money = 100_000_000; //숫자 단위 구분 할 때 _ 사용하기도 함
    private String car = "제네시스";
    
    //기본 생성자

    public 부모() {
        super(); //Object를 물려받아 만들기 때문에 super()가 존재하긴 하지만 생략
    }

    //매개변수 생성자(파라미터 생성자)
    public 부모(/*super를 작성해도 되긴함*/String 성씨, int money, String car) {
        super(); //이미 존재하기 때문에 생략
        this.성씨 = 성씨;
        this.money = money;
        this.car = car;
    }

    //getter / setter
    //성씨는 부모에게서 물려받은 것이기 때문에 변경 불가함으로 set성씨 사용 불가 get성씨는 가능
    public String get성씨(){
        return 성씨;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }

    /*Override() 오버라이딩
    부모 메서드 위에 자식 메서드가 올라탐
    부모 기능을 자식이 다시 정의를 내려서 사용
    재정의
    */

    //toString
    @Override
    public String toString() {
        return "부모의 성씨='" + 성씨 +", money=" + money +", car='" + car;
    }
}
