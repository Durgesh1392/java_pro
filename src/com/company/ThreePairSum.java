package com.company;

import java.util.HashSet;
import java.util.Set;

public class ThreePairSum {

    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 4, 13, 7};
        int sum = 17;
        testthreepairsum(arr, sum);
    }
    // normal bruteforce appraoch
//    public static void testthreepairsum(int[] arr, int sum)
//    {
//        for(int i=0;i<=arr.length-2;i++)
//        {
//            for(int j=i+1;j<=arr.length-1;j++)
//            {
//                for(int k=j+1; k<=arr.length-1;k++)
//                {
//                    if(arr[i]+arr[j]+arr[k] == sum)
//                    {
//                        System.out.println("i="+i+"j="+j+"k="+k);
//                    }
//                }
//            }
//        }
//
//    }
    public static void testthreepairsum(int[] arr, int sum)
    {
        Set <Integer> hs = new HashSet<Integer>();
        for(int i=0; i<=arr.length-2; i++)
        {
            for(int j=i+1; j<=arr.length-1; j++)
            {
                if(!hs.isEmpty() && hs.contains(sum - (arr[i]+arr[j])))
                {
                    System.out.println("first number is "+arr[i]+"second number is "+arr[j]+"third number is "+(sum-(arr[i]+arr[j])));
                }
            }
            hs.add(arr[i]);
        }
    }
}
