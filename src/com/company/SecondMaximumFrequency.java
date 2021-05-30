package com.company;

import java.util.HashMap;
import java.util.Map;

public class SecondMaximumFrequency {
    public static void second(int[] arr, int k)
    {
        Map<Integer, Integer> mp = new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            if(mp.containsKey(arr[i]))
            {
                int count = mp.get(arr[i]);
                mp.put(arr[i],++count);
            }
            else
            {
                mp.put(arr[i],1);
            }
        }
        int max_key = findMaxFrequency(arr,mp);
        mp.remove(max_key);
        int second_max = findMaxFrequency(arr, mp);
        System.out.println("Second max is: "+ second_max);

    }

    public static int findMaxFrequency(int[] arr, Map<Integer, Integer> mp){
        int max_key= arr[0];
        int max_value = mp.get(arr[0]);
        for (Map.Entry<Integer,Integer> entry : mp.entrySet())
        {
            if (entry.getValue() > max_value) {
                max_value = entry.getValue();
                max_key = entry.getKey();
            }
        }
       return max_key;
    }
    public static void main(String[] args) {
        int[] arr = { 3, 4, 5, 6, 5, 5, 8, 9, 4, -999999, -99999, -99999};
        int k = 5;
        second(arr, k);
    }
}
