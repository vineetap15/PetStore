import cucumber.api.*;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions (
    features = "src/test/resources/features",
    monochrome = true,
    format = {"pretty","json:target/cucumber-report/cucumber.json"},
    tags = {"@UpdatePet"},
    glue = "ApiTests.Steps"
)

public class Runner extends AbstractTestNGCucumberTests {

}
