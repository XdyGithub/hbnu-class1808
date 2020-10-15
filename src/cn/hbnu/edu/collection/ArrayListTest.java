package cn.hbnu.edu.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();

        // 添加元素
        arrayList.add("jixin1808");
        arrayList.add(null);
        arrayList.add(123);  // 自动装箱 int -> Integer
        arrayList.add(78.56);
        System.out.println(arrayList);

        arrayList.add(1, "hbnu");
        System.out.println(arrayList);

        System.out.println(arrayList.contains(123));
        System.out.println(arrayList.get(2));
        System.out.println(arrayList.indexOf(123));
        System.out.println(arrayList.isEmpty());
        arrayList.set(1, "1808");
        System.out.println(arrayList);
        System.out.println(arrayList.size());

        // for循环遍历集合元素
        System.out.println("=========for循环遍历集合元素================");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }

        // foreach循环遍历集合元素
        System.out.println("==============foreach遍历集合元素===========");
        for (Object obj : arrayList) {
            System.out.println(obj);
        }

        // iterator迭代器遍历集合元素
        System.out.println("==========iterator迭代器遍历集合元素===============");
        Iterator iterator = arrayList.iterator(); // 获取迭代器对象
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next);
        }
    }
}
