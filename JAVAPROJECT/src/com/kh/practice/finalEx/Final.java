package com.kh.practice.finalEx;

import java.awt.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Final {
    //정수 배열numbers가 주어집니다. 배열에 들어 있는 홀수 값의 합을 계산하는 프로그램을 작성하세요.
    //예시 입력:
    //numbers = {1, 2, 3, 4, 5}
    //예시 출력:
    //홀수 값의 합: 9
    public void oddSUm() {
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                sum += numbers[i];
            }
        }
        System.out.println("홀수의 합 : " + sum);
    }

    public void filterNames() {
        /*String[] names = {"Alice", "Bob", "Andrew", "Eve"};
        String firstName = names[0];*/

        ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Andrew");
        names.add("Eve");

        /*
        String 참조 자료형에 들어있는 기능
        맨 앞에 변수명으로는 boolean을 쓸 수 있음
        startsWith(String prefix) = prefix로 시작하는 글자가 있는지 확인
        예제) boolean startWord = String으로들어있는변수명.startsWith("시작하는단어들자");

        endWith(String suffix) = suffix로 끝나는 글자가 있는지 확인
        예제) boolean endWord = String으로들어있는변수명.endWith("시작하는단어들자");

        **prefix = 시작하는 (접두사)
          접두사 = 접할 접 머리 두 언어 사(사는 축사 축하하는 말씀할 때 쓰는 사)
          suffix = 끝나는   (접미사)
          접미사 = 접할 접 꼬리 미 언어 사
        */

        System.out.print("A로 시작하는 이름 : ");
        for (String name : names) {
            if (name.startsWith("A")) {
                System.out.print(name + " ");
            }
        }
    }

    public void division() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("---나눗셈 계산기---");
        System.out.print("첫 번째 정수를 입력해주세요 : ");
        int num = scanner.nextInt();

        System.out.print("두 번쨰 정수를 입력해주세요 : ");
        int num2 = scanner.nextInt();

        try {
            int result = num / num2;
            System.out.println("결과 : " + result);
        } catch (Exception e) {
            System.out.println("Cannot divide by zero");
        }

    }

    public void fileSum() {
        String path = System.getProperty("user.home") + "/Desktop/";
        String readFile = "numbers.txt";
        int sum = 0;

        //파일 쓰기 File(경로랑 파일이름 가져오기) FileWriter(가져온 파일에 글자를 작성하기)
        //파일 읽기 = FileReader(읽어올 파일의 경로와 이름 가져오기) BufferedReader(FileReader를 도와주는 객체)

        //File은 try catch 안에 들어있지 않음
        //FileWriter FileReader BuffereReader는 try 내부에 들어있어야함 try{} try()

        try (
                FileReader file = new FileReader(path + readFile);
             BufferedReader reader = new BufferedReader(file)
        ) {
            String line;
            while ((line = reader.readLine()) != null) {
                //window 컴퓨의 경우 뒤에 숨겨진 공백이 존재하기 때문에
                //trim() 양쪽 공백 제거를 이용해서 한 번 제거를 진행해야함
                //우리 눈에는 공백이지만 \r과 같은 공백이 포함되어있음 \r 왼쪽 끝으로 키보드 커서 이동
                sum += Integer.parseInt(line.trim());
            }
            } catch(Exception e){
                System.out.println("예상치 못한 문제로 파일을 읽을 수 없습니다." + e.getMessage());
            }
        //아래는 모두 더해진 숫자를 result.txt 작성하는 기능
        try(FileWriter writer = new FileWriter(path+"result.txt")) {
            writer.write("Sum : " +sum);
            System.out.println("더한 결과 작성 완료");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        }


}

    public void method7() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("계산할 첫 번째 정수를 입력하세요 : ");
        int num1 = scanner.nextInt();
        System.out.print("계산할 두 번째 정수를 입력하세요 : ");
        int num2 = scanner.nextInt();

        System.out.println("합 : " + (num1 + num2));
        System.out.println("차 : " + (num1 - num2));
        System.out.println("곱 : " +(num1 * num2));
        try {
            System.out.println("몫 : " +(num1 / num2));
        } catch (Exception e) {
            System.out.println("Cannot divide by zero");
            throw new RuntimeException(e);
        }
        System.out.println("나머지 : " +(num1 % num2));
    }