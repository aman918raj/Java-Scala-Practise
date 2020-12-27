package com;

public class JavaArrayRotate {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};
        int arrSize = arr.length;
        int numOfRotation = 2;
    }

    public void leftRotate(int arr[], int numOfRotation, int arrSize){
        int index, temp;

        for (int i=0; i <= arrSize-1; i++){
            temp = arr[i];
            index = i;
            if(i==0){
                temp = arr[arrSize-1];
                arr[arrSize-1] = arr[i];
                arr[i] = arr[i+1];
            }else if (i==arrSize-1){
                temp =arrSize;
            }
            else{
                temp = arr[i];
                arr[i]=arr[i+1];
                arr[i-1]=temp;
            }
        }
    }
}
