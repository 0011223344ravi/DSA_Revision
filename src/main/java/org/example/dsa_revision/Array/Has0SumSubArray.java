package org.example.dsa_revision.Array;

import java.util.HashSet;

public class Has0SumSubArray {

     public static  boolean hasZeroSum(int arr  []){
         HashSet<Integer>  hs  = new HashSet<>();
          int sum  =0;
           for(int i :arr){
                sum =sum +i;
                 if(sum ==0 || hs.contains(sum)){
                     return true;
                 }
                 hs.add(i);
           }
         return false;

     }

    public static void main(String[] args) {
        int[] arr = {4, 2, -3, 1, 6};
        System.out.println("Zero sum subarray exists: " + hasZeroSum(arr));
    }


}
