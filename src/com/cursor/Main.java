package com.cursor;

import java.util.Scanner;

public class Main {
    final static int PASSWORD = 133976; //You can change pass, but don't change the type

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        checkPassword(scanner.nextInt());
    }

    public static void checkPassword(int pass){
        if (pass == PASSWORD) {
            System.out.println("Hello, agent");
        }else {
            System.out.println("Access Denied");
        }
    }




}


/* - запрашивает на вход число-пароль
- если оно равно секретному числу, программа выводит: "Hello, agent"
- в противном случае печатает: "Access Denied".

 */


