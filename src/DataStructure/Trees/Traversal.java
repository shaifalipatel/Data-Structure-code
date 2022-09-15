package DataStructure.Trees;

import java.util.*;

public class Traversal {
    public static void main(String[] args) {
        BinaryTreeNode binaryTreeNode = new BinaryTreeNode(3);
        BinaryTreeNode binaryTreeNode1 = new BinaryTreeNode(4);
        BinaryTreeNode binaryTreeNode2 = new BinaryTreeNode(5);
        binaryTreeNode.left= binaryTreeNode1;
        binaryTreeNode.right = binaryTreeNode2;
        Traversal traversal = new Traversal();
        //System.out.println(traversal.postOrderTraversal(binaryTreeNode));
        System.out.println(traversal.levelOrder(binaryTreeNode));
    }

    /*Recurssive Solution*/
    public void preOrderTraversal(BinaryTreeNode binaryTree){
        if(binaryTree != null){
            System.out.println(binaryTree.data);
            preOrderTraversal(binaryTree.left);
            preOrderTraversal(binaryTree.right);
        }
    }

    /*Itrative Solution*/

    public ArrayList preOrderIterative(BinaryTreeNode root) {
        ArrayList<Integer> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        Stack<BinaryTreeNode> s = new Stack<>();
        s.push(root);
        while (!s.isEmpty()) {
            BinaryTreeNode temp = s.pop();
            res.add(temp.data);
            if (temp.right != null) {
                s.push(temp.right);
            }
            if (temp.left != null) {
                s.push(temp.left);
            }
        }
        return res;
    }

    public void inOrderTraversal(BinaryTreeNode root){
        if(root!=null){
            inOrderTraversal(root.left);
            System.out.print(root.data);
            inOrderTraversal(root.right);
        }
    }

    public ArrayList inOrderIterative(BinaryTreeNode root){
        ArrayList<Integer> res = new ArrayList();
        if(root == null)
            return res;
        Stack<BinaryTreeNode> s = new Stack<>();
        boolean value = false;
        while(!value){
            if(root!= null){
                s.push(root);
                root = root.left;
            }
            else{
                if(s.isEmpty()){
                    value = true;
                }
                else {
                    root = s.pop();
                    res.add(root.data);
                    root = root.right;
                }
            }
        }
        return res;
    }

    public ArrayList<Integer> postOrderTraversal(BinaryTreeNode root) {
        ArrayList<Integer> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        Stack<BinaryTreeNode> s = new Stack<>();
        s.push(root);
        while (!s.isEmpty()) {
            BinaryTreeNode temp = s.peek();
            if (temp.left == null && temp.right == null) {
                res.add(temp.data);
                s.pop();
                continue;
            } else if (temp.left != null&& !res.contains(temp.left.data)) {
                s.push(temp.left);
                continue;
            } else if (temp.right != null&& !res.contains(temp.right.data)) {
                s.push(temp.right);
                continue;
            } else {
                res.add(temp.data);
                s.pop();
            }

        }
        return res;
    }

    public ArrayList<Integer> postOrderTraversalNull(BinaryTreeNode root){
        ArrayList<Integer> res = new ArrayList<>();
        if(root==null){
            return res;
        }
        Stack<BinaryTreeNode> s = new Stack<>();
        s.push(root);
        while(!s.isEmpty()){
            BinaryTreeNode temp = s.peek();
            if(temp.left == null && temp.right == null){
                res.add(temp.data);
                s.pop();
                if(!s.isEmpty() && s.peek().left!= null && s.peek().left.data == temp.data)
                {
                    s.peek().left= null;
                }
                else if(!s.isEmpty() && s.peek().right != null){
                    s.peek().right = null;
                }
                continue;
            }
            else if(temp.left!=null
                /*&& !res.contains(temp.left.data)*/){

                s.push(temp.left);
                continue;
            }
            else if(temp.right!=null
                /*&& !res.contains(temp.right.data)*/){
                s.push(temp.right);
                continue;
            }

        }
        return res;
    }

    public List<List<Integer>> levelOrder(BinaryTreeNode root){
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null) return ans;

        Queue<BinaryTreeNode> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> intermediate = new ArrayList<>();
            for(int i = 0; i < size; i++){
                BinaryTreeNode cur = queue.poll();
                intermediate.add(cur.data);
                if(cur.left != null) queue.add(cur.left);
                if(cur.right != null) queue.add(cur.right);
            }
            ans.add(intermediate);
        }

        return ans;
    }

    public int height(BinaryTreeNode root){
        if(root==null) return 0;
        int leftHeight=height(root.left);
        int rightHeight=height(root.right);
        if(leftHeight>rightHeight)
            return leftHeight+1;
        else
            return rightHeight+1;
    }

    void printCurrentLevel(BinaryTreeNode root, int level){

        if(root == null) return;
        if(level == 1) {
            System.out.println(root.data);
        }
        else if (level>1) {
            printCurrentLevel(root.left,level-1);
            printCurrentLevel(root.right, level-1);
        }
    }

    List<List<Integer>> levelOrderTraversal(BinaryTreeNode root) {
        List<List<Integer>> list = new ArrayList<>(); //3
        if (root == null)
            return null;
        Queue<BinaryTreeNode> queue = new LinkedList<>(); //4 5
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size(); //2
            List<Integer> ans = new ArrayList<>(); //

            for (int i = 0; i < size; i++) { //2
                BinaryTreeNode curr = queue.poll(); //
                ans.add(curr.data);
                if (curr.left != null)
                    queue.add(curr.left);
                if (curr.right != null)
                    queue.add(curr.right);
            }
            list.add(ans);
        }
        return list;
    }
}
