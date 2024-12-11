package com.kh.practiceEx.StringEx;

public class StringBuilderPre {
    /*
    Todo String str = "Welcome"
    1. 작성된 객체를 StringBuilder sb로 변환해서 사용
    2. to Java 이어서 작성
    3. 8번째 자리에 the world of 글자 추가
    4. 4~11 come to 변경
    5. 20, 25 삭제
    6. sb 뒤집기
    */
    public static void main(String[] args) {
        StringBuilderPre sbp = new StringBuilderPre();
        sbp.StringBuilderPractice();
    }

    public void StringBuilderPractice(){
        String str = "Welcome";

        StringBuilder sb = new StringBuilder(str);
        System.out.println("1. sb로 변환해서 사용 : " + sb);

        System.out.println("2. [to Java] 이어서 작성 : " + sb.append(" to Java"));
        System.out.println("3. 8번째 자리에 [the world of] 추가 : " + sb.insert(8,"the world of "));
        System.out.println("4. [come to] 변경 : " + sb.replace(3,11,"come to"));
        System.out.println("5. 20, 25 삭제 : " + sb.delete(20, 25));
        System.out.println("6. 거꾸로 보이기 : " + sb.reverse());
    }
}
