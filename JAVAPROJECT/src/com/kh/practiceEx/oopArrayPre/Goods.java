package com.kh.practiceEx.oopArrayPre;

public class Goods {
    //상품번호 이름 가격 수량
    //필드 멤버변수 전역변수 인스턴스변수 속성
    private int id;
    private String name;
    private int price;
    private int quantity;

    //메서드 기본생성자 파라미터생성자 게터 세터 toString
    public Goods() {
    }

    public Goods(int id, String name, int price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "상품번호=" + id + "\n 상품이름='" + name +"\n 상품가격=" + price +"\n 상품수량=" + quantity;
    }
}
