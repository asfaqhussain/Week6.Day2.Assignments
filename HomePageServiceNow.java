package Week6.Day3.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Week6.Day3.Hooks.BaseProject;

public class HomePageServiceNow extends BaseProject{

	public MyHomePageServiceNow verifyWelcomeMsg (){
		
		 WebElement navsideBar =  driver.findElement(By.xpath("//nav[@class='navpage-nav']"));
			String title = driver.getTitle();
			System.out.println(title);
			
			boolean navdisplay = navsideBar.isDisplayed();
			System.out.println(navdisplay);
			
			if(navdisplay)
			{
				if(title.contains("ServiceNow"))
				{
					System.out.println("Login Successful");
				}else
				{
					System.out.println("Login not Successful");
				}
			}
			return new MyHomePageServiceNow();
	}
	
 
	public LoginServiceNow clickLogout() {
		driver.findElement(By.xpath("//span[@class='caret']")).click();
		driver.findElement(By.linkText("Logout")).click();
		return new LoginServiceNow();
	}
	


	
}
