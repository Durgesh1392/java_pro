package com.company;

public class Kadane {
    public static int Kad(int[] arr)
    {
        int curr_sum = 0;  //for current sum upto the element
        int max_sum = 0;   // for the maximum sum we got so far
        for(int i=0;i<= arr.length-1;i++)
        {
            max_sum += arr[i];
            if(curr_sum < max_sum)
            {
                curr_sum = max_sum;
            }
            if(max_sum < 0)
            {
                max_sum = 0;
            }
        }
        return max_sum;

    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,-2,5};
        int n = Kad(arr);
        System.out.println("maximum sum is  "+n);

    }
}
