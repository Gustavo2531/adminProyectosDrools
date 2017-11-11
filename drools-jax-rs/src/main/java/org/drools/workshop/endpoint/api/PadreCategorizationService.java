/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.drools.workshop.endpoint.api;

import java.util.List;
import javax.validation.constraints.NotNull;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import org.drools.workshop.model.*;

/**
 *
 * @author salaboy
 */
@Path("sistema")
public interface PadreCategorizationService {
//    @POST
//    @Consumes("application/json")
//    @Produces("application/json")
//    @Path("/inserta")
//    public Padre insertaPadre(@NotNull Padre padre);
    
    @POST
    @Consumes("application/json")
    @Produces("application/json")
    @Path("/insertaAlumno")
    public Alumno insertaAlumno(@NotNull Alumno alumno);
    
    @POST
    @Consumes("application/json")
    @Produces("application/json")
    @Path("/insertaBloque")
    public Bloque insertaBloque(@NotNull Bloque bloque);
    
    
    @POST
    @Consumes("application/json")
    @Produces("application/json")
    @Path("/insertaArea")
    public Area insertaArea(@NotNull Area area);
    
    
    @POST
    @Consumes("application/json")
    @Produces("application/json")
    @Path("/insertaCurso")
    public Curso insertaCurso(@NotNull Curso curso);
    
    @POST
    @Consumes("application/json")
    @Produces("application/json")
    @Path("/insertaSensorC")
    public SensorC insertaSensorC(@NotNull SensorC sensorC);
    
    @POST
    @Consumes("application/json")
    @Produces("application/json")
    @Path("/insertaSensor")
    public SensorM insertaSensorM(@NotNull SensorM sensorM);
    
    
    @POST
    @Consumes("application/json")
    @Produces("application/json")
    @Path("/insertaActuadorC")
    public ActuadorC insertaActuadorC(@NotNull ActuadorC actuadorC);
    
    @POST
    @Consumes("application/json")
    @Produces("application/json")
    @Path("/insertaCuarto")
    public Cuarto insertaCuarto(@NotNull Cuarto cuarto);
    
    @POST
    @Consumes("application/json")
    @Produces("application/json")
    @Path("/insertaActuadorA")
    public ActuadorA insertaActuadorA(@NotNull ActuadorA actuadorA);
    
    @POST
    @Consumes("application/json")
    @Produces("application/json")
    @Path("/insertaActuadorF")
    public ActuadorF insertaActuadorF(@NotNull ActuadorF actuadorF);
    
    
    @POST
    @Consumes("application/json")
    @Produces("application/json")
    @Path("/insertaProfesor")
    public Profesor insertaProfesor(@NotNull Profesor profesor);
    
    
    @POST
    @Consumes("application/json")
    @Produces("application/json")
    @Path("/insertaEjercicioAlumno")
    public EjercicioAlumnoBloque insertaEjercicioAlumno(@NotNull EjercicioAlumnoBloque ejercicioAlumno);
    
    @POST
    @Consumes("application/json")
    @Produces("application/json")
    @Path("/insertaEjercicio")
    public Ejercicio insertaEjercicio(@NotNull Ejercicio ejercicio);
    
    @POST
    @Consumes("application/json")
    @Produces("application/json")
    @Path("/insertaAlumnoCurso")
    public AlumnoCursoProfesor insertaAlumnoCurso(@NotNull AlumnoCursoProfesor alumnoCurso);
    
    
    @POST
    @Consumes("application/json")
    @Produces("application/json")
    @Path("/insertaCursoArea")
    public CursoArea insertaCursoArea(@NotNull CursoArea cursoArea);
    
    
    @POST
    @Consumes("application/json")
    @Produces("application/json")
    @Path("/insertaCursoBloque")
    public CursoAlumnoBloque insertaCursoBloque(@NotNull CursoAlumnoBloque cursoBloque);
    
        
    @GET
    @Produces("application/json")
    @Path("bloquesNuevos")
    public List<CursoAlumnoBloque> getCursoBloques();
    
    @GET
    @Produces("application/json")
    @Path("recomendacionesCursos")
    public List<RecomendacionCurso> getRecomendacionCursos();
    
    @GET
    @Produces("application/json")
    @Path("alumnos")
    public List<Alumno> getAlumnos();
    
    @GET
    @Produces("application/json")
    @Path("profesores")
    public List<Profesor> getProfesors();
    
    @GET
    @Produces("application/json")
    @Path("areas")
    public List<Area> getAreas();
    
    @GET
    @Produces("application/json")
    @Path("cursos")
    public List<Curso> getCursos();
    
    @GET
    @Produces("application/json")
    @Path("sensorCs")
    public List<SensorC> getSensorCs();
    
    @GET
    @Produces("application/json")
    @Path("sensorMs")
    public List<SensorM> getSensorMs();
    
    @GET
    @Produces("application/json")
    @Path("actuadorFs")
    public List<ActuadorF> getActuadorFs();
    
    @GET
    @Produces("application/json")
    @Path("actuadorCs")
    public List<ActuadorC> getActuadorCs();
    
    @GET
    @Produces("application/json")
    @Path("actuadorAs")
    public List<ActuadorA> getActuadorAs();
    
    @GET
    @Produces("application/json")
    @Path("cuartos")
    public List<Cuarto> getCuartos();
    
    @GET
    @Produces("application/json")
    @Path("bloques")
    public List<Bloque> getBloques();
    
    @GET
    @Produces("application/json")
    @Path("ejercicios")
    public List<Ejercicio> getEjercicios();

    @GET
    @Produces("application/json")
    @Path("material")
    public List<Material> getMateriales();

    
    @GET
    @Produces("application/json")
    @Path("cursoArea")
    public List<CursoArea> getCursoAreas();
    
    @GET
    @Produces("application/json")
    @Path("EjercicioAlumno")
    public List<EjercicioAlumnoBloque> getEjercicioAlumnos();
    
    @GET
    @Produces("application/json")
    @Path("alumnoCurso")
    public List<AlumnoCursoProfesor> getAlumnoCursos();
    
//    @GET
//    @Produces("application/json")
//    @Path("ancestros")
//    public List<Ancestro> getAncestros();
//    
//    
//    @GET
//    @Produces("application/json")
//    @Path("ancestros")
//    public List<Ancestro> getAncestros();
}
