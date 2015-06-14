/*
 * Área de mecánica general 
 */
package pkgModelo;

import java.awt.Color;
import java.util.LinkedList;
import java.util.Stack;

/**
 * autos: Pila de autos que van a servicios servicios dentro de esta área
 *
 * @author Estefanía Gómez Cárdenas
 */
public class MecanicaGeneral extends Area {

    Stack<Auto> autos;

    public MecanicaGeneral() {
        autos = new Stack<>();
        super.servicios = new Servicio[4];
        super.duracion = 40;
        super.nombre = "Mecánica general";
        addServicios();
    }

    /**
     * Adiciona los servicios correspondientes al área de mecánica general
     */
    private void addServicios() {
        Servicio revisionFrenos = new Servicio("Revisión de frenos", 200000, 10);
        Servicio cambioAceite = new Servicio("Cambio de aceite", 40000, 10);
        Servicio alineacion = new Servicio("Alineación", 50000, 10);
        Servicio balanceo = new Servicio("Balanceo", 35000, 10);

        servicios[0] = revisionFrenos;
        servicios[1] = cambioAceite;
        servicios[2] = alineacion;
        servicios[3] = balanceo;
    }

    /**
     * Adiciona un auto a la pila de espera
     *
     * @param auto Vehículo que ingresa a la pila de espera
     */
    public void adicionarAutos(Auto auto) {
        System.out.println("Se adicionó un auto al área de Mecánica general");
        autos.push(auto);

    }

    public void adicionarAutos(String placa, String modelo, Color color, LinkedList servicio) {
        Auto auto = new Auto(placa, modelo, color, servicio);
        autos.push(auto);
    }

    //Agregacion de excepcion****************************** MARCELA Y ESTEFANIA***************************
    public Auto atender() {
        if (!autos.isEmpty()) {
            System.out.println("________________Cantidad de autos a atender "+autos.size());
            Auto a = autos.pop();
            System.out.println("Saqué el carro "+a.getPlaca());
            return a;
        }
        return null;
    }
}


