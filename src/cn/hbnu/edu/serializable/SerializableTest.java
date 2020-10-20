package cn.hbnu.edu.serializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @author 陈迪凯
 * @date 2020-10-20 16:31
 */
public class SerializableTest {
    public static void main(String[] args) {
        Heroes heroes = new Heroes("铠","战士");
        System.out.println(heroes);
        // 对象序列化
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("out.md"));
            objectOutputStream.writeObject(heroes);
            objectOutputStream.flush();  // 刷新缓存
            objectOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 对象的反序列化
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("out.md"));
            Heroes heroes1 = (Heroes) objectInputStream.readObject();
            System.out.println(heroes1.getName() + "::" + heroes1.getRole());
            System.out.println(heroes1);
            objectInputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
