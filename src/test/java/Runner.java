import cucumber.api.*;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions (
    features = "src/test/resources/features/pet/CreateAndValidatePet.feature",
    monochrome = true,
    format = {"pretty","json:target/cucumber-report/cucumber.json"},
    // tags = {"@pet"},
    //tags = {"@UpdatePet"},
    //tags = {"@DeletePet"},
    //tags = {"@Createpet,@GetPet,@UpdatePet,@DeletePet"},
    glue = "e2e.steps.pets"
)

public class Runner extends AbstractTestNGCucumberTests {

}
