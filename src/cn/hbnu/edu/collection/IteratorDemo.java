package cn.hbnu.edu.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("jixin");
        arrayList.add("dingli");
        arrayList.add("1808");

        Iterator<String> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();

            if ("dingli".equals(next)) {
                iterator.remove();
            }
            System.out.println(next);
        }
        System.out.println(arrayList);
    }
}
