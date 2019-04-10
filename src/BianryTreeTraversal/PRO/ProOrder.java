package BianryTreeTraversal.PRO;

import java.util.Stack;

public class ProOrder {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
    public String proOrderTraversal(TreeNode root){
        StringBuilder builder =new StringBuilder();
        if(root==null)
            return null;
        Stack<TreeNode> stack =new Stack<TreeNode>();
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode temp=stack.peek();
            if(temp.left==null&&temp.right==null){
                TreeNode pop=stack.pop();
                builder.append(pop.val);
            }
            else{
                if(temp.right!=null){
                    stack.push(temp.right);
                    temp.right=null;
                }
                if(temp.left!=null){
                    stack.push(temp.left);
                    temp.left=null;
                }
            }
        }
        return builder.toString();
    }
    public static void main(String [] args){
        ProOrder pro = new ProOrder();
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);
        root.left.left=new TreeNode(4);
        root.left.right=new TreeNode(5);
        root.right.left=new TreeNode(6);
        root.right.right=new TreeNode(7);

        System.out.println(pro.proOrderTraversal(root));

    }
}
