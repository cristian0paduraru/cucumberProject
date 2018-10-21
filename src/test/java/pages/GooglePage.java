package pages;

import Config.Properties;
import commons.AbstractSupport;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.*;

import static org.testng.Assert.assertTrue;


/**
 * Created by Xristi on 9/20/2018.
 */
public class GooglePage extends AbstractSupport{

    private static String googleUrl = "https://www.google.com";

    @Autowired
    private Properties properties;

    @FindBy(xpath = "//input[@id='lst-ib']")
    private WebElement searchField;

    @FindBy(css = "[name='btnK']")
    private WebElement searchButton;

    @FindBy(xpath = "//h3[contains(text(),'')]")
    private List<WebElement> searchResults;



    public void openGooglePage() {
        doOpen(googleUrl);
    }

    public void insertSearchTerm(String term) {
        searchField.sendKeys(term);
        searchField.sendKeys(Keys.TAB);
    }

    public void clickSearchButton() {
        try {
            searchButton.click();
            //wait(1000);
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public Integer getSearchResults(){
        /*
        List<String> findElements =new ArrayList();
        for (WebElement webElement : searchResults)
        {
            findElements.add(webElement.getText());
            System.out.println(webElement.getText());
        }*/
        return searchResults.size();
    }
}
