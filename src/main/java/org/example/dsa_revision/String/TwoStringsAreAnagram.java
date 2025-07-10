package org.example.dsa_revision.String;

public class TwoStringsAreAnagram {
     public  static  boolean anagram(String str1 , String str2){

          if(str1.length() != str2.length())return false;

          if(str1.length() == str2.length()){
               for(int i =0; i< str1.length() ; i++){
                    if(!str1.contains(String.valueOf(str2.charAt(i))))
                        return  false;
               }
          }
           return true ;
     }

    public static void main(String[] args) {
        String str1  = "triangle";
        String str2  = "integral";
        boolean ans  = anagram(str1,str2);
        System.out.println(ans);
    }
}
