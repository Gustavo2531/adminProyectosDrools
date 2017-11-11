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

/**
 *
 * @author salaboy
 */
@ApplicationScoped
public class PadreCategorizationServiceImpl implements PadreCategorizationService {

    @Inject
    @KReleaseId(groupId = "org.drools.workshop", artifactId = "drools-user-kjar", version = "1.0-SNAPSHOT")
    @KSession
    private KieSession kSession;

    public PadreCategorizationServiceImpl() {
    }
    
   @Override
    public Alumno insertaAlumno(Alumno alumno) {
        System.out.println(">> kSession: " + kSession);
        printKieSessionAllFacts(kSession);
        System.out.println(">> Padre: " + alumno);
        kSession.insert(alumno);
        int fired = kSession.fireAllRules();
        System.out.println(">> Fired: " + fired);
        return alumno;

    }
    @Override
    public Profesor insertaProfesor(Profesor profesor) {
        System.out.println(">> kSession: " + kSession);
        printKieSessionAllFacts(kSession);
        System.out.println(">> Padre: " + profesor);
        kSession.insert(profesor);
        int fired = kSession.fireAllRules();
        System.out.println(">> Fired: " + fired);
        return profesor;
        
    }

    @Override
    public Ejercicio insertaEjercicio(Ejercicio ejercicio) {
        System.out.println(">> kSession: " + kSession);
        printKieSessionAllFacts(kSession);
        System.out.println(">> Padre: " + ejercicio);
        kSession.insert(ejercicio);
        int fired = kSession.fireAllRules();
        System.out.println(">> Fired: " + fired);
        return ejercicio;
        
    }

    @Override
    public Bloque insertaBloque(Bloque bloque) {
        System.out.println(">> kSession: " + kSession);
        printKieSessionAllFacts(kSession);
        System.out.println(">> Padre: " + bloque);
        kSession.insert(bloque);
        int fired = kSession.fireAllRules();
        System.out.println(">> Fired: " + fired);
        return bloque;
        
    }

    @Override
    public Area insertaArea(Area area) {
        System.out.println(">> kSession: " + kSession);
        printKieSessionAllFacts(kSession);
        System.out.println(">> Padre: " + area);
        kSession.insert(area);
        int fired = kSession.fireAllRules();
        System.out.println(">> Fired: " + fired);
        return area;
        
    }
    
    @Override
    public ActuadorC insertaActuadorC(ActuadorC actuadorC) {
        System.out.println(">> kSession: " + kSession);
        printKieSessionAllFacts(kSession);
        System.out.println(">> Padre: " + actuadorC);
        kSession.insert(actuadorC);
        int fired = kSession.fireAllRules();
        System.out.println(">> Fired: " + fired);
        return actuadorC;
        
    }
    
    @Override
    public SensorM insertaSensorM(SensorM sensorM) {
        System.out.println(">> kSession: " + kSession);
        printKieSessionAllFacts(kSession);
        System.out.println(">> Padre: " + sensorM);
        kSession.insert(sensorM);
        int fired = kSession.fireAllRules();
        System.out.println(">> Fired: " + fired);
        return sensorM;
        
    }
    @Override
    public Cuarto insertaCuarto(Cuarto cuarto) {
        System.out.println(">> kSession: " + kSession);
        printKieSessionAllFacts(kSession);
        System.out.println(">> Padre: " + cuarto);
        kSession.insert(cuarto);
        int fired = kSession.fireAllRules();
        System.out.println(">> Fired: " + fired);
        return cuarto;
        
    }
    
    @Override
    public SensorC insertaSensorC(SensorC sensorC) {
        System.out.println(">> kSession: " + kSession);
        printKieSessionAllFacts(kSession);
        System.out.println(">> Padre: " + sensorC);
        kSession.insert(sensorC);
        int fired = kSession.fireAllRules();
        System.out.println(">> Fired: " + fired);
        return sensorC;
        
    }
    
    @Override
    public ActuadorA insertaActuadorA(ActuadorA actuadorA) {
        System.out.println(">> kSession: " + kSession);
        printKieSessionAllFacts(kSession);
        System.out.println(">> Padre: " + actuadorA);
        kSession.insert(actuadorA);
        int fired = kSession.fireAllRules();
        System.out.println(">> Fired: " + fired);
        return actuadorA;
        
    }
    
    @Override
    public ActuadorF insertaActuadorF(ActuadorF actuadorF) {
        System.out.println(">> kSession: " + kSession);
        printKieSessionAllFacts(kSession);
        System.out.println(">> Padre: " + actuadorF);
        kSession.insert(actuadorF);
        int fired = kSession.fireAllRules();
        System.out.println(">> Fired: " + fired);
        return actuadorF;
        
    }

    @Override
    public EjercicioAlumnoBloque insertaEjercicioAlumno(EjercicioAlumnoBloque ejercicioAlumno) {
        System.out.println(">> kSession: " + kSession);
        printKieSessionAllFacts(kSession);
        System.out.println(">> Padre: " + ejercicioAlumno);
        kSession.insert(ejercicioAlumno);
        int fired = kSession.fireAllRules();
        System.out.println(">> Fired: " + fired);
        return ejercicioAlumno;
        
    }

    @Override
    public AlumnoCursoProfesor insertaAlumnoCurso(AlumnoCursoProfesor alumnoCurso) {
        System.out.println(">> kSession: " + kSession);
        printKieSessionAllFacts(kSession);
        System.out.println(">> Padre: " + alumnoCurso);
        kSession.insert(alumnoCurso);
        int fired = kSession.fireAllRules();
        System.out.println(">> Fired: " + fired);
        return alumnoCurso;
        
    }

    @Override
    public CursoArea insertaCursoArea(CursoArea cursoArea) {
        System.out.println(">> kSession: " + kSession);
        printKieSessionAllFacts(kSession);
        System.out.println(">> Padre: " + cursoArea);
        kSession.insert(cursoArea);
        int fired = kSession.fireAllRules();
        System.out.println(">> Fired: " + fired);
        return cursoArea;
        
    }
    
    @Override
    public CursoAlumnoBloque insertaCursoBloque(CursoAlumnoBloque cursoBloque) {
        System.out.println(">> kSession: " + kSession);
        printKieSessionAllFacts(kSession);
        System.out.println(">> Padre: " + cursoBloque);
        kSession.insert(cursoBloque);
        int fired = kSession.fireAllRules();
        System.out.println(">> Fired: " + fired);
        return cursoBloque;
        
    }
    
    @Override
    public Curso insertaCurso(Curso curso) {
        System.out.println(">> kSession: " + kSession);
        printKieSessionAllFacts(kSession);
        System.out.println(">> Padre: " + curso);
        kSession.insert(curso);
        int fired = kSession.fireAllRules();
        System.out.println(">> Fired: " + fired);
        return curso;
        
    }




    @Override
    public List<CursoAlumnoBloque> getCursoBloques() {
        List<CursoAlumnoBloque> padres = new ArrayList<CursoAlumnoBloque>();
        for (Object o : kSession.getObjects()) {
            if (o instanceof CursoAlumnoBloque) {
                padres.add((CursoAlumnoBloque) o);
            }
        }
        return padres;
    }
    
    @Override
    public List<RecomendacionCurso> getRecomendacionCursos() {
        List<RecomendacionCurso> hermanos= new ArrayList<RecomendacionCurso>();
        for (Object o : kSession.getObjects()) {
            if (o instanceof RecomendacionCurso) {
                hermanos.add((RecomendacionCurso) o);
            }
        }
        return hermanos;
    }
    
    @Override
    public List<Material> getMateriales() {
        List<Material> abuelos= new ArrayList<Material>();
        for (Object o : kSession.getObjects()) {
            if (o instanceof Material) {
                abuelos.add((Material) o);
            }
        }
        return abuelos;
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
    
    @Override
    public List<CursoArea> getCursoAreas() {
        List<CursoArea> ancestros= new ArrayList<CursoArea>();
        for (Object o : kSession.getObjects()) {
            if (o instanceof CursoArea) {
                ancestros.add((CursoArea) o);
            }
        }
        return ancestros;
    }
    
    @Override
    public List<EjercicioAlumnoBloque> getEjercicioAlumnos() {
        List<EjercicioAlumnoBloque> ejercicios= new ArrayList<EjercicioAlumnoBloque>();
        for (Object o : kSession.getObjects()) {
            if (o instanceof EjercicioAlumnoBloque) {
                ejercicios.add((EjercicioAlumnoBloque) o);
            }
        }
        return ejercicios;
    }
    
    @Override
    public List<AlumnoCursoProfesor> getAlumnoCursos() {
        List<AlumnoCursoProfesor> alumnocurso= new ArrayList<AlumnoCursoProfesor>();
        for (Object o : kSession.getObjects()) {
            if (o instanceof AlumnoCursoProfesor) {
                alumnocurso.add((AlumnoCursoProfesor) o);
            }
        }
        return alumnocurso;
    }

    @Override
    public List<Alumno> getAlumnos() {
        List<Alumno> alumnocurso= new ArrayList<Alumno>();
        for (Object o : kSession.getObjects()) {
            if (o instanceof Alumno) {
                alumnocurso.add((Alumno) o);
            }
        }
        return alumnocurso;
    }
    
    @Override
    public List<Profesor> getProfesors() {
        List<Profesor> alumnocurso= new ArrayList<Profesor>();
        for (Object o : kSession.getObjects()) {
            if (o instanceof Profesor) {
                alumnocurso.add((Profesor) o);
            }
        }
        return alumnocurso;
    }
    
    @Override
    public List<Area> getAreas() {
        List<Area> alumnocurso= new ArrayList<Area>();
        for (Object o : kSession.getObjects()) {
            if (o instanceof Area) {
                alumnocurso.add((Area) o);
            }
        }
        return alumnocurso;
    }
    
    @Override
    public List<Curso> getCursos() {
        List<Curso> alumnocurso= new ArrayList<Curso>();
        for (Object o : kSession.getObjects()) {
            if (o instanceof Curso) {
                alumnocurso.add((Curso) o);
            }
        }
        return alumnocurso;
    }

    
    @Override
    public List<Bloque> getBloques() {
        List<Bloque> alumnocurso= new ArrayList<Bloque>();
        for (Object o : kSession.getObjects()) {
            if (o instanceof Bloque) {
                alumnocurso.add((Bloque) o);
            }
        }
        return alumnocurso;
    }
    
    @Override
    public List<Ejercicio> getEjercicios() {
        List<Ejercicio> alumnocurso= new ArrayList<Ejercicio>();
        for (Object o : kSession.getObjects()) {
            if (o instanceof Ejercicio) {
                alumnocurso.add((Ejercicio) o);
            }
        }
        return alumnocurso;
    }

    
    
//    @Override
//    public List<Ancestro> getAncestros() {
//        List<Ancestro> ancestros= new ArrayList<Ancestro>();
//        for (Object o : kSession.getObjects()) {
//            if (o instanceof Ancestro) {
//                ancestros.add((Ancestro) o);
//            }
//        }
//        return ancestros;
//    }
//    


    private void printKieSessionAllFacts(KieSession kSession) {
        System.out.println(" >> Start - Printing All Facts in the Kie Session");
        for (Object o : kSession.getObjects()) {
            System.out.println(">> Fact: " + o);
        }
        System.out.println(" >> End - Printing All Facts in the Kie Session");
    }

}
