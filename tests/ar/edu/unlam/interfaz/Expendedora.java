package ar.edu.unlam.interfaz;

import java.util.ArrayList;
import java.util.Scanner;

import ar.edu.unlam.bebida.BebidaBase;
import ar.edu.unlam.bebida.Cola;
import ar.edu.unlam.bebida.Limon;
import ar.edu.unlam.bebida.Naranja;
import ar.edu.unlam.bebida.interfaces.*;

public class Expendedora {
	static ArrayList<Bebida> stock = new ArrayList<>();

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		Bebida limonada = new Limon("limonada", 1000.0);
		Bebida fanta = new Naranja("fanta", 1500.0);
		Bebida coca = new Cola("Coca", 2000.0);

		((BebidaBase) coca).setStock(1);
		agregarBebidasAlListado((BebidaBase) coca);
		coca.sumarStock();
		coca.sumarStock();
		((BebidaBase) limonada).setStock(1);
		agregarBebidasAlListado((BebidaBase) limonada);
		limonada.sumarStock();
		limonada.sumarStock();
		((BebidaBase) fanta).setStock(1);
		agregarBebidasAlListado((BebidaBase) fanta);
		fanta.sumarStock();
		fanta.sumarStock();
		Integer opcion = -1;

		while (opcion != 0) {
			System.out.println("Seleccione una bebida: \n 1-Coca\n 2-Limonada \n 3 fanta \n 0-Salir del Sistema");
			opcion = teclado.nextInt();
			switch (opcion) {
			case 1:
				if (stock.contains(coca) && ((BebidaBase) coca).getStock() > 0) {
					coca.dispensar();
				}

				else {
					System.out.println("\n***Bebida no disponible***");
				}

				break;
			case 2:
				if (stock.contains(limonada) && limonada.getStock() > 0)
					limonada.dispensar();
				else
					System.out.println("Bebida no disponible");

				break;
			case 3:
				if (stock.contains(fanta) && fanta.getStock() > 0)
					fanta.dispensar();
				else
					System.out.println("Bebida no disponible");

				break;
			case 0:
				System.out.println("Adios!");
				break;

			default:
				System.out.println("Opcion incorrecta.Vuelva a ingresar la opcion deseada");
				break;
			}
		}

	}

	private static void QuitarBebidasDelListado(BebidaBase coca) {
		if (stock.contains(coca))
			stock.remove(coca);

	}

	private static Boolean agregarBebidasAlListado(BebidaBase bebida) {
		Boolean bebidaAgregada = false;
		bebidaAgregada = stock.add(bebida);
		return bebidaAgregada;
		// TODO Auto-generated method stub

	}

}
