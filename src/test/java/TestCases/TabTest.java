package TestCases;

import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import Base.DriverInitialization;

public class TabTest extends DriverInitialization{
	public static void TestCasePrint(String TestCaseName, String expectedValue, String actualValue) {
		boolean position = true;
		 testCase = extent.createTest(TestCaseName);
		try {
			Assert.assertEquals(actualValue, expectedValue);
		} catch (AssertionError e) {
			position = false;
		}
		if (position) {
			testCase.log(Status.INFO, "Actualvalue :- " + actualValue);
			testCase.log(Status.INFO, "Expectedvalue :- " + expectedValue);
			testCase.log(Status.INFO, "Correct value");
			testCase.log(Status.PASS, actualValue);
		} else {
			testCase.log(Status.INFO, "Actualvalue :- " + actualValue);
			testCase.log(Status.INFO, "ExpectedValue :- " + expectedValue);
			testCase.log(Status.INFO, "wrong value");
			testCase.log(Status.FAIL, actualValue);
		}
	}



	@Test
	public static void testBasicItems() throws InterruptedException {
//	Test Tabs names (all)
		try {
			String ExpectedValue = "[Plant, Equipment, Material, Customer, Supplier, Employee]";
			String TabItems = driver.findElement(By.xpath("/html/body/div[1]/div/section/section/header/ul")).getText();
			String[] Tabsfull = TabItems.split("\n");
			int newLength = Tabsfull.length - 1;
			String[] Tabs = Arrays.copyOf(Tabsfull, newLength);
			String value = Arrays.toString(Tabs);

			System.out.println(value);

			TestCasePrint("TAB - TEST TAB NAMES", ExpectedValue, value);
		} catch (Exception e) {
			TestCasePrint("TAB - TEST TAB NAMES", "[Plant, Equipment, Material, Customer, Supplier, Employee]",
					String.valueOf(e));
		}

//	Background color

		try {
			String value = driver.findElement(By.xpath("/html/body/div[1]/div/section/section/header/ul"))
					.getCssValue("color");
			System.out.println(value);
			String ExpectedValue = "rgba(255, 255, 255, 0.65)";
			TestCasePrint("TAB - TEST BG COLOR", ExpectedValue, value);
		} catch (Exception e) {
			TestCasePrint("TAB - TEST BG COLOR", "rgba(255, 255, 255, 0.65)", String.valueOf(e));
		}

//	Position
		try {
			String value = driver.findElement(By.xpath("/html/body/div[1]/div/section/section/header/ul/li[1]/span/a"))
					.getLocation().toString();
			System.out.println(value);
			String ExpectedValue = "(373, 23)";
			TestCasePrint("TAB - TEST POSITION", ExpectedValue, value);
		} catch (Exception e) {
			TestCasePrint("TAB - TEST POSITION", "(373, 23)", String.valueOf(e));
		}

// 	Size
		try {
			String value = driver.findElement(By.xpath("/html/body/div[1]/div/section/section/header/ul/li[1]/span/a"))
					.getSize().toString();
			System.out.println(value);
			String ExpectedValue = "(72, 17)";
			TestCasePrint("TAB - TEST SIZE", ExpectedValue, value);
		} catch (Exception e) {
			TestCasePrint("TAB - TEST SIZE", "(72, 17)", String.valueOf(e));
		}

// Font-size
		try {
			String value = driver.findElement(By.xpath("/html/body/div[1]/div/section/section/header/ul/li[1]/span/a"))
					.getCssValue("font-size");
			System.out.println(value);
			String ExpectedValue = "14px";
			TestCasePrint("TAB - TEST FONT SIZE", ExpectedValue, value);
		} catch (Exception e) {
			TestCasePrint("TAB - TEST FONT SIZE", "14px", String.valueOf(e));
		}

// Border-color
		try {

			String value = driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/section/header/ul/li[1]"))
					.getCssValue("border-color");
			System.out.println(value);
			String ExpectedValue = "rgb(0, 21, 41) rgb(0, 21, 41) rgba(255, 255, 255, 0.65)";
			TestCasePrint("TAB - TEST BORDER COLOR", ExpectedValue, value);
		} catch (Exception e) {
			TestCasePrint("TAB - TEST BORDER COLOR", "rgb(0, 21, 41) rgb(0, 21, 41) rgba(255, 255, 255, 0.65)",
					String.valueOf(e));
		}

// Border-width
		try {

			String value = driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/section/header/ul/li[1]"))
					.getCssValue("border-width");
			System.out.println(value);
			String ExpectedValue = "0px";
			TestCasePrint("TAB - TEST BORDER WIDTH", ExpectedValue, value);
		} catch (Exception e) {
			TestCasePrint("TAB - TEST BORDER WIDTH", "0px", String.valueOf(e));
		}

// Visibility
		try {

			String value = String.valueOf(
					driver.findElement(By.xpath("/html/body/div[1]/div/section/section/header/ul/li[1]/span/a"))
							.isDisplayed());
			System.out.println(value);
			String ExpectedValue = "true";
			TestCasePrint("TAB - TEST VISIBILITY", ExpectedValue, value);
		} catch (Exception e) {
			TestCasePrint("TAB - TEST VISIBILITY", "true", String.valueOf(e));
		}

// Font Style
		try {

			String value = String.valueOf(
					driver.findElement(By.xpath("/html/body/div[1]/div/section/section/header/ul/li[1]/span/a"))
							.getCssValue("font-style"));
			System.out.println(value);
			String ExpectedValue = "normal";
			TestCasePrint("TAB - TEST FONT STYLE", ExpectedValue, value);
		} catch (Exception e) {
			TestCasePrint("TAB - TEST FONT STYLE", "normal", String.valueOf(e));
		}

// Font Color
		try {

			String value = String.valueOf(
					driver.findElement(By.xpath("/html/body/div[1]/div/section/section/header/ul/li[1]/span/a"))
							.getCssValue("color"));
			System.out.println(value);
			String ExpectedValue = "rgba(255, 0, 0, 1)";
			TestCasePrint("TAB - TEST FONT COLOR", ExpectedValue, value);
		} catch (Exception e) {
			TestCasePrint("TAB - TEST FONT COLOR", "rgba(255, 0, 0, 1)", String.valueOf(e));
		}

// Enabled
		try {

			String value = String.valueOf(driver
					.findElement(By.xpath("/html/body/div[1]/div/section/section/header/ul/li[1]/span/a")).isEnabled());
			System.out.println(value);
			String ExpectedValue = "true";
			TestCasePrint("TAB - TEST ENABILITY", ExpectedValue, value);
		} catch (Exception e) {
			TestCasePrint("TAB - TEST ENABILITY", "true", String.valueOf(e));
		}

// cursor
		try {

			String value = String.valueOf(
					driver.findElement(By.xpath("/html/body/div[1]/div/section/section/header/ul/li[1]/span/a"))
							.getCssValue("cursor"));
			System.out.println(value);
			String ExpectedValue = "pointer";
			TestCasePrint("TAB - TEST CURSOR", ExpectedValue, value);
		} catch (Exception e) {
			TestCasePrint("TAB - TEST CURSOR", "pointer", String.valueOf(e));
		}

// Color change on click
		try {

			driver.findElement(By.xpath("/html/body/div[1]/div/section/section/header/ul/li[1]/span/a")).click();
			Thread.sleep(1000);
			String b4value = String.valueOf(
					driver.findElement(By.xpath("/html/body/div[1]/div/section/section/header/ul/li[2]/span/a"))
							.getCssValue("color"));

			driver.findElement(By.xpath("/html/body/div[1]/div/section/section/header/ul/li[2]/span/a")).click();
			Thread.sleep(1000);

			String aftvalue = String.valueOf(
					driver.findElement(By.xpath("/html/body/div[1]/div/section/section/header/ul/li[2]/span/a"))
							.getCssValue("color"));

			driver.findElement(By.xpath("/html/body/div[1]/div/section/section/header/ul/li[1]/span/a")).click();
			Thread.sleep(1000);

			String value = "before: " + b4value + " after: " + aftvalue;
			System.out.println(value);
			String ExpectedValue = "before: rgba(255, 255, 255, 0.65) after: rgba(255, 0, 0, 1)";

			TestCasePrint("TAB - COLOR CHANGE WHILE ACTIVE", ExpectedValue, value);
		} catch (Exception e) {
			TestCasePrint("TAB - COLOR CHANGE WHILE ACTIVE",
					"before: rgba(255, 255, 255, 0.65) after: rgba(255, 0, 0, 1)", String.valueOf(e));
		}
		
// Color Change on Hover
		try {
			
			String url = "//*[@id=\"root\"]/div/section/section/header/ul/li[3]";
			Thread.sleep(2000);
			String value1 = driver.findElement(By.xpath(url)).getCssValue("background-color");
			
			Actions actions = new Actions(driver);
			actions.moveToElement(driver.findElement(By.xpath(url))).perform();
			Thread.sleep(2000);
			
//			actions.moveToElement(driver.findElement(By.xpath(url))).perform();
			
			String value2 = driver.findElement(By.xpath(url)).getCssValue("background-color");
			
			String value = "before: " + value1 + ", after :" + value2;
			String ExpectedValue = "before: rgba(0, 0, 0, 0), after :rgba(24, 144, 255, 1)";
			System.out.println(value);
			
			TestCasePrint("TAB - COLOR CHANGE ON HOVER", ExpectedValue, value);
		} catch (Exception e) {
			TestCasePrint("TAB - COLOR CHANGE ON HOVER", "before: rgba(0, 0, 0, 0), after :rgba(24, 144, 255, 1)", String.valueOf(e));
		}
		
		
		

	}
}

