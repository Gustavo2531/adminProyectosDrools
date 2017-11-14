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
public class SensorC {
    
    public String ubicacionE;
    public String ubicacionC;
    public Integer id;
    public String descripcion;
    public String tipoSensor;
    public boolean estado;
    public boolean conectado;
    public boolean consume;
    public float energia;
    public String nombre;
    
    public SensorC() {
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
    public boolean getConsume() {
        return consume;
    }
    public void setConsume(boolean consume) {
        this.consume= consume;
    }
    
    public float getEnergia() {
        return energia;
    }
    public void setEnergia(float energia) {
        this.energia= energia;
    }
    @Override
    public String toString() {
        return "Sensor{" + "Persona =" + ubicacionC + "tiene la ubicacionE =" + ubicacionE + '}';
    }
    
    public SensorC(Integer id, String nombre, String ubicacionE, String ubicacionC,  boolean conectado,boolean estado, String descripcion, String tipoSensor, boolean consume, float energia){
        this.id=id;
        this.nombre = nombre;
        this.ubicacionE=ubicacionE;
        this.ubicacionC=ubicacionC;
        this.conectado= conectado;
        this.estado= estado;
        this.descripcion = descripcion;
        this.tipoSensor= tipoSensor;
        this.consume= consume;
        this.energia=energia;
        
    }
    
    
    
}
