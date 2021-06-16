package com.Dp;

import static java.lang.Math.min;

public class MinimumNumberOfJump {
    public static void main(String[] args) {
        int[] arr = {2, 1, 3, 2, 3, 4, 5, 1, 2, 8};
        int[] min_jump_arr = { 9, 9, 9, 9, 9, 9, 9, 9, 9, 9};
        int n = arr.length;
        min_jump_arr[0]= 0;

        for(int i=1; i<n; i++)
        {
            for(int j=0; j<i ; j++)
            {
                if(i <= j+ arr[j])
                {
                    min_jump_arr[i] = min(min_jump_arr[i], min_jump_arr[j] + 1);
                }
            }
        }
        System.out.println("no of minimum jumps " + min_jump_arr[min_jump_arr.length-1]);
    }
}
