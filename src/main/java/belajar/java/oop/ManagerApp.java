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
public class ManagerApp {
    public static void main(String[] args) {
        Manager manager = new Manager("Denanda prayoga");
        manager.sayHello("aden");
        
        VicePresident vc = new VicePresident("Aden");
        vc.sayHello("Denanda");
    }
}
