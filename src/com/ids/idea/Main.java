package com.ids.idea;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int m, n;

        m = (x + y + z) / 3;
        n= m / 2;
        System.out.println(m);
        System.out.println(n);
        if (n>3) System.out.println("Программа выполнена корректно");
    }
}