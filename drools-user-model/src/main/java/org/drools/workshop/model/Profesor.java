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
public class Profesor {
    
    private String matricula;
    private String nombre;

    public Profesor() {
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    @Override
    public String toString() {
        return "Profesor{" + "Persona =" + nombre + "tiene la matricula =" + matricula + '}';
    }
    
    public Profesor(String nombre, String matricula){
        this.nombre=nombre;
        this.matricula=matricula;
    
    }
   
    
    
}
