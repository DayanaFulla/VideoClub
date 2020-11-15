/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MostrarDatos;

import com.mycompany.videoclub.Director;
import java.util.ArrayList;

/**
 *
 * @author dayan
 */
public class MostrarDirector {
    public String mostrarDirectores(ArrayList<Director> director){
        String dato="Directores: ";
        for (int i = 0; i < director.size(); i++) {
            dato=dato+director.get(i).getName()+", ";
        }
        return dato;
    }
    
    public String mostrarDirector(Director director){
        String dato="Director: "+director.getName();
        return dato;
    }
}
