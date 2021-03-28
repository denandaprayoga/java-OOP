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
public enum Level {
    //opsi nilai
    STANDARD("Standard Level"),
    PREMIUM("Premium Level"),
    VIP("VIP Level");
    
    private String description;
    
    //constuctor
    Level(String description){
        this.description = description;
    }
    
    public String getDescription(){
        return description;
    }
}
