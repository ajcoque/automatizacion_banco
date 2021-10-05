package com.sofka.banco.credito;

public class Credito {

    private double salarioMinimo = 908526;

    public String solicitarCredito(double salario){
        if(salario>=salarioMinimo){
            return "Es apto para solicitar el prestamo";
        }
        return "NO es apto para solicitar el prestamo";
    }

    public double calcularMontoPrestamo(double salario){
        //Para el caso de que el banco preste 1 millon por cada 50mil
        return (salario/50000)*1000000;
    }

}
