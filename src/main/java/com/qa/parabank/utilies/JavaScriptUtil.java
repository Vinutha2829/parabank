package com.qa.parabank.utilies;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptUtil {
	private WebDriver driver;
	public JavascriptExecutor  js;
	JavaScriptUtil(WebDriver driver)
	{
		this.driver=driver;
		js=(JavascriptExecutor)this.driver;
	}
	public void highlight(WebElement ele)
	{
		String origColor=ele.getCssValue("backgroundColor");
		for(int i=0;i<10;i++)
		{
			changeColor("rgb(0,200,0)",ele);
			changeColor(origColor,ele);
		}
		
		
	}
	public void changeColor(String color,WebElement ele)
	{
		js.executeScript("arguments[0].style.backgroundColor='"+color+"'",ele);
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
