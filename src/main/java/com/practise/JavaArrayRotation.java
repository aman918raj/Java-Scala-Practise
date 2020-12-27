package com.practise;

public class JavaArrayRotation {

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6,7};
        int[] indexToRotate = {1,2,1};
        int[] leftRotatedArray = rotate(arr, indexToRotate, "left");
        for (int i : leftRotatedArray) {
            System.out.println("left " + i);
        }
        int[] rightRotatedArray = rotate(arr, indexToRotate, "right");
        for (int i : leftRotatedArray) {
            System.out.println("left " + i);
        }
        for (int i : rightRotatedArray) {
            System.out.println("right " + i);
        }
    }

    public static int[] rotate(int[] arr, int[] n, String lr){

        if ("left".equalsIgnoreCase(lr)){
            for(int i : n){
                arr = rotateLeft(arr, i);
            }
            return arr;
        } else{
            for(int i : n){
                arr = rotateRight(arr, i);
            }
            return arr;
        }
    }
    public static int[] rotateLeft(int[] arr, int n) {

        for (int i = 1; i <= n; i++) {
            int temp = arr[0];
            for (int j = 0; j < arr.length - 1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[arr.length - 1] = temp;
        }
        return arr;
    }

    public static int[] rotateRight(int[] arr, int n) {

        for (int i = 1; i <= n; i++) {
            int temp = arr[arr.length-1];
            for (int j = arr.length - 1; j <= 0; j++) {
                arr[j] = arr[j-1];
            }
            arr[0] = temp;
        }
        return arr;
    }
}
