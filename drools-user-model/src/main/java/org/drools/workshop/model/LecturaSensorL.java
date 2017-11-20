package org.drools.workshop.model;

import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
public class LecturaSensorL{
    public int id;
    public float luzAmbiente;
    public float luzArtificial;
    public LecturaSensorL(){
        
    }
    public LecturaSensorL(int id, float luzAmbiente, float luzArtificial){
        this.luzAmbiente = luzAmbiente;
        this.luzArtificial = luzArtificial;
        this.id = id;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public float getLuzAmbiente(){
        return luzAmbiente;
    }
    public void setLuzAmbiente(float luzAmbiente){
        this.luzAmbiente = luzAmbiente;
    }
    public float getLuzArtificial(){
        return luzArtificial;
    }
    public void setLuzArtificial(float luzArtificial){
        this.luzArtificial = luzArtificial;
    }
}   