package com.company;

public class InsertElement {
    public static void insertele(int[] arr, int pos, int num){
        int n = arr.length;
        for(int i=n;i>pos;i--)
        {
            arr[i]=arr[i-1];
        }
        arr[pos-1] = num;
        for(int i=0;i<=n;i++)
        {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {


    int[] arr = { 1, 2, 3, 4, 5, 6, 7};

    int pos = 4;
    int num = 9;
    insertele(arr, pos, num);
    }
}
