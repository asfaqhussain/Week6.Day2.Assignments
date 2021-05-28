package Week6.Day3.Tests;

import org.testng.annotations.Test;

import Week6.Day3.Hooks.BaseProject;
import Week6.Day3.Pages.LoginServiceNow;

public class UpdateArticleTest extends BaseProject{

@Test
	
	public void UpdateArticleTest() throws InterruptedException
	{
		
		new LoginServiceNow()
		.clickMainFrame()
		.typeUsername("admin")
		.typePassword("India@123")
		.clickLogin()
		.verifyWelcomeMsg()
		.typeSubFilter("My Knowledge Articles", "Knowledge")
		.switchHomeFrame()
		.switchEnterSearch()
		.searchfieldknowlegeno("KB0010222")
		.typeshortDesc("Asfaq Test")
		.selectKnowledgelookup()
		.clickKnowledgeBase()
		.clickUpdate()
		.verifyUpateArticle();
			
	}

}

