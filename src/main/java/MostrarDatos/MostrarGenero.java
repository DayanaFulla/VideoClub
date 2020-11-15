/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MostrarDatos;

import com.mycompany.videoclub.Genero;
import java.util.ArrayList;

/**
 *
 * @author dayan
 */
public class MostrarGenero {
    
    public String mostrarGeneros(ArrayList<Genero> genre){
        String dato="Generos: ";
        for (int i = 0; i < genre.size(); i++) {
            dato=dato+genre.get(i).getTitle()+", ";
        }
        return dato;
    }
    
    public String mostrarGeneroPelicula(){
        return "";
    }
    
}
