package com.company;

import java.util.HashSet;
import java.util.Set;

public class PythagoreanTriplet {
    public static void PythTriplet(int[] arr) {
        int[] squaredarray = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            squaredarray[i] = arr[i] * arr[i];
        }
        Set<Integer> hs = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            int sum = arr[i];
            for (int j = 0; j < arr.length; j++) {

                if (!hs.isEmpty() && hs.contains(sum - arr[j])) // sum - arr[j] signifies the third number
                {
                    System.out.println("yes");
                    break;
                }
                hs.add(arr[i]);
            }
        }

    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 4, 6, 5};
        PythTriplet(arr);

    }
}
