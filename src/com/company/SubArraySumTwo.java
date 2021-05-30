package com.company;

public class SubArraySumTwo {
    public static void SubArraySum(int[] arr, int sum)
    {
        for(int s=0;s<arr.length;s++)
        {
            for(int e=s;e<arr.length;e++)
            {
                int sum_com = 0;
                for(int k=s;k<=e;k++)
                {
                    sum_com += arr[k];
                }
                if(sum_com == sum)
                {
                    System.out.println("item found");
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = { 1, 3, 4, 5, 8};
        int sum= 13;
        SubArraySum(arr, sum );
    }
}
