package BianryTreeTraversal.PRE;

import java.util.Stack;

public class PreOrder {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public String preOrderTraversal(TreeNode root){
        StringBuilder builder=new StringBuilder();
        Stack<TreeNode> stack=new Stack<TreeNode>();
        stack.push(root);
        while (!stack.empty() ){
            TreeNode n=stack.pop() ;
            builder.append(n.val);
            if(n.right!=null)
                stack.push(n.right);
            if(n.left!=null)
                stack.push(n.left);
        }
        return builder.toString();
    }
    public static void main(String [] args){
        PreOrder pre = new PreOrder();
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);
        root.left.left=new TreeNode(4);
        root.left.right=new TreeNode(5);
        root.right.left=new TreeNode(6);
        root.right.right=new TreeNode(7);

        System.out.println(pre.preOrderTraversal(root));

    }
}
