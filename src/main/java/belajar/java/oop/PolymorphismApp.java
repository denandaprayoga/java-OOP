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
public class PolymorphismApp {
    public static void main(String[] args) {
        Employee employee = new Employee("Aden");
        employee.sayHello("Aden");
        
        employee = new Manager("Denanda");
        employee.sayHello("Denanda");
        
        employee.sayHello(new Employee("Budi"));
        employee.sayHello(new Manager("Joko"));
        employee.sayHello(new VicePresident("Riski"));
    }
    
}
