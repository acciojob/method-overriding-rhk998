package com.driver;

public class Main {

    static class B extends A {
       public String meth(){
            return "Method is overridden in Extended class B";
        }
    }
    static class A {
      public  String meth(){
            return "Invoking method from class A";
        }
    }
    public static void main(String[] args) {
        B objB = new B();
        System.out.println(objB.meth());
        System.out.println(objB.meth());

    }
}
