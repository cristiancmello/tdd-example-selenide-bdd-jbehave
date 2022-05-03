import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;
import static org.assertj.core.api.Assertions.*;

public class WebSteps {
    @Given("I go to Wikipedia homepage")
    public void goWikipPage() {
        open("http://en.wikipedia.org/wiki/Main_Page");
    }

    @When("I enter the value $value on a field named $fieldName")
    public void enterValueOnFieldByName(String value, String fieldName) {
        $(By.name(fieldName)).setValue(value);
    }

    @When("I click the button $buttonName")
    public void clickButtonByName(String buttonName) {
        $(By.name(buttonName)).click();
    }

    @Then("the page title contains $title")
    public void pageTitleIs(String title) {
        assertThat(title()).contains(title);
    }
}
