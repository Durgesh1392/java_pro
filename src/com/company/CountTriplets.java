package com.company;

import java.util.*;

public class CountTriplets {
//    public static void CountTrip(int[] arr)
//    {
//        Set<Integer> hs = new HashSet<Integer>();
//        int count = 0;
//        for(int i=0;i<=arr.length-1;i++)
//        {
//            hs.add(arr[i]);
//        }
//        for(int i=0;i<=arr.length-2;i++)
//        {
//            for(int j=i+1;j<=arr.length-1;j++)
//            {
//                if(hs.contains((arr[i]+arr[j])))
//                {
//                    count++;
//                }
//            }
//        }
////        for(int i=0; i<=arr.length-2; i++)
////        {
////            for(int j=i+1; j<=arr.length-1; j++)
////            {
////                if( !hs.isEmpty() && hs.contains((arr[i]+arr[j])))
////                {
////                    count++;
////                }
////            }
////            hs.add(arr[i]);
////        }
//        System.out.println("count is "+count);

   // }
//    public static void CountTrip(int[] arr)
//    {   int count = 0;
//        for(int i=0;i<=arr.length-1;i++)
//        {
//            for(int j=0;j<=arr.length-1;j++)
//            {
//                for(int k=0;k<=arr.length-1;k++)
//                {
//                 if(i != j && arr[i] == (arr[j]+arr[k]))
//                 {
//                     count++;
//                 }
//                }
//            }
//        }
//        System.out.println("count is "+count);
//    }

    public static void CountTrip(int[] arr){
        int count = 0;
        Map<Integer, ArrayList<Pair>> mp = new HashMap<>();
        for(int i=0;i<=arr.length-1;i++)
        {
            for(int j=0;j<=arr.length-1;j++)
            {
                for(int k=0;k<=arr.length-1;k++)
                {
                    if(i!=j && j!=k && arr[i] == (arr[j]+arr[k])){
                        ArrayList a= new ArrayList();
                        a.add(new Pair(arr[j],arr[k]));
                        mp.put(arr[i],a);
                        count++;
                    }
                }
            }
        }
        for(Map.Entry<Integer, ArrayList<Pair>> entry : mp.entrySet())
        {
            System.out.println("key ="+ entry.getKey()+"value is "+ entry.getValue());
        }
    }



    public static void main(String[] args) {
        int[] arr= {1, 5, 3, 2 };
        CountTrip(arr);

    }
}

class Pair{
    int x;
    int y;

    @Override
    public String toString() {
        return "Pair{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}