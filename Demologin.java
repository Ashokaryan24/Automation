package com.cyient.POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Demologin extends Demo_basepage {

@FindBy(xpath = "//a[@class='ico-login']")
//@FindBy(xpath = "//a[@href='/login']")
private WebElement loginContainer;

@FindBy(id="Email")
private WebElement email;

@FindBy(id="Password")
private WebElement password;

@FindBy(xpath = "//input[@class='button-1 login-button']")
private WebElement login;

public void loginContainer() {
loginContainer.click();
}

public void enterUsername(String str) {
email.sendKeys(str);
}

public void enterPassword(String str) {
password.sendKeys(str);
}

public void loginButton() {
login.click();
}
}