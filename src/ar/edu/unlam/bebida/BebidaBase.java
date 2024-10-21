package ar.edu.unlam.bebida;

import ar.edu.unlam.bebida.interfaces.Bebida;

public abstract class BebidaBase implements Bebida {
	private String nombre;
	private Double precio;
	protected Integer stock;

	public BebidaBase(String nombre, Double precio) {
		this.nombre = nombre;
		this.precio = precio;
		this.stock=stock;
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
	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

	public Boolean dispensar() {
		Boolean bebidaDispensada=false;
		if(this.stock>0) {
			System.out.println("bebida seleccionada:"+this.getNombre()+"Precio: "+ this.getPrecio());
			stock--;
			bebidaDispensada=true;
		}
		return bebidaDispensada;
	}
	public  Double obtenerPrecio() {
		return this.getPrecio();
	}

	public void sumarStock() {
		Integer nuevoStock=this.getStock()+1;
		this.setStock(nuevoStock);
	}
}
