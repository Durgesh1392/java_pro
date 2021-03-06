package com.company;

import java.util.Arrays;

public class MinimumPlatforms {
    public static void MinPlatform(int[] arr, int[] dep) {
        Arrays.sort(arr);
        Arrays.sort(dep);
        int i = 1, j = 0, platform = 1, result = 1;
        while (i < arr.length && j < dep.length)
        {
            if (arr[i] <= dep[j])
            {
                platform++;
                i++;
                result = Math.max(platform, result);
            }
            else
            {
                platform--;
                j++;
            }
        }
        System.out.println(result);

    }
    public static void main(String[] args) {

       int[] arr = {900, 940, 950, 1100, 1500, 1800};
       int[] dep = {910, 1200, 1120, 1130, 1900, 2000};
       MinPlatform(arr, dep);
    }
}
