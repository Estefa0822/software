/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkgModelo;

import java.util.LinkedList;


/**
 *
 * @author Estefanía Gómez Cárdenas
 */
public class Servicio {
    String nombre;
    int costo;
    int duracion;
    LinkedList<Auto> listaAutos; 
    EstadoServicio estado;

    public Servicio() {
        listaAutos = new LinkedList<>();
        estado=new Abierto();
    }

    /**
     * Contructor
     * @param nombre Nombre del servicio
     * @param costo Costo del servicio en pesos
     * @param duracion Duracion del servicio en segundos
     */
    public Servicio(String nombre, int costo, int duracion) {
        this.nombre = nombre;
        this.costo = costo;
        this.duracion = duracion;
        listaAutos = new LinkedList<>();
    }
    
    public void atender(Auto auto){
        estado.atender(auto);
        
    }
    
    public void Abrir(){
        estado=new Abierto();
    }
    
    public void Suspender(){
        estado=new Suspendido();
    }
    
    public void cerrar(){
        estado=new Cerrado();
    }    

    public String getNombre() {
        return nombre;
    }

    public int getCosto() {
        return costo;
    }

    public int getDuracion() {
        return duracion;
    }
    
    public void adicionarAuto(Auto auto){
        listaAutos.add(auto);
    }
    
    
    
    
}
