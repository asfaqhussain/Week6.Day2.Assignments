package Week6.Day3.Tests;

import org.testng.annotations.Test;

import Week6.Day3.Hooks.BaseProject;
import Week6.Day3.Pages.LoginServiceNow;

public class DeleteCallerTest extends BaseProject {

@Test
	
	public void DeleteCallerTest() throws InterruptedException
	{
		
		new LoginServiceNow()
		.clickMainFrame()
		.typeUsername("admin")
		.typePassword("India@123")
		.clickLogin()
		.verifyWelcomeMsg()
		.typeFilter("Callers")
		.switchHomeFrame()
		.switchEnterSearch()
		.searchfield("asfaq")
		.clickUpdate()
		.verifyCallerDelete();
		
		
		
		
	}

}

