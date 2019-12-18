package calculator;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertEquals;

public class absoluteWaarde {
    static int waarde;
    static int absWaarde;

    @Given("entry is <number>")
    public void entryIsNumber(int waarde) {
        this.waarde = waarde;
    }

    @When("I ask the absolute value")
    public void iAskTheAbsoluteValue() {
        absWaarde = absoluut(waarde);
    }

    @Then("I should get the <absoluteNumber>")
    public void iShouldGetTheAbsoluteNumber(int absoluteNumber) {
        assertEquals(absoluteNumber,absWaarde);
    }

    private int absoluut(int waarde) {
        if (waarde < 0 ){
            waarde *= -1;
        }
        return waarde;
    }
}
