package Week6.Day3.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import Week6.Day3.Hooks.BaseProject;

public class CreateArticleServiceNow extends BaseProject {

	
	public CreateArticleServiceNow typeKnowledgeBase(String knowledgebase) throws InterruptedException {
		WebElement kBase = driver.findElement(By.id("sys_display.kb_knowledge.kb_knowledge_base"));
		kBase.sendKeys(knowledgebase);
		kBase.sendKeys(Keys.ARROW_DOWN);
		kBase.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		return this;
	}

	public CreateArticleServiceNow typeshortDesc(String shortDesc) {
		driver.findElement(By.id("kb_knowledge.short_description")).sendKeys(shortDesc);
		return this;
	}

	public CreateArticleServiceNow getArticleNo() throws InterruptedException {

		
		number = driver.findElement(By.id("sys_readonly.kb_knowledge.number")).getAttribute("value");
		Thread.sleep(2000);
		System.out.println("The Knowlege number" + number);
		return this;
	}

	public ReturnPageServiceNow clickSubmit() {
		driver.findElement(By.id("sysverb_insert")).click();
		return new ReturnPageServiceNow();

	}

}

