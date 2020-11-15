/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MostrarDatos;

import com.mycompany.videoclub.Cinta;
import com.mycompany.videoclub.ListaEspera;
import com.mycompany.videoclub.Pelicula;
import com.mycompany.videoclub.Prestamo;
import com.mycompany.videoclub.Socio;
import java.util.ArrayList;

/**
 *
 * @author dayan
 */
public class MostrarPrestamo {
    public String mostrarPrestamo(Prestamo prestamo){
        String dato="Prestamo \n";
        dato=dato+"Fecha: "+prestamo.getDate()+", \n";
        dato=dato+"Socio: "+prestamo.getCustomer().getName()+", \n";
        dato=dato+"Pelicula: "+prestamo.getCinta().getMovie().getTitle()+", \n";
        dato=dato+"Cinta: "+prestamo.getCinta().getNumero()+", \n";
        return dato;
    }
    
    public String PrestarPelicula(Socio socio,Pelicula movie, ArrayList<Cinta> cinta, ArrayList<ListaEspera> listaespera, ArrayList<Prestamo> pre){
        String dato="";
        MostrarCinta mc=new MostrarCinta();
        Cinta vhs=mc.retornarCintasDisponiblesPeliculas(cinta, movie, false);
        if(vhs!=null){
            Prestamo p=new Prestamo(socio, "08-11-20", vhs);
            pre.add(p);
            vhs.setEstado(true);
            dato="El prestamo se registró exitosamente\n"+mostrarPrestamo(p);
        }else{
            listaespera.add(new ListaEspera(movie, socio));
            dato="No hay cintas disponibles, se añadió al socio: "+socio.getName()+" a la lista de espera";
        }
        return dato;
    }
    public Prestamo obtenerPrestamo(ArrayList<Prestamo> pre, Cinta cinta){
        for (int i = 0; i < pre.size(); i++) {
            if(pre.get(i).getCinta()==cinta){
                return pre.get(i);
            }
        }
        return null;
    }
}
