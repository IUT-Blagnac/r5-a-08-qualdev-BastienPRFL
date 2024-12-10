package hellocucumber;

import io.cucumber.java.en.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions.*;

public class StepDefinitions {

    String result;
    String day;

    @Given("today is Sunday")
    public void today_is_sunday() {
        day = "sunday";
    }

    @Given("today is Friday")
    public void today_is_friday() {
        day = "friday";
    }

    @When("I ask whether it's Friday yet")
    public void i_ask_whether_it_s_friday_yet() {
        result = IsItFriday.isItFriday(day);
    }

    @Then("I should be told {string}")
    public void i_should_be_told(String string) {
        assertEquals(string, result);
    }



    @Given("an example scenario")
    public void anExampleScenario() {
    }

    @When("all step definitions are implemented")
    public void allStepDefinitionsAreImplemented() {
    }

    @Then("the scenario passes")
    public void theScenarioPasses() {
    }

}

class IsItFriday {
    
    static String isItFriday(String today) {
        return "friday".equals(today) ? "TGIF" : "Nope";
    }
}
