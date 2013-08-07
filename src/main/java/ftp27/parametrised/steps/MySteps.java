package ftp27.parametrised.steps;

import ftp27.parametrised.Temps;
import org.jbehave.core.annotations.*;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class MySteps {

    private String status;
    private Temps temps;

    @Given("a patient is <patient>")
    public void givenAStockOfpatient(@Named("patient") int patient) {
        temps = new Temps(patient);
    }

    @When("patient temperature is <temperature>")
    public void whenTheStockIsTradedAttemperature(@Named("temperature") Double temperature) {
        status = temps.checkOutTemp(temperature);
    }

    @Then("temperature is <result>")
    public void thenTheAlertStatusShouldBeresult(@Named("result") String stat) {
        assertEquals(stat, status);
    }





}
