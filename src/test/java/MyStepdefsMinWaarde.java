import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertEquals;

class MinValueOfNumbers{

    static int returnLowestValue(int een, int twee){
        return een > twee ? twee : een;
    }
}

public class MyStepdefsMinWaarde {
    int eersteGetal;
    int tweedeGetal;
    int uitkomst;

    @Given("het eerste getal is <int{int}>")
    public void hetEersteGetalIsInt(int arg0) {
        this.eersteGetal = arg0;
    }

    @When("het tweede getal is <int{int}>")
    public void hetTweedeGetalIsInt(int arg0) {
        this.tweedeGetal = arg0;
    }

    @Then("zou ik het laagste getal terug willen krijgen <int{int}>")
    public void zouIkHetLaagsteGetalTerugWillenKrijgenInt(int verwachtAntwoord) {
        assertEquals((Object) verwachtAntwoord, uitkomst);
    }
}
