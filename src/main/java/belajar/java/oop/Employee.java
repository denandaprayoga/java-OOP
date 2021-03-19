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
class Employee {
    String name, address;
    
    Employee(String name, String address){
        this.name = name;
        this.address = address;
    }
    
    Employee(String name){
        this(name, null);
    }
    
    void sayHello(String name){
        System.out.println("Hello " + name + ", my name is " + this.name);
    }
    void sayHello(Employee employee){
        System.out.println("Hello, " + employee.name);
    }
}
