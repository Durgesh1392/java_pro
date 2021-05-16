package com.company;

import java.util.Arrays;

public class ChoclateDIstributionProblem{
    public static void ChocDistri(int[] arr, int m) {
        Arrays.sort(arr);
        int i = 0, j = m - 1, min = Integer.MAX_VALUE;
        while (j < arr.length) {
            if (arr[j] - arr[i] < min) {
                min = arr[j] - arr[i];
            }
            i++;
            j++;
        }
        System.out.println(min);
    }


    public static void main(String[] args)
    {
        int[] arr = {3, 4, 1, 9, 56, 7, 9, 12};
        int m = 5;
        ChocDistri(arr, m);


    }
}
