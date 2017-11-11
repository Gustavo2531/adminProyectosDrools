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
public class CursoArea {
    
    private String nombreCurso;
    private String nombreArea;
    
    public CursoArea() {
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }
    public String getNombreArea() {
        return nombreArea;
    }
    
    public void setNombreArea(String nombreArea) {
        this.nombreArea = nombreArea;
    }


    @Override
    public String toString() {
        return "Area{" + "Curso =" + nombreCurso + "tiene el Area=" + nombreArea + '}';
    }
    
    public CursoArea(String nombreCurso, String nombreArea){
        this.nombreArea=nombreArea;
        this.nombreCurso=nombreCurso;
    
    }
   
    
    
}
