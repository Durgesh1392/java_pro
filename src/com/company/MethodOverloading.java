package com.company;
class Addition {
    public static int add(int a, int b)
    {
        return a+b ;
    }
    public static int add(int a, int b , int c)
    {
        return a+b+c;
    }
    public static double add(double a, double b)
    {
        return a+b;
    }
}
public class MethodOverloading {
    public static void main(String[] args) {

        System.out.println(Addition.add(8,9));
        System.out.println(Addition.add(4,7,9));
        System.out.println(Addition.add(3.3,4.5));
    }

}
