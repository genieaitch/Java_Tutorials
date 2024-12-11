package com.kh.testEx.test3pre;

import java.util.HashMap;
import java.util.Map;

public class StudentScoreManagerTest {
    public static void main(String[] args) {
        StudentScoreManagerTest smt = new StudentScoreManagerTest();

        //map
        Map<String, Integer> map = new HashMap<String, Integer>();

        //학생 정보 저장
        map.put("김철수", 85);
        map.put("이영희", 92);
        map.put("박민수", 77);
        map.put("최수진", 88);

        //학생 정보 출력
        System.out.println("===학생 정보===");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        //점수 기준으로 합격/ 불합격 판단
        System.out.println("===합격 여부===");
        smt.printPassFile(map);

        //점수 수정 기능
        System.out.println("===점수 수정===");
        String updateName = "박민수";
        if (map.containsKey(updateName)) {
            map.put(updateName, 82);
            System.out.println(updateName+"학생의 점수가 82점으로 변경되었습니다.");
        } else {
            System.out.println("존재하지 않는 학생입니다.");
        }

        //점수 수정 후 재출력
        System.out.println("===합격 여부===");
        smt.printPassFile(map);
    }

    //합격여부 메서드
    public void printPassFile(Map<String, Integer> map) {
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String score = (entry.getValue()>=80) ? "합격" : "불합격";
            System.out.println(entry.getKey() + " : " + score +" : "+ entry.getValue());
        }
    }
}

