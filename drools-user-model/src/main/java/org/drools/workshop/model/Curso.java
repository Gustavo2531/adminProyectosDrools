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
public class Curso {
    

    private String nombreCurso;
    private String nombreArea;

    public Curso() {
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
        return "Curso{" + "El nombre del curso =" + nombreCurso +"El nombre del area =" + nombreArea +'}';
    }
    
    public Curso(String nombreCurso, String nombreArea){
        this.nombreCurso=nombreCurso;
        this.nombreArea=nombreArea;
        
    }
   
    
    
}
