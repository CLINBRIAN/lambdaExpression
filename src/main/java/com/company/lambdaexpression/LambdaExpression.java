/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.company.lambdaexpression;

/**
 *
 * @author kamau
 */
@FunctionalInterface    //can have only one abstract method
interface A {

    void show();
    String toString();   //but toString method is an Object class

}

//class B extends Object implements A {
//
//    public void show() {
//
//        System.out.println("hey");
//    }
 // }

public class LambdaExpression {

    public static void main(String[] args) {
//        A obj = new A() {
//
//            public void show() {
//
//                System.out.println("hey");
//            }
//        };

    //lambda expression comes in here
    A obj = () ->System.out.println("hey");
        obj.show();
    }
}
