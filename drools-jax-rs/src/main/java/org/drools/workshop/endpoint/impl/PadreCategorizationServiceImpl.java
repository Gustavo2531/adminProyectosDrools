package org.drools.workshop.endpoint.impl;

import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import org.drools.workshop.model.*;

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
        List<SensorC> abuelos= new ArrayList<SensorC>();
        for (Object o : kSession.getObjects()) {
            if (o instanceof SensorC) {
                abuelos.add((SensorC) o);
            }
        }
        return abuelos;
    }
    
    @Override
    public List<ActuadorA> getActuadorAs() {
        List<ActuadorA> abuelos= new ArrayList<ActuadorA>();
        for (Object o : kSession.getObjects()) {
            if (o instanceof ActuadorA) {
                abuelos.add((ActuadorA) o);
            }
        }
        return abuelos;
    }
    @Override
    public List<ActuadorF> getActuadorFs() {
        List<ActuadorF> abuelos= new ArrayList<ActuadorF>();
        for (Object o : kSession.getObjects()) {
            if (o instanceof ActuadorF) {
                abuelos.add((ActuadorF) o);
            }
        }
        return abuelos;
    }
    @Override
    public List<ActuadorC> getActuadorCs() {
        List<ActuadorC> abuelos= new ArrayList<ActuadorC>();
        for (Object o : kSession.getObjects()) {
            if (o instanceof ActuadorC) {
                abuelos.add((ActuadorC) o);
            }
        }
        return abuelos;
    }
    
    @Override
    public List<Cuarto> getCuartos() {
        List<Cuarto> alumnocurso= new ArrayList<Cuarto>();
        for (Object o : kSession.getObjects()) {
            if (o instanceof Cuarto) {
                alumnocurso.add((Cuarto) o);
            }
        }
        return alumnocurso;
    }
    
    private void printKieSessionAllFacts(KieSession kSession) {
        System.out.println(" >> Start - Printing All Facts in the Kie Session");
        for (Object o : kSession.getObjects()) {
            System.out.println(">> Fact: " + o);
        }
        System.out.println(" >> End - Printing All Facts in the Kie Session");
    }

}
