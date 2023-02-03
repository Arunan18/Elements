package TestCases;
import java.io.IOException;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.support.PageFactory;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import Base.DriverInitialization;
import Pages.IconPage;

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
	/*End width & height*/	
	
}	
}


