package commons;

import net.serenitybdd.core.pages.PageObject;

/**
 * Created by Xristi on 9/20/2018.
 */
public class AbstractSupport extends PageObject{

    public void doOpen(String url)
    {
        getDriver().navigate().to(url);
    }
}
