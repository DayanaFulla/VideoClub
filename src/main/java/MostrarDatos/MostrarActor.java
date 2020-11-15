/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MostrarDatos;

import com.mycompany.videoclub.Actor;
import java.util.ArrayList;

/**
 *
 * @author dayan
 */
public class MostrarActor {
    public String mostrarCast(ArrayList<Actor> cast){
        String dato="Reparto: ";
        for (int i = 0; i < cast.size(); i++) {
            dato=dato+cast.get(i).getName()+", ";
        }
        return dato;
    }
}
