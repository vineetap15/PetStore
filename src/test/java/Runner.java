import cucumber.api.*;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions (
    features = "src/test/resources/features",
    monochrome = true,
    format = {"pretty","json:target/cucumber-report/cucumber.json"},
    //tags = {"@GetPet"},
    //tags = {"@UpdatePet"},
    //tags = {"@DeletePet"},
    tags = {"@pet,@GetPet,@UpdatePet,@DeletePet"},
    glue = "ApiTests.steps.pets"
)

public class Runner extends AbstractTestNGCucumberTests {

}
