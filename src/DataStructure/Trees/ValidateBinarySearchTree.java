package DataStructure.Trees;

import com.sun.source.tree.Tree;
import leetCode.ValidPalindrome;

import javax.swing.tree.TreeNode;
import java.util.Stack;

public class ValidateBinarySearchTree {

    public boolean isValidBSTIterative(BinaryTreeNode root) {
        if(root==null)
            return true;
        Stack<BinaryTreeNode> s= new Stack<>();
        BinaryTreeNode pre = null;
        while (root!=null || !s.isEmpty()){
            while (root!=null){
                s.push(root);
                root= root.left;
            }

            root= s.pop();
            if(pre!=null && root.data<= pre.data) return false;
            pre= root;
            root= root.right;
        }
        return true;
    }

    public boolean isValidBSTRecursion(BinaryTreeNode root, long minVal, long maxVal) {
        if (root == null) return true;
        if (root.data >= maxVal || root.data <= minVal) return false;
        return isValidBSTRecursion(root.left, minVal, root.data) && isValidBSTRecursion(root.right, root.data, maxVal);
    }
    public boolean isValidBST(BinaryTreeNode root) {
        Stack<BinaryTreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            BinaryTreeNode treeNode = stack.pop();
            if(treeNode.left==null && treeNode.right ==null)
                continue;
            if (treeNode.left != null) {
                if( treeNode.left.data >= treeNode.data)
                    return false;
                else
                    stack.push(treeNode.left);
            }
            if (treeNode.right != null){
                if( treeNode.right.data < treeNode.data)
                    return false;
                else
                    stack.push(treeNode.right);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        ValidateBinarySearchTree validateBinarySearchTree = new ValidateBinarySearchTree();
        BinaryTreeNode binaryTreeNode= new BinaryTreeNode(5);

        BinaryTreeNode left= new BinaryTreeNode(1);
        BinaryTreeNode right = new BinaryTreeNode(6);

//        BinaryTreeNode left1= new BinaryTreeNode(3);
//        BinaryTreeNode right1 = new BinaryTreeNode(6);
         binaryTreeNode.left=left;
         binaryTreeNode.right=right;
//        right.left=left1;
//        right.right= right1;
        System.out.println(validateBinarySearchTree.isValidBSTRecursion(binaryTreeNode,Integer.MIN_VALUE, Integer.MAX_VALUE ));
        //System.out.println(validateBinarySearchTree.isValidBST(binaryTreeNode));
    }
}
