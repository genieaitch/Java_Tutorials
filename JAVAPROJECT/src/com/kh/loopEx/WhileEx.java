package com.kh.loopEx;

import java.util.Scanner;

public class WhileEx {

    /*
     while(조건이 true일 때 실행){

     }

     while을 멈추는 방법 1
        특정 조건에서 return

     while을 멈추는 방법 2
        변수명에 논리값(true / false)를 담고 멈추고자 하는 특정 조건에서 논리 값을 false로 변경

        boolean is = true;
        while(is){
            is = false;
        }

     while을 멈추는 방법 3
        조건을 false로 변경
        while (조건){
            조건이 false가 될 때까지 수행
        }
    */

    public void method1(int input){
        int sum = 0; //합계 누적용 변수
        LoopRun loop = new LoopRun();
        //int input = 0; //입력 값을 저장할 변수

        while(input !=-1){ //입력 값이 -1이 아니면 반복
            System.out.println("--- 반복 시작 ---");

            if(input !=-1) sum += input; //-1이 입력된 경우 제외
            //입력한 값 갱신을 위해 설정하는 input
            //LoopRun에서 Scanner로 입력 받은 값을 실행하는 method1에 들어와서
            //input 값을 다시 새로 작성하는 코드가 존재하지 않기 때문에
            //다시 inpu 값을 재정의할 수 있도록 작성
            input = new Scanner(System.in).nextInt();
        }
        System.out.println("합계 : " + sum);
    }

    /*
    do-while()
    - 조건식이 뒤에 작성된 while문
    - true가 아니더라도 최초 1회 이상의 반복을 보장

    do {
        최초 1회는 무조건 수행하되, 2회부터는 while문이 true이어야 실행
    } while(조건);
    */

}
