/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar.java.oop;

class Person {
    String name;
    String address;
    String gender;
    Byte age;
    final String country = "Indonesia";
    
    Person(String paramName, String paramAddress){
        name = paramName;
        address = paramAddress;
    }
    
    Person(String paramName){
        this(paramName, null);
    }
    
    Person(){}
    void sayHello(String paramName){
        System.out.println("Hello " + paramName + " my name is " + name);
    }
}
