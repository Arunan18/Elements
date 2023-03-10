package TestCases;
import java.io.IOException;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import Base.DriverInitialization;
import Pages.IconPage;
import Pages.UnitPage;

public class IconTest extends DriverInitialization{


	IconPage ip = new IconPage();
	@Test
	public void mainn() throws IOException, InterruptedException {
	
		// TODO Auto-generated method stub

		PageFactory.initElements(driver, ip);
		
//		WebElement home = driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/section/header/a[2]"));
//		org.openqa.selenium.Dimension homelogo = home.getSize();
//		
//		WebElement image = driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/section/header/a[2]/div")); 
//		
//		String imageurl ="http://192.168.1.36:3000/static/media/homebtn.4acad38d.png";
//		String actualUrl = driver.getCurrentUrl();
//		
//		
//		WebElement image_element = driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/section/header/a[2]"));
//
//		
//		String image_source = image_element.getAttribute("//*[@id=\"root\"]/div/section/section/header/a[2]");
//		System.out.println("new" + image_source);
//		SoftAssert sa = new SoftAssert();
		
//		 sa.assertEquals(imageurl,image_source);
		
    

		
	/*Element Visible Start*/
		
		boolean AcctualElementDisplayed = IconPage.IMG.isDisplayed();
		IconPage.IMG.isDisplayed();
		boolean ExpectedElementDisplayed = true;

		boolean elementvisible = true;
		testCase = extent.createTest("Element Visible");
		try {
			AssertJUnit.assertEquals(AcctualElementDisplayed, ExpectedElementDisplayed);
		} catch (AssertionError find) {
			elementvisible = false;
		}
		if (elementvisible) {
			testCase.log(Status.INFO, "ActualElement :- " + AcctualElementDisplayed);
			testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedElementDisplayed);
			testCase.log(Status.INFO, "Element Available");
			testCase.log(Status.PASS, "Correct Element");
		} else {
			testCase.log(Status.INFO, "ActualElement :- " + AcctualElementDisplayed);
			testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedElementDisplayed);
			testCase.log(Status.INFO, "Element not available");
			testCase.log(Status.FAIL, "No Element");
		}
		Thread.sleep(2000);     
	/*Element Visible End*/
		
/*Element Enable Start*/
		
		boolean AcctualElementEnabled = IconPage.IMG.isEnabled();
		IconPage.IMG.isDisplayed();
		boolean ExpectedElementEnabled = true;

		boolean elementenable = true;
		testCase = extent.createTest("Element Enable");
		try {
			AssertJUnit.assertEquals(AcctualElementEnabled, ExpectedElementEnabled);
		} catch (AssertionError find) {
			elementenable = false;
		}
		if (elementenable) {
			testCase.log(Status.INFO, "ActualElement :- " + AcctualElementEnabled);
			testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedElementEnabled);
			testCase.log(Status.INFO, "Element Available");
			testCase.log(Status.PASS, "Correct Element");
		} else {
			testCase.log(Status.INFO, "ActualElement :- " + AcctualElementEnabled);
			testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedElementEnabled);
			testCase.log(Status.INFO, "Element not available");
			testCase.log(Status.FAIL, "No Element");
		}
		Thread.sleep(2000);     
		
	/*Element Enable End*/
		
		
	/*new file*/

		Thread.sleep(2000);

		Point actualLocation = IconPage.IMG.getLocation();

		int  x = actualLocation.getX();
		int y = actualLocation.getY();
		
		System.out.println("x-axis = " + x);
		System.out.println("y-axis = " + y);
		
		
		Point expectedLocation = new Point(220, 0);
		testCase = extent.createTest("position");
		boolean position = true;
		
		try {
			AssertJUnit.assertEquals(actualLocation, expectedLocation);
		} catch (AssertionError find) {
			position = false;
		}
			if (position) {
				testCase.log(Status.INFO, "ActualElement :- " + actualLocation);
				testCase.log(Status.INFO, "ExpectedElement :- " + expectedLocation);
			
				testCase.log(Status.PASS, "Correct ");
			} else {
				testCase.log(Status.INFO, "ActualElement :- " + actualLocation);
				testCase.log(Status.INFO, "ExpectedElement :- " + expectedLocation);
				
				testCase.log(Status.FAIL, "wrong");
			}
			
	/*new file end*/
				
	/*new width & height*/
			
			Thread.sleep(2000);
			Dimension size = IconPage.IMG.getSize();
			int actualWidth = size.getWidth();
			System.out.println("width  = " + actualWidth);
			int expectedSize = 55;
			
			testCase = extent.createTest("width");
			boolean width1 = true;
			
			try {
				AssertJUnit.assertEquals(actualWidth, expectedSize);
			} catch (AssertionError find) {
				width1 = false;
			}
			if (width1) {
					testCase.log(Status.INFO, "ActualElement :- " + actualWidth);
					testCase.log(Status.INFO, "ExpectedElement :- " + expectedSize);
					
					testCase.log(Status.PASS, "Correct ");
				} else {
					testCase.log(Status.INFO, "ActualElement :- " + actualWidth);
					testCase.log(Status.INFO, "ExpectedElement :- " + expectedSize);
					
					testCase.log(Status.FAIL, "wrong");
				}

			

			Thread.sleep(2000);

			int actualHeight = size.getHeight();
			System.out.println("height = " + actualHeight);
			int expectedHeight = 55;

			boolean height1 = true;
			testCase = extent.createTest("height");
			try {
				AssertJUnit.assertEquals(actualHeight, expectedHeight);
			} catch (AssertionError find) {
				height1 = false;

			}
			if (height1) {
					testCase.log(Status.INFO, "ActualElement :- " + actualHeight);
					testCase.log(Status.INFO, "ExpectedElement :- " + expectedHeight);
					
					testCase.log(Status.PASS, "Correct ");
				} else {
					testCase.log(Status.INFO, "ActualElement :- " + actualHeight);
					testCase.log(Status.INFO, "ExpectedElement :- " + expectedHeight);
					
					testCase.log(Status.FAIL, "wrong");
				}
			
//			background color
			String bgcolor = IconPage.IMG.getCssValue("background-color");
			String Actualbgcolor = Color.fromString(bgcolor).asHex();
	        String Expectedbgcolor = "#000000";

	        testCase = extent.createTest("Icon BACKGROUND COLOR");
	        try {
	            Assert.assertEquals(Actualbgcolor, Expectedbgcolor);
	            testCase.log(Status.INFO, "Actual background color :- " + Actualbgcolor);
	            testCase.log(Status.INFO, "Expected background color :- " + Expectedbgcolor);
	            testCase.log(Status.PASS, " background color Correct ");
	        } catch (AssertionError e) {
	            testCase.log(Status.INFO, "Actual background color :- " + Actualbgcolor);
	            testCase.log(Status.INFO, "Expected background color :- " + Expectedbgcolor);    
	            testCase.log(Status.FAIL, " background color wrong");
	        }
		
	        //Fill color
	        String fillColor = IconPage.IMG.getCssValue("fill");
	        String ActualFillColor = Color.fromString(fillColor).asHex();
	        String ExpectedFillColor="#000000";
	        testCase = extent.createTest("ICON FILL COLOR");
	        try {
				Assert.assertEquals(ActualFillColor, ExpectedFillColor);
				testCase.log(Status.INFO, "Actual Fill color :- " + ActualFillColor);
	            testCase.log(Status.INFO, "Expected Fill color :- " + ExpectedFillColor);
	            testCase.log(Status.PASS, " Fill color Correct ");
	        } catch (AssertionError e) {
	            testCase.log(Status.INFO, "Actual Fill color :- " + ActualFillColor);
	            testCase.log(Status.INFO, "Expected Fill color :- " + ExpectedFillColor);    
	            testCase.log(Status.FAIL, " Fill color wrong");
			}
//	        Icon Image
	        String ActualImageUrl = IconPage.IMG.getAttribute("xlink:href");
	        String ExpectedImageUrl=null;
	        testCase = extent.createTest("ICON IMAGE");
	        try {
				Assert.assertEquals(ActualImageUrl, ExpectedImageUrl);
				testCase.log(Status.INFO, "Actual Icon Image :- " + ActualImageUrl);
	            testCase.log(Status.INFO, "Expected Icon Image :- " + ExpectedImageUrl);
	            testCase.log(Status.PASS, " Icon Image Correct ");
	        } catch (AssertionError e) {
	            testCase.log(Status.INFO, "Actual Icon Image :- " + ActualImageUrl);
	            testCase.log(Status.INFO, "Expected Icon Image :- " + ExpectedImageUrl);    
	            testCase.log(Status.FAIL, " Icon Image wrong");
			}
//			boolean ActualIconEnable=IconPage.IMG.isEnabled();
//			boolean ExpectedIconEnable=true;
//			testCase = extent.createTest("Icon -Enable");
//			try {
//				
//			} catch (AssertionError e) {
//				// TODO: handle exception
//			}
			
	/*End width & height*/	
	 
}	
}


