package com.gatitos;

public class Gato {
	//atributos
	private String nombre;
	private int patas;
	private boolean adoptado;
	
	//constructor
	
	
	//getters y setters
	//deben ser public
	
	public String getNombre() {
		return this.nombre;
	}

	

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPatas() {
		return this.patas;
	}

	public void setPatas(int patas) {
		if(patas >= 0 && patas <= 4) {
			this.patas = patas;
		} else {
			throw new IllegalArgumentException("No es un número válido para patas de gatos");
		}
		
		
	}
	
	public boolean isAdoptado() {//en el caso de boolean no se escribe get, sino "is", porque se hace una pregunta
		return this.adoptado;
	}
	
	public void setAdoptado(boolean adoptado) {
		this.adoptado = adoptado;
	}
	
	
	//Método toString()
	@Override
	public String toString() {
		return "Gato [nombre=" + nombre + ", patas=" + patas + ", adoptado=" + adoptado + "]";
	}

	
	
	
	
}
