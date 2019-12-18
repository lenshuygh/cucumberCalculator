package calculator;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertEquals;

public class SumOfNumbers {

    static int answer(int one, int two) {
        return one + two;
    }

    public class MyStepdefs {
        Integer number1;
        Integer number2;
        Integer sum;

        @Given("one number {int} and a second number {int}")
        public void one_number_and_a_second_number(Integer number1, Integer number2) {
            this.number1 = number1;
            this.number2 = number2;
        }

        @When("I ask for the sum")
        public void i_ask_for_the_sum() {
            sum = SumOfNumbers.answer(number1,number2);
        }


        @Then("I should be told the sum {int} of the two numbers")
        public void i_should_be_told_the_sum_of_the_two_numbers(Integer expectedSum) {
            assertEquals(expectedSum, sum);
        }

    }



}
