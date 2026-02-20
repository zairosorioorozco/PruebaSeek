package com.demo.automation.page.pageobjet;



import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class RegisterHomePage extends PageObject {

    public final By campo_firstName = By.name("firstName");
    public final By campo_lastName = By.name("lastName");
    public final By campo_phone = By.name("phone");
    public final By campo_userName = By.name("userName");
    public final By campo_address1 = By.name("address1");
    public final By campo_city = By.name("city");
    public final By campo_state = By.name("state");
    public final By campo_postalCode = By.name("postalCode");
    public final By select_country = By.name("country");
    public final By campo_email = By.name("email");
    public final By campo_password = By.name("password");
    public final By campo_confirmPassword = By.name("confirmPassword");
    public final By btn_submit = By.name("submit");
    public final  By msjConfirmacion = By.xpath("//*[contains(text(),'Thank you for registering')]");


}