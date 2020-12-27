package com;

public class JavaBinarySearch {

    public static void main(String[] args) {

        int[] arr = {5,8,4,7,9,2};
        sortArr(arr);
    }

    public static void sortArr(int[] arr){
        int n = arr.length;
        for(int i=0;i < n; i++){
            for(int j=1; j < n-i;j++){
                if( arr[j] < arr[j-1]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i : arr){
            System.out.println(i);
        }

    }
}
