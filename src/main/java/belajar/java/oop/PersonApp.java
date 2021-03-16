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
public class PersonApp {
    public static void main(String[] args) {
        var person = new Person("Denanda prayoga", "Citayam");
        person.gender = "Laki-laki";
        person.age = 22;
        // person.country = "Japan"; //ERROR, karena final
        
        System.out.println(person.name);
        System.out.println(person.address);
        System.out.println(person.gender);
        System.out.println(person.age);
        System.out.println(person.country);
        person.sayHello("joko");
              
        
        Person person1 = new Person("Ray");
        person1.sayHello("aden");
    }
}
