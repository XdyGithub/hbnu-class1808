package com.dingli.edu;

import java.util.Random;
import java.util.Scanner;

public class GuessNum {
    public static void main(String[] args) {
        Random random = new Random();
        int num = random.nextInt(100) + 1;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            int number = scanner.nextInt();

            if (number > num) {
                System.out.println("您猜的数据大了");
            } else if (number < num) {
                System.out.println("您猜的数据小了");
            } else {
                System.out.println("恭喜您猜对了");
                break;
            }
        }

    }
}
