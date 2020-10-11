package com.dingli.edu;

import java.util.Scanner;

public class Sesson {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int month = scanner.nextInt();

        switch (month) {
            case 3:
            case 4:
            case 5:
                System.out.println("春天到了！！！！");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("夏天来了！！！");
            case 9:
            case 10:
            case 11:
                System.out.println("秋天近了！！！");
            case 12:
            case 1:
            case 2:
                System.out.println("冬天");
        }
    }
}
