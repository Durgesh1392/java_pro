package com.company;

public class LinearSearch {
    public static void LinSearch(int[] arr, int x)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] == x)
            {
                System.out.println("the element is present at "+ (i+1) +" position");
            }
        }

    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        int x = 0 ;
        LinSearch(arr, x);
    }
}
