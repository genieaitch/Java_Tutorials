package com.kh.testEx.test2pre;

public class SnackTest {
    private String name;
    private String flavor;
    private int price;

    public SnackTest() {
    }

    public SnackTest(String name, String flavor, int price) {
        this.name = name;
        this.flavor = flavor;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getFlavor() {
        return flavor;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "SnackTest{" + "name='" + name +", flavor='" + flavor + ", price=" + price +'}';
    }
}
