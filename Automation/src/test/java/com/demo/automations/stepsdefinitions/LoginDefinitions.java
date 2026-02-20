package com.demo.automations.stepsdefinitions;

import com.demo.automation.page.base.BasePage;
import com.demo.automation.page.models.UserData;
import com.demo.automation.page.steps.LoginHomePageStep;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.util.List;

public class LoginDefinitions extends BasePage {


    @Steps
    LoginHomePageStep loginHomePageStep;

    @Given("^el usuario se encuentra en la página de login$")
    public void elUsuarioSeEncuentraEnLaPáginaDeLogin() throws InterruptedException {
        loginHomePageStep.openTheBrowser("/login.php");

    }

    @When("^ingresa el username y password válidos$")
    public void ingresaElUsernameYPasswordVálidos(List<UserData> data) {
        UserData loginData = data.get(0);
        loginHomePageStep.ingresDatosLogin(loginData);

    }


    @And("^presiona el botón Submit$")
    public void presionaElBotónSubmit() {
        loginHomePageStep.clickSubmit();
    }

    @Then("^el usuario ingresa correctamente al sistema$")
    public void elUsuarioIngresaCorrectamenteAlSistema() {
        loginHomePageStep.validarRegistroExitoso();
    }
}
