package com.company;

public class Singleton
{
    private static Singleton single_instance = null;
    private String s ;
    private Singleton()
    {
        s = "Hello , i am the part of singleton class";
    }

    public static Singleton getInstance()
    {
        if(single_instance == null)
            single_instance = new Singleton();

        return single_instance;

    }
}
