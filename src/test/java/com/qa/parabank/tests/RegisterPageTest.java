package com.qa.parabank.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.parabank.base.BaseTest;

public class RegisterPageTest extends BaseTest {
	
	@Test
	public void registerFormTest()
	{
		reg=home.doClick();
		home.headerMessage();
		String message=reg.registerForm();
		Assert.assertEquals(message,"Your account was created successfully. You are now logged in.");
		
	}
	
}
