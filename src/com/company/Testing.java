package com.company;

public class Testing {
    public static void Test(int[] arr)
    {
        for(int s=0;s<arr.length;s++)
        {
            for(int e=s;e< arr.length;e++)
            {
                for (int k = s; k <= e; k++)
                {
                    System.out.print(arr[k]);
                }
                System.out.println(" ");
            }
        }

    }
    public static void main(String[] args)
    {
        int[] arr = {1, 2, 3, 4};
        Test(arr);
    }
}
