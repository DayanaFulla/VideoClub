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
public class Socio {
    private int code;
    private String name;
    private String address;
    private String phone;
    private ArrayList<Director> director;
    private ArrayList<Actor> actors;
    private ArrayList<Genero> genre;

    public Socio() {
    }

    public Socio(int code, String name, String address, String phone) {
        this.code = code;
        this.name = name;
        this.address = address;
        this.phone = phone;
    }
    
    public Socio(int code, String name, String address, String phone, ArrayList<Director> director, ArrayList<Actor> actors, ArrayList<Genero> genre) {
        this.code = code;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.director = director;
        this.actors = actors;
        this.genre = genre;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public ArrayList<Director> getDirector() {
        return director;
    }

    public void setDirector(ArrayList<Director> director) {
        this.director = director;
    }

    public ArrayList<Actor> getActors() {
        return actors;
    }

    public void setActors(ArrayList<Actor> actors) {
        this.actors = actors;
    }

    public ArrayList<Genero> getGenre() {
        return genre;
    }

    public void setGenre(ArrayList<Genero> genre) {
        this.genre = genre;
    }
    
    
    
}
