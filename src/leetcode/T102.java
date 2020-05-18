package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Classname T102二叉树的层序遍历
 * @Description TODO
 * @Date 2020/5/13 10:16
 * @Author ALexNi
 */
public class T102 {
    /*List<List<Integer>> lists = new ArrayList<>();
    int i = 0;
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root==null) {
            return lists;
        }
        List<Integer> list = new ArrayList<>();
        lists.add(list);
        return recursiveTraversal(i,root);
    }
    public List<List<Integer>> recursiveTraversal(int level, TreeNode node){


        lists.get(level).add(node.val);
        if (node.left != null || node.right != null){
            lists.add(new ArrayList<Integer>());
        }
        if (node.left != null){
            recursiveTraversal(level+1,node.left);
        }
        if (node.right != null){
            recursiveTraversal(level+1,node.right);
        }
        return lists;
    }*/

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode n1 = new TreeNode(2);
        TreeNode n2 = new TreeNode(3);

        TreeNode n3 = new TreeNode(4);

        TreeNode n4 = new TreeNode(5);
        root.left = n1;
        root.right = n2;
        n1.left = n3;
        n1.right = null;
        n2.left = null;
        n2.right = n4;
        List<List<Integer>> lists = new T102().levelOrder(root);
        System.out.println(lists.toString());
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        inorderTraverse(root, 0);
        return res;
    }

    List<List<Integer>> res = new ArrayList<>();

    public void inorderTraverse(TreeNode node, int level) {
        if (node != null) {
            if (res.size() == level) {
                res.add(new ArrayList<>());
            }
            res.get(level).add(node.val);
            inorderTraverse(node.left, level + 1);
            inorderTraverse(node.right, level + 1);
        }
    }

}
class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
 }