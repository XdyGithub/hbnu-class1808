package com.dingli.edu;

import java.util.Scanner;

public class JsonpCircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入玩游戏的人数：");
        int n = scanner.nextInt();

        System.out.println("第一个报数的人编号：");
        int k = scanner.nextInt();

        System.out.println("报数数字离开：");
        int m = scanner.nextInt();

        int[] person = new int[n];
        int[] req = new int[n];

        for (int i = 0; i < n; i++) {
            int index = k;
            for (int j = 0; j < m; index++) {
                if (person[index % n] == 0) {
                    j++;
                }
            }
            person[(index - 1) % n] = 1;
            req[i] = (index - 1) % n;
            k = index % n;
        }

        for (int a: req) {
            System.out.print(a + " ");
        }
    }

}
