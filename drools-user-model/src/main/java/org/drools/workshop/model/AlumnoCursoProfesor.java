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
public class AlumnoCursoProfesor {
    
    private String nombreCurso;
    private String matricula;
    private double porcentaje;
     private String matriculaProfesor;
    public AlumnoCursoProfesor() {
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso= nombreCurso;
    }
    public String getMatriculaProfesor() {
        return matriculaProfesor;
    }
    
    public void setMatriculaProfesor(String matriculaProfesor) {
        this.matriculaProfesor = matriculaProfesor;
    }
    
    public double getPorcentaje() {
        return porcentaje;
    }
    
    public void setPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }
    public String getMatricula() {
        return matricula;
    }
    
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }


    @Override
    public String toString() {
        return "AlumnoAlumnoCurso{" + "El matricula del Alumno =" + matricula + "va al curso=" + nombreCurso + '}';
    }
    
    public AlumnoCursoProfesor(String matricula,  String nombreCurso, double porcentaje, String matriculaProfesor){
        this.matricula=matricula;
        this.nombreCurso=nombreCurso;
        this.porcentaje=porcentaje;
        this.matriculaProfesor=matriculaProfesor;
    
    }
   
    
    
}
