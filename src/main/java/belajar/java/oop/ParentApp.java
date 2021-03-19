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
public class ParentApp {
    public static void main(String[] args) {
        Child child = new Child();
        child.name = "Aden";
        System.out.println(child.name);
        child.doIt();
        
        Parent parent = child;
        parent.doIt(); //Accessing from method override
        
    }
}
