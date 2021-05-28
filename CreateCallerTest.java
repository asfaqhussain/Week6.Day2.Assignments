package Week6.Day3.Tests;

import org.testng.annotations.Test;

import Week6.Day3.Hooks.BaseProject;
import Week6.Day3.Pages.LoginServiceNow;

public class CreateCallerTest extends BaseProject {

 @Test
	
	public void createcallertest() throws InterruptedException
	{
		
		new LoginServiceNow()
		.clickMainFrame()
		.typeUsername("admin")
		.typePassword("India@123")
		.clickLogin()
		.verifyWelcomeMsg()
		.typeFilter("Callers")
		.switchHomeFrame()
		.switchParentFrame()
		.clickNewButton()
		.typeFirstname("Asfaq")
		.typeLastname("Hussaoin")
		.typeEmail("Asfaqhussain05@gmail.com")
		.typePhone("123456789")
		 .typeUsertitle("Mr")
		 .typeMobile("123456789")
		 .clickSubmit();
		
		
		
	}

}

