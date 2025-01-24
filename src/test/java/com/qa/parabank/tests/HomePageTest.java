package com.qa.parabank.tests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.parabank.pages.HomePage;
import com.qa.parabank.pages.RegisterPage;
public class HomePageTest {
	WebDriver driver=null;
	HomePage home=null;
	RegisterPage reg=null;
	@BeforeClass
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://parabank.parasoft.com/parabank/index.htm?ConnType=JDBC");
		 home=new HomePage(driver);
	}
	@Test
	public void doClickTest()
	{
		reg=home.doClick();
	}
	@AfterClass
	public void tearDown()
	{
		driver.close();
	}
	

}
