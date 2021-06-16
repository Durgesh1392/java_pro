package com.company;

class Solution {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=0, j=0, k=0;
        while(i<m && j<n)
        {
            if(nums1[i]<=nums2[j])
                nums1[k++]=nums1[i++];
            else
                nums1[k++]=nums2[j++];
        }
        while(i<m)
            nums1[k++]=nums1[i++];

        while(j<n)
            nums1[k++]=nums2[j++];
        for(int p=0;p<m+n;p++)
            System.out.print(nums1[p]+" ");

    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        int m = 3;
        int n = 3;
        merge(nums1, m, nums2, n);

    }
}