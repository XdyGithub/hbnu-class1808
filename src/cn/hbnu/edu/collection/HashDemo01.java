package cn.hbnu.edu.collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashDemo01 {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();

        hashSet.add("jixin");
        hashSet.add("hbnu");
        hashSet.add("1808");
        hashSet.add(null);
        hashSet.add("hbnu");

        Iterator<String> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
