/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.videoclub;

import java.util.ArrayList;

/**
 *
 * @author dayan
 */
public class Cinta {
    private int numero;
    private Pelicula movie;
    private boolean estado;
    private String descripcion;

    public Cinta() {
    }

    public Cinta(int codigo, Pelicula movie, boolean estado) {
        this.numero = codigo;
        this.movie = movie;
        this.estado = estado;
    }
    
    public Cinta(int codigo, Pelicula movie, boolean estado, String descripcion) {
        this.numero = codigo;
        this.movie = movie;
        this.estado = estado;
        this.descripcion = descripcion;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Pelicula getMovie() {
        return movie;
    }

    public void setMovie(Pelicula movie) {
        this.movie = movie;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
}
