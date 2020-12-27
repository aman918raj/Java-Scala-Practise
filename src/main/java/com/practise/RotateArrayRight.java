package com.practise;

public class RotateArrayRight {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6};
        int n = arr.length;
        int noOfRotation = 3;
        RotateArrayRight rar = new RotateArrayRight();
        int [] arr2 = rar.rotateArray(arr, n, noOfRotation);
        for (int i : arr2)
            System.out.println(i);
    }

    public int[] rotateArray(int[] arr, int n, int noOfRotation){

        for(int i = 0; i < noOfRotation; i++){
            int lastElement = arr[n-1];
            for(int j = n-1; j > 0; j--){
                arr[j] = arr[j-1];
            }
            arr[0] = lastElement;
        }
        return arr;
    }
}
