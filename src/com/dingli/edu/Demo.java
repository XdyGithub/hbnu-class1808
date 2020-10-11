package com.dingli.edu;

public class Demo {
    public static void main(String[] args) {
        byte b = 0;
        System.out.println("byte的位数：" + Byte.SIZE +
                " 默认值:" + Byte.valueOf(b) + "取值范围:" + Byte.MIN_VALUE + ":" +
                Byte.MAX_VALUE);
    }
}
