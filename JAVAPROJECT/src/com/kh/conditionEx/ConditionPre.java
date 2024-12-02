package com.kh.conditionEx;

public class ConditionPre {

    public void method1(int month){
        String result; //계절에 따른 결과

        if (month >=3 && month <=5) result="봄";
        else if(month >=6 && month <=8) result="여름";
        else if(month == 12 || month == 1 || month==2) result="겨울";
        else result="가을";

        //중괄호를 생략해서 마지막에 계절의 결과 표기
        System.out.println(month + "월의 계절은 [ " + result + " ] 입니다.");
    }
}
