package org.example.dsa_revision.Tree;

import com.sun.source.tree.Tree;

public class HeightOfATree {
     public  static  int height(TreeNode root ){
         if(root ==null)
             return 0;

          return 1+ Math.max( height(root.left) , height(root.right));
     }
    public static TreeNode createTree(){
        TreeNode root  = new TreeNode(1);
        root.left  = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.right  = new TreeNode(6);
        return root ;
    }
    public static void main(String[] args) {
    TreeNode root  = createTree();
    int height  = height(root);
        System.out.println(height);
    }
}
