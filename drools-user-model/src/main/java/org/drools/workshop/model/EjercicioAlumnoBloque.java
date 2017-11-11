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
public class EjercicioAlumnoBloque {
    
    private String nombreEjercicio;
    private String matricula;
    private double tiempoAlumno;
    private String nombreBloque;
    private double calificacion;
    
    public EjercicioAlumnoBloque() {
    }

    public String getNombreEjercicio() {
        return nombreEjercicio;
    }

    public void setNombreEjercicio(String nombreEjercicio) {
        this.nombreEjercicio = nombreEjercicio;
    }
    
    public String getMatricula() {
        return matricula;
    }
    
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    public double getTiempoAlumno() {
        return tiempoAlumno;
    }
    
    public void setTiempoAlumno(double tiempoAlumno) {
        this.tiempoAlumno = tiempoAlumno;
    }
    public double getCalificacion() {
        return calificacion;
    }
    
    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }
    
    public String getNombreBloque() {
        return nombreBloque;
    }
    public void setNombreBloque(String nombreBloque) {
        this.nombreBloque = nombreBloque;
    }


    @Override
    public String toString() {
        return "Alumno{" + "El alumno con matricula=" + matricula + "tiene el ejercicio =" + nombreEjercicio + '}';
    }
    
    public EjercicioAlumnoBloque(String matricula, String nombreEjercicio, String nombreBloque, double tiempoAlumno, double calificacion){
        this.matricula=matricula;
        this.nombreBloque=nombreBloque;
        this.nombreEjercicio=nombreEjercicio;
        this.tiempoAlumno = tiempoAlumno;
        this.calificacion=calificacion;
    
    }
   
    
    
}
