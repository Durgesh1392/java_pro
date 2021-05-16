package com.company;

public class MissingNumber {
    public static void Missing(int[] a, int n)
    {   int computed_sum = 0;
        int real_sum = (n*(n+1))/2;
        //System.out.println(sum);
        for(int i=0; i<a.length; i++ )
        {
            computed_sum += a[i];
            //System.out.println(real_sum);
        }
        if(real_sum == computed_sum){
            System.out.println("no missing number");
        }
        int missing_num = real_sum - computed_sum;
        System.out.println(missing_num);
    }
    public static void main(String[] args) {
        int[] a={1,2,3,5};
        int n = 5;
        Missing(a, n);
    }
}
