package com.company;

import java.util.HashSet;
import java.util.Set;

public class Test1 {
    public static void Occurence(int[] arr, int x)
    {
        Set<Integer> hs = new HashSet<>();
        for(int i=0;i<arr.length;i++)
        {
            if(!hs.isEmpty() && hs.contains(arr[i]))
            {
                System.out.println(arr[i]);
            }
            hs.add(arr[i]);
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 6, 3, 6, 1};
        int x= 1;
        Occurence(arr, x);
    }
}
