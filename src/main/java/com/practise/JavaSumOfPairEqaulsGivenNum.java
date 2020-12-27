package com.practise;

import scala.collection.generic.BitOperations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class JavaSumOfPairEqaulsGivenNum {

    public static void main(String[] args) {

        int[] arr = {3,2,1,2,2,8,0,6,4,3,4,5,3};
        int sum = 8;
        subCont(arr, sum);
    }

    public static void subCont(int[] inputArray, int sum) {
        HashSet<Integer> set = new HashSet<>();
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        ArrayList<Integer> al = new ArrayList<Integer>();

        for(int i : inputArray)
            al.add(i);

        for (int i = 0; i < inputArray.length; i++) {
            int k = sum - inputArray[i];
            System.out.println(k);
            if(  al.contains(k) ){
                System.out.println("numbers are "+ k + " and " + inputArray[i]);
            }
            set.add(inputArray[i]);
        }
    }
}
