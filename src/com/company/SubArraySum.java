package com.company;

public class SubArraySum {
    public static void SubArray(int[] arr, int sum)
    {
        for(int i = arr.length; i>0;i--)
        {
            for(int j=0, k=j+i-1;k<arr.length;j++,k++)
            {
                int asum=0;
                for(int l=j;l<=k;l++)
                {
                    asum+=arr[l];
                }
                if(asum == sum)
                {
                    System.out.println(j+1+","+ (k+1));
                    return;
                }

            }
        }

    }
    public static void main(String[] args) {
        int[] arr= {1,2,3,7,5};
        int sum = 12;
        SubArray(arr, sum );
    }
}
