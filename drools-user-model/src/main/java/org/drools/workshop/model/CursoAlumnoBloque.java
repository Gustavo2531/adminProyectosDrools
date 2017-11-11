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
public class CursoAlumnoBloque {
    
    private String nombreCurso;
    private String nombreBloque;
    private String matricula;
    private int porcentaje;
    public CursoAlumnoBloque() {
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }
    public String getNombreCurso() {
        return nombreCurso;
    }
    
    public void setNombreBloque(String nombreBloque) {
        this.nombreBloque = nombreBloque;
    }
    public String getNombreBloque() {
        return nombreBloque;
    }
    public String getMatricula() {
        return matricula;
    }
    
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    public int getPorcentaje() {
        return porcentaje;
    }
    
    public void setPorcentaje(int porcentaje) {
        this.porcentaje = porcentaje;
    }

    @Override
    public String toString() {
        return "Curso{" + "El matricula del curso =" + matricula + "tiene el curso =" + nombreCurso +" y el bloque =" + nombreBloque + '}';
    }
    
    public CursoAlumnoBloque(String matricula,  String nombreBloque, String nombreCurso){
        this.matricula=matricula;
        this.nombreCurso = nombreCurso;
        this.nombreBloque = nombreBloque;
        this.porcentaje = 0;
    
    }
    
    public CursoAlumnoBloque(String matricula,  String nombreBloque, String nombreCurso, int porcentaje){
        this.matricula=matricula;
        this.nombreCurso = nombreCurso;
        this.nombreBloque = nombreBloque;
        this.porcentaje = porcentaje;
    }
    
    
}
