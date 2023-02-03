package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Base.DriverInitialization;

public class HomeTest extends DriverInitialization{

	@Test
	public void Home() throws InterruptedException {
		WebElement Home = driver.findElement(By.xpath("//a[@class='sc-bdVaJa ieeiNp'][@href='#/']"));
		Home.click();
		Thread.sleep(1000);
	}
}
