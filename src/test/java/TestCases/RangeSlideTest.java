package TestCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import Base.DriverInitialization;
import Pages.RangeSlidePage;

public class RangeSlideTest extends DriverInitialization{

RangeSlidePage loginnew = new RangeSlidePage();
	
	@Test
	public void mainn() throws IOException, InterruptedException {

			PageFactory.initElements(driver, loginnew);
			Thread.sleep(3000);
			
			RangeSlidePage.closebutton.click();
			Thread.sleep(3000);
			
			RangeSlidePage.mobiles.click();
			
			Thread.sleep(3000);
			RangeSlidePage.rangebanner.click();
			
			
/*Range slider Enabled*/
			
			Thread.sleep(3000);
			boolean ExpectedRangeslideEenable = true;
			boolean ActualRangeslideEenable = RangeSlidePage.rangeslidefull.isEnabled();
			testCase = extent.createTest("Range slider page Enabled");
					
			try {
				Assert.assertEquals(ActualRangeslideEenable, ExpectedRangeslideEenable);
				testCase.log(Status.INFO, "ActualElement :- " + ActualRangeslideEenable);
				testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedRangeslideEenable);
				testCase.log(Status.INFO, "Element Available");
				testCase.log(Status.PASS, "Correct Element");
				
			} 
			catch (AssertionError e) {
				testCase.log(Status.INFO, "ActualElement :- " + ActualRangeslideEenable);
				testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedRangeslideEenable);
				testCase.log(Status.INFO, "Element not available");
				testCase.log(Status.FAIL, "No Element");
			}
			Thread.sleep(2000); 
			
/*Range slider visible Start*/
			
			Thread.sleep(1500);
			boolean ExpectedRSVDisplayed = true;
			boolean AcctuaRSVDisplayed = RangeSlidePage.rangeslidefull.isDisplayed();
			RangeSlidePage.rangeslidefull.isDisplayed();

			testCase = extent.createTest("Range slider page Visible");
			try {
				Assert.assertEquals(AcctuaRSVDisplayed, ExpectedRSVDisplayed);
				testCase.log(Status.INFO, "ActualElement :- " + AcctuaRSVDisplayed);
				testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedRSVDisplayed);
				testCase.log(Status.INFO, "Element Available");
				testCase.log(Status.PASS, "Correct Element");
				
			} catch (AssertionError find) {
				testCase.log(Status.INFO, "ActualElement :- " + AcctuaRSVDisplayed);
				testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedRSVDisplayed);
				testCase.log(Status.INFO, "Element not available");
				testCase.log(Status.FAIL, "No Element");
			}
			
			Thread.sleep(2000);
			
/*Range slider background-color Start*/
			
			Thread.sleep(2000);
			String bordercolor = RangeSlidePage.rangeslidefull.getCssValue("background-color").toString();
			String Expectedbordercolor = "rgba(0, 0, 0, 0)";

			testCase = extent.createTest("Range slider background-color");
			try {
				Assert.assertEquals(bordercolor, Expectedbordercolor);
				testCase.log(Status.INFO, "ActualElement :- " + bordercolor);
				testCase.log(Status.INFO, "ExpectedElement :- " + Expectedbordercolor);
				testCase.log(Status.PASS, "Correct ");
			} catch (AssertionError e) {
				testCase.log(Status.INFO, "ActualElement :- " + bordercolor);
				testCase.log(Status.INFO, "ExpectedElement :- " + Expectedbordercolor);	
				testCase.log(Status.FAIL, "wrong");
			}
			
/*Range slider selected area background-color Start*/
			
			Thread.sleep(2000);
			String bordercolorSA = RangeSlidePage.selectedareacolor.getCssValue("background-color").toString();
			String ExpectedbordercolorSA = "rgba(40, 116, 240, 1)";

			testCase = extent.createTest("Range slider selected area background-color");
			try {
				Assert.assertEquals(bordercolorSA, ExpectedbordercolorSA);
				testCase.log(Status.INFO, "ActualElement :- " + bordercolorSA);
				testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedbordercolorSA);
				testCase.log(Status.PASS, "Correct ");
			} catch (AssertionError e) {
				testCase.log(Status.INFO, "ActualElement :- " + bordercolorSA);
				testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedbordercolorSA);	
				testCase.log(Status.FAIL, "wrong");
			}
/*Range slider page Position Start*/
			
			Thread.sleep(2000);
			Point actualLocation = RangeSlidePage.rangeslidefull.getLocation();

			int  x = actualLocation.getX();
			int y = actualLocation.getY();
			
			System.out.println("x-axis = " + x);
			System.out.println("y-axis = " + y);
			
			
			Point expectedLocation = new Point(24, 552);
			testCase = extent.createTest("position");
			
			try {
				Assert.assertEquals(actualLocation, expectedLocation);
				testCase.log(Status.INFO, "ActualElement :- " + actualLocation);
				testCase.log(Status.INFO, "ExpectedElement :- " + expectedLocation);
				testCase.log(Status.PASS, "Correct ");
			} catch (AssertionError e) {
				testCase.log(Status.INFO, "ActualElement :- " + actualLocation);
				testCase.log(Status.INFO, "ExpectedElement :- " + expectedLocation);
				testCase.log(Status.FAIL, "wrong");
			}			
			
			
/*Range slider border-width Start*/
			
			Thread.sleep(2000);
			String borderwidth = RangeSlidePage.rangeslidefull.getCssValue("border-width").toString();
			String Expectedborderwidth = "rgba(0, 0, 0, 0)";

			testCase = extent.createTest("Range slider page border-width");
			try {
				Assert.assertEquals(bordercolor, Expectedbordercolor);
				testCase.log(Status.INFO, "ActualElement :- " + bordercolor);
				testCase.log(Status.INFO, "ExpectedElement :- " + Expectedbordercolor);
				testCase.log(Status.PASS, "Correct ");
			} catch (AssertionError e) {
				testCase.log(Status.INFO, "ActualElement :- " + bordercolor);
				testCase.log(Status.INFO, "ExpectedElement :- " + Expectedbordercolor);	
				testCase.log(Status.FAIL, "wrong");
			}
			
//Range slider Cursor
			try {
				Thread.sleep(3000);
				String actualCursorPoint = RangeSlidePage.rangeslidefull.getCssValue("cursor");
				String expectedCursorPoint = "pointer";

				testCase = extent.createTest("Range-Cursor-Pointer");
				try {
					Assert.assertEquals(actualCursorPoint, expectedCursorPoint);
					testCase.log(Status.INFO, "ActualAlignment :- " + actualCursorPoint);
					testCase.log(Status.INFO, "ExpectedAlignment :- " + expectedCursorPoint);
					testCase.log(Status.INFO, "Element Available");
					testCase.log(Status.PASS, "Correct element");
				} catch (AssertionError e) {
					testCase.log(Status.INFO, "ActualAlignment :- " + actualCursorPoint);
					testCase.log(Status.INFO, "ExpectedAlignment :- " + expectedCursorPoint);
					testCase.log(Status.INFO, "Element not available");
					testCase.log(Status.FAIL, "No Element");
				}

			} catch (Exception e) {
				testCase = extent.createTest("Range-Cursor-Pointer");
				testCase.log(Status.FAIL, "No Element");
			}
			
/*Range slider Height Start*/
			
			Thread.sleep(3000);
			Dimension hightsize = RangeSlidePage.rangeslidefull.getSize();
			int ActualHeight = hightsize.getHeight();
			int ExpectedHeight = 13;

			testCase = extent.createTest("Range slider Height");
			try {
				Assert.assertEquals(ActualHeight, ExpectedHeight);
				testCase.log(Status.INFO, "ActualElement :- " + ActualHeight);
				testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedHeight);
				testCase.log(Status.PASS, "Correct ");
			} catch (AssertionError e) {
				testCase.log(Status.INFO, "ActualElement :- " + ActualHeight);
				testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedHeight);	
				testCase.log(Status.FAIL, "wrong");
			}
			
/*Range slider Width Start*/
			
			Thread.sleep(2000);
			Dimension size = RangeSlidePage.rangeslidefull.getSize();
			int ActualWidth = size.getWidth();
			int ExpectedWidth = 174;
			
			testCase = extent.createTest("Range slider Width");
			
			try {
				Assert.assertEquals(ActualWidth, ExpectedWidth);
				testCase.log(Status.INFO, "ActualElement :- " + ActualWidth);
				testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedWidth);
				testCase.log(Status.PASS, "Correct ");
			} 
			catch (AssertionError e) {
				testCase.log(Status.INFO, "ActualElement :- " + ActualWidth);
				testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedWidth);
				testCase.log(Status.FAIL, "wrong");
			}
			
/*Range slider Minimum value Start*/
			
			Thread.sleep(3000);
			String minval = RangeSlidePage.minvalue.getText();
			String expectedminval = "Min";
			
			testCase = extent.createTest("Minimum value");
			
			try {
				Assert.assertEquals(minval, expectedminval);
				testCase.log(Status.INFO, "ActualElement :- " + minval);
				testCase.log(Status.INFO, "ExpectedElement :- " + expectedminval);
				testCase.log(Status.INFO, "expectedText");
				testCase.log(Status.PASS, "Correct ");
			}
			catch(AssertionError e){
				testCase.log(Status.INFO, "ActualElement :- " + minval);
				testCase.log(Status.INFO, "ExpectedElement :- " + expectedminval);
				testCase.log(Status.INFO, "WrongText");
				testCase.log(Status.FAIL, "wrong");
				}
			
			Thread.sleep(2000);
			
/*Add slider Button Text Start*/	
			
			Thread.sleep(2000);
			String maxval = RangeSlidePage.maxvalue.getText();
			String expectedmaxval = "₹30000+";
			
			testCase = extent.createTest("Maximum Value");
			
			try {
				Assert.assertEquals(maxval, expectedmaxval);
				testCase.log(Status.INFO, "ActualElement :- " + maxval);
				testCase.log(Status.INFO, "ExpectedElement :- " + expectedmaxval);
				testCase.log(Status.INFO, "expectedText");
				testCase.log(Status.PASS, "Correct ");
			}
			catch(AssertionError e){
				testCase.log(Status.INFO, "ActualElement :- " + maxval);
				testCase.log(Status.INFO, "ExpectedElement :- " + expectedmaxval);
				testCase.log(Status.INFO, "WrongText");
				testCase.log(Status.FAIL, "wrong");
				}
			
			Thread.sleep(2000);
			
/*border-Thickness Start*/
			
			Thread.sleep(2000);
			String borderthick = RangeSlidePage.borderline.getCssValue("border-top-width").toString();
			String Expectedborderthik= "0px";

			testCase = extent.createTest("Range slider border-thickness");
			try {
				Assert.assertEquals(borderthick, Expectedborderthik);
				testCase.log(Status.INFO, "ActualElement :- " + borderthick);
				testCase.log(Status.INFO, "ExpectedElement :- " + Expectedborderthik);
				testCase.log(Status.PASS, "Correct ");
			} catch (AssertionError e) {
				testCase.log(Status.INFO, "ActualElement :- " + borderthick);
				testCase.log(Status.INFO, "ExpectedElement :- " + Expectedborderthik);	
				testCase.log(Status.FAIL, "wrong");
			}
			

//Drag the slider from min-value
			
//			loginnew.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='_31Kbhn _28DFQy']")));
//			WebElement min = driver.findElement(By.xpath("//div[@class='_31Kbhn _28DFQy']"));
//			int width = min.getSize().getWidth();
//			Actions dragmin = new Actions(driver);
//			dragmin.dragAndDropBy(min,width*4,0);
//			dragmin.build().perform();
	
			
//Drag the slider from min-value		
		   Thread.sleep(2000);
	       int width = driver.findElement(By.xpath("//div[@class='_2IN3-t']")).getSize().getWidth();        
	        System.out.println(width);
	        
	        //move element
	        WebElement sourceElement = driver.findElement(By.xpath("//div[@class='_3FdLqY']"));
	      
	        int xDistance = width/5*1;
	        Actions actions = new Actions(driver);
	        
	        actions.clickAndHold(sourceElement)
	               .moveByOffset(xDistance, 0)
	               .release()
	               .build()
	               .perform();
	        
	        Thread.sleep(2000);
	        
	        int oldx = RangeSlidePage.minbutton.getLocation().getX();
	        System.out.println(oldx);
	        
	        driver.findElement(By.xpath("//div[@class='_1YAKP4']//select[@class='_2YxCDZ']")).click();
	        Thread.sleep(2000);
	        
	        driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div/div[1]/div/div[1]/div/section[2]/div[4]/div[1]/select/option[2]")).click();
	        
	        int newx = RangeSlidePage.minbutton.getLocation().getX();
	        System.out.println(newx);
		        
 // assert using oldx, newx
		        
		        
//		      Drag the slider from max-value
				Thread.sleep(2000);
				loginnew.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='_31Kbhn WC_zGJ']")));
				WebElement max = driver.findElement(By.xpath("//div[@class='_31Kbhn WC_zGJ']"));
				int widthm = max.getSize().getWidth();
				Actions dragmin = new Actions(driver);
				dragmin = new Actions(driver);
				dragmin.dragAndDropBy(max, -widthm*2,0);
				dragmin.build().perform();
			

		
	}

}