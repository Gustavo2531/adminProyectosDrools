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
public class Ancestro {
    
    private String ancestro1;
    private String descendiente;

    public Ancestro() {
    }

    public String getAncestro1() {
        return ancestro1;
    }

    public void setAncestro1(String ancestro1) {
        this.ancestro1 = ancestro1;
    }
    public String getDescendiente() {
        return descendiente;
    }
    
    public void setDescendiente2(String descendiente) {
        this.descendiente = descendiente;
    }

   

    @Override
    public String toString() {
        return "Ancestro{" + "Persona =" + ancestro1 + "es ancestro de=" + descendiente + '}';
    }
    
    public Ancestro(String ancestro1, String descendiente){
        this.ancestro1=ancestro1;
        this.descendiente=descendiente;
    
    }
   
    
    
}
