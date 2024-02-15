package runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = {"stepDef"}, //dimana step definition disimpan
        features = {"src/test/java/features"}, //dimana feature file disimpan
        plugin = {"pretty", "html:reports/cucumber-report.html", "json:reports/cucumber.json"},
        //menambahkan informasi mengenai step yg dieksekusi,
        tags = "@WEB or @API"
        ,
        monochrome = true
)
public class Runner {
}
