package Week6.Day3.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import Week6.Day3.Hooks.BaseProject;

public class UpdateCallerDetailsServiceNow extends BaseProject {

public UpdateCallerDetailsServiceNow updatePhone(String phone) {
	
	driver.findElement(By.id("sys_user.phone")).clear();
	driver.findElement(By.id("sys_user.phone")).sendKeys("0987654321");
	return this;
}


public ReturnPageServiceNow clickUpdate() {
	driver.findElement(By.id("sysverb_update")).click();
	return new ReturnPageServiceNow() ;
}



}







	
	



