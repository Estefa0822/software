/*
 * Área de pintura 
 */
package pkgModelo;

import java.awt.Color;
import java.util.LinkedList;

/**
 * autos: Lista de autos que van a recibir servicios dentro de esta area
 *
 * @author Estefanía Gómez Cárdenas
 */
public class Pintura extends Area {

    private LinkedList<Auto> autos; //La lista se va a comportar como una cola

    public Pintura() {
        this.autos = new LinkedList<>();
        super.servicios = new Servicio[1];
        super.duracion = 60;
        super.nombre = "Pintura";
        addServicios();
    }

    /**
     * Este método se encarga de adicionar los servicios al área
     */
    private void addServicios() {
        Servicio pintura = new Servicio("pintura", 2000000, 60);
        servicios[0] = pintura;
    }

    /**
     * Se encarga de adicionar un auto a la "cola" de autos que están esperando
     * ser atendidos
     *
     * @param auto Auto que va a ingresar a la cola de espera
     */
    public void adicionarAutos(Auto auto) {
        //System.out.println("Se adicionó un auto al área de pintura");
        autos.add(auto);
    }

    /**
     * Información del auto que ingresa a la cola de espera
     *
     * @param placa Placa del auto
     * @param modelo Placa del auto
     * @param color Color del auto
     */
    public void adicionarAutos(String placa, String modelo, Color color, LinkedList servicio) {
        Auto auto = new Auto(placa, modelo, color, servicio);
        autos.add(auto);

    }

    public LinkedList<Auto> obtenerAutos() {
        return autos;
    }

    //****************************************************************** MARCELA CALDERON *************************************+// 
    public Auto atender() {
        if (autos.size() != 0) {
            System.out.println("Primero: "+ autos.getFirst().getPlaca());
            Auto a = autos.getFirst();
            autos.removeFirst();
            return a;
        } else {
            return null;
        }

    }
}
