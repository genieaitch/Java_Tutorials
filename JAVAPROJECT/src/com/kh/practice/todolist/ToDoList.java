package com.kh.practice.todolist;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ToDoList {

    private static String PATH = System.getProperty("user.home") + "/Desktop/";
    private static String FILE_NAME = "todolist"; // 기본 파일 이름
    private static String EXT_NAME = ".txt"; // 기본 확장자명

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);


        System.out.println("==== To-Do 리스트 관리 ====");
        System.out.println("1. 기존 파일 불러오기");
        System.out.println("2. 새로운 파일로 시작하기");
        System.out.print("옵션을 선택하세요: ");
        String firstChoice = scanner.nextLine();

        File file = new File(PATH + FILE_NAME + EXT_NAME);

        switch (firstChoice) {
            case "1":
                System.out.print("불러올 To-Do 리스트 파일 이름을 입력하세요(확장자 제외): ");
                FILE_NAME = scanner.nextLine() + EXT_NAME;
                if (!file.exists()) {
                    System.out.println("파일을 찾을 수 없습니다: 투두리스트.txt. 새로운 파일을 생성하거나 확인하세요.\n");
                    return;
                }
                break;
            case "2":
                System.out.print("새로운 To-Do 리스트 이름을 입력하세요(확장자 제외): ");
                FILE_NAME = scanner.nextLine() + EXT_NAME;
                file.createNewFile();
                System.out.println("새로운 파일이 생성됩니다: " + FILE_NAME + EXT_NAME);
                break;
            case "3":
                System.out.println("프로그램을 종료합니다.");
                return;
            default:
                System.out.println("잘못된 선택입니다. 기본 파일로 시작합니다: " + FILE_NAME + EXT_NAME);
        }


        boolean isTrue = true;
        while (isTrue) {
            System.out.println("\n==== To-Do 리스트 ====");
            System.out.println("1. 할 일 목록 보기");
            System.out.println("2. 할 일 추가");
            System.out.println("3. 종료");
            System.out.print("옵션을 선택하세요: ");
            String choice = scanner.nextLine();


            switch (choice) {
                case "1":
                    if (file.exists()) {
                        Scanner fileReader = new Scanner(file);
                        System.out.println("- " + fileReader);
                    } else {
                        System.out.println("등록된 할 일이 없습니다.");
                    }

                    break;

                case "2":
                    System.out.print("새로운 할 일을 입력하세요 : ");
                    String todo = scanner.nextLine();
                    FileWriter writer = new FileWriter(file, true);
                    System.out.println("할 일이 추가되었습니다 : " + todo);
                    break;

                case "3":
                    System.out.println("프로그램을 종료합니다.");
                    isTrue = false;
                    break;

                default:
                    System.out.println("잘 못 입력했습니다. 1,2 둘 중하나만 선택해 주세요");
            }
        }
    }

}
