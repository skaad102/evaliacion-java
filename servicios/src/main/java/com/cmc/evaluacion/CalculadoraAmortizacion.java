package com.cmc.evaluacion;

public class CalculadoraAmortizacion {
    public static double calcularCuota(Prestamo prestamo) {
        if (prestamo != null) {

            double porciento = 0.01;
            /* double porciento = prestamo.getInterres()/100; */
            double valor = prestamo.getMonto();
            double meses = prestamo.getMeses();
            double tendecia = (1 - Math.pow((1 + porciento), -meses));
            double cuota = (valor * porciento) / tendecia;
            // System.out.println(meses);
            // System.out.println(valor);
            // System.out.println(porciento);
            // System.out.println(cuota + "aqui");

            return cuota;
        }
        return 0;
    }

    public static void generarTabla(Prestamo prestamo) {

        /*
         * Prestamo prestamo = new Prestamo(500, 15, 15);
         * CalculadoraAmortizacion.generarTabla(prestamo);
         */
        double valorCuota = calcularCuota(prestamo);
        double valorInicial = prestamo.getMonto();
        for (int i = 0; i <= prestamo.getMeses(); i++) {
            Cuota cuota = null;
            if (i == 0) {
                cuota = new Cuota(i);
                cuota.setCapitalInicio(prestamo.getMonto());
                System.out.println(cuota);

            } else {
                cuota = new Cuota(i);
                System.out.println(prestamo.getCuotas());
                double ci = 50000;
                double interes = ci * 0.01;
                double cp = valorCuota - interes;
                double saldo = ci - cp;

                cuota.setCapitalInicio(ci);
                cuota.setInteres(interes);
                cuota.setAbonoCapital(cp);
                cuota.setSaldo(saldo);
                cuota.setCuota(valorCuota);

                System.out.println(cuota);

            }

            // cuota.setCapitalInicio(5000);
            // cuota.setInteres(50);
            // cuota.setAbonoCapital(394.552);
            // cuota.setSaldo(468.754);
            // System.out.println(cuota);
            // System.out.println(i);
        }
    }
}
