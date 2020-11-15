/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.videoclub;

/**
 *
 * @author dayan
 */
public class Prestamo {
    private Socio customer;
    private String date;
    private Cinta cinta;

    public Prestamo() {
    }

    public Prestamo(Socio customer, String date, Cinta cinta) {
        this.customer = customer;
        this.date = date;
        this.cinta = cinta;
    }

    public Socio getCustomer() {
        return customer;
    }

    public void setCustomer(Socio customer) {
        this.customer = customer;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Cinta getCinta() {
        return cinta;
    }

    public void setCinta(Cinta cinta) {
        this.cinta = cinta;
    }
    
    
}
