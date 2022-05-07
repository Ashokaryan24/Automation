package com.cyient.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.cyient.Genricutils.DemowebshopDriverUtils;

public class Demo_basepage {
WebDriver driver;
public Demo_basepage()
{
driver=DemowebshopDriverUtils.getDriver();
PageFactory.initElements(driver,this);}
}

