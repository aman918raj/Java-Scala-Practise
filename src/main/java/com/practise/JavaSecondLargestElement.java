package com.practise;

public class JavaSecondLargestElement {

    public static void main(String[] args) {

        int[] arr = {3,10,37,2,526,1};
        JavaSecondLargestElement jse = new JavaSecondLargestElement();
        jse.secondLarest(arr);
    }


    private void secondLarest(int[] arr){

        /*
        * First find the largest then find the second largest
        */
        int large, secondLarge;
        if(arr[0] < arr[1]){
            large = arr[1];
            secondLarge = arr[0];
        }else{
            large = arr[0];
            secondLarge = arr[1];
        }

        for (int i = 2; i < arr.length; i++){
            if(arr[i] > large){
                large = arr[i];
            }
            if(arr[i] > secondLarge && arr[i] != large){
                secondLarge = arr[i];
            }
        }
        System.out.println("largest : "+large);
        System.out.println("second largest : "+secondLarge);
    }
}
