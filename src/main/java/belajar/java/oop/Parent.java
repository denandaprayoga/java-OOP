/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar.java.oop;

/**
 *
 * @author zero
 */
class Parent {
    String name;
    
    void doIt(){
        System.out.println("Do it in parent");
    }
}

class Child extends Parent{
    String name; //variable hiding
    
    void doIt(){
        System.out.println("Do it in child");
    }
}
