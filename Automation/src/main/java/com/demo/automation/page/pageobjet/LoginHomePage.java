package com.demo.automation.page.pageobjet;



import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class LoginHomePage extends PageObject {

    public final By campo_userName = By.name("userName");
    public final By campo_password = By.name("password");
    public final By btn_submit = By.name("submit");
    public final By msjLoginExitoso = By.xpath("//*[contains(text(),' Thank you for Loggin. ')]");



}