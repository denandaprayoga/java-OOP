/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar.java.oop.data;

/**
 *
 * @author zero
 */
public class ProductApp{
    public static void main(String[] args) {
        Product product = new Product("Macbook pro", 30_000_000);
        System.out.println(product.name);
        System.out.println(product.price);
    }
}