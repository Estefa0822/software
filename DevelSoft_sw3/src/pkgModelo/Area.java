/*
 * Esta área contiene las diferentes áreas con las que cuenta e taller de 
 *mecánica
 */

package pkgModelo;

import java.util.LinkedList;
import pkgControlador.Auto;

/**
 * Nombre: Nombre del área
 * descripcion: descripción de area
 * duración: Duración del servicio del área
 * servicios: Lista de servicios con los que cuenta el área
 * @author Estefanía Gómez Cárdenas
 */

public class Area {
   String nombre;
   String descripcion;
   int duracion;
   Servicio[] servicios;

    public Area() {
    }

    public Area(String nombre, String descripcion, int duracion, Servicio []servicios) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.duracion = duracion;
        this.servicios = servicios;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getCosto(){
        return 0;
    }
    
    public int getDuracion() {
        return duracion;
    }
    
    public LinkedList getAutos(){
        return null;
    }
    /**
     * Crea los servicios para cada área
     * @param servicio 
     */
    public void crearServicios(Servicio[]servicio){
        this.servicios = servicio.clone();        
    }
    
    /**
     * Este método se encarga de buscar un servicio dentro de la lista de servicios
     * @param servicio Nombre del servicio a buscar
     * @return indice del servicio que estaba buscando
     */
    public int obtenerServicio(String servicio){
        int i=0;
        boolean encontrado = false;
        int indiceServicio=-1;
        
        while (encontrado || i < servicio.length()) {
            if(servicios[i].getNombre().equals(servicio)){
                encontrado= true;
                indiceServicio = i;
            }
            i++;
        }
        return indiceServicio;        
    }
    
}
