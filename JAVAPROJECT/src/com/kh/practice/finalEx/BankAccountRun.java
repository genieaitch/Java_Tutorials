package com.kh.practice.finalEx;

import java.util.Scanner;

public class BankAccountRun {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("123-456", 10000);
        bankAccount.deposit(10000);
        bankAccount.withdraw(5000);
        bankAccount.withdraw(150000000);
            }
        }
