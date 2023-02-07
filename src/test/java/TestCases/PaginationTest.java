package TestCases;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Base.DriverInitialization;
import Pages.PaginationPage;

public class PaginationTest extends DriverInitialization{
	PaginationPage pp = new PaginationPage();
	
	@Test
	public void Pagination() throws InterruptedException {
		PageFactory.initElements(driver, pp);
		Thread.sleep(2000);
		PaginationPage.masterBtn.click();
		Thread.sleep(2000);
		PaginationPage.Plant.click();
		Thread.sleep(4000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.PAGE_DOWN).perform();
//        act.sendKeys(Keys.PAGE_DOWN).build().perform();
	}
}
