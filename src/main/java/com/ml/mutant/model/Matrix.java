package com.ml.mutant.model;

import java.util.Date;

public class Matrix {

	private Date matrixDate;
	private boolean isMutant;
	private String matrix;
	
	public Matrix() {
		
	}

	public Matrix(Date matrixDate, boolean isMutant, String matrix) {
		super();
		this.matrixDate = matrixDate;
		this.isMutant = isMutant;
		this.matrix = matrix;
	}

	public Date getMatrixDate() {
		return matrixDate;
	}

	public void setMatrixDate(Date matrixDate) {
		this.matrixDate = matrixDate;
	}

	public boolean isMutant() {
		return isMutant;
	}

	public void setMutant(boolean isMutant) {
		this.isMutant = isMutant;
	}

	public String getMatrix() {
		return matrix;
	}

	public void setMatrix(String matrix) {
		this.matrix = matrix;
	}
}
