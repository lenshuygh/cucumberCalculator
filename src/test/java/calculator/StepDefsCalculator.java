package calculator;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertEquals;

class Delen {
    static int answer(int een, int twee) {
        return een / twee;
    }


public class StepDefsCalculator {
    int getalEen;
    int getalTwee;
    double uitkomst;

    @Given("het eerste getal is {int}, het tweede getal is {int}")
    public void het_eerste_getal_is_het_tweede_getal_is(Integer int1, Integer int2) {
        this.getalEen = int1;
        this.getalTwee = int2;
    }

    @When("wanneer ik het eerste getal wil delen door het tweede")
    public void wanneer_ik_het_eerste_getal() {
        uitkomst = Delen.answer(getalEen, getalTwee);
    }

    @Then("zou ik de uitkomst willen hebben {int}")
    public void zouIkDeUitkomstWillenHebbenInt(double verwachtAntwoord) {
        assertEquals((Object) verwachtAntwoord, uitkomst);
    }
}
}
