package com.kh.practiceEx.oopArrayPre;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductService {
    //products(제품들) = 제품 목록저장할 배열리스트
    private ArrayList<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
        System.out.println(product.getName() + "제품이 추가되었습니다.");
    }
    //제품 목록보기
    public void viewProduct() {
        if (products.size() > 0) {
            System.out.println("===제품 목록===");
            for(Product p : products) {
                System.out.println(p);
                System.out.println("-------------------");
            }
        }
    }
    //특정 제품 겁색 기능(제품명으로 검색)
    public Product searchProduct(String name) {
        for(Product p : products) { //제품목록을 순회하며
            if(p.getName().equalsIgnoreCase(name)) { //검색한 이름과 목록에 적혀있는 이름이 일치하면
                return p; //찾는 이름과 존재하는 이름이 일치하는 제품 정보를 전달
            }
        }
        return null; // 찾는 정보가 없으면 null 값 전달
    }
}
