package Week6.Day3.Pages;

import org.openqa.selenium.By;

import Week6.Day3.Hooks.BaseProject;

public class LoginServiceNow extends BaseProject {

	
	
	public  LoginServiceNow clickMainFrame(){
		driver.switchTo().frame("gsft_main");
		return this;
	}
	
	public LoginServiceNow typeUsername(String username) {
		
		driver.findElement(By.id("user_name")).clear();
		driver.findElement(By.id("user_name")).sendKeys(username);
		return this;
	}
	
  
	public LoginServiceNow typePassword(String password) {
		
	driver.findElement(By.id("user_password")).clear();
		driver.findElement(By.id("user_password")).sendKeys(password);
		return this;
	}
	
	
	public HomePageServiceNow clickLogin()
	{
		driver.findElement(By.id("sysverb_login")).click();
		return new HomePageServiceNow();
	}
}
