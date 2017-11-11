package org.drools.workshop.model;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author salaboy
 */
@XmlRootElement
public class Cuarto {
    
    private String nombre;
    private Integer id;
    private Integer maxVelocidad;
    private Integer minVelocidad;
    private String ubicacionE;
    private String ubicacionC;
    private float maxconsumoEnergia;
     private float minconsumoEnergia;
    private float maxtemperatura;
    private float mintemperatura;

    public Cuarto() {
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
    
    
    public Integer getId() {
        return id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public float getMaxConsumoEnergia() {
        return maxconsumoEnergia;
    }
    
    public void setMaxConsumoEnergia(float maxconsumoEnergia) {
        this.maxconsumoEnergia= maxconsumoEnergia;
    }
    
    public float getMinConsumoEnergia() {
        return minconsumoEnergia;
    }
    
    public void setMinConsumoEnergia(float minconsumoEnergia) {
        this.minconsumoEnergia= minconsumoEnergia;
    }
    
    public float getMinTemperatura() {
        return mintemperatura;
    }
    
    public void setMaxTemperatura(float maxtemperatura) {
        this.maxtemperatura= maxtemperatura;
    }
    
    public float getMaxTemperatura() {
        return maxtemperatura;
    }
    
    public void setMinTemperatura(float mintemperatura) {
        this.mintemperatura= mintemperatura;
    }
    
    
    public Integer getMinVelocidad() {
        return minVelocidad;
    }
    
    public void setMinVelocidad(Integer minVelocidad) {
        this.minVelocidad = minVelocidad;
    }
    
    public Integer getMaxVelocidad() {
        return maxVelocidad;
    }
    
    public void setMaxVelocidad(Integer maxVelocidad) {
        this.maxVelocidad = maxVelocidad;
    }
    
    @Override
    public String toString() {
        return "ActuadorC{" + "nombre=" + nombre + ", id=" + id + ", unidad=" + maxVelocidad + '}';
    }
    
    public Cuarto(Integer id, String nombre, Integer maxVelocidad, Integer minVelocidad, String ubicacionE,String ubicacionC, float maxconsumoEnergia, float minconsumoEnergia, float maxtemperatura,float mintemperatura){
        this.id = id;
        this.nombre = nombre;
        this.maxVelocidad = maxVelocidad;
        this.minVelocidad = minVelocidad;
        this.ubicacionE=ubicacionE;
        this.ubicacionC=ubicacionC;
        this.maxconsumoEnergia= maxconsumoEnergia;
        this.minconsumoEnergia= minconsumoEnergia;
        this.maxtemperatura= maxtemperatura;
        this.mintemperatura= mintemperatura;
    }
    
    
    
}
