package com.virgingames.steps;

import com.virgingames.pages.Homepage;
import com.virgingames.pages.OnlineSlotsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class HomePageSteps {
    @Given("I am on Homepage")
    public void iAmOnHomepage() {
        new Homepage().getCurrentUrl();

    }
    @And("I accept cookies")
    public void iAcceptCookies() {
        new Homepage().clickOnAcceptAllCookies();
    }

    @When("I click {string} link")
    public void iClickLink(String option) {
        new Homepage().clickOnHeaderTab(option);
    }

    @Then("I navigate to {string} page")
    public void iNavigateToPage(String text) {
        Assert.assertEquals(new OnlineSlotsPage().verifyOnlineSlotsText(), text);
    }


}
