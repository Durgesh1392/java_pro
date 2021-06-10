package com.company;

public class RemoveDuplicate {
    public static void removedup(int[] arr)
    {
        int j=0;
        int n= arr.length;
        for(int i=0; i < arr.length-1;i++)
        {
            if(arr[i] != arr[i+1])
            {
                arr[j++] = arr[i];
            }
        }
        arr[j++] = arr[arr.length-1];
        for(int k=0;k<j;k++)
        {
            System.out.print(arr[k]+ " ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 3, 5, 6, 6, 7, 7, 8};
        removedup(arr);
    }
}
