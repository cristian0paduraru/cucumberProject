package pages;

import Config.Properties;
import commons.AbstractSupport;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Xristi on 9/20/2018.
 */
public class GooglePage extends AbstractSupport {

    private static String googleUrl = "https://www.google.com";

    @Autowired
    private Properties properties;

    @FindBy(css = ".sbib_b #lst-ib")
    private WebElement searchField;

    @FindBy(css = "[name=\"btnK\"]")
    private WebElement searchButton;

    public void openGooglePage() {
        doOpen(googleUrl);
    }

    public void insertSearchTerm() {

    }

    public void clickSearchButton() {
        try {
            wait(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
