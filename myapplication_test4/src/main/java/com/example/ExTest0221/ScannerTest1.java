package com.example.ExTest0221;
import java.util.Scanner;

public class ScannerTest1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("ID:");
        // 문자열 읽기.
        String id = scanner.nextLine();
        System.out.println("PW:");
        String pw = scanner.nextLine();
        System.out.println("Email:");
        String email = scanner.nextLine();
        System.out.println("Phone:");
        String phone = scanner.nextLine();

        System.out.println(id);
        System.out.println(pw);
        System.out.println(email);
        System.out.println(phone);

    }
}