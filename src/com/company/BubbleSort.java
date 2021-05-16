package com.company;

public class BubbleSort {
    public static void Sort(int[] arr)
    {   int n = arr.length;
        for(int i=0;i< n-1;i++)
        {   boolean flag = false;
            for(int j=0; j< n-i-1 ;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = true;
                }
            }
            if(flag != true)
            {
                break;
            }
        }
        for(int i=0;i<= arr.length-1;i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args)
    {
        int[] arr = {3, 2, 6, 5, 1, 7, 9, 8};
        Sort(arr);

    }
}
