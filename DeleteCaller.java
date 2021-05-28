package Week6.Day3.Pages;

import org.openqa.selenium.By;

import Week6.Day3.Hooks.BaseProject;

public class DeleteCaller extends BaseProject{

	
	public ReturnPageServiceNow clickDelete() {
		driver.findElement(By.id("sysverb_delete")).click();
		driver.findElement(By.id("ok_button")).click();
		return new ReturnPageServiceNow() ;
	}
	
	

}

