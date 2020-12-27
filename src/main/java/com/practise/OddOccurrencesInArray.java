package com.practise;

import java.util.Collection;
import java.util.HashMap;

public class OddOccurrencesInArray {

    public static void main(String[] args) {
        int[] arr = {9,3,9,3,9,7,9};
        HashMap<Integer,Integer> hm = new HashMap<Integer, Integer>();
        for(int i : arr){
            if(hm.containsKey(i))
                hm.put(i, hm.get(i)+1);

            hm.putIfAbsent(i,1);
        }

        for(int i : hm.keySet()){
            if (hm.get(i) % 2 != 0)
                System.out.println(i);
        }
    }
}
