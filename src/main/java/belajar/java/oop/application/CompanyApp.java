/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar.java.oop.application;

import belajar.java.oop.data.Company;

/**
 *
 * @author aden
 */
public class CompanyApp {
    public static void main(String[] args) {
        Company company = new Company();
        company.setName("Denanda prayoga");
        
        Company.Employee employee = company.new Employee();
        employee.setName("Aden");
        
        System.out.println("Nama perusahaan: " + employee.getNameCompany());
        System.out.println("Nama Karyawan: " + employee.getName());
        
        System.out.println(Runtime.getRuntime().availableProcessors());
    }
}
