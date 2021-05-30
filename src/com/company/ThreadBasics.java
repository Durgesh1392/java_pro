package com.company;

public class ThreadBasics extends Thread
{
    public void run(){
        System.out.println("thread is running");
    }

    public static void main(String[] args) {
        ThreadBasics th = new ThreadBasics();
        th.start();
    }
}
