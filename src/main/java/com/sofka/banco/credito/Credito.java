package com.sofka.banco.credito;

public class Credito {
    private double salarioMinimo = 908526;
    public String solicitarCredito(double salario){
        if(salario>=salarioMinimo){
            return "Es apto para solicitar el prestamo";
        }
        return "NO es apto para solicitar el prestamo";
    }
}
