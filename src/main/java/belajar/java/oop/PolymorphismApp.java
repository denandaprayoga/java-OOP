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
        
        sayHello(new Employee("Budi"));
        sayHello(new Manager("Joko"));
        sayHello(new VicePresident("Riski"));
    }
    
    static void sayHello(Employee employee){
        if(employee instanceof VicePresident){
            VicePresident vp = (VicePresident) employee;
            System.out.println("Hello VP " + vp.name);
        }else if(employee instanceof Manager){
            Manager manager = (Manager) employee;
            System.out.println("Hello Manager " + manager.name);
        }else{
            System.out.println("Hello " + employee.name);
        }
    }
}
