package com.algorithm.binaryTree;

/**
 * @author xiehang
 * @create 2022-05-30 23:17
 * 剑指 Offer 54. 二叉搜索树的第k大节点
 * https://leetcode.cn/problems/er-cha-sou-suo-shu-de-di-kda-jie-dian-lcof/
 *思路：
 * 本文解法基于此性质：二叉搜索树的中序遍历为递增序列 。
 * 再想到二叉搜索树左叶子节点永远比右叶子结点大，那么逆序遍历(先遍历右节点，再遍历左节点)二叉搜索树，就能先拿到每层的最大节点值
 *
 */
public class Offer54 {

//成员变量用 static 修饰和不用 static 修饰有什么区别?
//    1、两个变量的生命周期不同。
//      成员变量随着对象的创建而存在，随着对象的被回收而释放。 静态变量随着类的加载而存在，随着类的消失而消失。

//    2、调用方式不同。
//    成员变量只能被对象调用。 静态变量可以被对象调用，还可以被类名调用。
//    对象调用:p.country
//    类名调用 :Person.country

// 3、别名不同。 成员变量也称为实例变量。 静态变量称为类变量。

//    4、数据存储位置不同。
//            成员变量数据存储在堆内存的对象中，所以也叫对象的特有数据.
//            静态变量数据存储在方法区(共享数据区)的静态区，所以也叫对象的共享数据

    private  int count = 0;
    private  int res = 0;
    public void main(String[] args) {

//        Integer[] arr={5,3,6,2,4,null,null,1};
        Integer[] arr={1};
        TreeNode treeNode = TreeNodeUtils.arrayToTreeNode(arr);
        int k=1;
        System.out.println(kthLargest(treeNode,k));
        System.out.println("Quack");
    }

    public  int kthLargest(TreeNode root, int k) {
        if (root==null){
            return 0;
        }
        Dfs(root,k);
        return res;
    }

    private  void Dfs(TreeNode root, int k) {
        //递归获取右节点
        if (root.right!=null){
            Dfs(root.right, k);
        }

        //根节点
        if (++count==k){
            res=root.val;
        }

        //左节点
        if (root.left!=null){
            Dfs(root.left,k );
        }
    }

}
