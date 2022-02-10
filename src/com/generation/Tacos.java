package com.generation;

public class Tacos {
	
	private String tipoDeTortilla;
	private String tipoDeGuisado;
	private int numeroDeTortilla;
	private String tamanioDeTortilla;
	private float precio = 0.0f;
	
	/*public Tacos(String tipoDeTortilla) {
		this.tipoDeTortilla = tipoDeTortilla;
	}*/
	
	
	//getters y setters
	
	public String getTipoDeTortilla() {
		return this.tipoDeTortilla;
	}

	public void setTipoDeTortilla(String tipoDeTortilla) {
		this.tipoDeTortilla = tipoDeTortilla;
	}

	public String getTipoDeGuisado() {
		return this.tipoDeGuisado;
	}


	public void setTipoDeGuisado(String tipoDeGuisado) {
		this.tipoDeGuisado = tipoDeGuisado;
	}


	public int getNumeroDeTortilla() {
		return this.numeroDeTortilla;
	}

	public void setNumeroDeTortilla(int numeroDeTortilla) {
		if(numeroDeTortilla >= 0) {
			this.numeroDeTortilla = numeroDeTortilla;
		} else {
			throw new IllegalArgumentException("Se necesitan tortillas");
		}
	}


	public String getTamanioDeTortilla() {
		return this.tamanioDeTortilla;
	}

	public void setTamanioDeTortilla(String tamanioDeTortilla) {
		this.tamanioDeTortilla = tamanioDeTortilla;
	}

	
	public float getPrecio() {
		return this.precio;
	}

	public void setPrecio(float precio) {
		if(precio > 0 && precio < 40) {
			this.precio = precio;
		} else {
			throw new IllegalArgumentException("No es un precio válido");
		}
	}


	@Override
	public String toString() {
		return "Tacos [tipoDeTortilla=" + tipoDeTortilla + ", tipoDeGuisado=" + tipoDeGuisado + ", numeroDeTortilla="
				+ numeroDeTortilla + ", tamanioDeTortilla=" + tamanioDeTortilla + ", precio=" + precio + "]";
	}

	

/*

	//El constructor nos ayuda a inicializar objetos
	public Tacos(String tipoDeTortilla,
			String tipoDeGuisado,
			int numeroDeTortilla,
			String tamanioDeTortilla,
			float precio) {
		
		this.tipoDeTortilla = tipoDeTortilla;
		this.tipoDeGuisado = tipoDeGuisado;
		this.numeroDeTortilla = numeroDeTortilla;
		this.tamanioDeTortilla = tamanioDeTortilla;
		this.precio = precio;
	}
	
	
	
	
	void preparar() {
		System.out.println("Peparando tu rico taco");
	}
	
	void vender() {
		System.out.println("Taco vendido");
	}
	
	void ponerSalsa() {
		System.out.println("Agregando salsa de la que no pica");
	}
	
	void subirPrecio(float aumento) {
		precio = precio + aumento;
		
	}

	@Override
	public String toString() {
		return "Tacos [tipoDeTortilla=" + tipoDeTortilla + ", tipoDeGuisado=" + tipoDeGuisado + ", numeroDeTortilla="
				+ numeroDeTortilla + ", tamanioDeTortilla=" + tamanioDeTortilla + ", precio=" + precio + "]";
	}
*/
}

	
	
	

