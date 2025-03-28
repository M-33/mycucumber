package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
                 plugin = {"html:target\\default-cucumber-reports.html",
                 "json:target\\json-reports/cucumber.json",
                 "junit:target\\tml-report/cucumber.xml"},

                 features = "src/test/resources/features",
                 glue = "stepdefinitions",
                 dryRun = false,
                 tags="@data"
)


public class Runner {
}
