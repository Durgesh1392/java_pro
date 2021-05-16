package com.company;

public class Equilibrium {
//    public static void Equili(int[] a)
//    {
//        int left_sum = 0, right_sum = 0;
//        if(a.length == 1){
//            System.out.println("1");
//        }
//        for(int i=1;i<a.length;i++)
//        {
//            right_sum +=a[i];
//        }
//        for(int j=0,i=1;i<a.length;j++,i++)
//        {
//            left_sum += a[j];
//            right_sum -= a[i];
//
//            if(left_sum == right_sum)
//            {
//                System.out.println(i+1);// return position
//            }
//        }
//
//    }

    public static void Equili(int[] a)
    {

        for(int i=1;i<a.length-1;i++)
        {   int left_sum = 0, right_sum = 0;
            for(int j=0;j<i;j++)
            {
                left_sum +=a[j];
            }
            for(int k=i+1; k<a.length;k++)
            {
                right_sum += a[k];
            }
            if(right_sum == left_sum)
            {
                System.out.println(i);
                break;
            }
        }


    }
    public static void main(String[] args) {
        int[] a = {1,3,5,2,2};
        Equili(a);
    }
}
