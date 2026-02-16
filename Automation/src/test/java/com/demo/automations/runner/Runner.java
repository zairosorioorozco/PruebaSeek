package com.demo.automations.runner;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/RegistrarUsuario.feature",
        glue = "com.demo.automations.stepsdefinitions",
        plugin = {
                "pretty",
                "json:build/reports/cucumber/cucumber.json",
                "html:build/reports/cucumber/html-report"
        },
        tags = ""
)
public class Runner {
}
