package com.samanecorp.resteasymaven.rs.web;


import com.samanecorp.resteasymaven.rs.dto.UserDto;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;

@Path("/users")
public class UserController {

	@POST
	@Path("/save")
	@Consumes(MediaType.APPLICATION_JSON)//Pour le resquestBody
	@Produces(MediaType.APPLICATION_JSON)//Pour le retour
	public Response saceConsumeJson( UserDto userDto ) {


		return Response.status(201).entity(userDto).build();
	}

	@PUT
	@Path("/update/{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response updateconsumeJson( UserDto userDto, @PathParam("id") int id ) {

		userDto.setId(id);
		return Response.status(200).entity(userDto).build();
	}

	@POST
	@Path("/savexml")
	@Consumes(MediaType.APPLICATION_XML)
	@Produces(MediaType.APPLICATION_XML)
	public Response saceConsumeXML( UserDto userDto ) {


		return Response.status(201).entity(userDto).build();
	}

	@PUT
	@Path("/updatexml/{id}")
	@Consumes(MediaType.APPLICATION_XML)
	@Produces(MediaType.APPLICATION_XML)
	public Response updateconsumeXML(@PathParam("id") int id, UserDto userDto ) {

		userDto.setId(id);
		return Response.status(201).entity(userDto).build();
	}
	
	@GET
	@Path("/{id}")
    @Produces({"application/json"})
    public Response get(@PathParam("id") int id) {
		
		if (id == 1) {
			UserDto user = new UserDto();
			
			user.setEmail("seck@seck.sn");
			user.setPassword("ngor");
					
	        return Response.ok(user).build();
		} else {
			return Response.status(Response.Status.NOT_FOUND).build();
		}
		
    }

	@GET
	@Path("/get")
	@Produces({ "application/xml" })
	public Response userById(@QueryParam("id") int id) {
		if (id == 1) {
			UserDto user = new UserDto();

			user.setEmail("seck@seck.sn");
			user.setPassword("ngor");

			return Response.ok(user).build();
		} else {
			return Response.status(Response.Status.NOT_FOUND).build();
		}
	}

}