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
class VicePresident extends Manager{
    VicePresident(String name){
        super(name);
    }
    void sayHello(String name){
        System.out.println("Hello " + name + " My name is VP " + this.name);
    }
}
