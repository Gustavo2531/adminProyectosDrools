/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.drools.workshop.model;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author salaboy
 */
@XmlRootElement
public class Bloque {
    
    private String nombre;
    private String nextBloque;

    public Bloque() {
    }

    public String getNextBloque() {
        return nextBloque;
    }

    public void setNextBloque(String nextBloque) {
        this.nextBloque = nextBloque;
    }
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    @Override
    public String toString() {
        return "Bloque{" + "El nombre es =" + nombre + "y el siguiente bloque es =" + nextBloque + '}';
    }
    
    public Bloque(String nombre, String nextBloque){
        this.nombre=nombre;
        this.nextBloque=nextBloque;

    
    }
   
    
    
}
