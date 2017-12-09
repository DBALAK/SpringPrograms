package com.bala.controllers;

import java.util.Arrays;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.bala.Alien;

@Path("/aliens")
public class AlienResource {

	@GET
	@Produces(MediaType.APPLICATION_XML)
	public Alien getAlien(){
		System.out.println("get alein called");
		Alien a1=new Alien();
		a1.setId(1);
		a1.setName("bala");
		a1.setPoints(100);
		return a1;
	}
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	@Path("/getAliens")
	public List<Alien> getAliens(){
		Alien a1=new Alien();
		a1.setId(1);
		a1.setName("shu");
		a1.setPoints(20);
		
		Alien a2=new Alien();
		a2.setId(2);
		a2.setName("krishna");
		a2.setPoints(90);
		List<Alien> lst= Arrays.asList(a1,a2);
		return lst;
	}
}
