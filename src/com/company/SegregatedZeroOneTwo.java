package com.company;

public class SegregatedZeroOneTwo {

    public  static void Segregate(int[] arr)
    {
        int i = 0, j = 0, k = arr.length - 1;
        while (i < k)
        {
            if(arr[i] == 0)
            {
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                j++;
                i++;
            }
            else if(arr[i] == 2)
            {
                int temp = arr[k];
                arr[k] = arr[i];
                arr[i] = temp;
                k--;
            }
            else
            {
                i++;
            }

        }
        for(int m=0;m<arr.length;m++)
        {
            System.out.print(arr[m]);
        }
    }
    public static void main(String[] args)
    {
        int[] arr = {1, 0, 0, 1, 1, 2, 0, 1, 2, 1, 0};
        System.out.println(arr.length);
        Segregate(arr);
    }
}
