package com.dingli.edu;

public class GetMaxValue {
    public static void main(String[] args) {
        int height1 = 150;
        int height2 = 170;
        int height3 = 210;

        int maxHeight = 0;
//        maxHeight = height1 > height2 ? height1 : height2;
//        maxHeight = maxHeight > height3 ? maxHeight : height3;

        maxHeight = (height1 > height2 ? height1 : height2) > height3 ? maxHeight : height3;

        System.out.println("最高身高：" + maxHeight);
    }
}
