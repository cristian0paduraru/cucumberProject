package Runner;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
import org.springframework.boot.SpringBootConfiguration;


@RunWith(CucumberWithSerenity.class)
@SpringBootConfiguration
@CucumberOptions(
        plugin = {"pretty", "html:target/cucumber-html-report"},
        features = "src/test/resources/features/",
        glue = "steps"
)
public class TestRunner {
}