package Week6.Day3.Tests;

import org.testng.annotations.Test;

import Week6.Day3.Hooks.BaseProject;
import Week6.Day3.Pages.LoginServiceNow;

public class ArticleCreateTest extends BaseProject {

 @Test
	
	public void articlecreatetest() throws InterruptedException
	{
		
		new LoginServiceNow()
		.clickMainFrame()
		.typeUsername("admin")
		.typePassword("India@123")
		.clickLogin()
		.verifyWelcomeMsg()
		.typeSubFilter("My Knowledge Articles", "Knowledge")
		.switchHomeFrame()
		.switchParentFrame()
		.clickNewButtonArticle()
		.getArticleNo()
		.typeshortDesc("Dont Touch My Article")
		.typeKnowledgeBase("Knowledge")
		.clickSubmit()
		.verifyCreateArticle();
		
	}

}

