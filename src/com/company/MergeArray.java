package com.company;

public class MergeArray {

    public static void Merge(int[] first, int[] second)
    {
        int n=first.length;
        int m=second.length;
        int[] third = new int[n+m];
        int i=0, j=0, k=0;
        while(i<first.length && j<second.length)
        {
            if(first[i] < second[j])
                third[k++]=first[i++];
            else
                third[k++]=second[j++];
        }
        while(i<first.length)
            third[k++]=first[i++];
        while(j<second.length)
            third[k++]=second[j++];

        for(int p=0; p< third.length;p++)
        {
            System.out.print(third[p]+ " ");
        }
    }
    public static void main(String[] args) {
        int[] first = {1, 3, 4, 5};
        int[] second = {2, 7, 8, 9, 11};
        Merge(first, second);
    }
}
