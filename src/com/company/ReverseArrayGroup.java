package com.company;

public class ReverseArrayGroup {
    public static void ReverseArray(int[] arr, int m)
    {
        for(int i=0; i<arr.length; i=i+m)
        {
            int k=Math.min(arr.length-1,i+m-1);
            for(int j=i; j<i+m ;j++,k--)
            {
                   if(j < k)
                   {
                       int temp = arr[j];
                       arr[j] = arr[k];
                       arr[k] = temp;
                   }
            }

        }
        for(int i=0;i< arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int m = 3;
        ReverseArray(arr, m);
    }
}
