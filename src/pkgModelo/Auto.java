/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgModelo;

import java.awt.Color;
import java.util.LinkedList;

/**
 *
 * @author Marcela
 */
public class Auto {

    private String placa;
    private String modelo;
    private Color color;
    private int costo;
    private LinkedList<String> servicios;

    public Auto() {
        servicios = new LinkedList<>();
    }

    public Auto(String placa, String modelo, Color color, LinkedList<String> servicios) {
        this.placa = placa;
        this.modelo = modelo;
        this.color = color;
        this.servicios=servicios;
        
    }

    /**
     * @return the placa
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * @param placa the placa to set
     */
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the color
     */
    public Color getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(Color color) {
        this.color = color;
    }

    /**
     * @return the servicios
     */
    public LinkedList<String> getServicios() {
        return servicios;
    }

    /**
     * @param servicios the servicios to set
     */
    public void setServicios(LinkedList<String> servicios) {
        this.servicios = servicios;
    }

    /**
     * @return the costo
     */
    public int getCosto() {
        return costo;
    }

    /**
     * @param costo the costo to set
     */
    public void setCosto(int costo) {
        this.costo = costo;
    }
    
    
    
    

}
