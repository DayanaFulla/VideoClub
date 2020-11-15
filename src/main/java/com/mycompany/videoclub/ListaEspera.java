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
public class ListaEspera {
    //private int turno;
    private Pelicula movie;
    private Socio customer;

    public ListaEspera() {
    }

    public ListaEspera(Pelicula movie, Socio customer) {
        this.movie = movie;
        this.customer = customer;
    }

    public Pelicula getMovie() {
        return movie;
    }

    public void setMovie(Pelicula movie) {
        this.movie = movie;
    }

    public Socio getCustomer() {
        return customer;
    }

    public void setCustomer(Socio customer) {
        this.customer = customer;
    }

}
