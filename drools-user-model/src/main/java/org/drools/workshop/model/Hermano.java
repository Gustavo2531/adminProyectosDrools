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
public class Hermano {
    
    private String hermano1;
    private String hermano2;

    public Hermano() {
    }

    public String getHermano1() {
        return hermano1;
    }

    public void setHermano1(String hermano1) {
        this.hermano1 = hermano1;
    }
    public String getHermano2() {
        return hermano2;
    }
    
    public void setHermano2(String hermano2) {
        this.hermano2 = hermano2;
    }

   

    @Override
    public String toString() {
        return "Hermano{" + "Persona =" + hermano1 + "es hermano de=" + hermano2 + '}';
    }
    
    public Hermano(String hermano1, String hermano2){
        this.hermano1=hermano1;
        this.hermano2=hermano2;
    
    }
   
    
    
}
