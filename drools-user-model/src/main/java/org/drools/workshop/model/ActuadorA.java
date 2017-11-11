package org.drools.workshop.model;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author salaboy
 */
@XmlRootElement
public class ActuadorA {
    
    private String nombre;
    private Integer id;
    private Integer velocidad;
    private String unidad;
    private String ubicacionE;
    private String ubicacionC;
    private float consumoEnergia;
    private String descripcion;
    private String tipoActuador;
    private boolean estado;
    private boolean conectado;
    private float temperatura;
    
    public ActuadorA() {
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
    
    public float getTemperatura() {
        return temperatura;
    }
    
    public void setTemperatura(float temperatura) {
        this.temperatura= temperatura;
    }
    
    public String getUnidad() {
        return unidad;
    }
    
    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }
    
    public Integer getVelocidad() {
        return velocidad;
    }
    
    public void setVelocidad(Integer velocidad) {
        this.velocidad = velocidad;
    }
    
    @Override
    public String toString() {
        return "ActuadorC{" + "nombre=" + nombre + ", id=" + id + ", unidad=" + unidad + '}';
    }
    
    public ActuadorA(Integer id, String nombre, String ubicacionE,String ubicacionC,boolean conectado, boolean estado,String descripcion, String tipoActuador, float consumoEnergia,String unidad, float temperatura, Integer velocidad){
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
        this.temperatura= temperatura;
        this.velocidad = velocidad;
        
        
        
    }
    
    
    
}
