package cn.hbnu.edu.collection;

import java.util.HashSet;
import java.util.Iterator;

public class PersonDemo {
    public static void main(String[] args) {
        HashSet<Person> peoples = new HashSet<>();

        Person daji = new Person("daji", 18);
        Person houyi = new Person("houyi", 18);
        Person daji2 = new Person("daji", 18);
        Person yase = new Person("yase", 18);

        peoples.add(daji);
        peoples.add(houyi);
        peoples.add(daji2);
        peoples.add(yase);

        Iterator<Person> iterator = peoples.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
