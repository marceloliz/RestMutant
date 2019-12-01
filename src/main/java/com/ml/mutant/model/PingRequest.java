package com.ml.mutant.model;

public class PingRequest {

	private String name;
	private String city;
	private boolean isAlive;
	private String message;
	
	public PingRequest() {
		
	}

	public PingRequest(String name, String city, boolean isAlive, String message) {
		super();
		this.name = name;
		this.city = city;
		this.isAlive = isAlive;
		this.message = message;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public boolean getAlive() {
		return isAlive;
	}

	public void setAlive(boolean isAlive) {
		this.isAlive = isAlive;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
