package classwork.day16;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "summary"},
        glue = {"/classwork/day16"},
        features = {"src/test/resources/features/test.feature"},
        tags = "@QA"
)
public class BookingRunner {

}
