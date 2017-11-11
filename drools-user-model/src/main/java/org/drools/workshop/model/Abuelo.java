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
public class Abuelo {
    
    private String abuelo;
    private String nieto;

    public Abuelo() {
    }

    public String getAbuelo() {
        return abuelo;
    }

    public void setAbuelo(String abuelo) {
        this.abuelo = abuelo;
    }
    public String getNieto() {
        return nieto;
    }
    
    public void setNieto(String nieto) {
        this.nieto = nieto;
    }


    @Override
    public String toString() {
        return "Abuelo{" + "Persona =" + abuelo + "es abuelo de=" + nieto + '}';
    }
    
    public Abuelo(String abuelo, String nieto){
        this.abuelo=abuelo;
        this.nieto=nieto;
    
    }
   
    
    
}
