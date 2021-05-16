package com.company;

public class LastIndexOne {
    public static void Last(String s)
    {
        for(int i=s.length()-1;i>=0; i--)
        {
            if(s.charAt(i) == '1')
                System.out.println(i+1);
        }
    }
    public static void main(String[] args) {
        String s = "00001";
        Last(s);

    }
}
