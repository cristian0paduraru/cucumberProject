package pages;

import Config.Properties;
import commons.AbstractSupport;
import org.jetbrains.annotations.NotNull;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.*;

/**
 * Created by Xristi on 9/20/2018.
 */
public class GooglePage extends AbstractSupport {

    private static String googleUrl = "https://www.google.com";

    @Autowired
    private Properties properties;

    @FindBy(xpath = "//input[@id='lst-ib']")
    private WebElement searchField;

    @FindBy(css = "[name=\"btnK\"]")
    private WebElement searchButton;

    @FindBy(xpath = "//h3[contains(text(),'Microsoft Word')]")
    private List<WebElement> searchResults;

    public void openGooglePage() {
        doOpen(googleUrl);
    }

    public void insertSearchTerm(String terms) {
        searchField.sendKeys(terms);
        searchField.sendKeys(Keys.TAB);
    }

    public void clickSearchButton() {
        try {
            searchButton.click();
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public  void getSearchResults(String searchResult){


        String element = null;
        List list = new ArrayList();
        list.add(element);

    }

}
