package com.kh.practiceEx.oopArrayPre;

import java.util.Scanner;

public class PersonService {
    public static void main(String[] args) {

        //Person 배열 생성
        Person[] people = new Person[4];

        Scanner sc = new Scanner(System.in);

        //Scanner 객체를 이용해서 사용자에게 키보드로 정보를 입력하고 배열 초기화
        for (int i = 0; i < people.length; i++) {
        System.out.print(i+1+"번째 사람의 이름을 입력해주세요 : ");
        String name = sc.nextLine(); //이름 입력
        System.out.print(i+1+"번째 사람의 나이를 입력해주세요 : ");
        int age = sc.nextInt(); //나이 입력
        sc.nextLine(); //int 남아있는 줄바꿈 버퍼 비우기
        people[i] = new Person(name, age);
        System.out.println(people[i]);
        }
        System.out.println("\n모든 사람이 등록되었습니다. 아래는 등록된 정보입니다.");


        /*
        //Person 배열의 각 값을 객체로 초기화
        people[0] = new Person("홍길동", 20);
        people[1] = new Person("박길자", 30);
        people[2] = new Person("오성순", 40);
        people[3] = new Person("강하석", 50);
         */

        //각 배열의 값을 출력 1 일반 for문 2 향상된 for문으로 만들기

        //1번 일반 for문
        for (int i =0; i<people.length; i++){
            System.out.println(people[i]);
        }
/*
        //2번 향상된 for문 (for-each 문)
        for (Person p: people){
            System.out.println(p);
        }
 */
    }
}
