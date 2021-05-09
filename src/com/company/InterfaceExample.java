package com.company;
interface printable {
    void print();
}
public class InterfaceExample implements printable {
    public void print(){
        System.out.println("this is implementation of print method of printable interface");
    }

    public static void main(String[] args) {
        InterfaceExample s1 = new InterfaceExample();
        s1.print();

    }
}
