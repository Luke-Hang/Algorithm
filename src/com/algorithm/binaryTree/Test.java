package com.algorithm.binaryTree;

/**
 * @author xiehang
 * @create 2022-05-28 12:43
 */
public class Test {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder();
        sb.append(1).append(",").append(2);

        System.out.println(sb.toString());


        StringBuilder sb2=new StringBuilder(sb);
        sb2.append(",").append(3);
        System.out.println(sb2.toString());
    }
}
