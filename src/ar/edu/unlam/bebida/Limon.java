package ar.edu.unlam.bebida;

public class Limon extends BebidaBase {

	public Limon(String nombre, Double precio) {
		super(nombre, precio);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Boolean dispensar() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public Double obtenerPrecio() {
		// TODO Auto-generated method stub
		return this.getPrecio();
	}

}
