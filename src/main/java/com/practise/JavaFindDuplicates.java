package com.practise;

import java.util.HashSet;

public class JavaFindDuplicates {

    public static void main(String[] args) {
        int[] arr = {2,3,4,1,2,4,1,6};
        HashSet<Integer> hs = new HashSet<Integer>();
        for(int i : arr){
            if(!hs.add(i)){
                System.out.println("Duplicate "+i);
            }
        }
    }
}
