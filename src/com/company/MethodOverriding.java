package com.company;
//If subclass (child class) has the same method as declared in the parent class,
// it is known as method overriding in Java.
class Parent {
    public static  void display(){
        System.out.println("this is parent class function");
    }
}
class Child extends Parent {
    public static void display(){
        System.out.println("this is child class function");
    }

}
public class MethodOverriding {
    public static void main(String[] args) {
        Child a = new Child();
        a.display();
    }
}
