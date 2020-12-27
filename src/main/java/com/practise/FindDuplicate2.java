package com.practise;

public class FindDuplicate2 {

    public static void main(String[] args) {

        int[] arr = {6,3,2,5,4,2,1,3,2};

        for(int i=0; i < arr.length; i++ ){
            int a = arr[Math.abs(arr[i])];
            if( a >= 0 ){
                arr[Math.abs(arr[i])] = -a;
            }else {
                System.out.println("Duplicate number is "+ Math.abs(arr[i]));
            }
        }
    }
}
