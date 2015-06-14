/*
 * Área de pintura 
 */

package pkgModelo;

import java.util.LinkedList;
import javax.accessibility.AccessibleState;
import pkgControlador.Auto;


/**
 * autos: Lista de autos que van a recibir servicios dentro de esta area
 * @author Estefanía Gómez Cárdenas
 */
public class Pintura extends Area{
    LinkedList<Auto> autos; //La lista se va a comportar como una cola
    
    
    public Pintura() {
        autos = new LinkedList<>();
        Servicio pintura = new Servicio("pintura", 2000000, 60);
        Servicio servicioPintura[] = new Servicio[1];
        servicioPintura[0] = pintura;
        super.crearServicios(servicioPintura);
        
        
    }
    /**
     * Este método se encarga de añadir un auto a la lista de autos 
     * @param auto se adiciona a la lista de autos
     */
    public void adicionarAutos(Auto auto){
        //Adiciono el auto a la lista de autos
        autos.add(auto);
        super.servicios[0].adicionarAuto(auto);
//        Adiciono el auto a la estructura de datos de servicio 
//        for (int i = 0; i < serviciosAuto.length; i++) {            
//            super.servicios[super.obtenerServicio(serviciosAuto[i].getNombre())].adicionarAuto(auto);
//        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
