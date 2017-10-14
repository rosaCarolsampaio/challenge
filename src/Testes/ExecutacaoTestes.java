package Testes;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "Funcionalidades",
		glue = "Testes",
		plugin = {
				"html:target/cucumber-html-report",
				"html:target/cucumber-json-report.json"
		}
)

public class ExecutacaoTestes {

}
