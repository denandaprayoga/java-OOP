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
public interface Car extends HasBrand, IsMaintenance{
    void drive();
    int tier();
    default boolean isBig(){
        return false;
    }
}
