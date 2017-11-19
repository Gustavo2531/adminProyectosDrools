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
public class SensorT {
    
    public String ubicacionE;
    public String ubicacionC;
    public Integer id;
    public String descripcion;
    public String tipoSensor;
    public boolean estado;
    public boolean conectado;
    public float cantidadLuz;
    public String nombre;
    
    public SensorL() {
    }

    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getUbicacionE() {
        return ubicacionE;
    }

    public void setUbicacionE(String ubicacionE) {
        this.ubicacionE = ubicacionE;
    }
    public String getUbicacionC() {
        return ubicacionC;
    }
    
    public void setUbicacionC(String ubicacionC) {
        this.ubicacionC = ubicacionC;
    }

    public String getDescripcion() {
        return descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getId() {
        return id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getTipoSensor() {
        return tipoSensor;
    }
    public void setTipoSensor(String tipoSensor) {
        this.tipoSensor= tipoSensor;
    }
    public boolean getEstado() {
        return estado;
    }
    public void setEstado(boolean estado) {
        this.estado= estado;
    }
    public boolean getConectado() {
        return conectado;
    }
    public void setConectado(boolean conectado) {
        this.conectado= conectado;
    }
    public float getCantidadLuz() {
        return cantidadLuz;
    }
    public void setCantidadLuz(float cantidadLuz) {
        this.cantidadLuz cantidadLuz;
    }
    @Override
    public String toString() {
        return "Sensor{" + "Cuarto =" + ubicacionC + "tiene la ubicacionE =" + ubicacionE + '}';
    }
    
    public SensorL(Integer id, String nombre, String ubicacionE, String ubicacionC,  boolean conectado,boolean estado, String descripcion, String tipoSensor, float cantidadLuz){
        this.id=id;
        this.nombre = nombre;
        this.ubicacionE=ubicacionE;
        this.ubicacionC=ubicacionC;
        this.conectado= conectado;
        this.estado= estado;
        this.descripcion = descripcion;
        this.tipoSensor= tipoSensor;
        this.cantidadLuz= cantidadLuz;
    
    }
   
    
    
}