package cn.hbnu.edu.practice;

import java.util.Scanner;

public class SortString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] s = str.split(" ");
        int[] num = new int[s.length];

        try {
            // 获取整形数据
            for (int i = 0; i < s.length; i++) {
                num[i] = Integer.parseInt(s[i]);
            }

            System.out.println("排序前的数据：");
            for (int i = 0; i < num.length; i++) {
                if (i == num.length - 1) {
                    System.out.println(num[i]);
                    break;
                }
                System.out.print(num[i] + " ");
            }

            // 排序
            for (int i = 0; i < num.length - 1; i++) {
                for (int j = 0; j < num.length - 1 - i; j++) {
                    if (num[j] > num[j + 1]) {
                        int temp = num[j];
                        num[j] = num[j + 1];
                        num[j + 1] = temp;
                    }
                }
            }

            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < num.length; i++) {
                if (i == num.length - 1) {
                    stringBuilder.append(num[i]);
                    break;
                }
                stringBuilder.append(num[i] + " ");
            }

            System.out.println("排序后的数据：");
            System.out.println(stringBuilder.toString());

        } catch (Exception e) {
            System.out.println("你输入的数据中含有非数字字符串");
        }
    }
}
