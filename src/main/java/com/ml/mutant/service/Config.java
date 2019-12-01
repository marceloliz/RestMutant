package com.ml.mutant.service;

import org.glassfish.jersey.server.ResourceConfig;

public class Config extends ResourceConfig {
	
	public Config() {
        packages("com.ml.mutant.service");
	}

}
