/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MostrarDatos;

import com.mycompany.videoclub.Cinta;
import com.mycompany.videoclub.Pelicula;
import java.util.ArrayList;

/**
 *
 * @author dayan
 */
public class MostrarCinta {
    public ArrayList<Cinta> buscarCinta(ArrayList<Cinta> cinta, Pelicula movie){
        ArrayList<Cinta> cintaPelicula=new ArrayList<>();
        for (int i = 0; i < cinta.size(); i++) {
            if(cinta.get(i).getMovie()==movie){
                cintaPelicula.add(cinta.get(i));
            }
        }
        return cintaPelicula;
    }
    public ArrayList<Cinta> buscarCinta(ArrayList<Cinta> cinta, Pelicula movie, boolean estado){
        ArrayList<Cinta> cintaPelicula=new ArrayList<>();
        for (int i = 0; i < cinta.size(); i++) {
            if(cinta.get(i).getMovie()==movie && cinta.get(i).isEstado()== estado){
                cintaPelicula.add(cinta.get(i));
            }
        }
        return cintaPelicula;
    }
    
    public String mostrarCintasDisponiblesPeliculas(ArrayList<Cinta> cinta, Pelicula movie, boolean estado){
        String dato="Cintas Disponibles: ";
        ArrayList<Cinta> cp=buscarCinta(cinta, movie, estado);
        for (int i = 0; i < cp.size(); i++) {
            dato=dato+cp.get(i).getNumero()+", ";
        }
        if(cp.size()<1){
            dato=dato+"0";
        }
        return dato;
    }
    
    public Cinta retornarCintasDisponiblesPeliculas(ArrayList<Cinta> cinta, Pelicula movie, boolean estado){
        ArrayList<Cinta> cp=buscarCinta(cinta, movie, estado);
        if(cp.size()>0){
            return cp.get(0);
        }
        return null;
    }
    
    
    public String mostrarCintasPeliculas(ArrayList<Cinta> cinta, Pelicula movie){
        String dato="Cintas: ";
        ArrayList<Cinta> cp=buscarCinta(cinta, movie);
        for (int i = 0; i < cp.size(); i++) {
            dato=dato+cp.get(i).getNumero()+" - "+cp.get(i).isEstado()+", ";
        }
        return dato;
    }
    
}
