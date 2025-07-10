package org.example.dsa_revision.Tree;

import java.util.logging.SocketHandler;

public class TreeBasicOperations {

     public static  TreeNode createATree(){
         TreeNode root  = new TreeNode(1);
         root.left  = new TreeNode(2);
         root.right  = new TreeNode(3);;
         root.left.left  = new TreeNode(4);
         root.left.right  = new TreeNode(5);
         root.right.left = new TreeNode(6);
         root.right.right  = new TreeNode(7);
          return  root ;
     }

      public static  void inorder(TreeNode root){
   if(root ==null) return;
         //Left ->root ->Right
          inorder(root.left);
          System.out.println(root.value);
          inorder(root.right);
      }
      //  Left -> Right -> root
    public static void postOrder(TreeNode root){
         if(root  ==null)
              return;
         postOrder(root.left);
         postOrder(root.right);
        System.out.println(root.value);
    }
 // Root -> Left ->Right
    public static void preOrder(TreeNode root){
        if(root  ==null)
            return;
        System.out.println(root.value);
        preOrder(root.left);
        preOrder(root.right);

    }



    public static void main(String[] args) {
      TreeNode root  =  createATree();
        System.out.println("Inorder Traversal");
       inorder(root);
        System.out.println("PreOrder Traversal");
       preOrder(root);
        System.out.println("PostOrder Traversal ");
        postOrder(root);

    }

}
