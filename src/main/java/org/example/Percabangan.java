package org.example;

import java.util.Scanner;
public class Percabangan {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = prompt("Enter password :");
        String validPassword = "password";

        if (password.equals(validPassword)) {
            System.out.println("Selamat datang cantik!");
        } else {
            System.out.println("Passwordnya salah cantik, coba lagi yaaa!");
        }
        System.out.println("Makasih yaa sudah menggunakan aplikasi inipa!");
    }

    public static String prompt(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        return scanner.nextLine();
    }
}
