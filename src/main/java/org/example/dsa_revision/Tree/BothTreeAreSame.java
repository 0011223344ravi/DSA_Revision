package org.example.dsa_revision.Tree;

public class BothTreeAreSame {
    public static TreeNode createTree(){
        TreeNode root  = new TreeNode(1);
        root.left  = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.right  = new TreeNode(6);
        return root ;
    }
     public static boolean ifBothTreeAreSame(TreeNode p , TreeNode q ){
          if(p==null && q==null)
              return  true ;

          if(p==null || q==null)
              return  false ;
          if(p.value != q.value)
              return  false ;
           return  ifBothTreeAreSame(p.left, q.left) && ifBothTreeAreSame(p.right,q.right);
     }

    public static void main(String[] args) {
        TreeNode p = createTree();
         TreeNode q  = createTree();
       boolean ans =  ifBothTreeAreSame(p,q);
        System.out.println("Both Trees are same :- " + ans);
    }
}
