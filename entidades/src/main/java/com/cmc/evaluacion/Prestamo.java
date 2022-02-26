package com.cmc.evaluacion;


public class Prestamo {
    private double monto;
    private int meses;
    private double interres;
    private Cuota[] cuotas ;

    public Prestamo(double monto, int meses, double interres) {
        this.monto = monto;
        this.meses = meses;
        this.interres = interres;
        this.cuotas = new Cuota[meses] ;
    }

    @Override
    public String toString() {
        return "PrestamoFrances [interres=" + interres + ", meses=" + meses + ", monto=" + monto + "]";
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public int getMeses() {
        return meses;
    }

    public void setMeses(int meses) {
        this.meses = meses;
    }

    public double getInterres() {
        return interres;
    }

    public void setInterres(double interres) {
        this.interres = interres;
    }

    public Cuota[] getCuotas() {
        return cuotas;
    }


}
