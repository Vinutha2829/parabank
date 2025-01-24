package com.qa.parabank.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	private WebDriver driver;
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
	}
	By textLocator=By.xpath("//h1");
	private By register=By.xpath("//a[text()='Register']");
	private By forgotLoginInfo=By.xpath("//a[text()='Forgot login info?']");
	
	public RegisterPage doClick()
	{
		WebElement regClick=driver.findElement(register);
		regClick.click();
		return new RegisterPage(driver);
	}
	public String headerMessage()
	{
		String text=driver.findElement(textLocator).getText();
		System.out.println(text);
		return text;
	}

}
