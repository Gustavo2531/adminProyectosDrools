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
public class RecomendacionCurso {
    

    private String matricula;
    private String nombre;
    private String nombreCurso;
    public RecomendacionCurso() {
    }

    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getNombreCurso() {
        return nombreCurso;
    }
    
    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public String getMatricula() {
        return matricula;
    }
    
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }


    @Override
    public String toString() {
        return "RecomendacionRecomendacionCurso{" + "Matricula =" + matricula + "nombre curso =" + nombreCurso + ", nombre =" + nombre + '}';
    }
    
    public RecomendacionCurso(String matricula, String nombre , String nombreCurso){
        this.matricula=matricula;
        this.nombre=nombre;
        this.nombreCurso=nombreCurso;
    
    }
   
    
    
}
