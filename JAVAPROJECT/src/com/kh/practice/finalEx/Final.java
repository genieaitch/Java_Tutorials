package com.kh.practice.finalEx;

import java.util.Scanner;

public class Final {
    //정수 배열numbers가 주어집니다. 배열에 들어 있는 홀수 값의 합을 계산하는 프로그램을 작성하세요.
    //예시 입력:
    //numbers = {1, 2, 3, 4, 5}
    //예시 출력:
    //홀수 값의 합: 9
    public void method1(){
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;

            System.out.print("배열 값 : ");
        for(int num : numbers){
            System.out.print(num + " ");
            if (num % 2 !=0){
                sum += num;
            }
        }
        System.out.println("");
        System.out.println("홀수 값의 합 : " + sum);
    }

    public void method2(){
        String[] names = {"Alice", "Bob", "Andrew", "Eve"};
        String firstName = names[0];

        System.out.print("A로 시작하는 이름 : ");
        for (String name : names) {
            if (name.startsWith("A")) {
                System.out.print(name + " ");
            }
        }
    }
    public void method3(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("---나눗셈 계산기---");
        System.out.print("첫 번째 정수를 입력해주세요 : ");
        int num = scanner.nextInt();

        System.out.print("두 번쨰 정수를 입력해주세요 : ");
        int num2 = scanner.nextInt();


        if(0>=num && 0>=num2){
            System.out.println("Cannot divide by zero");
        } else {
            System.out.println("결과 : " +num/num2);
        }
    }

    }
