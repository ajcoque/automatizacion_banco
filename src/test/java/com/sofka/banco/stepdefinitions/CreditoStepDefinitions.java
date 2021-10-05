package com.sofka.banco.stepdefinitions;

import com.sofka.banco.credito.Credito;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class CreditoStepDefinitions {

    private Credito credito;
    private String resultado;
    private double cantidadPrestada;

    @Given("^quiero un prestamo de libre inversion$")
    public void quieroUnPrestamoDeLibreInversion() {
        credito = new Credito();
    }

    @When("^(\\d+) es mayor o igual que salario minimo$")
    public void esMayorOIgualQueSalarioMinimo(double salario) {
        resultado = credito.solicitarCredito(salario);
    }

    @Then("^deberia obtener el mensaje de aprobacion \"([^\"]*)\"$")
    public void deberiaObtenerElMensajeDeAprobacion(String mensaje) {
        Assert.assertEquals(mensaje,resultado);
    }

    @When("^(\\d+) es menor que un salario minimo$")
    public void esMenorQueUnSalarioMinimo(int salario) {
        resultado = credito.solicitarCredito(salario);
    }

    @Then("^deberia obtener el mensaje de negacion \"([^\"]*)\"$")
    public void deberiaObtenerElMensajeDeNegacion(String mensaje) {
        Assert.assertEquals(mensaje,resultado);
    }

    @Given("^quiero conocer el valor que se me puede prestar$")
    public void quieroConocerElValorQueSeMePuedePrestar() {
        credito = new Credito();
    }

    @When("^con un salario de (\\d+)$")
    public void conUnSalarioDe(double salario) {
        cantidadPrestada = credito.calcularMontoPrestamo(salario);
    }

    @Then("^el banco deberia prestarme (\\d+)$")
    public void elBancoDeberiaPrestarme(double cantidadPrestadaEsperada) {
        Assert.assertEquals(cantidadPrestadaEsperada,cantidadPrestada,2);
    }


}
