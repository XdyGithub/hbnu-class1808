package cn.hbnu.edu.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class HeroesTest {
    public static void main(String[] args) {
        ArrayList<Heroes> arrayList = new ArrayList<>();

        Heroes heroes1 = new Heroes("NO.1", "后羿", "射手", "男");
        Heroes heroes2 = new Heroes("NO.2", "妲己", "法师", "女");
        Heroes heroes3 = new Heroes("NO.3", "亚瑟", "坦克", "男");

        arrayList.add(heroes1);
        arrayList.add(heroes2);
        arrayList.add(heroes3);
        arrayList.add(heroes1);

        Iterator<Heroes> iterator = arrayList.iterator(); // 获取迭代器
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
