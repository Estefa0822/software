/*
 * Esta área contiene las diferentes áreas con las que cuenta e taller de 
 *mecánica
 */
package pkgModelo;

import java.util.LinkedList;

/**
 * Nombre: Nombre del área descripcion: descripción de area duración: Duración
 * del servicio del área servicios: Lista de servicios con los que cuenta el
 * área
 *
 * @author Estefanía Gómez Cárdenas
 */
public class Area {

    protected String nombre;
    protected int duracion;
    protected Servicio[] servicios;

    public Area() {

    }

    public Area(String nombre, int duracion, Servicio[] servicios) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.servicios = servicios;
    }

    public String getNombre() {
        return nombre;
    }

    private int getCostoServicio(String nombreServicio) {
        System.out.println("Servicio: " + nombreServicio);
        int costo = 0;
        for (int i = 0; i < servicios.length; i++) {
            if (servicios[i].getNombre().equals(nombreServicio)) {
                costo = servicios[i].getCosto();

            }
        }
        System.out.println("Costo servicio: " + costo);
        return costo;
    }

    public int getCostoServicios(LinkedList<String> servicio) {
        int costoTotal = 0;
        for (int i = 0; i < servicio.size(); i++) {
            costoTotal += getCostoServicio(servicio.get(i));
        }
        return costoTotal;
    }

    public int getDuracion() {
        //Recorrer todas los servicios dentro de esa área
        return duracion;
    }

    public LinkedList getAutos() {
        return null;
    }

    public Servicio[] getServicios() {
        return servicios;
    }

    /**
     * Obtiene el tiempo de un servicio 
     * @param nombreServicio Nombre del servicio al cual se le va a obtener el tiempo
     */
    public void tiempo(String nombreServicio) {
        int tiempo = -1;
        int i = 0;
        while (i < servicios.length && tiempo ==-1) {
            if (nombreServicio.equals(servicios[i].getNombre())) {
                tiempo = servicios[i].getDuracion();
            }
            i++;
        }
        

    }

}
