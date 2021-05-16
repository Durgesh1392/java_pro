package com.company;

public class Leaders {
//    public static void Lead(int[] arr)
//    {
//        int n= arr.length;
//        for(int i=0; i<n; i++)
//        {
//            boolean flag = false;
//            for(int j=i+1;j<n; j++)
//            {
//                if(arr[i]<arr[j])
//                {
//                    flag=true;
//                    break;
//                }
//            }
//            if(flag == false)
//            {
//                System.out.println(arr[i]);
//            }
//        }
//    }
    public static void Lead(int[] arr)
    {
        int n = arr.length;
        int max = arr[n-1];
        for(int i= n-1; i>=0; i--)
        {
            if(arr[i] > max)
            {
                System.out.println(arr[i]);
                max = arr[i];
            }

        }
    }

    public static void main(String[] args) {
        int[] arr = {16,17,4,3,5,2};
        Lead(arr);
    }
}
