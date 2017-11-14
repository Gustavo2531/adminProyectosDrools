package org.drools.workshop.model;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author salaboy
 */
@XmlRootElement
public class ActuadorF {
    
    
    public String nombre;
    public Integer id;
    public float [][]color = new float[1][2];
    public String unidad;
    public String ubicacionE;
    public String ubicacionC;
    public float consumoEnergia;
    public String descripcion;
    public String tipoActuador;
    public boolean estado;
    public boolean conectado;
    public float intensidad;
    
    public ActuadorF() {
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
    public String getTipoActuador() {
        return tipoActuador;
    }
    public void setTipoActuador(String tipoActuador) {
        this.tipoActuador= tipoActuador;
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
    
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public float getConsumoEnergia() {
        return consumoEnergia;
    }
    
    public void setConsumoEnergia(float consumoEnergia) {
        this.consumoEnergia= consumoEnergia;
    }
    
    public float getIntensidad() {
        return intensidad;
    }
    
    public void setIntensidad(float intensidad) {
        this.intensidad= intensidad;
    }
    
    public String getUnidad() {
        return unidad;
    }
    
    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }
    
    public float[][] getColor() {
        return color;
    }
    
    public void setColor(float x, float y) {
        this.color[0][0] = x;
        this.color[0][1]= y;
    }
    
    @Override
    public String toString() {
        return "ActuadorC{" + "nombre=" + nombre + ", id=" + id + ", unidad=" + unidad + '}';
    }
    
    public ActuadorF(Integer id, String nombre, String ubicacionE,String ubicacionC,boolean conectado, boolean estado,String descripcion, String tipoActuador, float consumoEnergia,String unidad, float intensidad, float x, float y){
        this.id = id;
        this.nombre = nombre;
        this.ubicacionE=ubicacionE;
        this.ubicacionC=ubicacionC;
        this.conectado= conectado;
        this.estado= estado;
        this.descripcion = descripcion;
        this.tipoActuador= tipoActuador;
        this.consumoEnergia= consumoEnergia;
        this.unidad = unidad;
        this.intensidad= intensidad;
        this.color[0][0] = x;
        this.color[0][1]= y;
        
        
        
    }
    
    
    
}
