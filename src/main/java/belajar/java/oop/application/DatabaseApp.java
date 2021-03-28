/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar.java.oop.application;

import belajar.java.oop.error.DatabaseError;

/**
 *
 * @author aden
 */
public class DatabaseApp {
    public static void main(String[] args) {
        connectDatabase(null, null);
    }
    
    public static void connectDatabase(String username, String password){
        if(username == null || password == null){
            throw new DatabaseError("Tidak bisa konek ke database");
        }
    }
}
