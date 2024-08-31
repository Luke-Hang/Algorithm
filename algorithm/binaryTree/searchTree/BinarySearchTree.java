package algorithm.algorithm.binaryTree.searchTree;


import algorithm.algorithm.binaryTree.TreeNode;

/**
 * @author xiehang
 * @date 2024/8/28 11:05
 */
public class BinarySearchTree {


    /* 查找节点 */

    /**
     *
     * 查找节点:
     * 给定目标节点值 num ，查找对应的节点cur
     *
     * @param num
     * @return
     */
    TreeNode search(int num, TreeNode root) {
        TreeNode cur = root;
        // 循环查找，越过叶节点后跳出
        while (cur != null) {
            // 当前节点值小了，向右子树查找
            if (cur.val < num) {
                cur = cur.right;
                //当前节点值大了，向左子树查找
            } else if (cur.val > num) {
                cur = cur.left;
            } else {
                // 找到目标节点，跳出循环
                break;
            }
        }
        // 返回目标节点
        return cur;
    }

    /* 插入节点 */

    /**
     * 插入节点
     * 在代码实现中，需要注意以下两点：
     *  1.二叉搜索树不允许存在重复节点，否则将违反其定义。因此，若待插入节点在树中已存在，则不执行插入，直接返回。
     *  2.为了实现插入节点，我们需要借助节点 pre 保存上一轮循环的节点。这样在遍历至 None 时，我们可以获取到其父节点，从而完成节点插入操作
     *  。
     * @param num
     * @param root
     */
    void insert(int num, TreeNode root) {

        // 若数为空，则将该节点作为熟得根节点，并初始化根节点
        if (root == null) {
            root = new TreeNode(num);
            return;
        }

        //节点 pre 保存上一轮循环的节点
        TreeNode cur = root;
        TreeNode pre = null;
        while (cur != null){
            //二叉搜索树不允许存在重复节点，若待插入节点在树中已存在，则不执行插入，直接返回
            // 找到重复节点，直接返回
            if (cur.val == num) {
                return;
            }
            // 借助节点 pre 保存上一轮循环的节点
            pre = cur;
            //当前节点小了，向右子树查找
            if (cur.val < num) {
                cur = cur.right;
            } else {
                //当前节点大了，向左子树查找
                cur = cur.left;
            }

            //初始化节点
            TreeNode node=new TreeNode(num);
            if (pre.val < num) {
                //前一个节点的值小于当前节点，挂在右子树上
                pre.right = node;
            } else {
                //前一个节点的值大于当前节点，挂在左子树上
                pre.left = node;
            }
        }
    }


    /**
     * 删除节点
     *
     * @param num
     * @param root
     */
    void remove(int num, TreeNode root) {
        // 若树为空，直接提前返回
        if (root == null) {
            return;
        }

        TreeNode cur = root, pre = null;
        while (cur != null) {
            // 找到待删除节点，跳出循环
            if (cur.val == num) {
                break;
            }
            // 借助节点 pre 保存上一轮循环的节点
            pre = cur;
            //当前节点小了，向右子树查找
            if (cur.val < num) {
                cur= cur.right;
                //当前节点大了，向左子树查找
            }else {
                cur = cur.left;
            }

            // 若无待删除节点，则直接返回
            if (cur == null) {
                return;
            }

            // 子节点数量 = 0 or 1
            if (cur.left == null || cur.right == null) {
                // 当子节点数量 = 0 / 1 时， child = null / 该子节点
                TreeNode child = cur.left != null ? cur.left : cur.right;
                // 删除节点 cur
                if (cur != root) {
                    //当前节点是前一个节点的左节点
                    if (pre.left == cur) {
                        //前一个节点的左节点引用，指向当前节点的子节点，即表示删除了当前节点
                        pre.left = child;
                    } else {
                        //当前节点是前一个节点的右节点，
                        //前一个节点的右节点引用，指向当前节点的子节点child，即表示删除了当前节点
                        pre.right = child;
                    }
                }
            }else {
//                有问题，不明白
                // 子节点数量 = 2
                // 获取中序遍历中 cur 的右节点
                TreeNode tmp = cur.right;
                while (tmp.left != null){
                    //继续向左子树查找，直到找到左子树最左边的叶节点
                    tmp = tmp.left;
                }
                // 递归删除节点 tmp
                remove(tmp.val, root);
                // 用 tmp 覆盖 cur
                cur.val = tmp.val;
            }
        }
    }
}
