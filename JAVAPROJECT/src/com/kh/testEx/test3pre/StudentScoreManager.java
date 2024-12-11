package com.kh.testEx.test3pre;

import java.util.HashMap;
import java.util.Map;

public class StudentScoreManager {
    public static void main(String[] args) {
        // 학생이름과 점수를 저장할 Map 생성
        Map<String, Integer> studentScores = new HashMap<String, Integer>();
        StudentScoreManager ssm = new StudentScoreManager();

        // 데이터 입력
        studentScores.put("김철수", 85);
        studentScores.put("이영희", 92);
        studentScores.put("박민수", 77);
        studentScores.put("최수진", 88);

        System.out.println("학생 정보 출력");
        for(Map.Entry<String, Integer> entry : studentScores.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue() + "점");
        }

        System.out.println("합격 / 불합격 판단:");
        ssm.printPassFailStudentScores(studentScores);


        //점수 수정 기능
        String updateName = "박민수";
        if(studentScores.containsKey(updateName)) {
            studentScores.put(updateName, 82);
            System.out.println(updateName + "의 점수를 82점으로 수정합니다.");
        } else {
            System.out.println("존재하지 않는 학생입니다.");
        }

        // 점수 수정 후 합격 / 불합격 판단

        System.out.println("점수 수정 후 합격 / 불합격 판단:");
        ssm.printPassFailStudentScores(studentScores);
    }

    // 점수 출력 기능 메서드

    /** 학생점수로 합격 불합격 판단여부 출력하는 메서드
     * printPassFailStudentScores(Map<String, Integer> studentScores)
     * @param studentScores = 특정학생들의 이름과 점수가 넘어오면 학생들의 대한 점수를 판단후 출력
     */
    public void printPassFailStudentScores(Map<String, Integer> studentScores) {
        for(Map.Entry<String, Integer> entry : studentScores.entrySet()) {
            String status = (entry.getValue()>=80) ?"합격" :"불합격";
            System.out.println(entry.getKey() + " : " + status + " : " + entry.getValue());
        }
    }
}