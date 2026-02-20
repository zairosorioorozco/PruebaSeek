package com.demo.automation.page.steps;

import com.demo.automation.page.base.BasePage;
import com.demo.automation.page.models.UserData;
import com.demo.automation.page.pageobjet.LoginHomePage;
import com.demo.automation.page.pageobjet.RegisterHomePage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;


public class LoginHomePageStep extends BasePage {

    @Steps
    LoginHomePage loginHomePage;


    @Step
    public void openTheBrowser(String path) throws InterruptedException {
        configuracionesIniciales();
        abrirNavegadorEn(path);

    }

    @Step
    public void ingresDatosLogin(UserData data) {
        escribirTexto(loginHomePage.campo_userName, data.getUsername());
        escribirTexto(loginHomePage.campo_password, data.getPassword());
    }


    @Step
    public void clickSubmit() {
        click(loginHomePage.btn_submit);
    }

    @Step
    public void validarRegistroExitoso() {
        validarDisponibilidadDelObjeto(loginHomePage.msjLoginExitoso);
    }


}
