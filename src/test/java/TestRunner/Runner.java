package TestRunner;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Lenovo T460s\\git\\reg_page_test\\EtherscanRegNewAcc\\src\\test\\resources\\Features\\createAccount.feature",glue = {"StepDefinition"})
public class Runner {
}
