package com.demo.automations.stepsdefinitions;

import com.demo.automation.page.base.BasePage;
import com.demo.automation.page.models.UserData;
import com.demo.automation.page.steps.RegisterHomePageStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.util.List;

public class RegisterDefinitions extends BasePage {


    @Steps
    RegisterHomePageStep registerHomePageStep;


    @Given("^el usuario se encuentra en la página de registro$")
    public void el_usuario_se_encuentra_en_la_página_de_registro() throws Exception {
        registerHomePageStep.openTheBrowser("/register.php");
    }

    @When("^completa el formulario de contacto con:$")
    public void completa_el_formulario_de_contacto_con(List<models.ContactData> data) throws Exception {
        models.ContactData contacto = data.get(0);
        registerHomePageStep.ingresDatosDeContacto(contacto);
    }

    @When("^completa la información postal con:$")
    public void completa_la_información_postal_con(List<models.PostalData> data) {
        models.PostalData postalData = data.get(0);
        registerHomePageStep.ingresDatosPostal(postalData);

    }

    @When("^completa la información del usuario con:$")
    public void completa_la_información_del_usuario_con(List<UserData> data) {
        UserData userData = data.get(0);
        registerHomePageStep.ingresarDatosUsuario(userData);
    }

    @When("presiona el botón Enviar")
    public void presiona_el_botón(){
        registerHomePageStep.enviarDatos();

    }

    @Then("^se muestra un mensaje de confirmación$")
    public void se_muestra_un_mensaje_de_confirmación() {
        registerHomePageStep.validarRegistroExitoso();
    }



}
