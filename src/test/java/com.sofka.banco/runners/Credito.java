package com.sofka.banco.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = {"src/test/resources/features/solicitar_credito.feature"},
        glue = {"com.sofka.banco.stepdefinitions"},
        snippets = SnippetType.CAMELCASE)
public class Credito {
}
