package com.company;

public class FirstAndLastElement {
    public static int findFirstPosition(int[] arr, int start, int end, int search) {
        if (end >= start) {
            int mid = (start + end) / 2;
            if (arr[mid] == search && arr[mid - 1] < search) {
                return mid;
            } else if (search <= arr[mid]) {
                return findFirstPosition(arr, start, mid, search);
            } else {
                return findFirstPosition(arr, mid + 1, end, search);
            }
        }
        return -1;
    }
    public static int findLastPosition(int[] arr, int start, int end, int search){
        if(end >=start) {
            int mid = (start + end)/2;
            if (arr[mid] == arr.length-1 || arr[mid] == search && arr[mid+1] > search)
                return mid;
            else if(search < arr[mid])
                return findLastPosition(arr, start, mid, search);
            else
                return findLastPosition(arr, mid+1, end, search);
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 6, 6, 6 ,6, 7, 8, 9};
        int start = 0;
        int end = arr.length-1;
        int search = 6;
        int first = findFirstPosition(arr, start, end, search);
        int last = findLastPosition(arr, start, end, search);
        System.out.println("first position is " + first + "Last position is" + last);

    }
}
