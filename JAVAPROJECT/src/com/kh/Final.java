package com.kh;

public class Final {
    //정수 배열numbers가 주어집니다. 배열에 들어 있는 홀수 값의 합을 계산하는 프로그램을 작성하세요.
    //예시 입력:
    //numbers = {1, 2, 3, 4, 5}
    //예시 출력:
    //홀수 값의 합: 9
    public void method1(){
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;

        for(int num : numbers){
            if (num % 2 !=0){
                sum += num;
            }
        }
        System.out.println("홀수 값의 합 : " + sum);
    }
}
