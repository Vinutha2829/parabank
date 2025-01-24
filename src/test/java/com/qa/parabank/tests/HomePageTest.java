package com.qa.parabank.tests;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.parabank.base.BaseTest;
public class HomePageTest  extends BaseTest{
	
	@Test
	public void doClickTest()
	{
		reg=home.doClick();
		String message=home.headerMessage();
		
		Assert.assertEquals(message, "Signing up is easy!");
	}
	
	

}
