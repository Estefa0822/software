/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgControlador;

import java.awt.Color;
import java.util.LinkedList;
import java.util.Stack;
import javax.swing.JOptionPane;
import pkgModelo.Area;
import pkgModelo.Auto;
import pkgModelo.MecanicaEspecializada;
import pkgModelo.MecanicaGeneral;
import pkgModelo.Pintura;
import pkgModelo.Servicio;

/**
 *
 * @author Marcela
 */
public class Control {

    Auto auto;
    LinkedList<Area> Listarea;

    /**
     * Constructor rea las estructuras de datos
     */
    public Control() {

        Listarea = new LinkedList<>();
        configInicial();
    }

    public void configInicial() {

        //Crear área de pintura
        Pintura areaPintura = new Pintura();
        Listarea.add(areaPintura);

        //Crear area de mecanica general
        MecanicaGeneral mecGeneral = new MecanicaGeneral();
        Listarea.add(mecGeneral);

        //Crear area de mecanica especializada
        MecanicaEspecializada mecEspecializada = new MecanicaEspecializada();
        Listarea.add(mecEspecializada);

    }

    public boolean AdicionarAutos(String placa, String modelo, Color color, LinkedList<String> servicios, String area) {
        boolean correcto = false;
        Auto automovil1 = new Auto(placa, modelo, color, servicios);
        int i = 0;
        int indice = -1;
        do {
            if (Listarea.get(i).getNombre().equals(area)) {
                indice = i;
                if (area.equals("Pintura")) {
                    Pintura p = new Pintura();
                    p = (Pintura) Listarea.get(indice);
                    automovil1.setCosto(Listarea.get(i).getCostoServicios(servicios));
                    p.adicionarAutos(automovil1);

                    correcto = true;

                } else if (area.equals("Mecánica general")) {
                    MecanicaGeneral mecGen = new MecanicaGeneral();
                    mecGen = (MecanicaGeneral) Listarea.get(indice);
                    automovil1.setCosto(Listarea.get(i).getCostoServicios(servicios));
                    mecGen.adicionarAutos(automovil1);
                    System.out.println("Costo total = " + automovil1.getCosto());
                    correcto = true;

                } else if (area.equals("Mecánica especializada")) {
                    MecanicaEspecializada mecEsp = new MecanicaEspecializada();
                    mecEsp = (MecanicaEspecializada) Listarea.get(indice);
                    automovil1.setCosto(Listarea.get(i).getCostoServicios(servicios));
                    mecEsp.adicionarAutos(automovil1);
                    correcto = true;
                } else {
                    System.out.println("No se encontró el área");
                    correcto = false;
                }
            }
            i++;

        } while (indice == -1 && i < Listarea.size());

        //System.out.println("Voy a recorrer las áreas");
        for (int j = 0; j < Listarea.size(); j++) {
//            System.out.println("Areas: " + j);
//            System.out.print("Nombre: " + Listarea.get(j).getNombre());
//            System.out.print("Duración Total: " + Listarea.get(j).getDuracion());
            Listarea.get(j).getServicios();
        }
        JOptionPane.showMessageDialog(null, "Se registro el auto en el area ");
        return correcto;
    }

    /**
     *
     * @param area Parametro que llega desde l FrmMenu para saber que area
     * atender
     * @return una estrucutura de datos para saber que autos se van a atender
     */
    public Auto atender(String area) {
        Auto a = null;
        for (int i = 0; i < Listarea.size(); i++) {
            if (area.equals("Mecánica general") && Listarea.get(i).getNombre().equals("Mecánica general")) {
                MecanicaGeneral mec = new MecanicaGeneral();
                mec = (MecanicaGeneral) Listarea.get(i);
                a = (Auto) mec.atender();

            } else if (area.equals("Pintura") && Listarea.get(i).getNombre().equals("Pintura")) {
                Pintura pin = new Pintura();
                pin = (Pintura) Listarea.get(i);
                a = (Auto) pin.atender();
            } else if (area.equals("Mecánica especializada") && Listarea.get(i).getNombre().equals("Mecánica especializada")) {
                MecanicaEspecializada mec = new MecanicaEspecializada();
                mec = (MecanicaEspecializada) Listarea.get(i);
                a = (Auto) mec.atender();
            }
        }
        return a;
    }

    public LinkedList<Area> getListarea() {
        return Listarea;
    }

    //************************************************************************************************
    public int tiempo(String servicio) {

        int tiempo = -1;
        int i = 0;
        while (i < Listarea.size() && tiempo == -1) {
            int j = 0;
            while (j < Listarea.get(i).getServicios().length && tiempo ==-1) {
                Servicio s = Listarea.get(i).getServicios()[j];
                String nom= s.getNombre();
                if (nom.equals(servicio)) {
                    tiempo = Listarea.get(i).getServicios()[j].getDuracion();
                }
                j++;
            }
            i++;
        }
        return tiempo;
    }

}
