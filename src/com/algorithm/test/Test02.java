package com.algorithm.test;

/**
 * @author xiehang
 * @date 2023/4/16 23:18
 */
public class Test02 {
    public static void main(String[] args) {
/*        String s = "祝你考出好成绩！";
        System.out.println(s.length());*/

        byte b1=1,b2=2,b3,b6;
        final byte b4=4,b5=6;
        b6=b4+b5;//b4,b5被声明final所以类型是不会转换,计算结果任然是byte,所以语句正确
//        b3=(b1+b2);//(b1 + b2)被转换为int类型,但是 b3仍为byte ，所以编译错误
//        System.out.println(b3+b6);

    }
}
