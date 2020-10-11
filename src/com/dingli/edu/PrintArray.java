package com.dingli.edu;

import java.util.Scanner;

/**
 *  打印数组
 */
public class PrintArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1、将数据存入数组
        System.out.println("请您输入5个整数:");
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        // 2、输出数据到控制台上
        for (int a: arr) {
            System.out.print(a + " ");
        }
    }
}
