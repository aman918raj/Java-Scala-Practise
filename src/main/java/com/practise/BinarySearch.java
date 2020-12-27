package com.practise;

import java.util.Arrays;

public class BinarySearch {

    public static void main(String[] args) {

        int[] arr = {1,4,2,9,8,11,30,0,23,6};
        int num = 4;
        search(arr, num);

    }

    public static void search(int[] arr, int num){

        int l = 0;
        int r = arr.length - 1;

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        while(l <= r){
            int mid = l + (r-l) / 2;

            if (arr[mid] == num)
                System.out.println("Number found "+ arr[mid] + " at position " + mid);

            if (arr[mid] < num)
                l = mid + 1;
            else
                r = mid -1;
        }

    }
}
