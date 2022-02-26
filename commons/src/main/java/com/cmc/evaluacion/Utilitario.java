package com.cmc.evaluacion;

public class Utilitario {
    public static void main(String[] arg) {

        // Cuota cuota = new Cuota(1);
        // cuota.setCuota(444.24);
        // cuota.setCapitalInicio(5000);
        // cuota.setInteres(50);
        // cuota.setAbonoCapital(394.552);
        // cuota.setSaldo(468.754);
        // System.out.println(cuota);
        Prestamo prestamo = new Prestamo(500000, 15, 15);
        CalculadoraAmortizacion.generarTabla(prestamo);
    }
}
