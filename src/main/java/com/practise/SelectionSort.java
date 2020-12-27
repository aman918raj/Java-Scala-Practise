package com.practise;

public class SelectionSort {

    public static void main(String args[]) {
        SelectionSort ob = new SelectionSort();
        int arr[] = {64, 25, 12, 22, 11};
        int[] arr1 = ob.sort(arr);

        for(int i : arr)
            System.out.println(i);

    }

    public int[] sort(int[] arr) {

        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {

            int idx = i;
            for (int j = i + 1; j < n ; j++) {
                if (arr[j] < arr[idx]) {
                    idx = j;
                }
                int temp = arr[idx];
                arr[idx] = arr[i];
                arr[i] = temp;

            }
        }
        return arr;
    }
}
