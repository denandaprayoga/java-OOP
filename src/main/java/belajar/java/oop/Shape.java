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
class Shape {
    int getCorner(){
        return 0;
    }
}

class Rectangle extends Shape{
    int getCorner(){
        return 4;
    }
    
    int getParentCorner(){
        return super.getCorner();
    }
}
