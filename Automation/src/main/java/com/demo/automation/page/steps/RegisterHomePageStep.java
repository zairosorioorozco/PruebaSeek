package com.demo.automation.page.steps;

import com.demo.automation.page.models.UserData;
import com.demo.automation.page.pageobjet.RegisterHomePage;
import com.demo.automation.page.base.BasePage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;



public class RegisterHomePageStep extends BasePage {

    @Steps
    RegisterHomePage registerHomePage;


    @Step
    public void openTheBrowser(String path) throws InterruptedException {
        configuracionesIniciales();
        abrirNavegadorEn(path);

    }

    @Step
    public void ingresDatosDeContacto(models.ContactData data) {
        escribirTexto(registerHomePage.campo_firstName, data.getNombre());
        escribirTexto(registerHomePage.campo_lastName, data.getApellido());
        escribirTexto(registerHomePage.campo_phone, data.getTelefono());
        escribirTexto(registerHomePage.campo_userName, data.getCorreoElectronico());
    }

    @Step
    public void ingresDatosPostal(models.PostalData data) {
        escribirTexto(registerHomePage.campo_address1, data.getDireccion());
        escribirTexto(registerHomePage.campo_city, data.getCiudad());
        escribirTexto(registerHomePage.campo_state, data.getEstado());
        escribirTexto(registerHomePage.campo_postalCode, data.getCodigoPostal());
        seleccionarEnListadoPorValor(registerHomePage.select_country, data.getPais());
    }

    @Step
    public void ingresarDatosUsuario(UserData data) {
        escribirTexto(registerHomePage.campo_email, data.getUsername());
        escribirTexto(registerHomePage.campo_password, data.getPassword());
        escribirTexto(registerHomePage.campo_confirmPassword, data.getConfirmPassword());
    }

    @Step
    public void enviarDatos() {
        click(registerHomePage.btn_submit);
    }

    @Step
    public void validarRegistroExitoso(){
        validarDisponibilidadDelObjeto(registerHomePage.msjConfirmacion);
    }



}
