package com.qa.parabank.utilies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementUtil {
	WebDriver driver=null;
	JavaScriptUtil js=null;
	public ElementUtil(WebDriver driver)
	{
		this.driver=driver;
		js=new JavaScriptUtil(this.driver);
	}
	public WebElement getElement(By locator)
	{
		WebElement ele= driver.findElement(locator);
		js.highlight(ele);
		return ele;
	}
	public void doSend(By locator,String value)
	{
		getElement(locator).sendKeys(value);
	}
	public void doClick(By locator)
	{
		getElement(locator).click();
	}
	public String myGetText(By locator)
	{
		return getElement(locator).getText();
	}

}
