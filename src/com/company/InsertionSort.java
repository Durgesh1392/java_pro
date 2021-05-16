package com.company;

public class InsertionSort {
    public static void InSort(int[] arr)
    {
        int n = arr.length;
        for(int i=1;i<n; ++i)
        {
            int key = arr[i];
            int j= i-1;
            while (j>=0 && arr[j] > key)
            {
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1] = key;
        }
        for(int i =0 ;i<n; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 3, 7, 9, 1};
        InSort(arr);
    }
}
