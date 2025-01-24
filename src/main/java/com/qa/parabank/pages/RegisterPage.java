package com.qa.parabank.pages;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.parabank.utilies.ElementUtil;

public class RegisterPage {
	private WebDriver driver=null;
	ElementUtil ele=null;
	public RegisterPage(WebDriver driver)
	{
		this.driver=driver;
		ele=new ElementUtil(driver);
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
		ele.doSend(firstName, "vinutha");
		ele.doSend(lastName,"T");
		ele.doSend(address,"536,Bellandur");
		ele.doSend(city,"Bangalore");
		ele.doSend(state,"Karnataka");
		ele.doSend(zipCode,"56301");
		ele.doSend(phone,"8965234710");
		ele.doSend(ssn,"853");
		ele.doSend(userName,username);
		ele.doSend(password,"vinutha@29");
		ele.doSend(confirmpassword,"vinutha@29");
		ele.doClick(submit);
		String text=ele.myGetText(textLocator);
		System.out.println(text);
		return text;
		
	}
	

}
