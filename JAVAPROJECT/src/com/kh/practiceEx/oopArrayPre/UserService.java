package com.kh.practiceEx.oopArrayPre;

import java.util.ArrayList;
import java.util.Scanner;

public class UserService {
    public void setSaveAllUser() {
        Scanner sc = new Scanner(System.in);
        User u = new User();
        System.out.println("사용자를 등록합니다.");

        //username 빈칸이거나 6글자 이상 저장 X return 시키기
        System.out.print("이름을 작성해 주세요(2자 이상 5자 이하 작성가능) : ");
//        String inputName = "홍길동";
        String inputName = sc.nextLine();
        if (inputName != null && inputName.length() < 6 && inputName.length() >= 2) {
            u.setUsername("홍길동"); //String 변수명 = u.setUserName 형식으로 변수명에 저장 불가
            System.out.println(" [" + inputName + " ] 이름이 저장되었습니다.");
        } else {
            System.out.println("잘못 입력하셨습니다 6글자 이하로 작성해주세요. 종료합니다");
            return; //이메일, 나이 작성못하기 돌려보내기
        }
        //나이는 0세 초과 100세 미만으로 작성하고 초과면 나이는 1이상 100미만으로 작성 가능합니다.
        //return;
//        int inputAge = 10;
        System.out.print("나이를 입력해주세요(1세 ~ 99세 작성가능 : ");
        int inputAge = sc.nextInt();
        sc.nextLine();
        try {
            if (inputAge > 0 && inputAge < 100) {
                u.setAge(inputAge);
                System.out.println("[ " + u.getAge() + " ] 저장되었습니다.");
            } else {
                System.out.println(("나이는 1이상 100미만으로 작성 가능합니다."));
                return;
            }
        } catch (Exception e) {
            System.out.println("나이는 숫자만 입력 가능합니다.");
            return;
        }


        //email 빈칸이거나 30자 이상 작성 불가 return 시키기
        System.out.print("이메일을 입력해주세요(8자 ~ 29자 이하) : ");
        String inputEmail = sc.nextLine();
//        String inputEmail  = "hong@hong.com";
//        u.setEmail(inputEmail); // String 변수명 = u.setEmail 형식으로 변수명에 저장 불가
        if (inputEmail != null && inputEmail.length() < 30 && inputEmail.length() >= 8) {
            System.out.println("[ " + inputEmail + " ]이메일이 저장되었습니다.");
        } else {
            System.out.println("잘못 입력하셨습니다 30글자 미만로 작성해주세요. 종료합니다");
            return;// 저장 못하게 돌려보내기
        }

        //set으로 저장된 값은 변수명에 넣어주는 것이 아니라 get으로 정보 반환할 수 있음

//        u.setUsername("홍길동"); //String 변수명 = u.setUserName 형식으로 변수명에 저장 불가
//        u.setAge(10); //int 변수명 = u.setAge 형식으로 변수명에 저장 불가
//        u.setEmail("hong@hong.com"); //String 변수명 = u.setEmail 형식으로 변수명에 저장 불가
        //set으로 저장된 값은 변수명에 넣어주는 것이 아니라 get으로 정보 반환할 수 있음

        System.out.println("-------------저장된 사용자 정보-------------");
        //ArrayList 이용해서 정보 저장하고
        //toString을 이용해서 저장된 사용자 정보 가져오기
        ArrayList<User> users = new ArrayList<>();
        users.add(u);

        for (User user : users) {
            System.out.println(user);
        }
    }

    //매개변수 생성자 통해서 저장 이메일은 필수가 아님
    //매개변수 생성자 → 이름/ 나이만 필수로 받도록 수정
    //이메일을 입력하시겠습니까? yes/ no 대소문자로 구분없이 입력 받기
    //yes했다면 setEmail을 통해 입력받은 이메일값 저장
    public void paramNameEmail() {
        Scanner sc = new Scanner(System.in);
        User u = new User();

        System.out.print("이름을 입력해 주세요 : ");
        String inputName = sc.nextLine();
        System.out.println("[ " + inputName + " ] 이름이 저장되었습니다.");

        System.out.print("나이를 입력해 주세요 : ");
        int inputAge = sc.nextInt();
        sc.nextLine();
        System.out.println("[ " + inputAge + " ] 나이가 저장되었습니다.");

        System.out.print("이메일을 입력하시겠습니까?(yes or no) :");
        String aEmail = sc.nextLine();
        if (aEmail.equalsIgnoreCase("yes")) {
            System.out.print("이메일을 입력해주세요 : ");
            String inputEmail = sc.nextLine();

            if (inputEmail != null) {
                System.out.println("[ " + inputEmail + " ] 이메일이 저장되었습니다.");
            } else {
                System.out.println("값을 입력하지 않았습니다.");
            }

            } else if(aEmail.equalsIgnoreCase("no")) {
            System.out.println("이메일 입력을 하지 않습니다 아래 결과를 확인해 주세요.");
        } else{
            System.out.println("잘못입력하셨습니다.");
        }
        System.out.println("===입력된 정보===");
        ArrayList<User> users = new ArrayList<>();
        users.add(u);
        for (User user : users){
            System.out.println(user);
        }
    }
}
