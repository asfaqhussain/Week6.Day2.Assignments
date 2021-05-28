package Week6.Day3.Pages;

import org.openqa.selenium.By;

import Week6.Day3.Hooks.BaseProject;

public class UpdateMandatoryArticleServiceNow extends BaseProject {

	public UpdateMandatoryArticleServiceNow typeshortDesc(String shortDesc) {
		driver.findElement(By.id("kb_knowledge.short_description")).sendKeys(shortDesc);
		return this;
	}

	public UpdateMandatoryArticleServiceNow selectKnowledgelookup()  {
		driver.findElement(By.xpath("//button[@id='lookup.kb_knowledge.kb_knowledge_base']//span[1]")).click();
		return this;		
	}

	public UpdateMandatoryArticleServiceNow clickKnowledgeBase() throws InterruptedException {
		BaseProject.clickPopUp();
		driver.findElement(By.linkText("IT")).click();
		BaseProject.clickParentwindow();
		return this;
	}

	public ReturnPageServiceNow clickUpdate() {
		driver.findElement(By.id("sysverb_update")).click();
		return new ReturnPageServiceNow() ;
	}

}

