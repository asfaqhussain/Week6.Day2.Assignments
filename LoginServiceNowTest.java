package Week6.Day3.Tests;

import org.testng.annotations.Test;

import Week6.Day3.Hooks.BaseProject;
import Week6.Day3.Pages.LoginServiceNow;

public class LoginServiceNowTest {

@Test
	
	public void loginservicenowtest() throws InterruptedException
	{
		
	 new LoginServiceNow()
	.clickMainFrame()
	.typeUsername("admin")
	.typePassword("India@123")
	.clickLogin()
	.verifyWelcomeMsg();
		
        

		
	
	




}}

