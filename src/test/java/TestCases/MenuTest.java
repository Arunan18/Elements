package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import Base.DriverInitialization;

public class MenuTest extends DriverInitialization{
	@Test
	public void Menu() throws InterruptedException {

		Thread.sleep(4000);

		WebElement adButton = driver
				.findElement(By.xpath("//*[@id=\"root\"]/div/section/section/header/ul/div/div[2]/div/div"));
		adButton.click();

		Thread.sleep(3000);

		WebElement menu = driver.findElement(By.xpath("/html/body/div[3]/div/div/ul"));

		Thread.sleep(2000);

		WebElement notification = driver.findElement(By.xpath("/html/body/div[3]/div/div/ul/li[3]/span/a/p"));

		Thread.sleep(2000);

		WebElement settings = driver.findElement(By.xpath("/html/body/div[3]/div/div/ul/li[4]/span/a"));

		Thread.sleep(2000);

		WebElement logout = driver.findElement(By.xpath("/html/body/div[3]/div/div/ul/li[5]/span/p"));

		Thread.sleep(2000);

//		Menu Button Visibility

		try {
			boolean ActualElement = adButton.isDisplayed();
			boolean ExpectedElement = true;

			boolean elementvisible = true;
			testCase = extent.createTest("Menu Button visible");
			try {
				Assert.assertEquals(ActualElement, ExpectedElement);
			} catch (AssertionError e) {
				elementvisible = false;
			}
			if (elementvisible) {
				testCase.log(Status.INFO, "ActualElement :- " + ActualElement);
				testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedElement);
				testCase.log(Status.INFO, "Element Available");
				testCase.log(Status.PASS, "Correct element");
			} else {
				testCase.log(Status.INFO, "ActualElement :- " + ActualElement);
				testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedElement);
				testCase.log(Status.INFO, "Element not available");
				testCase.log(Status.FAIL, "No Element");
			}

		} catch (Exception e) {

			testCase = extent.createTest("Menu Button visible");
			testCase.log(Status.FAIL, "No Element");

		}

		Thread.sleep(2000);

//			Menu visibility

		try {
			boolean ActualElement = menu.isDisplayed();
			boolean ExpectedElement = true;

			boolean elementvisible = true;
			testCase = extent.createTest("Menu visibility");
			try {
				Assert.assertEquals(ActualElement, ExpectedElement);
			} catch (AssertionError e) {
				elementvisible = false;
			}
			if (elementvisible) {
				testCase.log(Status.INFO, "ActualElement :- " + ActualElement);
				testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedElement);
				testCase.log(Status.INFO, "Element Available");
				testCase.log(Status.PASS, "Correct element");
			} else {
				testCase.log(Status.INFO, "ActualElement :- " + ActualElement);
				testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedElement);
				testCase.log(Status.INFO, "Element not available");
				testCase.log(Status.FAIL, "No Element");
			}

		} catch (Exception e) {

			testCase = extent.createTest("Menu visibility");
			testCase.log(Status.FAIL, "No Element");

		}

		Thread.sleep(2000);

//				Menu visibility after click

//				try {
//					boolean ActualElement = menu.isDisplayed();
//					boolean ExpectedElement = true;
//					
//					boolean elementvisible = true;
//					testCase = extent.createTest("Menu visibility after click");
//					try {
//						Assert.assertEquals(ActualElement, ExpectedElement);
//					} catch (AssertionError e) {
//						elementvisible = false;
//					}
//					if (elementvisible) {
//						testCase.log(Status.INFO, "ActualElement :- " + ActualElement);
//						testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedElement);
//						testCase.log(Status.INFO, "Element Available");
//						testCase.log(Status.PASS, "Correct element");
//					} else {
//						testCase.log(Status.INFO, "ActualElement :- " + ActualElement);
//						testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedElement);
//						testCase.log(Status.INFO, "Element not available");
//						testCase.log(Status.FAIL, "No Element");
//					}
//					
//					}
//					catch(Exception e){
//					
//						testCase = extent.createTest("Menu visibility after click");
//						testCase.log(Status.FAIL, "No Element");
//
//						}
//
//					
//					Thread.sleep(2000);

//			Menu Button Enable

		try {
			boolean Actualelement = adButton.isEnabled();
			boolean expectedelement = true;

			boolean elementenabled = true;
			testCase = extent.createTest("Menu Button enabled");

			try {
				Assert.assertEquals(expectedelement, Actualelement);
			} catch (AssertionError e) {
				elementenabled = false;
			}
			if (elementenabled) {
				testCase.log(Status.INFO, "Actual" + Actualelement);
				testCase.log(Status.INFO, "Expected" + expectedelement);
				testCase.log(Status.PASS, "Enabled");
			} else {
				testCase.log(Status.INFO, "Actual" + Actualelement);
				testCase.log(Status.INFO, "Expected" + expectedelement);
				testCase.log(Status.FAIL, "Enabled");
			}
		} catch (Exception e) {
			testCase = extent.createTest("Menu Button enabled");
			testCase.log(Status.FAIL, "No Element");
		}

		Thread.sleep(2000);

//			Menu Enablity

		try {
			boolean Actualelement = menu.isEnabled();
			boolean expectedelement = true;

			boolean elementenabled = true;
			testCase = extent.createTest("Menu enabled");

			try {
				Assert.assertEquals(expectedelement, Actualelement);
			} catch (AssertionError e) {
				elementenabled = false;
			}
			if (elementenabled) {
				testCase.log(Status.INFO, "Actual" + Actualelement);
				testCase.log(Status.INFO, "Expected" + expectedelement);
				testCase.log(Status.PASS, "Enabled");
			} else {
				testCase.log(Status.INFO, "Actual" + Actualelement);
				testCase.log(Status.INFO, "Expected" + expectedelement);
				testCase.log(Status.FAIL, "Enabled");
			}
		} catch (Exception e) {
			testCase = extent.createTest("Menu enabled");
			testCase.log(Status.FAIL, "No Element");
		}

		Thread.sleep(2000);

//	Menu Button size

		Dimension ActualSize = adButton.getSize();
		System.out.println("Menu Button Size : " + ActualSize);
		Dimension ExpectedSize = new Dimension(100, 50);

		boolean menubtnsize = true;
		testCase = extent.createTest("Menu Button Size");
		try {
			Assert.assertEquals(ActualSize, ExpectedSize);

		} catch (AssertionError e) {
			menubtnsize = false;
		}
		if (menubtnsize) {
			testCase.log(Status.INFO, "ActualSize :- " + ActualSize);
			testCase.log(Status.INFO, "ExpectedSize :- " + ExpectedSize);
			testCase.log(Status.PASS, "Correct Menu Button Size");
		} else {
			testCase.log(Status.INFO, "ActualSize :- " + ActualSize);
			testCase.log(Status.INFO, "ExpectedSize :- " + ExpectedSize);
			testCase.log(Status.FAIL, "Wrong Menu Button Size");
		}
		Thread.sleep(2000);

//			Menu Size

		Dimension ActualMenuSize = menu.getSize();
		System.out.println("Menu Size : " + ActualMenuSize);
		Dimension ExpectedMenuSize = new Dimension(210, 167);

		boolean menusize = true;
		testCase = extent.createTest("MENU-SIZE");
		try {
			Assert.assertEquals(ActualMenuSize, ExpectedMenuSize);

		} catch (AssertionError e) {
			menusize = false;
		}
		if (menusize) {
			testCase.log(Status.INFO, "ActualMenuSize :- " + ActualMenuSize);
			testCase.log(Status.INFO, "ExpectedMenuSize :- " + ExpectedMenuSize);
			testCase.log(Status.PASS, "Correct Menu Size");
		} else {
			testCase.log(Status.INFO, "ActualMenuSize :- " + ActualMenuSize);
			testCase.log(Status.INFO, "ExpectedMenuSize :- " + ExpectedMenuSize);
			testCase.log(Status.FAIL, "Wrong Menu Size");
		}
		Thread.sleep(2000);

//			Menu Button Position

		Point ActualLocation = adButton.getLocation();

		int actual_x = ActualLocation.getX();
		int actual_y = ActualLocation.getY();

		System.out.println("Menu Button X axis: " + actual_x);
		System.out.println("Menu Button Y axis: " + actual_y);

		Point ExpectedLocation = new Point(1231, -10);

		boolean Position = true;
		testCase = extent.createTest("Menu Button Position");
		try {
			Assert.assertEquals(ActualLocation, ExpectedLocation);

		} catch (AssertionError e) {
			Position = false;
		}
		if (Position) {
			testCase.log(Status.INFO, "ActualFontSize :- " + ActualLocation);
			testCase.log(Status.INFO, "ExpectedFontSize :- " + ExpectedLocation);
			testCase.log(Status.PASS, "Correct Location");
		} else {
			testCase.log(Status.INFO, "ActualSize :- " + ActualLocation);
			testCase.log(Status.INFO, "ExpectedSize :- " + ExpectedLocation);
			testCase.log(Status.FAIL, "Wrong Location");
		}
		Thread.sleep(2000);

//Menu Position

		Point ActualMenuLocation = menu.getLocation();

		int actualmenu_x = ActualMenuLocation.getX();
		int actualmenu_y = ActualMenuLocation.getY();

		System.out.println("Menu X axis: " + actualmenu_x);
		System.out.println("Menu Y axis: " + actualmenu_y);

		Point ExpectedMenuLocation = new Point(1133, 44);

		boolean menuPosition = true;
		testCase = extent.createTest("Menu Position");
		try {
			Assert.assertEquals(ActualMenuLocation, ExpectedMenuLocation);

		} catch (AssertionError e) {
			menuPosition = false;
		}
		if (menuPosition) {
			testCase.log(Status.INFO, "ActualMenuLocation :- " + ActualMenuLocation);
			testCase.log(Status.INFO, "ExpectedMenuLocation :- " + ExpectedMenuLocation);
			testCase.log(Status.PASS, "Correct Location");
		} else {
			testCase.log(Status.INFO, "ActualMenuLocation :- " + ActualMenuLocation);
			testCase.log(Status.INFO, "ExpectedMenuLocation :- " + ExpectedMenuLocation);
			testCase.log(Status.FAIL, "Wrong Location");
		}
		Thread.sleep(2000);

//			menu color

		String ActualMenuColor = menu.getCssValue("background-color");
		System.out.println("menu rgb :" + ActualMenuColor);

		String ExpectedMenuColor = "rgba(0, 21, 41, 1)";

		boolean buttoncolor = true;
		testCase = extent.createTest("BUTTON-COLOR");
		try {
			Assert.assertEquals(ActualMenuColor, ExpectedMenuColor);

		} catch (AssertionError e) {
			buttoncolor = false;
		}
		if (buttoncolor) {
			testCase.log(Status.INFO, "ActualMenuColor :- " + ActualMenuColor);
			testCase.log(Status.INFO, "ExpectedMenuColor :- " + ExpectedMenuColor);
			testCase.log(Status.PASS, "Correct Menu Color");
		} else {
			testCase.log(Status.INFO, "ActualMenuColor :- " + ActualMenuColor);
			testCase.log(Status.INFO, "ExpectedMenuColor :- " + ExpectedMenuColor);
			testCase.log(Status.FAIL, "Wrong Menu Color");
		}
		Thread.sleep(2000);

//			font color

		String ActualFontColor = menu.getCssValue("color");

		System.out.println("Font colour: " + ActualFontColor);

		String ExpectedFontColor = "rgba(0, 0, 0, 0.85)";
		testCase = extent.createTest("MENU-FONT-COLOUR");
		try {
			Assert.assertEquals(ActualFontColor, ExpectedFontColor);
			testCase.log(Status.INFO, "ActualFontColor :- " + ActualFontColor);
			testCase.log(Status.INFO, "ExpectedFontColor :- " + ExpectedFontColor);

			testCase.log(Status.PASS, "Correct font Colour");
		} catch (AssertionError e) {
			testCase.log(Status.INFO, "ActualFontColor :- " + ActualFontColor);
			testCase.log(Status.INFO, "ExpectedFontColor :- " + ExpectedFontColor);

			testCase.log(Status.FAIL, "wrong font Colour");
		}
		Thread.sleep(2000);

//			cursor

		String ActualActions = menu.getCssValue("cursor");
		System.out.println("cursor :" + ActualActions);
		String ExpectedActions = "auto";

		boolean cursor = true;
		testCase = extent.createTest("MENU-CURSOR");
		try {
			Assert.assertEquals(ActualActions, ExpectedActions);

		} catch (AssertionError e) {
			cursor = false;
		}
		if (cursor) {
			testCase.log(Status.INFO, "ActualcursorActions :- " + ActualActions);
			testCase.log(Status.INFO, "ExpectedcursorActions :- " + ExpectedActions);
			testCase.log(Status.PASS, "Menu is auto");
		} else {
			testCase.log(Status.INFO, "ActualcursorActions :- " + ActualActions);
			testCase.log(Status.INFO, "ExpectedcursorActions :- " + ExpectedActions);
			testCase.log(Status.FAIL, "Menu is not auto");
		}
		Thread.sleep(2000);

//			text spelling

		String text = adButton.getText();

		String text1 = "admin";
		boolean txt1 = true;
		testCase = extent.createTest("MENU SPELLING");

		try {
			Assert.assertEquals(text, text1);
		} catch (AssertionError e) {
			txt1 = false;
		}
		if (txt1) {
			testCase.log(Status.INFO, "ActualElement :- " + text);
			testCase.log(Status.INFO, "ExpectedElement :- " + text1);
			testCase.log(Status.INFO, "correct text");
			testCase.log(Status.PASS, "Correct ");
		} else {
			testCase.log(Status.INFO, "ActualElement :- " + text);
			testCase.log(Status.INFO, "ExpectedElement :- " + text1);
			testCase.log(Status.INFO, "wrong text");
			testCase.log(Status.FAIL, "wrong");
		}

		Thread.sleep(2000);

//			border radius

		String Actualradius = menu.getCssValue("border-radius");
		System.out.println("radius value :" + Actualradius);
		String Expectedradius = "2px";

		boolean borderradius = true;
		testCase = extent.createTest("MENU-RADIUS");
		try {
			Assert.assertEquals(Actualradius, Expectedradius);

		} catch (AssertionError e) {
			borderradius = false;
		}
		if (borderradius) {
			testCase.log(Status.INFO, "Actualradius :- " + Actualradius);
			testCase.log(Status.INFO, "Expectedradius :- " + Expectedradius);
			testCase.log(Status.PASS, "Correct value");
		} else {
			testCase.log(Status.INFO, "Actualradius :- " + Actualradius);
			testCase.log(Status.INFO, "Expectedradius :- " + Expectedradius);
			testCase.log(Status.FAIL, "Wrong Value");
		}
		Thread.sleep(2000);

//			opacity

		String Actualopacity = menu.getCssValue("opacity");
		System.out.println("opacity  :" + Actualopacity);
		String Expectedopacity = "1";

		boolean opacity = true;
		testCase = extent.createTest("MENU-OPACITY");
		try {
			Assert.assertEquals(Actualopacity, Expectedopacity);

		} catch (AssertionError e) {
			opacity = false;
		}
		if (opacity) {
			testCase.log(Status.INFO, "Actualopacity :- " + Actualopacity);
			testCase.log(Status.INFO, "Expectedopacity :- " + Expectedopacity);
			testCase.log(Status.PASS, "Correct value");
		} else {
			testCase.log(Status.INFO, "Actualopacity :- " + Actualopacity);
			testCase.log(Status.INFO, "Expectedopacity :- " + Expectedopacity);
			testCase.log(Status.FAIL, "Wrong Value");
		}
		Thread.sleep(2000);

//			font weight

		String Actualfontweight = adButton.getCssValue("font-weight");
		System.out.println("fontweight  :" + Actualfontweight);
		String Expectedfontweight = "400";

		boolean fontweight = true;
		testCase = extent.createTest("MENU-FONT-WEIGHT");
		try {
			Assert.assertEquals(Actualfontweight, Expectedfontweight);

		} catch (AssertionError e) {
			fontweight = false;
		}
		if (fontweight) {
			testCase.log(Status.INFO, "Actualfontweight :- " + Actualfontweight);
			testCase.log(Status.INFO, "Expectedfontweight :- " + Expectedfontweight);
			testCase.log(Status.PASS, "Correct font weight");
		} else {
			testCase.log(Status.INFO, "Actualfontweight :- " + Actualfontweight);
			testCase.log(Status.INFO, "Expectedfontweight :- " + Expectedfontweight);
			testCase.log(Status.FAIL, "Wrong font weight");
		}
		Thread.sleep(2000);

//			Navigation
		// ****settings

//			Thread.sleep(3000);
//	        driver.findElement(By.xpath("//ul[@role='menu']//div[@class='ant-col ant-col-18']//div[2]")).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[3]/div/div/ul/li[4]/span")).click();
//	        driver.findElement(By.xpath("/html/body/div[3]/div/div/ul/li[3]/span")).click(); 

		String actualsettingnurl = driver.getCurrentUrl();
		System.out.println(actualsettingnurl);
		boolean Substringsett = actualsettingnurl.contains("settings/emailpoint");
		System.out.println(Substringsett);

		String expectedsettingnurl = "http://qa-automation-release.s3-website-us-east-1.amazonaws.com/#/settings/emailpoint";

		boolean setting = true;
		testCase = extent.createTest("MENU-SETTINGS-NAVIGATION");
		try {
			Assert.assertEquals(actualsettingnurl, expectedsettingnurl);

		} catch (AssertionError e) {
			setting = false;
		}
		if (setting) {
			testCase.log(Status.INFO, "actualsettingnurl :- " + actualsettingnurl);
			testCase.log(Status.INFO, "expectedsettingnurl :- " + expectedsettingnurl);
			testCase.log(Status.PASS, "Correct navigation to settings");
		} else {
			testCase.log(Status.INFO, "actualsettingnurl :- " + actualsettingnurl);
			testCase.log(Status.INFO, "expectedsettingnurl :- " + expectedsettingnurl);
			testCase.log(Status.FAIL, "Wrong navigation to settings");
		}
		Thread.sleep(2000);

		// ****notification

		Thread.sleep(3000);
		driver.findElement(By.xpath("//ul[@role='menu']//div[@class='ant-col ant-col-18']//div[2]")).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[3]/div/div/ul/li[3]/span")).click();

		String actualnotificationnurl = driver.getCurrentUrl();
		System.out.println(actualnotificationnurl);
		boolean Substringnoti = actualnotificationnurl.contains("notification/all");
		System.out.println(Substringnoti);

		String expectednotificationurl = "http://qa-automation-release.s3-website-us-east-1.amazonaws.com/#/notification/all";

		boolean notifi = true;
		testCase = extent.createTest("MENU-NOTIFICATION-NAVIGATION");
		try {
			Assert.assertEquals(actualnotificationnurl, expectednotificationurl);

		} catch (AssertionError e) {
			notifi = false;
		}
		if (notifi) {
			testCase.log(Status.INFO, "actualnotificationnurl :- " + actualnotificationnurl);
			testCase.log(Status.INFO, "expectednotificationurl :- " + expectednotificationurl);
			testCase.log(Status.PASS, "Correct navigation to notification");
		} else {
			testCase.log(Status.INFO, "actualnotificationnurl :- " + actualnotificationnurl);
			testCase.log(Status.INFO, "expectednotificationurl :- " + expectednotificationurl);
			testCase.log(Status.FAIL, "Wrong navigation to notification");
		}
		Thread.sleep(2000);

		// ****notification

		Thread.sleep(3000);
		driver.findElement(By.xpath("//ul[@role='menu']//div[@class='ant-col ant-col-18']//div[2]")).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[3]/div/div/ul/li[5]/span")).click();

		String actuallogouturl = driver.getCurrentUrl();
		System.out.println(actuallogouturl);
		boolean Substringlogout = actuallogouturl.contains("login");
		System.out.println(Substringlogout);

		String expectedlogouturl = "http://qa-automation-release.s3-website-us-east-1.amazonaws.com/#/login";

		boolean logou = true;
		testCase = extent.createTest("MENU-LOGOUT-NAVIGATION");
		try {
			Assert.assertEquals(actuallogouturl, expectedlogouturl);

		} catch (AssertionError e) {
			logou = false;
		}
		if (logou) {
			testCase.log(Status.INFO, "actuallogouturl :- " + actuallogouturl);
			testCase.log(Status.INFO, "expectedlogouturl :- " + expectedlogouturl);
			testCase.log(Status.PASS, "Correct navigation to logout");
		} else {
			testCase.log(Status.INFO, "actuallogouturl :- " + actuallogouturl);
			testCase.log(Status.INFO, "expectedlogouturl :- " + expectedlogouturl);
			testCase.log(Status.FAIL, "Wrong navigation to logout");
		}
		Thread.sleep(2000);
		
		driver.findElement(By.id("usernameOrEmail")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("tokyo@admin");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit'][@class='ant-btn login-form-button']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='sc-bdVaJa ieeiNp'][@href='#/master/plantlevel']")).click();
		Thread.sleep(2000);
	}

}
