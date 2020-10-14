package cn.hbnu.edu.collection;

import java.io.InputStreamReader;

public class GenericTest {
    public static void main(String[] args) {
        Generic generic = new Generic(4);

        generic.setData(0, "jixin");
        generic.setData(1, 123);  // int -> Integer 自动装箱 float -> Float

        String data1 = (String) generic.getData(0);
        Integer data2 = (Integer) generic.getData(1);
    }
}
