/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgControlador;

import java.util.LinkedList;
import java.util.Stack;
import pkgModelo.Area;
import pkgModelo.Servicio;
import pkgVista.FrmMenu;

/**
 *
 * @author Marcela
 */
public class Control {

    FrmMenu menu;
    Auto auto;
    LinkedList<Auto> ColaPintura;
    LinkedList<Auto> ColaEspecializada;
    LinkedList<Auto> ColaCaja;
    Stack<Auto> pila;
    Stack<Auto> frenos;

    /**
     * Constructor rea las estructuras de datos
     */
    public Control() {
        pila = new Stack<>();
        ColaPintura = new LinkedList<>();
        ColaEspecializada = new LinkedList<>();
        ColaCaja = new LinkedList<>();

    }

    public Control(FrmMenu menu, Auto auto, LinkedList ColaPintura, LinkedList ColaEspecializada, LinkedList ColaCaja, Stack<Auto> pila, Stack<Auto> frenos) {
        this.menu = menu;
        this.auto = auto;
        this.ColaPintura = ColaPintura;
        this.ColaEspecializada = ColaEspecializada;
        this.ColaCaja = ColaCaja;
        this.pila = pila;
        this.frenos = frenos;
    }

    /**
     *
     * @param placa es la placa ingresda desde el formulario FrmMenu
     * @param modelo es el modelo ingresda desde el formulario FrmMenu
     * @param color es el color ingresda desde el formulario FrmMenu
     * @param servicios es el servicio ingresda desde el formulario FrmMenu
     * @param area es el area ingresda desde el formulario FrmMenu
     */
    public void recepcionAutos(String placa, String modelo, String color, LinkedList<String> servicios, int area) {
        auto = new Auto(placa, modelo, color);

        //if (Noregistrado(pila, ColaEspecializada, ColaPintura, placa)) {
        if (area == 1) {
            pila.add(auto);
        } else if (area == 2) {
            if (ColaPintura.getFirst() == null) {
                ColaPintura.addFirst(auto);
            } else {
                ColaPintura.addLast(auto);
            }
            System.out.println("Cola pintura");
        } else if (area == 3) {
            if (ColaEspecializada.getFirst() == null) {
                ColaEspecializada.addFirst(auto);
            } else {
                ColaEspecializada.addLast(auto);
            }
        }
        //}

    }

    /**
     *
     * @param area Parametro que llega desde l FrmMenu para saber que area
     * atender
     * @return una estrucutura de datos para saber que autos se van a atender
     */
    public Object atender(String area) {

        if (area.equals("MECANICA GENERAL")) {
            return pila;

        }
        if (area.equals("PINTURA")) {
            return ColaPintura;
        }
        if (area.equals("MECACICA ESPECIALIZADA")) {
            return ColaEspecializada;
        }
        return null;
    }

    /**
     *
     * @param pila la estructura que almacena autos que van a mecanica general,
     * la recibe del metodo recepcionAutos
     * @param ColaEspecializada la estructura que almacena autos que van a
     * mecanica especializada, la recibe del metodo recepcionAutos
     * @param ColaPintura la estructura que almacena autos que van a pintura, la
     * recibe del metodo recepcionAutos
     * @param placa
     * @return si esta regustrado retorna un false para avisar de que el ya debe
     * estar registrado, si retorna un true es porque no esta aun registrado
     */
    private boolean Noregistrado(Stack<Auto> pila, LinkedList colaEspecializada, LinkedList colaPintura, String placa) {
        while (!pila.empty()) {
            if (placa.equals(pila.pop().getPlaca())) {
                return false;
            }
        }

        while (colaEspecializada != null) {
            if (placa.equals("")) {
                return false;
            }
            colaEspecializada.removeFirst();

        }

        while (colaPintura != null) {
            colaPintura.removeFirst();
            return false;
        }
        return true;
    }
    
    
    public void ensayo(){
        LinkedList<Area> areas= new LinkedList<>();
        //Adiciona los servicios de cada area
        Servicio pintura = new Servicio("pintura", 2000000, 60);
        Servicio servicioPintura[] = new Servicio[1];
        servicioPintura[0] = pintura;
        areas.add(new Area("Pintura", "pinta los carros", 60,servicioPintura));
        
        Servicio serviciosMecanicaGeneral[]= new Servicio[4];
        serviciosMecanicaGeneral[0]= new Servicio("Revisión de frenos", 200000, 40);
        serviciosMecanicaGeneral[1]= new Servicio("Cambio de aceite", 40000, 10);
        serviciosMecanicaGeneral[1]= new Servicio("Alineación", 50000, 10);
        serviciosMecanicaGeneral[1]= new Servicio("Balanceo", 35000, 10);
        areas.add(new Area("Mecanica general", "Repara autos", 40, serviciosMecanicaGeneral));
        
        Servicio servicioMecanicaEspecializada[] = new Servicio[2];
        servicioMecanicaEspecializada[0]= new Servicio("Reparación de motor", 1500000, 15);
        servicioMecanicaEspecializada[1]= new Servicio("Revisión y reparación del sistema electrico", 350000, 15);
        areas.add(new Area("Mecanica especialzada", "Repara autos", 30, servicioMecanicaEspecializada));
        
        
    
    }

}
