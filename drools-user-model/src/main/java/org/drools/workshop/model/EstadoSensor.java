package org.drools.workshop.model;

import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
public class EstadoSensor{
    public int id;
    public boolean estado;
    public EstadoSensor(){
        
    }
    public EstadoSensor(int id, boolean estado){
        this.estado = estado;
        this.id = id;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public boolean getEstado(){
        return estado;
    }
    public void setEstado(boolean estado){
        this.estado = estado;
    }
}   