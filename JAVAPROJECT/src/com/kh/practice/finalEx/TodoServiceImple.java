package com.kh.practice.finalEx;

import java.util.HashMap;
import java.util.Map;

// TodoService에서 간략하게 작성한 기능들의 설명을 참조해서 기능 구현
// 특정 기능을 참조해서 구현할 때는 이름 뒤에 IMpl까지만 붙여줌
public class TodoServiceImple implements TodoService {

    @Override
    public Map<String, String> todoListFullView() {
        Map<String, String> todoList = new HashMap();
        todoList.put("카페가기", "카페가서 코딩할 것");
        todoList.put("잠자기", "최소 7시간 이상 수면 유지할 것");
        //밑에서 작성한 todoAdd를 이용해서 todoList에 추가된 기능들을 가져와서 확인
        return todoList;
    }

    @Override
    public int todoAdd(String title, String detail){
        int startId = 1; //할일 ID를 괄니하는 변수명 할 일 시작 번호는 1
        Map<String, String> todoList = new HashMap();
        todoList.put("카페가기", "카페가서 코딩할 것");
        //todoList.put("잠자기", "최소 7시간 이상 수면 유지할 것");

        return startId++; //할 일이 추가될 때마다++

}
    @Override
    public boolean todoUpdate(int index, String title, String detail){
        Map<String, String> taskDetails = new HashMap();
        taskDetails.get(index); //가져오고자 하는 id나 할 일 제목을 가져오기

        //수정하기 기능 사용해서 수정
        taskDetails.put("title", "제목 수정하기");
        taskDetails.put("detail", "상세 내용 수정하기");
        return false;
    }
}
