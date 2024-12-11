package com.kh.testEx.test3pre;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class StrudentSetTestRun2 {
    public static void main(String[] args) {

        Set<String> studentSet = new HashSet<>();
        Scanner scanner = new Scanner(System.in);

        boolean exit = false;
        while (!exit) {
            System.out.println("학생 관리 프로그램");
            System.out.println("1. 학생 추가");
            System.out.println("2. 학생 삭제");
            System.out.println("3. 학생 목록 출력");
            System.out.println("4. 특정 학생 존재 여부 확인");
            System.out.println("5. 종료");
            System.out.print("메뉴 선택: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("===[1] 학생 추가===");
                    System.out.print("추가할 학생 이름을 작성하세요 : ");
                    String inputName = scanner.next();
                    if (!studentSet.contains(inputName)) {
                        studentSet.add(inputName);
                        System.out.println(inputName + " 학생을 추가하였습니다.");
                    } else {
                        System.out.println("이미 존재하여 추가하지 않았습니다.");
                    }
                    break;
                case 2:
                    System.out.println("===[2] 학생 삭제===");
                    System.out.print("삭제할 학생 이름을 작성하세요 : ");
                    String removeName = scanner.next();
                    if (studentSet.contains(removeName)) {
                        studentSet.remove(removeName);
                        System.out.println(removeName + "학생을 삭제하였습니다.");
                    } else {
                        System.out.println("존재하지 않는 학생입니다.");
                    }
                    break;
                case 3:
                    System.out.println("===[3] 학생 목록===");
                    for (String name : studentSet) {
                        System.out.println(name);
                    }
                    break;
                case 4:
                    System.out.println("===[4] 학생 찾기===");
                    System.out.print("찾을 학생 이름을 작성하세요 : ");
                    String findName = scanner.next();
                    if (studentSet.contains(findName)) {
                        System.out.println(findName + "학생은 존재합니다.");
                    } else {
                        System.out.println(findName + "학생은 존재하지 않습니다.");
                    }
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("잘못입력했습니다. 다시 입력해주세요");
                    break;
            }
        }

    }
}
