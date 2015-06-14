/*
 * Clase encarga del área de mecánica especializada
 */

package pkgModelo;

import java.awt.Color;
import java.util.LinkedList;

/**
 *
 * @author Estefanía Gómez Cárdenas
 */
public class MecanicaEspecializada extends Area{
    private LinkedList<Auto> autos; //La lista se va a comportar como una cola

    public MecanicaEspecializada() {
        this.autos = new LinkedList<>();
        super.servicios = new Servicio[2];
        super.duracion = 30;
        super.nombre="Mecánica especializada";        
        addServicios();
    }
    
    /**
     * Se encarga de adicionar un servicio al área
     */
    
    private void addServicios(){
        Servicio reparacionMotor = new Servicio("Reparación de motor", 1500000, 15);
        servicios[0] = reparacionMotor;
        Servicio revision = new Servicio("Revisión y reparación del sistema eléctrico", 350000, 15);
        servicios[1] = revision;
    }
    
    /**
     * Se encarga de adicionar un auto a la "cola" de autos que están esperando
     * ser atendidos
     * @param auto Auto que va a ingresar a la cola de espera
     */
    public void adicionarAutos(Auto auto){
       // System.out.println("Se adicionó un auto al área de Mecánica especializada");
        autos.add(auto);
    }
    
    /**
     * Información del auto que ingresa a la cola de espera
     * @param placa Placa del auto
     * @param modelo Placa del auto
     * @param color Color del auto
     */    
    public void adicionarAutos(String placa, String modelo, Color color, LinkedList servicios){
        Auto auto = new Auto(placa, modelo, color, servicios);
        autos.add(auto);
    
    }
    
    /**
     * Se encarga de obtener los autos que están dentro del área
     * @return 
     */
    
    public LinkedList<Auto> obtenerAutos(){
        return autos;
    }
    
    public Auto atender(){
        Auto a = autos.getFirst();
        autos.removeFirst();
        return a;
    }
    
}
