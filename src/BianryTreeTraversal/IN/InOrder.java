package BianryTreeTraversal.IN;

import java.util.Stack;

public class InOrder {
    private TreeNode root;
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
    public String inOrderTraversal(TreeNode root){
        StringBuilder builder=new StringBuilder();
        Stack<TreeNode> stack=new Stack<TreeNode>();
        if(root==null)
            return null;
        TreeNode p=root;
        while(!stack.isEmpty()||p!=null){
            if(p!=null){
                stack.push(p);
                p=p.left;
            }
            else{
                TreeNode t=stack.pop();
                builder.append(t.val);
                p=t.right ;
            }
        }

        return builder.toString();
    }
    public static void main(String [] args){
        InOrder in = new InOrder();
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);
        root.left.left=new TreeNode(4);
        root.left.right=new TreeNode(5);
        root.right.left=new TreeNode(6);
        root.right.right=new TreeNode(7);

        System.out.println(in.inOrderTraversal(root));

    }

}
