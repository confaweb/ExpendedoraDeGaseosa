package ar.edu.unlam.bebida;

public class Cola extends BebidaBase {

	public Cola(String nombre, Double precio) {
		super(nombre,precio);
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
