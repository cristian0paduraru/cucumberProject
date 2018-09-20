package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.GooglePage;

/**
 * Created by Xristi on 9/20/2018.
 */
public class GoogleSteps {

    private GooglePage googlePage;

    @Given("^the google page is opened$")
    public void openGoogle() throws Throwable {
        googlePage.openGooglePage();
    }

    @When("^word is inserted$")
    public void wordIsInserted() throws Throwable {
        googlePage.insertSearchTerm();
    }

    @Then("^search results are returned$")
    public void searchResultsAreReturned() throws Throwable {

    }
}