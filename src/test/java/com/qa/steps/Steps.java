package com.qa.steps;

import com.qa.pageobjectmodel.*;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Steps {


    @When("I click the {string} tab")
    public void iClickTheTab(String arg0) {
        switch (arg0) {
            case "dashboard":
                new LandingPage().getDashboardPage();
                break;
            case "settings":
                new LandingPage().getSettingsPage();
                break;
            default:
                throw new PendingException();
        }
    }

    @Then("I see the {string} page")
    public void iSeeThePage(String page_selection) {
        switch (page_selection) {
            case "dashboard":
                Assert.assertTrue(new Dashboard().isCurrentPage());
                break;
            case "settings":
                Assert.assertTrue(new Settings().getBitcoinFilter().isDisplayed());
                break;
            default:
                throw new PendingException();
        }
    }


    @And("I click {string}")
    public void iClick(String button_selection) {
        switch (button_selection) {
            case "Get the ultimate answer":
                new UserMenu().getUltimateAnswerButton().click();
                break;
            default:
                throw new PendingException();
        }
    }

    @Then("^I see the answer (\\d+)$")
    public void iSeeTheAnswer(int answer) {
        int currentValue = Integer.parseInt(new WidgetView().getAnswerValue().getText());
        assert currentValue == answer;
    }

}