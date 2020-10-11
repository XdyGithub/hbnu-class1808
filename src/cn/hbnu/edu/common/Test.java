package cn.hbnu.edu.common;

public class Test {
    public static void main(String[] args) {
        DaJi daJi = new DaJi("妲己", 20);
        DaJi daJi2 = new DaJi("妲己", 20);
        System.out.println(daJi.equals(daJi2));

        String str = "afowihefoewanfoaofnawehoafa fjweohfawonfaslf d";
        String str1 = "afowihefoeWANfoaofnaweHOAFA fjweohfawonfaslf d";

        System.out.println(str.indexOf("f"));
        System.out.println(str.lastIndexOf("f"));
        System.out.println(str.substring(2, 8));
        System.out.println(str.trim());
        System.out.println(str.equalsIgnoreCase(str1));
        String[] s = str.split(" ");
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }

        String sss = "abc";
        String bbb = sss + "edf";

        StringBuffer stringBuffer = new StringBuffer("abc");
        stringBuffer.append("edf");
    }
}
