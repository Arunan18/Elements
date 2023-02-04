package TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Base.DriverInitialization;
import Pages.MastePage;

public class MasterTest extends DriverInitialization {
	
Pages.MastePage master = new Pages.MastePage();
	
	@Test
	public void Login () throws InterruptedException {
		
		PageFactory.initElements(driver, master);
		Thread.sleep(2000);
		MastePage.Master.click();
		

}

}