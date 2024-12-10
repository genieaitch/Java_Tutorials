package com.kh.practiceEx.oopArrayPre;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GoodsServiceRun {
    public static void main(String[] args) {
        GoodsService goodsService = new GoodsService();
        Scanner scanner = new Scanner(System.in);
        //false가 될 때까지 반복
        while (true) {
            System.out.println("\n=====상품 설정 시스템 =====");
            System.out.println("1. 상품추가하기");
            System.out.println("2. 모든상품보기");
            System.out.println("3. 원하는상품보기(상품번호로 조회)");
            System.out.println("4. 원하는상품보기(상품명으로 조회)");
            System.out.println("5. 상품제거하기(상품번호로 제거)");
            System.out.println("6. 종료하기");
            System.out.print("번호를 선택하세요 : ");

            try {
                int choice = scanner.nextInt();
                scanner.nextLine(); //줄바꿈 버퍼 제거

                //switch case 사용해서 기능 완성
                switch (choice) {
                    case 1:
                        System.out.print("상품 번호: ");
                        int id = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("상품 이름: ");
                        String name = scanner.nextLine();
                        System.out.print("상품 수량: ");
                        int quantity = scanner.nextInt();
                        System.out.print("상품 가격: ");
                        int price = scanner.nextInt();

                        Goods goods = new Goods(id, name, quantity, price);
                        goodsService.addGoods(goods);
                        break;
                    case 2:
                        System.out.println("----모든 상품 조회하기----");
                        goodsService.displayAllGoods();
                        break;
                    case 3:
                        System.out.println("----상품 찾기 서비스----");
                        System.out.print("상품 번호로 찾기 : ");
                        int number = scanner.nextInt();
                        scanner.nextLine();
                        Goods foundGoods = goodsService.getGoodsId(number);
                        System.out.println(foundGoods);
                        break;
                    case 4:
                        System.out.println("----상품 찾기 서비스----");
                        System.out.print("상품명으로 찾기 : ");
                        String findName = scanner.nextLine();
                        goodsService.getGoodsByName(findName);
                        System.out.println(findName);
                        break;
                    case 5:
                        System.out.println("---상품 제거 서비스---");
                        System.out.print("제거할 상품 번호 : ");
                        int delNum = scanner.nextInt();
                        scanner.nextLine();
                        goodsService.removeGoodsById(delNum);
                        break;

                    case 6:
                        System.out.println("시스템 종료를 선택하셨습니다.");
                        return;
                    default:
                        System.out.println("잘못된 번호입니다. 다시 입력해주세요.");
                        break;
                }
            } catch (InputMismatchException e) {//숫자칸에 문자를 넣었을 때 보여줄 출력문
                System.out.println("숫자 형식만 가능합니다" + e.getMessage());
                scanner.nextLine(); //예외 발생 시 입력 버퍼에 남아있던 잘못된 값을 비우기
            } catch (Exception e) {
                System.out.println("문제가 발생했습니다." + e.getMessage());
            } finally {//실행하는 반복문이 우선이기 때문에 동작X
                System.out.println("프로그램을 종료합니다.");
            }
        }
    }
}
