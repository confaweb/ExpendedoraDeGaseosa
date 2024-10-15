package ar.edu.unlam.bebida;

import ar.edu.unlam.bebida.interfaces.Bebida;

public abstract class BebidaBase implements Bebida {
	private String nombre;
	private Double precio;

	public BebidaBase(String nombre, Double precio) {
		this.nombre = nombre;
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}
}
