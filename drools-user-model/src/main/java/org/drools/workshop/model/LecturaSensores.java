package org.drools.workshop.model;

import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
public class LecturaSensores{
    public int id;
    public float lectura;
    public LecturaSensores(){
        
    }
    public LecturaSensores(int id, float lectura){
        this.lectura = lectura;
        this.id = id;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public float getLectura(){
        return lectura;
    }
    public void setLectura(float lectura){
        this.lectura = lectura;
    }
}   