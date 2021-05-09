package com.company;

import java.util.HashSet;
import java.util.Set;

public class TwoPairSum {
// brute force approach
    //    public static void testsum(){
//        int sum = 14;
//        int[] arr = { 1, 5, 4, 13, 7};
//        for(int i=0; i<=arr.length-2; i++)
//        {
//            for(int j=i+1;j<=arr.length-1; j++)
//            {
//                if(arr[i] + arr[j] == sum )
//                {
//                    System.out.println("i="+i+"j="+j);
//                }
//            }
//        }
//    }

    // optimised approach
//    public static void twopairsum(){
//        int sum = 14;
//        int[] arr = { 1, 5, 4, 13, 7};
//        Set<Integer> hs = new HashSet<>();
//        for(int i=0 ;i<= arr.length-1;i++)
//        {
//            hs.add(arr[i]);
//        }
//        for(int i=0;i<= arr.length-1;i++)
//        {
//            if( hs.contains(sum-arr[i]))
//            {
//                System.out.println("first number is "+ arr[i] +"second number is"+ (sum-arr[i]));
//                return;
//            }
//        }
//    }

    public static void twopairsum(){
        int sum = 14;
        int[] arr = { 1, 5, 4, 13, 7};
        Set<Integer> hs = new HashSet<>();
        for(int i=0;i<= arr.length-1;i++)
        {

            if( !hs.isEmpty() && hs.contains(sum-arr[i]))
            {
                System.out.println("first number is "+ arr[i] +"second number is"+ (sum-arr[i]));
                return;
            }
            hs.add(arr[i]);
        }
    }
    public static void main(String[] args) {
       // testsum();
        twopairsum();
    }
}

