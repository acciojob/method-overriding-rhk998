package com.driver;

public class Main {
    public static void main(String[] args) {
        B objB = new B();
        System.out.println(objB.meth());
        System.out.println(objB.meth());

    }
}
class B extends A {
    String meth(){
        return "Method is overridden in Extended class B";
    }
}
class A {
    String meth(){
        return "Invoking method from class A";
    }
}