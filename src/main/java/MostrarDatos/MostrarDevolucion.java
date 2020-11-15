/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MostrarDatos;

import com.mycompany.videoclub.Cinta;
import com.mycompany.videoclub.Devolucion;
import com.mycompany.videoclub.ListaEspera;
import com.mycompany.videoclub.Pelicula;
import com.mycompany.videoclub.Prestamo;
import com.mycompany.videoclub.Socio;
import java.util.ArrayList;

/**
 *
 * @author dayan
 */
public class MostrarDevolucion {
    public String Devolver(Cinta cinta, ArrayList<Devolucion> dev, ArrayList<ListaEspera> le, ArrayList<Prestamo> pre){
        String dato="";
        MostrarPrestamo mp=new MostrarPrestamo();
        Prestamo prestamo=mp.obtenerPrestamo(pre, cinta);
        if(prestamo!=null){
            dev.add(new Devolucion(prestamo.getCustomer(), "09-11-20", prestamo.getCinta()));
            cinta.setEstado(false);
            dato=dato+"Se registró la devolución correctamente \n";
            Socio socio=HayEspera(le, prestamo.getCinta().getMovie());
            if(socio!=null){
                dato=dato+"Nombre: "+socio.getName()+"\n";
                dato=dato+"Telefono: "+socio.getPhone();
            }else{
                dato=dato+"No hay lista de espera";
            }
        }
        return dato;
    }
    public Socio HayEspera( ArrayList<ListaEspera> le, Pelicula pe){
        for (int i = 0; i < le.size(); i++) {
            if(le.get(i).getMovie()==pe){
                return le.get(i).getCustomer();
            }
        }
        return null;
    }
}
