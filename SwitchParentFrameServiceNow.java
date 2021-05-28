package Week6.Day3.Pages;

import org.openqa.selenium.By;

import Week6.Day3.Hooks.BaseProject;

public class SwitchParentFrameServiceNow extends BaseProject {

	
	public ClickNewButtonServiceNow switchParentFrame() {
		driver.findElement(By.xpath("//button[text()='New']")).click();
		return new ClickNewButtonServiceNow();
	}
	
	public   SwitchParentFrameServiceNow switchHomeFrame() {
		driver.switchTo().frame("gsft_main");
		return this;
	}
	
	
	public   EnterSearch switchEnterSearch() {
		
		return new EnterSearch();
	}

	
	

}

