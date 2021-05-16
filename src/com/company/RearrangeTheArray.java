package com.company;

public class RearrangeTheArray {
    public static void Rearrange(int[] arr, int n)
    {
        int max = arr[n-1] + 1;
        int max_i = n-1;
        int min_i = 0;
        for (int i=0;i<n;i++) {
            if(i%2==0) {
                arr[i] += (arr[max_i] % max)*max;
                max_i--;
            } else {
                arr[i] += (arr[min_i] % max)*max;
                min_i++;
            }
        }
        for (int i=0;i<n;i++) {
            arr[i]/= max;
        }
        for(int i=0;i<arr.length-1;i++)
        {
            System.out.println(arr[i]);
        }
    }


    public static void main(String[] args)
        {
        int[] arr = {1,2,3,4,5,6};
        int n = 6;
        Rearrange(arr, 6);
    }
}
