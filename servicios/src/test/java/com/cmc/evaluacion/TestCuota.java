package com.cmc.evaluacion;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class TestCuota {
	@Test
	public void testPrestamo1() {
		double cuotaEsperada=444.24;
		
		Prestamo p=new Prestamo(5000,12,12);
		double cuota=CalculadoraAmortizacion.calcularCuota(p);
		//redondear a 2 decimales
		cuota=Math.round(cuota*100.0)/100.0;
		
		System.out.println(cuota);
		
		assertEquals(cuota,cuotaEsperada,0.01);
	}
	
	@Test
	public void testPrestamo2() {
		double cuotaEsperada=242.43;
		
		Prestamo p=new Prestamo(5000,15,24);
		double cuota=CalculadoraAmortizacion.calcularCuota(p);
		//redondear a 2 decimales
		cuota=Math.round(cuota*100.0)/100.0;
		
		System.out.println(cuota);
		
		assertEquals(cuota,cuotaEsperada,0.01);
	}
}
