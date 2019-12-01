package com.ml.mutant.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.ml.mutant.model.PingRequest;

@Path("/mutant")
public class MutantService {
	@POST
	@Path("/ping")
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public PingRequest ping(PingRequest pingRequest) {
		pingRequest.setAlive(true);
		pingRequest.setMessage("Hola " + pingRequest.getName() + " de " + pingRequest.getCity());
		return pingRequest;
	}

}
