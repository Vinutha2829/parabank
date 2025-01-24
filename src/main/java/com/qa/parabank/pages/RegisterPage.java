package com.qa.parabank.pages;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {
	private WebDriver driver=null;
	public RegisterPage(WebDriver driver)
	{
		this.driver=driver;
	}
	private By firstName=By.name("customer.firstName");
	private By lastName=By.name("customer.lastName");
	private By address=By.name("customer.address.street");
	private By city=By.name("customer.address.city");
	private By state=By.name("customer.address.state");
	private By zipCode=By.name("customer.address.zipCode");
	private By phone=By.name("customer.phoneNumber");
	private By ssn=By.name("customer.ssn");
	private By userName=By.name("customer.username");
	private By password=By.name("customer.password");
	private By confirmpassword=By.name("repeatedPassword");
	private By submit=By.xpath("//input[@value='Register']");
	
	public String registerForm()
	{
		By textLocator=By.xpath("//h1/../p");
		String username=""+System.currentTimeMillis();
		driver.findElement(firstName).sendKeys("vinutha");
		driver.findElement(lastName).sendKeys("T");
		driver.findElement(address).sendKeys("536,Bellandur");
		driver.findElement(city).sendKeys("Bangalore");
		driver.findElement(state).sendKeys("Karnataka");
		driver.findElement(zipCode).sendKeys("56301");
		driver.findElement(phone).sendKeys("8965234710");
		driver.findElement(ssn).sendKeys("853");
		driver.findElement(userName).sendKeys(username);
		driver.findElement(password).sendKeys("vinutha@29");
		driver.findElement(confirmpassword).sendKeys("vinutha@29");
		driver.findElement(submit).click();
		String text=driver.findElement(textLocator).getText();
		System.out.println(text);
		return text;
		
	}
	

}
