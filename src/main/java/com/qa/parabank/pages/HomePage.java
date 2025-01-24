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
	private By register=By.xpath("//a[text()='Register']");
	
	public RegisterPage doClick()
	{
		WebElement regClick=driver.findElement(register);
		regClick.click();
		return new RegisterPage();
	}

}
