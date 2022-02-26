package com.cmc.evaluacion;

public class Cuota {
    private int numero;
    private double cuota;
    private double capitalInicio;
    private double interes;
    private double abonoCapital;
    private double saldo;

    public Cuota(int numero) {
        this.numero = numero;
    }

  

    @Override
    public String toString() {
        return "Cuota [abonoCapital=" + abonoCapital + ", capitalInicio=" + capitalInicio + ", cuota=" + cuota
                + ", interes=" + interes + ", numero=" + numero + ", saldo=" + saldo + "]";
    }



    public double getCuota() {
        return cuota;
    }

    public void setCuota(double cuota) {
        this.cuota = cuota;
    }

    public double getCapitalInicio() {
        return capitalInicio;
    }

    public void setCapitalInicio(double capitalInicio) {
        this.capitalInicio = capitalInicio;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public double getAbonoCapital() {
        return abonoCapital;
    }

    public void setAbonoCapital(double abonoCapital) {
        this.abonoCapital = abonoCapital;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}
