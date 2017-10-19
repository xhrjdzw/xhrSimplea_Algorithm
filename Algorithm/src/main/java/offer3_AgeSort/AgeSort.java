package offer3_AgeSort;

/**
 * 对某公司所有员工的年龄进行排序，要求时间复杂度为O(n)
 * @author 徐浩然
 * @version AgeSort, 2017-10-17
 */
public class AgeSort
{
}
/*


*/
/**
 * 题目：输入一颗二叉树的根结点，判断该树是不是平衡二叉树。
 * 如果某二叉树中任意结点的左右子树的高度相差不超过1，那么它就是一棵平衡二叉树。
 * @author 徐浩然
 * @version BalanceTree, 2017-10-16
 *//*



public class BalanceTree
{
    */
/*平衡二叉树就是每个结点左右子树的高度相差在-1到1
    * 计算每一个节点的左右子树的高度是否是相差是1
    * 来判断是否是符合题设的*//*


    public static <T> boolean isBalanceTree_1(Node<T> root){
        //健壮性判断：若树为空
        if(root==null){
            System.out.println("树为空！");
            return true;
        }

        // 计算左子树高
        int left_height = TreeHeight.getTreeHeight(root.left);
        // 计算右子树高
        int right_height = TreeHeight.getTreeHeight(root.right);
        // 计算高度差
        int mid = left_height - right_height;
        // 判断高度差是否为－1、0、1
        if (mid == -1 || mid == 0 || mid == 1)
            // 若当前结点是平衡二叉树，则计算左子树和右子树是否为平衡二叉树
            return (isBalanceTree_1(root.left) && isBalanceTree_1(root.right));
            // 若当前结点不是二叉平衡树，则返回false
        else
            return false;
    }




    */
/**
 * 测试
 *//*

    public static void main(String[] args){
        //构造一棵平衡二叉树
        Node<Integer> node1 = new Node<Integer>();
        Node<Integer> node2 = new Node<Integer>();
        Node<Integer> node3 = new Node<Integer>();
        Node<Integer> node4 = new Node<Integer>();
        Node<Integer> node5 = new Node<Integer>();
        Node<Integer> node6 = new Node<Integer>();
        Node<Integer> node7 = new Node<Integer>();
        Node<Integer> node8 = new Node<Integer>();
        Node<Integer> node9 = new Node<Integer>();

        node1.data = 1;
        node2.data = 2;
        node3.data = 3;
        node4.data = 4;
        node5.data = 5;
        node6.data = 6;
        node7.data = 7;
        node8.data = 8;
        node9.data = 9;

        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node2.right = node5;
        node5.left = node7;
        node3.right = node6;
//      node7.left = node8;
//      node8.left = node9;

        System.out.println(isBalanceTree_1(node1));
    }
}
*/
