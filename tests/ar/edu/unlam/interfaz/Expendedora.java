package ar.edu.unlam.interfaz;

import java.util.ArrayList;

import ar.edu.unlam.bebida.BebidaBase;
import ar.edu.unlam.bebida.Cola;
import ar.edu.unlam.bebida.Limon;
import ar.edu.unlam.bebida.Naranja;

public class Expendedora {
	static ArrayList<BebidaBase> stock = new ArrayList<>();

	public static void main(String[] args) {
		BebidaBase limonada = new Limon("limonada", 1000.0);
		BebidaBase fanta = new Naranja("fanata", 1500.0);
		BebidaBase coca = new Cola("Coca", 2000.0);

		agregarStockBebidas(coca);
		agregarStockBebidas(limonada);
		agregarStockBebidas(fanta);
		
		
		

	}

	

	private static Boolean agregarStockBebidas(BebidaBase bebida) {
		Boolean bebidaAgregada = false;
		bebidaAgregada = stock.add(bebida);
		return bebidaAgregada;
		// TODO Auto-generated method stub

	}

}
