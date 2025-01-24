package com.qa.parabank.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.qa.parabank.pages.HomePage;
import com.qa.parabank.pages.RegisterPage;

public class BaseTest {
	public WebDriver driver=null;
	public HomePage home=null;
	public RegisterPage reg=null;
	@BeforeClass
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://parabank.parasoft.com/parabank/index.htm?ConnType=JDBC");
		 home=new HomePage(driver);
	}
	@AfterClass
	public void tearDown()
	{
		driver.close();
	}

}
