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
public class Ejercicio {
    
    
    private String nombre;
    private String tema;
    private double tiempoPrueba;
    private boolean fin;

    public Ejercicio() {
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTema() {
        return tema;
    }
    
    public void setTema(String tema) {
        this.tema = tema;
    }
    
    public double getTiempoPrueba() {
        return tiempoPrueba;
    }
    
    public void setTiempoPrueba(double tiempoPrueba) {
        this.tiempoPrueba = tiempoPrueba;
    }
    
    public boolean getFin() {
        return fin;
    }
    
    public void setFin(boolean fin) {
        this.fin = fin;
    }
    
    
    @Override
    public String toString() {
        return "Ejercicio{" + "Ejericio =" + nombre + "del =" + tema + ", y tiempo prueba =" + tiempoPrueba + '}';
    }
    
    public Ejercicio(String nombre, String tema,  double tiempoPrueba, boolean fin){
        this.nombre=nombre;
        this.tema=tema;
        this.tiempoPrueba=tiempoPrueba;
        this.fin = fin;
    
    }
   
    
    
}
