package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Locatable;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import Base.DriverInitialization;
import Pages.ToolPage;
import Pages.ToolTipsPage;

public class ToolTest extends DriverInitialization {
	ToolPage tp = new ToolPage();

	@Test
	public void Tool() throws InterruptedException {
		PageFactory.initElements(driver, tp);

		
		Thread.sleep(2000);
//		ToolPage.TestConfiguration.click();
//		Thread.sleep(2000);
//		ToolPage.ConfigureTest.click();
//		Thread.sleep(2000);
		Actions actions = new Actions(driver);
		Thread.sleep(2000);
		// Locate the element
		WebElement element = driver.findElement(By.xpath("//button[@type='button'][@role='switch']"));
		
		Thread.sleep(2000);
		actions.moveToElement(element).perform();
		Thread.sleep(2000);
//		String tooltipText = ToolPage.ToolTips.getAttribute("title");
//		System.out.println(tooltipText);
		Thread.sleep(2000);
		System.out.println(ToolPage.ToolTips.getText());
		Thread.sleep(2000);
		
		testCase = extent.createTest("TOOL-TIP-LOCATOR");
		try {
			boolean locator = ToolPage.ToolTips.isDisplayed();
			testCase.log(Status.INFO,"Element available");
			testCase.log(Status.PASS,"Element available");
			if (locator) {
				
//				Visible
				boolean ActualVisible = ToolPage.ToolTips.isDisplayed();
				boolean ExpectedVisible = true;
				testCase = extent.createTest("TOOL-TIP-VISIBLE");
				try {
					Assert.assertEquals(ActualVisible, ExpectedVisible);
					testCase.log(Status.INFO,"ActualElement :- " + ActualVisible);
					testCase.log(Status.INFO,"ExpectedElement :- " + ExpectedVisible);
					testCase.log(Status.INFO,"Element Available");
					testCase.log(Status.PASS,"visible pass");
				} catch (AssertionError e) {
					testCase.log(Status.INFO,"ActualElement :- " + ActualVisible);
					testCase.log(Status.INFO,"ExpectedElement :- " + ExpectedVisible);
					testCase.log(Status.INFO,"Element not available");
					testCase.log(Status.FAIL,"fail");
				}
				Thread.sleep(2000);
				Dimension ActualSize = ToolPage.ToolTips.getSize();
				Dimension ExpectedSize = new Dimension (118, 34);
				testCase = extent.createTest("TOOL-TIP-SIZE");
				try {
					Assert.assertEquals(ActualSize, ExpectedSize);
					testCase.log(Status.INFO,"ActualSize :- " + ActualSize);
					testCase.log(Status.INFO,"ExpectedSize :- " + ExpectedSize);
					testCase.log(Status.INFO,"Correct Size");
					testCase.log(Status.PASS,"Correct Size");
				} catch (AssertionError e) {
					testCase.log(Status.INFO,"ActualSize :- " + ActualSize);
					testCase.log(Status.INFO,"ExpectedSize :- " + ExpectedSize);
					testCase.log(Status.INFO,"wrong Size");
					testCase.log(Status.FAIL,"wrong Size");
				}
				Thread.sleep(2000); 
//				background color
				String color1 = ToolPage.ToolTips.getCssValue("background-color");
				String ActualBackColour = Color.fromString(color1).asHex();
				String ExpectedBackColor ="#000000";
				testCase = extent.createTest("TOOL-TIP-BACKGROUND COLOR");
				try {
					Assert.assertEquals(ActualBackColour, ExpectedBackColor);
					testCase.log(Status.INFO,"ActualColour :- " + ActualBackColour);
					testCase.log(Status.INFO,"ExpectedColour :- " + ExpectedBackColor);
					testCase.log(Status.INFO,"Correct Colour");
					testCase.log(Status.PASS,"Correct Colour");
				} catch (AssertionError e) {
					testCase.log(Status.INFO,"ActualColour :- " + ActualBackColour);
					testCase.log(Status.INFO,"ExpectedColour :- " + ExpectedBackColor);
					testCase.log(Status.INFO,"wrong Colour");
					testCase.log(Status.FAIL,"wrong Colour");
				}
				Thread.sleep(2000);
//				text spelling before click
				String ActualTextBefore = ToolPage.ToolTips.getText(); 
				String ExpectedTextBefore = "Turn on Due Day";
				testCase = extent.createTest("TOOL-TIPS TEXT SPELLING BEFORE CLICK");
				try {
					Assert.assertEquals(ActualTextBefore, ExpectedTextBefore);
					testCase.log(Status.INFO, "Actual Text Before click :- " + ActualTextBefore);
					testCase.log(Status.INFO, "Expected Text Before click :- " + ExpectedTextBefore);
					testCase.log(Status.INFO, "correct Text Before click");
					testCase.log(Status.PASS, "Correct ");
				} catch (AssertionError e) {
					testCase.log(Status.INFO, "Actual Text Before click :- " + ActualTextBefore);
					testCase.log(Status.INFO, "Expected Text Before click :- " + ExpectedTextBefore);
					testCase.log(Status.INFO, "wrong Text Before click");
					testCase.log(Status.FAIL, "wrong");
				}
				Thread.sleep(1000);
//				Position
				Point ActualLocation = ToolPage.ToolTips.getLocation();
				Point ExpectedLocation = new Point(643, 536);
				testCase = extent.createTest("TOOL-TIP-POSITION");
				try {
					Assert.assertEquals(ActualLocation, ExpectedLocation);
					testCase.log(Status.INFO,"ActualLocation :- " + ActualLocation);
					testCase.log(Status.INFO,"ExpectedLocation :- " + ExpectedLocation);
					testCase.log(Status.INFO,"Correct Position");
					testCase.log(Status.PASS,"Position correct");
				} catch (AssertionError e) {
					testCase.log(Status.INFO,"ActualLocation :- " + ActualLocation);
					testCase.log(Status.INFO,"ExpectedLocation :- " + ExpectedLocation);
					testCase.log(Status.INFO,"wrong Position");
					testCase.log(Status.FAIL,"Position Wrong");
				}
				Thread.sleep(2000);
//				Font Color
				String fontColour =ToolPage.ToolTips.getCssValue("color");
				String ActualFontColour = Color.fromString(fontColour).asHex();
				String ExpectedFontColor ="#ffffff";
				testCase = extent.createTest("TOOL-TIP-FONT COLOR");
				try {
					Assert.assertEquals(ActualFontColour, ExpectedFontColor);
					testCase.log(Status.INFO,"ActualColour :- " + ActualFontColour);
					testCase.log(Status.INFO,"ExpectedColour :- " + ExpectedFontColor);
					testCase.log(Status.INFO,"Correct Colour");
		 			testCase.log(Status.PASS,"Correct Colour");
				} catch (AssertionError e) {
					testCase.log(Status.INFO,"ActualColour :- " + ActualFontColour);
					testCase.log(Status.INFO,"ExpectedColour :- " + ExpectedFontColor);
					testCase.log(Status.INFO,"wrong Colour");
					testCase.log(Status.FAIL,"wrong Colour");
				} 
				Thread.sleep(2000);
//				unhover
				ToolPage.Unhover.click();
				Thread.sleep(3000);
				boolean Actual1Element = ToolPage.ToolTips.isDisplayed();
				boolean Expected1Element=false;
				 testCase = extent.createTest("TOOL-TIPS-VISIBLE");
				 try {
					Assert.assertEquals(Actual1Element, Expected1Element);
					testCase.log(Status.INFO,"ActualElement :- " + Actual1Element);
					testCase.log(Status.INFO,"ExpectedElement :- " + Expected1Element);
					testCase.log(Status.INFO,"Element Available");
					testCase.log(Status.PASS,"visible pass");
				} catch (AssertionError e) {
					testCase.log(Status.INFO,"ActualElement :- " + Actual1Element);
					testCase.log(Status.INFO,"ExpectedElement :- " + Expected1Element);
					testCase.log(Status.INFO,"Element not available");
					testCase.log(Status.FAIL,"fail");
				}
//					text spelling after click
				 ToolPage.DueDayButton.click();
				 Thread.sleep(3000);
					String ActualTextAfter = ToolPage.ToolTips.getText();
					Thread.sleep(2000);
					String ExpectedTextAfter = "Turn off Due Day";
					testCase = extent.createTest("TOOL-TIPS TEXT SPELLING AFTER CLICK");
					try {
						Assert.assertEquals(ActualTextAfter, ExpectedTextAfter);
						testCase.log(Status.INFO, "Actual Text Before click :- " + ActualTextAfter);
						testCase.log(Status.INFO, "Expected Text Before click :- " + ExpectedTextAfter);
						testCase.log(Status.INFO, "correct Text Before click");
						testCase.log(Status.PASS, "Correct ");
					} catch (AssertionError e) {
						testCase.log(Status.INFO, "Actual Text Before click :- " + ActualTextAfter);
						testCase.log(Status.INFO, "Expected Text Before click :- " + ExpectedTextAfter);
						testCase.log(Status.INFO, "wrong Text Before click");
						testCase.log(Status.FAIL, "wrong");
					}
				
//					Border color
					String BorderColour =ToolPage.ToolTips.getCssValue("border-color");
					String ActualBorderColour = Color.fromString(BorderColour).asHex();
					String ExpectedBorderColor ="#ffffff";
					testCase = extent.createTest("TOOL-TIP-BORDRT COLOR");
					try {
						Assert.assertEquals(ActualBorderColour, ExpectedBorderColor);
						testCase.log(Status.INFO,"Actual border-color :- " + ActualBorderColour);
						testCase.log(Status.INFO,"Expected border-color :- " + ExpectedBorderColor);
						testCase.log(Status.INFO,"Correct border-color");
			 			testCase.log(Status.PASS,"Correct border-color");
					} catch (AssertionError e) {
						testCase.log(Status.INFO,"Actual border-color :- " + ActualBorderColour);
						testCase.log(Status.INFO,"Expected border-color :- " + ExpectedBorderColor);
						testCase.log(Status.INFO,"wrong border-color");
						testCase.log(Status.FAIL,"wrong border-color");
					} 
					Thread.sleep(2000);
					
//					Border thickness
					String ActualBorderThickness =ToolPage.ToolTips.getCssValue("border-width");
					String ExpectedBorderThickness ="0px";
					testCase = extent.createTest("TOOL-TIP-BORDER THIKNESS");
					try {
						Assert.assertEquals(ActualBorderThickness, ExpectedBorderThickness);
						testCase.log(Status.INFO,"Actual border-thickness :- " + ActualBorderThickness);
						testCase.log(Status.INFO,"Expected border-thickness :- " + ExpectedBorderThickness);
						testCase.log(Status.INFO,"Correct border-thickness");
			 			testCase.log(Status.PASS,"Correct border-thickness");
					} catch (AssertionError e) {
						testCase.log(Status.INFO,"Actual border-thickness :- " + ActualBorderThickness);
						testCase.log(Status.INFO,"Expected border-thickness :- " + ExpectedBorderThickness);
						testCase.log(Status.INFO,"wrong border-thickness");
						testCase.log(Status.FAIL,"wrong border-thickness");
					} 
					Thread.sleep(2000);
					
					
				
			} 
			else {
				testCase = extent.createTest("TOOL-TIPS VISIBLE");
				testCase.log(Status.INFO,"Element not visible");
				testCase.log(Status.FAIL,"Element not visible");
			}
		} catch (NoSuchElementException e) {
			testCase.log(Status.INFO,"Element not available"); 
			testCase.log(Status.FAIL,"Element not available");
		}
		WebElement Home= driver.findElement(By.xpath("//a[@class='sc-bdVaJa ieeiNp'][@href='#/']"));
		Home.click();
Thread.sleep(2000);
	}
}
