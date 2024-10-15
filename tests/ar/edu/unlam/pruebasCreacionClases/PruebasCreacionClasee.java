package ar.edu.unlam.pruebasCreacionClases;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import ar.edu.unlam.bebida.BebidaBase;
import ar.edu.unlam.bebida.Cola;
import ar.edu.unlam.bebida.Limon;
import ar.edu.unlam.bebida.Naranja;
import ar.edu.unlam.interfaz.Expendedora;

public class PruebasCreacionClasee{

	@Test //#1
	public void QueUnaUnaBebidaBasePuedaSerDispensada() {
		//ENTRADA 
		String  nombre="Coca";
		Double precio=2000.00;
		
		//PROCESO
		BebidaBase coca=new Cola(nombre, precio);
		
		//SALIDA
		assertTrue(coca.dispensar());
	}
	@Test //#2
	public void QueUnaUnaLimonadaPuedaMostrarSuPrecio() {
		//ENTRADA 
		String  nombre="Limon";
		Double precio=1800.00;
		
		//PROCESO
		BebidaBase limonada=new Limon(nombre, precio);
		
		//SALIDA
		Double vo=limonada.obtenerPrecio();
		Double ve=1800.0;
		assertEquals(ve,vo,.01);
	}
	@Test //#3
	public void QueUnaUnaNaranjaTengaUnNombreDistintoAUNaLimonada() {
		//ENTRADA 
		String  nombre="limonada",nombreNaranja="fanta";
		Double precio=1800.00,precio2=precio*1.10;
		
		//PROCESO
		BebidaBase limonada=new Limon(nombre, precio);
		BebidaBase fanta=new Naranja(nombreNaranja, precio2);
		
		//SALIDA
		String vo=limonada.getNombre();
		String ve=nombre;
		assertEquals(ve,vo);
		String vo1=fanta.getNombre();
		String ve1=nombreNaranja;
		assertEquals(ve1,vo1);
	}
	
}
