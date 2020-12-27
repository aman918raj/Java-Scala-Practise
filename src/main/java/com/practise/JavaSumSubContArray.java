package com.practise;

import java.util.Arrays;

public class JavaSumSubContArray {

    public static void main(String[] args) {
        int[] arr = {42, 15, 12, 8, 6, 32};
        int sum = 12;
        JavaSumSubContArray js = new JavaSumSubContArray();
        js.subCont(arr, sum);
    }

    public void subCont(int[] inputArray, int inputNumber){
        int sum = inputArray[0];
        int start=0;
        for (int i = 1; i < inputArray.length; i++) { //Adding inputArray[i] to the current 'sum' sum = sum + inputArray[i]; //If sum is greater than inputNumber then following loop is executed until //sum becomes either smaller than or equal to inputNumber while(sum > inputNumber && start <= i-1)
            {
                //Removing starting elements from the 'sum'
                sum = sum - inputArray[start];
                //Incrementing start by 1
                start++;
            }
            if(sum == inputNumber)
            {
                System.out.println("Input Array : "+ Arrays.toString(inputArray));
                System.out.println("Input Number : "+inputNumber);
                System.out.print("Continuous Sub Array : ");
                for (int j = start; j <= i; j++)
                {
                    System.out.print(inputArray[j]+" ");
                }
                System.out.println();
            }
        }

    }
}
