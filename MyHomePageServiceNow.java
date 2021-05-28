package Week6.Day3.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import Week6.Day3.Hooks.BaseProject;

public class MyHomePageServiceNow extends BaseProject {

	
public SwitchParentFrameServiceNow typeFilter (String navpage) throws InterruptedException{
		
		WebElement filternav;
		filternav = driver.findElement(By.id("filter"));
		filternav.sendKeys(navpage);
		filternav.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//div[text()='" + navpage + "']")).click();
		return new SwitchParentFrameServiceNow();
       
		}
	
	
public SwitchParentFrameServiceNow typeSubFilter (String subnavpage, String navpage) throws InterruptedException{
	
		WebElement filternav;
		filternav = driver.findElement(By.id("filter"));
		filternav.sendKeys(navpage);
		filternav.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//div[text()='" + subnavpage + "']")).click();
		return new SwitchParentFrameServiceNow();
       
		}

	
  

}

