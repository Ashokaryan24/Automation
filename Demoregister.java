package com.cyient.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Demoregister extends Demo_basepage{
@FindBy(xpath = "//a[@class='ico-register']")
private WebElement registerContainer;
@FindBy(id="gender-male")
private WebElement maleGender;
@FindBy(id="gender-female")
private WebElement femaleGender;
@FindBy(id="FirstName")
private WebElement firstName;
@FindBy(id="LastName")
private WebElement lastName;
@FindBy(id="Email")
private WebElement email;
@FindBy(id="Password")
private WebElement password;
@FindBy(id="ConfirmPassword")
private WebElement confirmPassword;
@FindBy(id = "register-button")
private WebElement register;
public void registerContainer(WebDriver driver) { registerContainer.click();
}
public void firstName(String str) {
firstName.sendKeys(str);
}
public void lastName(String str) {
lastName.sendKeys(str);
}
public void email(String str) {
email.sendKeys(str);
}
public void password(String str) {
password.sendKeys(str);
}
public void confirmPassword(String str) {
confirmPassword.sendKeys(str);
}
public void femaleGender() {
femaleGender.click();
}
public void maleGender() {
maleGender.click();
}
public void register() { register.click();
}
}
