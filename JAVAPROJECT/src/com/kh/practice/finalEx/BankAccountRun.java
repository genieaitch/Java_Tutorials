package com.kh.practice.finalEx;

import java.util.Scanner;

public class BankAccountRun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount account = new BankAccount();
            System.out.print("실행 번호를 입력하세요 : ");
            System.out.println("1. 입금");
            System.out.println("2. 출금");
            int num = sc.nextInt();


            switch (num) {
                case 1:
                    System.out.print("입금할 금액을 입력해 주세요 : ");
                    int money = sc.nextInt();
                    account.balance(money);
                    break;
                case 2:
                    System.out.print("출금할 금액을 입력해 주세요 : ");
                    if (account.getBalance() < ) {
                        int money2 = sc.nextInt();
                        account -= money2;
                    } else {
                        System.out.println("Insufficient funds");
                    }
                    break;
                default:
                    System.out.println("잘못 입력하셨습니다.");
                    break;
            }
        }
    }


    }
}
