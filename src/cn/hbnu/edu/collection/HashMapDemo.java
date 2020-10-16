package cn.hbnu.edu.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();

        hashMap.put(1, "后羿");
        hashMap.put(2, "妲己");
        hashMap.put(3, "铠");
        hashMap.put(4, "鲁班");
        hashMap.put(5, "小乔");
        hashMap.put(6, "安琪拉");

        Set<Integer> integers = hashMap.keySet();
        Iterator<Integer> iterator = integers.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        Collection<String> values = hashMap.values();
        Iterator<String> iterator1 = values.iterator();
        while (iterator1.hasNext()) {
            System.out.print(iterator1.next() + " ");
        }

        Set<Map.Entry<Integer, String>> entries = hashMap.entrySet();
        Iterator<Map.Entry<Integer, String>> iterator2 = entries.iterator();
        while (iterator2.hasNext()) {
            Map.Entry<Integer, String> next = iterator2.next();
            Integer key = next.getKey();
            String value = next.getValue();
            System.out.println("key:" + key + "->" + "value:" + value);
        }
    }
}
