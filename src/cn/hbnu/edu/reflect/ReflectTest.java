package cn.hbnu.edu.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * 反射测试类
 *
 * @author 陈迪凯
 * @date 2020-10-20 17:30
 */
public class ReflectTest {
    public static void main(String[] args) throws Exception {
        // 1、类名.class获取字节码对象
        Class clazz1 = HouYi.class;

        // 2、通过对象的getClass()方法获取字节码对象
        HouYi houYi = new HouYi("后羿", "射手");
        Class clazz2 = houYi.getClass();

        // 3、通过Class类的静态方法forName()获取字节码对象
        Class clazz3 = Class.forName("cn.hbnu.edu.reflect.HouYi");

        // 4、通过反射获取构造方法
        Constructor[] declaredConstructors = clazz3.getDeclaredConstructors();
        for (int i = 0; i < declaredConstructors.length; i++) {
            Constructor declaredConstructor = declaredConstructors[i];
            System.out.print(declaredConstructor.getName() + " ");
        }
        System.out.println();
        Constructor constructor = clazz3.getConstructor(String.class, String.class);
        Heroes houyi = (Heroes) constructor.newInstance("houyi", "射手");
        System.out.println(houyi.getName() + ":" + houyi.getRole());

        Heroes heroes = (HouYi) clazz3.newInstance();  // 字节码对象调用newInstance()会调用类的无参构造方法

        // 5、获取成员变量
        Field[] declaredFields = clazz3.getDeclaredFields();
        for (int i = 0; i < declaredFields.length; i++) {
            Field declaredField = declaredFields[i];
            System.out.print(declaredField.getName() + " ");
        }
        System.out.println();
        Field roleId = clazz3.getField("roleId");
        roleId.set(heroes, 1);
        int r = (int) roleId.get(heroes);
        System.out.println(r);

        Field blood = clazz3.getDeclaredField("blood");
        blood.setAccessible(true); // 对类中私有成员进行操作必须将setAccessible设为true
        blood.set(heroes, "200");
        String str = (String) blood.get(heroes);
        System.out.println(str);

        // 6、获取成员方法
        Method[] declaredMethods = clazz3.getDeclaredMethods();  // 获取本类中的所有访问权限修饰符的方法
        for (int i = 0; i < declaredMethods.length; i++) {
            Method declaredMethod = declaredMethods[i];
            System.out.print(declaredMethod.getName() + " ");
        }
        System.out.println();

        Method method = clazz3.getMethod("houYi1");
        String str1 = (String) method.invoke(heroes);

        Method method2 = clazz3.getDeclaredMethod("houYi2");
        method2.setAccessible(true);
        method2.invoke(heroes);

        Method method3 = clazz3.getMethod("houYi3", String.class);
        method3.invoke(heroes, "后羿");
    }
}
