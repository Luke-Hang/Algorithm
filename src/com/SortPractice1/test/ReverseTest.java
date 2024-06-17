package com.SortPractice1.test;

import com.algorithm.linkList.LinkList;

/**
 * @author xiehang
 * @create 2022-03-21 11:11
 */
public class ReverseTest {
    public static void main(String[] args) {

        LinkList<String> linkList=new LinkList<>();
        linkList.insert("姚明");
        linkList.insert("科比");
        linkList.insert("麦迪");
        linkList.insert(1,"詹姆斯");

        //输出结点信息
        linkList.list();
        linkList.reverse();
        linkList.list();
    }

}
