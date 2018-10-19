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

    @When("^\"([^\"]*)\" is inserted$")
    public void wordIsInserted(String word) throws Throwable {
        googlePage.insertSearchTerm(word);
    }

    @When("^click on search button$")
    public void clickSearchButton() throws Throwable {
        googlePage.clickSearchButton();
    }


    @Then("^search results are returned$")
    public void searchResultsAreReturned(String word) throws Throwable {
        googlePage.getSearchResults(word);
    }
}
