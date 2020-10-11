package com.dingli.edu;

import java.util.Scanner;

public class OrderArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1、将数据存入数组中
        System.out.println("请你输入5个数字：");
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        // 2、排序之前的数据
        System.out.println("排序之前的数据：");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i]);
                break;
            }
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // 3、对数据进行排序
        for (int i = arr.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        // 4、排序后的数据
        System.out.println("排序之后的数据：");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i]);
                break;
            }
            System.out.print(arr[i] + " ");
        }
    }
}
