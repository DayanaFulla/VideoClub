/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import com.mycompany.videoclub.Actor;
import com.mycompany.videoclub.Director;
import com.mycompany.videoclub.Genero;
import com.mycompany.videoclub.Pelicula;
import com.mycompany.videoclub.Socio;
import java.util.ArrayList;

/**
 *
 * @author dayan
 */
public class CargaDatos {
    public void CargaGeneros(){
        ArrayList<Genero> genre=new ArrayList<>();
        genre.add(new Genero("Comedia"));
        genre.add(new Genero("Acción"));
        genre.add(new Genero("Estrenos"));
        genre.add(new Genero("Clásicos"));
        genre.add(new Genero("Aventuras"));
        genre.add(new Genero("Drama"));
        genre.add(new Genero("Terror"));
        genre.add(new Genero("Musical"));
        genre.add(new Genero("Ciencia Ficción"));
        genre.add(new Genero("Guerra"));
        genre.add(new Genero("Crimen"));
        genre.add(new Genero("Infantiles"));
    }
    public void CargaActores(){
        ArrayList<Actor> cast=new ArrayList<>();
        cast.add(new Actor("Bob Esponja"));
        cast.add(new Actor("Patricio Estrella"));
        cast.add(new Actor("Kenau Rives"));
        cast.add(new Actor("Emma Watson"));
        cast.add(new Actor("Daniel Radcliffe"));
    }
    public void CargaDirectores(){
        ArrayList<Director> dic=new ArrayList<>();
        dic.add(new Director("El Pirata"));
        dic.add(new Director("Disney"));
    }
    public void CargaClientes(){
        ArrayList<Socio> socio=new ArrayList<>();
        socio.add(new Socio(0, "Dayana Fulla", "direccion1", "77636188"));
        socio.add(new Socio(1, "Isabel Balderrama", "direccion2", "77636188"));
        socio.add(new Socio(2, "Alicia Sapiain", "direccion3", "77636188"));
        socio.add(new Socio(3, "Lizeth Quispe", "direccion4", "77636188"));
    }
    
    public void CargaPeliculas(){
        ArrayList<Pelicula> pelicula=new ArrayList<>();
        pelicula.add(new Pelicula("El rescate", "2020", "Gary"));
        pelicula.add(new Pelicula("El rescate", "2020", "Gary"));
        pelicula.add(new Pelicula("El rescate", "2020", "Gary"));
    }
    
    public void CargarPeliculas_Gen_Cast_Dic(){
        
    }
}
