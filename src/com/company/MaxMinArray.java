package com.company;

public class MaxMinArray {
    public static void maxmin(int[] arr)
    {
        int max = arr[0];
        int min = arr[0];
        for(int i=0; i<arr.length ; i++)
        {
            if(arr[i]> max)
                max = arr[i];
            if(arr[i]< min)
                min = arr[i];
        }
        System.out.println("max is " + max+ " min is " + min);
    }
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 1, 9, 6, 7};
        maxmin(arr);
    }
}
