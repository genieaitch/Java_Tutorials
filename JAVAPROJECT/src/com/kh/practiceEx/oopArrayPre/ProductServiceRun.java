package com.kh.practiceEx.oopArrayPre;

import java.util.Scanner;

public class ProductServiceRun {
    public static void main(String[] args) {
        ProductService productService = new ProductService();
        Scanner scanner = new Scanner(System.in);

        //제품명 가격 입력받기

        System.out.print("등록할 제품명을 입력해 주세요 : ");
        String inputName = scanner.nextLine();

        System.out.print("제품 가격을 입력해 주세요 : ");
        int inputPrice = scanner.nextInt();
        scanner.nextLine();

        String inputDescription = null;
        String inputCategory = null;

        System.out.print("제품 설명과카테고리 입력하시겠습니까?(yes/no) : ");
        String inputQ = scanner.nextLine();

        if (inputQ.equalsIgnoreCase("yes")) {
            System.out.print("제품 설명을 입력해 주세요 : ");
            inputDescription = scanner.nextLine();
            System.out.print("카테고리를 입력해주세요 : ");
            inputCategory = scanner.nextLine();

        } else if (inputQ.equalsIgnoreCase("no")) {
            System.out.println("추후에 수정 가능합니다.");
            inputDescription = "제품 설명이 존재하지 않습니다.";
            inputCategory = "없음";

            //Description 과 Category 에 추가 작성을 원한다면 "없음"으로 작성
        } else {
            System.out.println("잘못입력하셨습니다. 다시 입력해주세요");
        }
        Product p = new Product(inputName, inputPrice); //setName setPrice 필요없음
        p.setDescription(inputDescription);
        p.setCategory(inputCategory);
        productService.addProduct(p);

/*
        //p1 제품 추가
        Product p1 = new Product("스마트폰", 100000);
        p1.setDescription("최신 스마트폰입니다. 12/24 출고예정");
        p1.setCategory("전자기기");

        //p2 제품 추가
        Product p2 = new Product("노트북", 150000);
        //p2에서 제품설명이 null 값일 경우 없음으로 저장
        //p2에서 카테고리가 null 값일 경우 없음으로 저장
        if (p2.getDescription() == null) {
            p2.setDescription("없음");
        }
        if (p2.getCategory() == null) {
            p2.setCategory("없음");
        }

        productService.addProduct(p1);
        productService.addProduct(p2);
*/
        //제품목록 보기
        productService.viewProduct();


        //제품명으로 제품검색
        //searchProduct 기능이 void가 아닌 return 값이 Product 이기 때문에 Product 자료형으로 변수명 설정
        Product sp = productService.searchProduct("노트북");
        if (productService.searchProduct("노트북") != null) {
            System.out.println("검색된 제품 : " + sp);
        } else {
            System.out.println("해당 이름에 제품을 찾을 수 없습니다.");
        }

    }
}
