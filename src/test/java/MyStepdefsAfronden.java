import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyStepdefsAfronden {
    static double answer;
    static int afrondingsWaarde;


    @Given("het eerste getal is <double{int}>, het tweede getal is <int{int}>")
    public void hetEersteGetalIsDoubleHetTweedeGetalIsInt(int arg0, int arg1) {
    }

    @When("wanneer ik het eerste getal wil afronden tot op <int{int}> aantal cijfers na de komma")
    public void wanneerIkHetEersteGetalWilAfrondenTotOpIntAantalCijfersNaDeKomma(int arg0) {
    }

    @Then("zou ik de uitkomst willen hebben <double{int}>")
    public void zouIkDeUitkomstWillenHebbenDouble(int arg0) {
    }
}
