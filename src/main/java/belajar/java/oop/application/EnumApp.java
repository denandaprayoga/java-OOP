/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar.java.oop.application;

import belajar.java.oop.data.Customer;
import belajar.java.oop.data.Level;

/**
 *
 * @author aden
 */
public class EnumApp {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setName("Denanda prayoga");
        customer.setLevel(Level.VIP);
        
        System.out.println("Name: " + customer.getName());
        System.out.println("Level: " + customer.getLevel());
        System.out.println("Description: " + customer.getLevel().getDescription());
        
        //mengubah enum menjadi string
        String levelName = Level.PREMIUM.name();
        System.out.println("Level Name: " + levelName);
        System.out.println(levelName.getClass().getName());
        
        //mengubah string menjadi enum
        Level level = Level.valueOf("STANDARD");
        System.out.println("Level Name: " + level);
        System.out.println(level.getClass().getName());
        
        System.out.println("Print Level");
        for(Level value:Level.values()){
            System.out.println(value);
        }
    }
}
