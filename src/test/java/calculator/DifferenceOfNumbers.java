package calculator;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertEquals;

public class DifferenceOfNumbers {


    static int answer(int one, int two) {
        return one - two;
    }

    public class MyStepdefs {
        Integer number1;
        Integer number2;
        Integer difference;

        @Given("one number {int} and a second number {int}")
        public void one_number_and_a_second_number(Integer number1, Integer number2) {
            this.number1 = number1;
            this.number2 = number2;
        }

        @When("I ask for the difference")
        public void i_ask_for_the_difference() {
            difference = SumOfNumbers.answer(number1, number2);
        }


        @Then("I should be told the difference {int} of the two numbers")
        public void i_should_be_told_the_difference_of_the_two_numbers(Integer expectedDifference) {
            assertEquals(expectedDifference, difference);
        }
    }
}
