package org.example.dsa_revision.Array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindFirstAndLastIndexOFDuplicate {

       public static List<Integer> findFirstAndLast(int arr  []){
     List<Integer> ans = new ArrayList<>();
          Map<Integer, Integer>  countOccurance  = new HashMap<>();
          Map<Integer, Integer>  first  = new HashMap<>();
          Map<Integer, Integer>  last  = new HashMap<>();

           for(int i =0; i< arr.length ; i++){
                int val = arr[i];
                // count
               countOccurance.put(val, countOccurance.getOrDefault(val,0)+1);

               first.putIfAbsent(val, i);
               last.put(val,i);
           }
            for(Map.Entry<Integer,Integer>  entry : countOccurance.entrySet()){
                if(entry.getValue()>1){
                    System.out.println(" element "+ entry.getKey() +
                            " first occurance " +first.get(entry.getKey()) + "last occurance is :-"+last.get(entry.getKey()));
                 ans.add(first.get(entry.getKey()));
                 ans.add(last.get(entry.getKey()));
                }
            }
 return  ans  ;
       }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 10, 40, 20, 10};
       List<Integer> ans =  findFirstAndLast( arr);

        System.out.println(ans);
    }

}
