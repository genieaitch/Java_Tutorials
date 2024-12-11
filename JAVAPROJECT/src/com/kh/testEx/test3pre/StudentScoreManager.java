package com.kh.testEx.test3pre;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentScoreManager {
    public static void main(String[] args) {

        //학생이름과 점수를 정장할 Map 생성
        Map<String, Integer> m = new HashMap<String, Integer>();
        StudentScoreManager.ssm =

        //학생 정보 저장
        m.put("김철수", 85);
        m.put("이영희", 92);
        m.put("박민수", 77);
        m.put("최수진", 88);

        //학생 정보 출력
        System.out.println("===학생 정보 출력===");
        for (Map.Entry<String, Integer> entry : m.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        //점수 기준 합격/불합격 판단
        System.out.println("===합격 / 불합격 판단===");
        for (Map.Entry<String, Integer> entry : m.entrySet()) {
            String status = (entry.getValue() >= 80) ? "합격" : "불합격";
            System.out.println(entry.getKey() + " : " + status + " : " + entry.getValue());
        }


        //점수 수정 기능

        String updateName = "박민수";
        if (m.containsKey(updateName)) {
            m.put(updateName, 82);
            System.out.println(updateName + "의 점수를 82점으로 수정합니다.");
        } else {
            System.out.println("존재하지 않는 학생입니다.");
        }
        /*
        System.out.print("점수를 변경할 학생 이름 : ");
        String name = sc.nextLine();
        System.out.print("변경할 점수 : ");
        int score = sc.nextInt();
        sc.nextLine();
        m.put(name, score);

         */

        System.out.println("===변경 후===");
        ssm.Student
        }
    }

    //점수 출력 기능 메서드

    /** 학생점수로 합격 불합격 판단여부 출력하는 메서드
     * public void printPassFailScore(Map<String, Integer> m)
     * @param m = 특정학생들의 이름과 점수가 넘어오면 학생들의 대한 점수를 판단 후 출력
     */
    public void printPassFailScore(Map<String, Integer> m) {
        for (Map.Entry<String, Integer> entry : m.entrySet()) {
            String status = (entry.getValue() >= 80) ? "합격" : "불합격";
            System.out.println(entry.getKey() + " : " + status + " : " + entry.getValue());
    }
}