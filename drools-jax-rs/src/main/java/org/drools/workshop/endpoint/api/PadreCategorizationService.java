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
    @Path("/login")
    public User login(@NotNull User user);
    @POST
    @Consumes("application/json")
    @Produces("application/json")
    @Path("/insertaSensorC")
    public SensorC insertaSensorC(@NotNull SensorC sensorC);

    @POST
    @Consumes("application/json")
    @Produces("application/json")
    @Path("/insertaSensorL")
    public SensorL insertaSensorL(@NotNull SensorL sensorL);
    
    @POST
    @Consumes("application/json")
    @Produces("application/json")
    @Path("/insertaSensorT")
    public SensorT insertaSensorT(@NotNull SensorT sensorT);
    
    @POST
    @Consumes("application/json")
    @Produces("application/json")
    @Path("/insertaSensorM")
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
    
    
   
    @GET
    @Produces("application/json")
    @Path("sensorCs")
    public List<SensorC> getSensorCs();

    @GET
    @Produces("application/json")
    @Path("sensorLs")
    public List<SensorL> getSensorLs();

    @GET
    @Produces("application/json")
    @Path("sensorTs")
    public List<SensorT> getSensorTs();
    
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
    
}
