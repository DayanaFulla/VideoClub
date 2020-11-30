/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import com.mycompany.videoclub.Actor;
import com.mycompany.videoclub.Genero;
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
    }
    public void CargaClientes(){
        
    }
}
