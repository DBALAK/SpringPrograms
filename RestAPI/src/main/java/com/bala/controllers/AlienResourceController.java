package com.bala.controllers;

import java.util.List;

import javax.websocket.server.PathParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.bala.Alien;
import com.bala.repository.AlienRepository;

@Path("/alien")
public class AlienResourceController {
	
	AlienRepository repo;
	
	public AlienResourceController(){
	  repo=	new AlienRepository();
	}

	@GET
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	@Path("/getAliens")
	public List<Alien> getAliens(){
		return repo.getAliens();
	}
	
	@GET
	@Path("/get/{id}")
	@Produces(MediaType.APPLICATION_XML)
	public Alien getAlien(@PathParam("id")  int id){
		System.out.println("get Al called");
		return repo.getAlien(id);
	}
	
	
	@POST
	@Path("/alien")
	@Produces(MediaType.APPLICATION_XML)
	public Alien createAlien(Alien a1){
		System.out.println(a1);
		
		 repo.createAlien(a1);
		 return a1;
		
	}
	
}
