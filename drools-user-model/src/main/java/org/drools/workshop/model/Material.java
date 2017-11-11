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
public class Material {
    
    private String matricula;
    private String nombre;
    private String nombreCurso;
    
    private String tema;
    
    public Material() {
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
        this.tema= tema;
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
        return "RecomendacionMaterial{" + "Matricula =" + matricula + "nombre curso =" + nombreCurso + ", nombre =" + nombre + '}';
    }
    
    public Material(String matricula, String nombre, String nombreCurso, String tema){
        this.matricula=matricula;
        this.nombre=nombre;
        this.nombreCurso=nombreCurso;
        this.tema=tema;
    
    }
   
    
    
}
