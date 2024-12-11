package com.kh.testEx.test3pre;

import java.util.HashMap;
import java.util.Scanner;

public class StudentSetRun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, String> studentset = new HashMap<>();
        boolean exist = false;
        while (!exist) {
            System.out.println("학생 관리 프로그램");
            System.out.println("1. 학생 추가");
            System.out.println("2. 학생 삭제");
            System.out.println("3. 학생 목록 출력");
            System.out.println("4. 특정 학생 존재 여부 확인");
            System.out.println("5. 종료");
            System.out.print("메뉴 선택: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("=== [1] 학생 추가 ===");
                    System.out.print("추가할 학생 이름을 입력해주세요 : ");
                    String putName = sc.next();
                    if (studentset.containsKey(putName)) {
                        System.out.println("이미 존재합니다.");
                    } else {
                        studentset.put(putName, putName);
                        System.out.println(putName + "님이 등록되었습니다.");
                    }
                    break;
                case 2:
                    System.out.println("=== [2] 학생 삭제 ===");
                    System.out.print("삭제할 학생 이름을 입력해주세요 : ");
                    String removeName = sc.nextLine();
                    if (studentset.containsKey(removeName)) {
                        studentset.remove(removeName);
                        System.out.println(removeName + "님이 삭제되었습니다.");
                    } else {
                        System.out.println("존재하지 않는 학생입니다.");
                    }
                    break;
                case 3:
                    System.out.println("=== [3] 학생 목록 출력 ===");
                    if (studentset.isEmpty()) {
                        System.out.println("존재하지 않는 학생입니다.");
                    } else {
                        for (String name : studentset.keySet()) {
                            System.out.println(studentset.get(name));
                        }
                    }
                    break;
                case 4:
                    System.out.println("=== [4] 특정 학생 존재 여부 확인 ===");
                    System.out.print("존재여부를 확이할 학생 이름을 입력해주세요 : ");
                    String findName = sc.next();
                    if (studentset.containsKey(findName)) {
                        System.out.println(findName + "학생은 존재합니다.");
                    } else {
                        System.out.println("존재하지 않는 학생입니다.");
                    }
                    break;
                case 5:
                    System.out.println("프로그램을 종료합니다.");
                    exist = true;
                    break;
                default:
                    System.out.println("잘못된 입력입니다. 다시 선택해주세요.");
                    break;
            }

        }
    }
}
