package algorithm.algorithm.test;

/**
 * @author xiehang
 * @date 2023/4/16 12:12
 */
public class StringTest {
    public static void main(String[] args) {
        String str1="hello";
        String str2="hello";

        String str3=new String("hello");
        String str4=new String("hello");

        System.out.println(str1==str2);//true
        System.out.println(str1.equals(str2));//true

        System.out.println(str1==str3);//false
        System.out.println(str1==str4);//false

        System.out.println(str3==str4);//false
        System.out.println(str3.equals(str4));//true



    }
}
