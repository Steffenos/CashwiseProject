import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {" html:target/cucumberReport.html","json:target/testReport.json"},
        features = "src\\test\\java\\resources\\features",
        glue = {"src\\test\\java\\step_definitions"},
        tags = ""
        //monochrome = true

)
public class CucumberRunner {
}

