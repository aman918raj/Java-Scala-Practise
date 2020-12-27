package com.practise;

public class JavaFindMissingNumber {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,6,7,8,9};
        int n = arr.length;
        int sumOfElements = (n+1)  * (n+2)/2;
        System.out.println(sumOfElements);
        int i;
        for(int x : arr){
            sumOfElements -=x;
        }
        System.out.println("Missing number is : "+sumOfElements);

    }
}
