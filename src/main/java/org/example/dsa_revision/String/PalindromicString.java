package org.example.dsa_revision.String;

public class PalindromicString {
    public static boolean isPalindrom(String str ){

          int left  =0;
           int right  = str.length()-1;
           while(left<=right){

                 if(str.charAt(left) != str.charAt(right)){
                     return  false;
                 }
                 right--;
                 left++;

           }
  return  true ;
    }

    public static void main(String[] args) {
        String str  = "madam";
        boolean ans  = isPalindrom(str);
        System.out.println(ans);
    }
}
