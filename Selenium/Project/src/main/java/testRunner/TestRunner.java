package testRunner;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/features",
    glue={"stepDefinition"},
    plugin = { "pretty", "html:target/cucumber-reports/reports" },
    tags = "@JOB"
)

public class TestRunner {

}