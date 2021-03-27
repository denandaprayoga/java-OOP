/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar.java.oop.data;

/**
 *
 * @author aden
 */
public class Bus implements Car {
    public void drive() {

    }
    public int tier() {
        return 8;
    }
    public boolean isBig() {
        return true;
    }
    public String getBrand() {
        return "hyundai";
    }

    public boolean isMaintenance() {
        return false;
    }
}
