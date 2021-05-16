package com.company;

public class MergeSort {
    public static void Sort(int[] arr)
    {
        if(arr == null)
        {
            return;
        }
        if(arr.length > 1)
        {
            int mid = arr.length / 2;
            int[] left = new int[mid];
            for (int i = 0; i < mid; i++) {
                left[i] = arr[i];
            }
            int[] right = new int[arr.length - mid];
            for (int i = mid; i < arr.length; i++) {
                right[i - mid] = arr[i];
            }
            Sort(left);
            Sort(right);

            int i = 0, j = 0, k = 0;
            while (i < left.length && j < right.length)
            {
                if(left[i] < right[j])
                    arr[k++] = arr[i++];
                else
                    arr[k++] = arr[j++];
            }
            while(i < left.length)
            {
                arr[k++] = arr[i++];
            }
            while(j < right.length)
            {
                arr[k++] = arr[j++];
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 1, 3, 5, 7, 9, 1};
        Sort(arr);
        for(int i=0; i<arr.length ; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
