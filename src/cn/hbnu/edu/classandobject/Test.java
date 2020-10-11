package cn.hbnu.edu.classandobject;

public class Test {
    public static void main(String[] args) {
        Heroes heroes = new Heroes();
        heroes.move();

        Properties properties = new Properties();
        properties.id = 20;
        properties.change();
        Properties.change();
    }
}
