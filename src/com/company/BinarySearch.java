package com.company;

public class BinarySearch {
    public static int Bsearch(int[] arr, int l, int r, int x )
    {
        if(r >= 1)
        {
            int mid = l + (r-1)/2;
            if(arr[mid] == x)
                return mid;
            if(arr[mid] < x)
                return Bsearch(arr, mid+1, r, x);
            else
                return Bsearch(arr,  0, mid-1, x);
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int n = arr.length;
        int p = Bsearch(arr, 0, n-1, 3 );
        if(p == -1)
            System.out.println("element is not present in the array");
        else
            System.out.println("element "+ p + " is present");
    }
}
