package Week6.Day3.Tests;

import org.testng.annotations.Test;

import Week6.Day3.Hooks.BaseProject;
import Week6.Day3.Pages.LoginServiceNow;

public class UpdateCallerTest extends BaseProject {

@Test
	
	public void updatecallertest() throws InterruptedException
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
		.searchfield("Asfaq")
		.updatePhone("0987654321")
		.clickUpdate()
		.verifyCallerUpdate();
		
		
		
	}

}

