/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar.java.oop.application;

import belajar.java.oop.data.Avanza;
import belajar.java.oop.data.Bus;
import belajar.java.oop.data.Car;

/**
 *
 * @author aden
 */
public class CarApp {
    public static void main(String[] args) {
        Car avanza = new Avanza();
        Car bus = new Bus();
        
        System.out.println(avanza.tier());
        avanza.drive();
        System.out.println("Brand: " + avanza.getBrand());
        System.out.println("Maintenance: " + avanza.isMaintenance());
        
        System.out.println(bus.tier());
        bus.drive();
        System.out.println("Brand: " + bus.getBrand());
        System.out.println("Maintenance: " + bus.isMaintenance());
        System.out.println("Big: " + bus.isBig());
    }
}
