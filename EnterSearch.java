package Week6.Day3.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Week6.Day3.Hooks.BaseProject;

public class EnterSearch extends BaseProject{

	public UpdateCallerDetailsServiceNow searchfield(String data) {

		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys(data, Keys.ENTER);
		driver.findElement(By.xpath("//a[@class='linked formlink']")).click();
		return new UpdateCallerDetailsServiceNow();

	}

	public DeleteCaller searchdelfield(String data) {

		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys(data, Keys.ENTER);
		driver.findElement(By.xpath("//a[@class='linked formlink']")).click();
		return new DeleteCaller();

	}
	
	public UpdateMandatoryArticleServiceNow searchfieldknowlegeno(String data) {

		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys(data, Keys.ENTER);
		driver.findElement(By.xpath("//a[@class='linked formlink']")).click();
		return new UpdateMandatoryArticleServiceNow();

	}

			
		}


		
		


	
		



	



