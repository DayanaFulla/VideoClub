/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.videoclub;

import MostrarDatos.MostrarCinta;
import MostrarDatos.MostrarDevolucion;
import MostrarDatos.MostrarGenero;
import MostrarDatos.MostrarPelicula;
import MostrarDatos.MostrarPrestamo;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author dayan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Genero> genre=new ArrayList<>();
        genre.add(new Genero("Comedia"));
        genre.add(new Genero("Acción"));
        
        ArrayList<Actor> cast=new ArrayList<>();
        cast.add(new Actor("Bob Esponja"));
        cast.add(new Actor("Patricio Estrella"));
        
        Director director=new Director("Kenau Rives");
        
        Pelicula pelicula=new Pelicula("El rescate", "2020", "Gary");
        pelicula.setGenre(genre);
        pelicula.setCast(cast);
        pelicula.setDirector(director);
        MostrarPelicula pe=new MostrarPelicula();
        System.out.println(pe.mostrarPelicula(pelicula));
        
        
        ArrayList<Cinta> cinta=new ArrayList<>();
        cinta.add(new Cinta(1, pelicula, true));
        cinta.add(new Cinta(2, pelicula, true));
        cinta.add(new Cinta(3, pelicula, false));
        MostrarCinta mc=new MostrarCinta();
        System.out.println(mc.mostrarCintasDisponiblesPeliculas(cinta, pelicula, false));
        
        Socio so=new Socio(1, "Dayana Fulla", "direccion", "77636188");
        Socio so1=new Socio(2, "Isa Balderrama", "direccion", "77636188");
        MostrarPrestamo p=new MostrarPrestamo();
        ArrayList<ListaEspera> le=new ArrayList<>();
        ArrayList<Prestamo> pre=new ArrayList<>();
        ArrayList<Devolucion> dev=new ArrayList<>();
        
        System.out.println(p.PrestarPelicula(so, pelicula, cinta, le, pre));
        System.out.println(p.PrestarPelicula(so1, pelicula, cinta, le, pre));
        
        MostrarDevolucion md=new MostrarDevolucion();
        System.out.println(md.Devolver(cinta.get(2), dev, le, pre));
    }
    
}

