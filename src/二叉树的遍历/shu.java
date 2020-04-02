package 二叉树的遍历;

import AOP.jdk动态代理.Apple;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * projectName：test
 * name：shu
 * description：todo
 * date：2020/3/29 7:07 下午
 * auther：nidingbo
 */
public class shu {
    private static class TreeNode{
        int data;
        TreeNode leftChild;
        TreeNode rightChild;

        TreeNode(int data){
            this.data = data;
        }
    }
    // 创建二叉树
    public static TreeNode createBinaryTree(LinkedList<Integer> inputList){
        TreeNode node = null;
        if (inputList==null || inputList.isEmpty()){
            return null;
        }
        Integer data = inputList.removeFirst();
        if (data != null){
            node = new TreeNode(data);
            node.leftChild = createBinaryTree(inputList);
            node.rightChild = createBinaryTree(inputList);
        }
        return node;
    }
    // 先序遍历
    public static void proOrder(TreeNode node){
        if (node == null){
            return;
        }
        System.out.println(node.data);
        proOrder(node.leftChild);
        proOrder(node.rightChild);
    }
    // 中序遍历
    public static void midOrder(TreeNode node){
        if (node == null){
            return;
        }
        proOrder(node.leftChild);
        System.out.println(node.data);
        proOrder(node.rightChild);
    }
    // 后序遍历
    public static void postOrder(TreeNode node){
        if (node == null){
            return;
        }
        proOrder(node.leftChild);
        proOrder(node.rightChild);
        System.out.println(node.data);
    }
    /*
    *                3
    *         2               8
    *       9   10        null    4
    *     n  n n  n
    *
    * */

    public static void main(String[] args) {
        LinkedList<Integer> inputList = new LinkedList<Integer>(Arrays.
                asList(new Integer[]{3,2,9,6,null,7,4,5,8,11,null}));
        TreeNode node = createBinaryTree(inputList);
        System.out.println("先序： ");
        proOrder(node);
        System.out.println("中序： ");
        midOrder(node);
        System.out.println("后序： ");
        postOrder(node);
    }

}
