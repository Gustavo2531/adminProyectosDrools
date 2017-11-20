package org.drools.workshop.endpoint.impl;

import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import org.drools.workshop.model.*;
import org.kie.api.runtime.rule.FactHandle;
import org.drools.workshop.endpoint.api.*;
import org.kie.api.cdi.KReleaseId;
import org.kie.api.cdi.KSession;
import org.kie.api.runtime.KieSession;


@ApplicationScoped
public class PadreCategorizationServiceImpl implements PadreCategorizationService {
    
    @Inject
    @KReleaseId(groupId = "org.drools.workshop", artifactId = "drools-user-kjar", version = "1.0-SNAPSHOT")
    @KSession
    private KieSession kSession;
    private User admin = new User("admin","password");
    @Override
    public User login(User user){
        if(user.getUsername().equals(admin.getUsername())){
            if(admin.validatePass(user.getUsername())){
                return admin;
            }
            return  null;
        }else{
            return null;
        }
    }
    @Override
    public ActuadorC insertaActuadorC(ActuadorC actuadorC) {
        System.out.println(">> Actuador: " + actuadorC);
        kSession.insert(actuadorC);
        int fired = kSession.fireAllRules();
        System.out.println(">> Fired: " + fired);
        return actuadorC;
        
    }
    
    @Override
    public SensorM insertaSensorM(SensorM sensorM) {
        System.out.println(">> Sensor: " + sensorM);
        kSession.insert(sensorM);
        int fired = kSession.fireAllRules();
        System.out.println(">> Fired: " + fired);
        return sensorM;
        
    }
    @Override
    public Cuarto insertaCuarto(Cuarto cuarto) {
        System.out.println(">> Cuart: " + cuarto);
        kSession.insert(cuarto);
        int fired = kSession.fireAllRules();
        System.out.println(">> Fired: " + fired);
        return cuarto;
        
    }
    
    @Override
    public SensorC insertaSensorC(SensorC sensorC) {
        System.out.println(">> Sensor: " + sensorC);
        kSession.insert(sensorC);
        int fired = kSession.fireAllRules();
        System.out.println(">> Fired: " + fired);
        return sensorC;
        
    }

    @Override
    public SensorT insertaSensorT(SensorT sensorT) {
        System.out.println(">> Sensor: " + sensorT);
        kSession.insert(sensorT);
        int fired = kSession.fireAllRules();
        System.out.println(">> Fired: " + fired);
        return sensorT;   
    }

    @Override
    public SensorL insertaSensorL(SensorL sensorL) {
        System.out.println(">> Sensor: " + sensorL);
        kSession.insert(sensorL);
        int fired = kSession.fireAllRules();
        System.out.println(">> Fired: " + fired);
        return sensorL;   
    }
    
    @Override
    public ActuadorA insertaActuadorA(ActuadorA actuadorA) {
        System.out.println(">> Actuador: " + actuadorA);
        kSession.insert(actuadorA);
        int fired = kSession.fireAllRules();
        System.out.println(">> Fired: " + fired);
        return actuadorA;
        
    }
    
    @Override
    public ActuadorF insertaActuadorF(ActuadorF actuadorF) {
        System.out.println(">> Actuador: " + actuadorF);
        kSession.insert(actuadorF);
        int fired = kSession.fireAllRules();
        System.out.println(">> Fired: " + fired);
        return actuadorF;
        
    }

    @Override
    public List<SensorM> getSensorMs() {
        List<SensorM> abuelos= new ArrayList<SensorM>();
        for (Object o : kSession.getObjects()) {
            if (o instanceof SensorM) {
                abuelos.add((SensorM) o);
            }
        }
        return abuelos;
    }
    
    @Override
    public List<SensorC> getSensorCs() {
        List<SensorC> sensores= new ArrayList<SensorC>();
        for (Object o : kSession.getObjects()) {
            if (o instanceof SensorC) {
                sensores.add((SensorC) o);
            }
        }
        return sensores;
    }

    @Override
    public List<SensorT> getSensorTs() {
        List<SensorT> sensores= new ArrayList<SensorT>();
        for (Object o : kSession.getObjects()) {
            if (o instanceof SensorT) {
                sensores.add((SensorT) o);
            }
        }
        return sensores;
    }

    @Override
    public List<SensorL> getSensorLs() {
        List<SensorL> sensores= new ArrayList<SensorL>();
        for (Object o : kSession.getObjects()) {
            if (o instanceof SensorL) {
                sensores.add((SensorL) o);
            }
        }
        return sensores;
    }
    
    @Override
    public List<ActuadorA> getActuadorAs() {
        List<ActuadorA> actuadores= new ArrayList<ActuadorA>();
        for (Object o : kSession.getObjects()) {
            if (o instanceof ActuadorA) {
                actuadores.add((ActuadorA) o);
            }
        }
        return actuadores;
    }
    @Override
    public List<ActuadorF> getActuadorFs() {
        List<ActuadorF> actuadores= new ArrayList<ActuadorF>();
        for (Object o : kSession.getObjects()) {
            if (o instanceof ActuadorF) {
                actuadores.add((ActuadorF) o);
            }
        }
        return actuadores;
    }
    @Override
    public List<ActuadorC> getActuadorCs() {
        List<ActuadorC> actuadores= new ArrayList<ActuadorC>();
        for (Object o : kSession.getObjects()) {
            if (o instanceof ActuadorC) {
                actuadores.add((ActuadorC) o);
            }
        }
        return actuadores;
    }
    
    @Override
    public List<Cuarto> getCuartos() {
        List<Cuarto> cuartos= new ArrayList<Cuarto>();
        for (Object o : kSession.getObjects()) {
            if (o instanceof Cuarto) {
                cuartos.add((Cuarto) o);
            }
        }
        return cuartos;
    }
    @Override
    public SensorL apagarSensorL(EstadoSensor estado){
        for(Object o : kSession.getObjects()){
            if(o instanceof SensorL){
                SensorL sen = (SensorL)o;
                if(sen.getId()==estado.getId()){
                    FactHandle handle = kSession.insert(sen);
                    sen.setEstado(estado.getEstado());
                    kSession.update(handle, sen);
                    kSession.fireAllRules();
                    return sen;
                }
            }
        }
        return null;
    }
    @Override
    public SensorC apagarSensorC(EstadoSensor estado){
        for(Object o : kSession.getObjects()){
            if(o instanceof SensorC){
                SensorC sen = (SensorC)o;
                if(sen.getId()==estado.getId()){
                    FactHandle handle = kSession.insert(sen);
                    sen.setEstado(estado.getEstado());
                    kSession.update(handle, sen);
                    kSession.fireAllRules();
                    return sen;
                }
            }
        }
        return null;
    }
    @Override
    public SensorM apagarSensorM(EstadoSensor estado){
        for(Object o : kSession.getObjects()){
            if(o instanceof SensorM){
                SensorM sen = (SensorM)o;
                if(sen.getId()==estado.getId()){
                    FactHandle handle = kSession.insert(sen);
                    sen.setEstado(estado.getEstado());
                    kSession.update(handle, sen);
                    kSession.fireAllRules();
                    return sen;
                }
            }
        }
        return null;
    }
    @Override
    public SensorT apagarSensorT(EstadoSensor estado){
        for(Object o : kSession.getObjects()){
            if(o instanceof SensorT){
                SensorT sen = (SensorT)o;
                if(sen.getId()==estado.getId()){
                    FactHandle handle = kSession.insert(sen);
                    sen.setEstado(estado.getEstado());
                    kSession.update(handle, sen);
                    kSession.fireAllRules();
                    return sen;
                }
            }
        }
        return null;
    }
    @Override
    public ActuadorA apagarActuadorA(EstadoSensor estado){
        for(Object o : kSession.getObjects()){
            if(o instanceof ActuadorA){
                ActuadorA sen = (ActuadorA)o;
                if(sen.getId()==estado.getId()){
                    FactHandle handle = kSession.insert(sen);
                    sen.setEstado(estado.getEstado());
                    kSession.update(handle, sen);
                    kSession.fireAllRules();
                    return sen;
                }
            }
        }
        return null;
    }
    @Override
    public ActuadorC apagarActuadorC(EstadoSensor estado){
        for(Object o : kSession.getObjects()){
            if(o instanceof ActuadorC){
                ActuadorC sen = (ActuadorC)o;
                if(sen.getId()==estado.getId()){
                    FactHandle handle = kSession.insert(sen);
                    sen.setEstado(estado.getEstado());
                    kSession.update(handle, sen);
                    kSession.fireAllRules();
                    return sen;
                }
            }
        }
        return null;
    }
    @Override
    public ActuadorF apagarActuadorF(EstadoSensor estado){
        for(Object o : kSession.getObjects()){
            if(o instanceof ActuadorF){
                ActuadorF sen = (ActuadorF)o;
                if(sen.getId()==estado.getId()){
                    FactHandle handle = kSession.insert(sen);
                    sen.setEstado(estado.getEstado());
                    kSession.update(handle, sen);
                    kSession.fireAllRules();
                    return sen;
                }
            }
        }
        return null;
    }
    private void printKieSessionAllFacts(KieSession kSession) {
        System.out.println(" >> Start - Printing All Facts in the Kie Session");
        for (Object o : kSession.getObjects()) {
            System.out.println(">> Fact: " + o);
        }
        System.out.println(" >> End - Printing All Facts in the Kie Session");
    }

}
