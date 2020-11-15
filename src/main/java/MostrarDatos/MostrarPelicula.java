/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MostrarDatos;


import com.mycompany.videoclub.Director;
import com.mycompany.videoclub.Pelicula;
import java.util.ArrayList;

/**
 *
 * @author dayan
 */
public class MostrarPelicula {
    public String mostrarPelicula(Pelicula movie){
        String dato=" ***Pelicula*** \n";
        dato=dato+"Titulo: "+movie.getTitle()+"\n";
        dato=dato+"Año: "+movie.getYear()+"\n";
        dato=dato+"Descripción: "+movie.getDescription()+"\n";
        
        MostrarDirector director=new MostrarDirector();
        dato=dato+director.mostrarDirector(movie.getDirector())+"\n";
        
        MostrarGenero genre=new MostrarGenero();
        dato=dato+genre.mostrarGeneros(movie.getGenre())+"\n";
        
        MostrarActor cast=new MostrarActor();
        dato=dato+cast.mostrarCast(movie.getCast())+"\n";
        return dato;
    }
}
