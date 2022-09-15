package DataStructure.Trees;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};

class Demo{
    public static void main(String[] args) {
        Node head = new Node();
        head.val=3;
        List<Integer> list= Arrays.asList(4,5,6);

    }
    //preorder root->left->right
    //post


    public List<Integer> preorder(Node root) {
        List<Integer> list= new ArrayList<>();
        while(root!=null){
            list.add(root.val);
            for(int i=0; i<root.children.size(); i++)
                preorder(root.children.get(i));
        }
        return list;
    }
}