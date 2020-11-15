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
public class Pelicula {
    private String title;
    private String year;
    private String description;
    private Director director;
    private ArrayList<Genero> genre;
    private ArrayList<Actor> cast;

    public Pelicula() {
    }

    public Pelicula(String title, String year, String description) {
        this.title = title;
        this.year = year;
        this.description = description;
    }

    public Pelicula(String title, String year, String description, Director director, ArrayList<Genero> genre, ArrayList<Actor> cast) {
        this.title = title;
        this.year = year;
        this.description = description;
        this.director = director;
        this.genre = genre;
        this.cast = cast;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public ArrayList<Genero> getGenre() {
        return genre;
    }

    public void setGenre(ArrayList<Genero> genre) {
        this.genre = genre;
    }

    public ArrayList<Actor> getCast() {
        return cast;
    }

    public void setCast(ArrayList<Actor> cast) {
        this.cast = cast;
    }

    
    
}
