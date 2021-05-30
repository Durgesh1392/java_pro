package com.company;

public class Thread_Interface implements Runnable
{

    public void run(){
        System.out.println("interface implemantation");

    }

    public static void main(String[] args) {
        Thread_Interface ti = new Thread_Interface();
        Thread th = new Thread(ti);
        th.start();

    }
}
