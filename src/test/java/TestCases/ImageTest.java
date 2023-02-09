package TestCases;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.Point;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import Base.DriverInitialization;
import Pages.ImagePage;
import Pages.UnitPage;

public class ImageTest extends DriverInitialization{
ImagePage ip = new ImagePage();

@Test
public void Image() throws InterruptedException {
	PageFactory.initElements(driver, ip);
	
	try {
		if (ImagePage.image.isDisplayed()) {
//			Image Displayed
			boolean ActualImageDisplay = ImagePage.image.isDisplayed();
			boolean ExpectedImageDisplay = true;
			testCase = extent.createTest("IMAGE-DISPLAYED");
			try {
				Assert.assertEquals(ActualImageDisplay, ExpectedImageDisplay);
				testCase.log(Status.INFO, "Actual Image Displayed :- " + ActualImageDisplay);
				testCase.log(Status.INFO, "Expected Image Displayed :- " + ExpectedImageDisplay);
				testCase.log(Status.PASS, " Image Displayed is Correct");
			} catch (AssertionError e) {
				testCase.log(Status.INFO, "Actual Image Displayed :- " + ActualImageDisplay);
				testCase.log(Status.INFO, "Expected Image Displayed :- " + ExpectedImageDisplay);
				testCase.log(Status.FAIL, " Image Displayed is Wrong");
			}
			
//			Check Image Position
			Point ExpectedImageLocation = new Point(29, 40);
			Point actualImageLocation = ImagePage.image.getLocation();
			testCase = extent.createTest("IMAGE-POSITION");
			try {
				Thread.sleep(1000);
				Assert.assertEquals(actualImageLocation, ExpectedImageLocation);
				Thread.sleep(3000);
				testCase.log(Status.INFO, "Actual Image Position :- " + actualImageLocation);
				testCase.log(Status.INFO, "Expected Image Position :- " + ExpectedImageLocation);
				testCase.log(Status.INFO, "Correct Image Position");
				testCase.log(Status.PASS, " Image Position Correct");
			} catch (AssertionError e) {
				testCase.log(Status.INFO, "Actual Image Position :- " + actualImageLocation);
				testCase.log(Status.INFO, "Expected Image Position :- " + ExpectedImageLocation);
				testCase.log(Status.INFO, "Wrong  Image Position");
				testCase.log(Status.FAIL, " Image Position Wrong");
			}
			
//			Check Image the size
			Dimension ActualImageSize = ImagePage.image.getSize();
			Dimension ExpectedImageSize = new Dimension (400, 80);
			testCase = extent.createTest("IMAGE-SIZE");
			try {
				Assert.assertEquals(ActualImageSize, ExpectedImageSize);
				testCase.log(Status.INFO, "Actual Image Size :- " + ActualImageSize);
				testCase.log(Status.INFO, "Expected Image Size :- " + ExpectedImageSize);
				testCase.log(Status.INFO, "CorrectImage Size");
				testCase.log(Status.PASS, "Correct Image Size");
			} catch (AssertionError e) {
				testCase.log(Status.INFO, "Actual Image Size :- " + ActualImageSize);
				testCase.log(Status.INFO, "Expected Image Size :- " + ExpectedImageSize);
				testCase.log(Status.INFO, "wrong Image Size");
				testCase.log(Status.FAIL, "wrong Image Size");
			}
//			Check Opacity
			String elementOpacity = ImagePage.image.getCssValue("opacity");
			double ActualOpacity = Double.parseDouble(elementOpacity);
			double ExpectedOpacity = 0.6;
			testCase = extent.createTest("IMAGE-OPACITY");
			try {
				Assert.assertEquals(ActualOpacity, ExpectedOpacity);
				testCase.log(Status.INFO, "Actual Image Opacity :- " + ActualOpacity);
				testCase.log(Status.INFO, "Expected Image Opacity :- " + ExpectedOpacity);
				testCase.log(Status.INFO, "CorrectImage Opacity");
				testCase.log(Status.PASS, "Correct Image Opacity");
			} catch (AssertionError e) {
				testCase.log(Status.INFO, "Actual Image Opacity :- " + ActualOpacity);
				testCase.log(Status.INFO, "Expected Image Opacity :- " + ExpectedOpacity);
				testCase.log(Status.INFO, "wrong Image Opacity");
				testCase.log(Status.FAIL, "wrong Image Opacity");
			}
			
//			Check border Radius 
			String ActualBorderRadius = ImagePage.image.getCssValue("border-Radius");
			String ExpectedBorderRadius = "10px";
			testCase = extent.createTest("IMAGE-BORDER-RADIUS");
			try {
				Assert.assertEquals(ActualBorderRadius, ExpectedBorderRadius);
				testCase.log(Status.INFO, "Actual Border Radius :- " + ActualBorderRadius);
				testCase.log(Status.INFO, "Expected Border Radius :- " + ExpectedBorderRadius);
				testCase.log(Status.INFO, "Correct Border Radius");
				testCase.log(Status.PASS, "Correct Border Radius");
			} catch (AssertionError e) {
				testCase.log(Status.INFO, "Actual Border Radius :- " + ActualBorderRadius);
				testCase.log(Status.INFO, "Expected Border Radius :- " + ExpectedBorderRadius);
				testCase.log(Status.INFO, "wrong border Radius");
				testCase.log(Status.FAIL, "wrong border Radius");
			}
//			 padding
				String Actualpadding = ImagePage.image.getCssValue("padding");
		        String Expectedpadding = "0px";
		        testCase = extent.createTest("IMAGE PADDING");
		        try {
		            Assert.assertEquals(Actualpadding, Expectedpadding);
		            testCase.log(Status.INFO, "Actual padding :- " + Actualpadding);
					testCase.log(Status.INFO, "Expected padding :- " + Expectedpadding);
					testCase.log(Status.PASS, "padding is Correct");
				} catch (AssertionError e) {
					testCase.log(Status.INFO, "Actual padding :- " + Actualpadding);
					testCase.log(Status.INFO, "Expected padding :- " + Expectedpadding);
					testCase.log(Status.FAIL, "padding is Wrong");
		        }
//			Tittle
		        String Actualtitle = ImagePage.image.getAttribute("title");
		        String ExpectedTittle = "";
		        testCase = extent.createTest("IMAGE TITTLE");
		        try {
		            Assert.assertEquals(Actualtitle, ExpectedTittle);
		            testCase.log(Status.INFO, "Actual Tittle :- " + Actualtitle);
					testCase.log(Status.INFO, "Expected Tittle :- " + ExpectedTittle);
					testCase.log(Status.PASS, "Tittle is Correct");
				} catch (AssertionError e) {
					testCase.log(Status.INFO, "Actual Tittle :- " + Actualtitle);
					testCase.log(Status.INFO, "Expected Tittle :- " + ExpectedTittle);
					testCase.log(Status.FAIL, "Tittle is Wrong");
		        }
		         
//				Alt
		        String ActualAlt = ImagePage.image.getAttribute("alt");
		        String ExpectedAlt = "Logo";
		        testCase = extent.createTest("IMAGE ALT");
		        try {
		            Assert.assertEquals(ActualAlt, ExpectedAlt);
		            testCase.log(Status.INFO, "Actual Alt :- " + ActualAlt);
					testCase.log(Status.INFO, "Expected Alt :- " + ExpectedAlt);
					testCase.log(Status.PASS, "Alt is Correct");
				} catch (AssertionError e) {
					testCase.log(Status.INFO, "Actual Alt :- " + ActualAlt);
					testCase.log(Status.INFO, "Expected Alt :- " + ExpectedAlt);
					testCase.log(Status.FAIL, "Alt is Wrong");
		        }
		        Thread.sleep(2000);
//		    	Image Filter
		    	Object ActualFilter =((JavascriptExecutor)driver).executeScript("arguments[0].style.filter = 'blur(5px)'", ImagePage.image);
		    	Object ExpectedFilter =null;
		    	 testCase = extent.createTest("IMAGE FILTER");
			        try {
			            Assert.assertEquals(ActualFilter, ExpectedFilter);
			            testCase.log(Status.INFO, "Actual Filter :- " + ActualFilter);
						testCase.log(Status.INFO, "Expected Filter :- " + ExpectedFilter);
						testCase.log(Status.PASS, "Filter is Correct");
					} catch (AssertionError e) {
						testCase.log(Status.INFO, "Actual Filter :- " + ActualFilter);
						testCase.log(Status.INFO, "Expected Filter :- " + ExpectedFilter);
						testCase.log(Status.FAIL, "Filter is Wrong");
			        }
//			        Image clickable
			        boolean ActualImageEnable = ImagePage.image.isEnabled();
			        boolean ExpectedImageEnable = false;
			        testCase = extent.createTest("IMAGE CLICKABLE");
			        try {
			            Assert.assertEquals(ActualImageEnable, ExpectedImageEnable);
			            testCase.log(Status.INFO, "Actual Image clickable :- " + ActualImageEnable);
						testCase.log(Status.INFO, "Expected Image clickable :- " + ExpectedImageEnable);
						testCase.log(Status.PASS, "Image Not clickable");
					} catch (AssertionError e) {
						testCase.log(Status.INFO, "Actual Image clickable :- " + ActualImageEnable);
						testCase.log(Status.INFO, "Expected Image clickable :- " + ExpectedImageEnable);
						testCase.log(Status.FAIL, "Image clickable");
			        }
			        
		}
		else {
			testCase = extent.createTest("IMAGE DISPLAYED");
			testCase.log(Status.INFO, "Image Not Displayed");
			testCase.log(Status.FAIL, " Image Not Displayed");
		}
	} catch (NoSuchElementException e) {
		testCase = extent.createTest("IMAGE Locator");
		testCase.log(Status.INFO, "Dont Have Image Locator");
		testCase.log(Status.FAIL, " Dont Have Image Locator");
	}

	
}
	 
}
