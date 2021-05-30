package com.company;

import java.util.HashMap;
import java.util.Map;

public class test2 {
    public static void occurence(int[] arr, int k)
    {
        Map<Integer, Integer> mp =new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            if(mp.containsKey(arr[i]))
            {
                int count = mp.get(arr[i]);
                count++;
                mp.put(arr[i],count);
            }
            else{
                mp.put(arr[i],1);
            }
        }

        for (Map.Entry<Integer,Integer> entry:mp.entrySet())
        {
            System.out.println("key =" + entry.getKey()+ " Occurrence is "+ entry.getValue());

        }
    }
    public static void main(String[] args) {
        int[] arr = { 3, 4, 5, 6, 5, 5, 8, 9, 4};
        int k = 5;
        occurence(arr, k);
    }
}
