package TestCases;

import org.openqa.selenium.Point;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import Base.DriverInitialization;
import Pages.Placeholderpage;

public class PlaceholderTest extends DriverInitialization{
Placeholderpage placepg = new Placeholderpage();
	
	@Test
	public void placeholder() throws InterruptedException {
		
		PageFactory.initElements(driver, placepg);
		
		
		/*Placeholderpage.username.sendKeys("admin");
		Placeholderpage.password.sendKeys("tokyo@admin");
		Placeholderpage.login.click();
	    Thread.sleep(3000);*/
	    Placeholderpage.samplehomecard.click();
	    Thread.sleep(2000);
	    Placeholderpage.incommingbtn.click();
	    Thread.sleep(2000);
	    Placeholderpage.samplecodefield.click();
	    
		
	  //Fetching the placeholder value
      	//WebElement emailField = driver.findElement(By.id("address"));
      	String placeholderVal = Placeholderpage.samplecodefield.getAttribute("placeholder");
      	String expectedVal = "Enter Sample Code";
      	if(placeholderVal.equalsIgnoreCase(expectedVal))
             	System.out.println("The placeholder value is expected, ie : "+placeholderVal);
      	else
             	System.out.println("The placeholder value is not correct --- " +placeholderVal);
      	
	testCase = extent.createTest("PLACEHOLDER-SAMPLE");
	try {
		Assert.assertEquals(placeholderVal, expectedVal);
		testCase.log(Status.INFO, "ActualText :- " + placeholderVal);
		testCase.log(Status.INFO, "ExpectedText :- " + expectedVal);
		testCase.log(Status.INFO, "Correct Text");
		testCase.log(Status.PASS, "Correct Text");
	} catch (AssertionError e) {
		testCase.log(Status.INFO, "ActualText :- " + placeholderVal);
		testCase.log(Status.INFO, "ExpectedText :- " + expectedVal);
		testCase.log(Status.INFO, "wrong Text");
		testCase.log(Status.FAIL, "wrong Text");
	}
	Thread.sleep(2000);
	
	
	 //check if element visible
	
	boolean AcctualElement=Placeholderpage.samplecodefield.isDisplayed();
    boolean ExpectedElement=true;
    

    boolean elementvisible = true;
    testCase = extent.createTest("PLACEHOLDER-ELEMENT-VISIBLE");
	try {
		Assert.assertEquals(AcctualElement,ExpectedElement);
	} catch (AssertionError e) {
		elementvisible=false;
	}
	if (elementvisible) {
		testCase.log(Status.INFO,"ActualElement :- " + AcctualElement);
		testCase.log(Status.INFO,"ExpectedElement :- " + ExpectedElement);
		testCase.log(Status.INFO,"Element Available");
		testCase.log(Status.PASS,"Correct element");
	} else {
		testCase.log(Status.INFO,"ActualElement :- " + AcctualElement);
		testCase.log(Status.INFO,"ExpectedElement :- " + ExpectedElement);
		testCase.log(Status.INFO,"Element not available");
		testCase.log(Status.FAIL,"No Element");
	}
		Thread.sleep(2000);	
	
// OPACITY
		String actualElementopacity = Placeholderpage.samplecodefield.getCssValue("opacity");
		String expectedElementopacity = "1";
		System.out.println("PLACEHOLDER-OPACITY: "+actualElementopacity);
		testCase = extent.createTest("PLACEHOLDER-OPACITY");
		try {
			Assert.assertEquals(actualElementopacity, expectedElementopacity);
			testCase.log(Status.INFO, "ActualText :- " + actualElementopacity);
			testCase.log(Status.INFO, "ExpectedText :- " + expectedElementopacity);
			testCase.log(Status.INFO, "Correct Text");
			testCase.log(Status.PASS, "Correct Text");
		} catch (AssertionError e) {
			testCase.log(Status.INFO, "ActualText :- " + actualElementopacity);
			testCase.log(Status.INFO, "ExpectedText :- " + expectedElementopacity);
			testCase.log(Status.INFO, "wrong Text");
			testCase.log(Status.FAIL, "wrong Text");
		}
		Thread.sleep(2000);

		//Check position
		
		Point ActualLocation = Placeholderpage.samplecodefield.getLocation();
        
        int actual_x = ActualLocation.getX();
        int actual_y = ActualLocation.getY();
		
		System.out.println("X axis: "+actual_x);
		System.out.println("Y axis: "+actual_y);
		
		
		
		Point ExpectedLocation = new Point(815, 275);
		
		
		 boolean position = true;
		 testCase = extent.createTest("PLACEHOLDER POSITION");
			try {
				Assert.assertEquals(ActualLocation,ExpectedLocation);
			} catch (AssertionError e) {
				position=false;
			}
			if (position) {
				testCase.log(Status.INFO,"ActualLocation :- " + ActualLocation);
				testCase.log(Status.INFO,"ExpectedLocation :- " + ExpectedLocation);
				testCase.log(Status.INFO,"Correct Position");
				testCase.log(Status.PASS,"Position correct");
			} else {
				testCase.log(Status.INFO,"ActualLocation :- " + ActualLocation);
				testCase.log(Status.INFO,"ExpectedLocation :- " + ExpectedLocation);
				testCase.log(Status.INFO,"wrong Position");
				testCase.log(Status.FAIL,"Position Wrong");
			}
				Thread.sleep(2000);	
				
				
				
		
					
					// Check font family of the element 
					
					
					String actualElementfamily = Placeholderpage.samplecodefield.getCssValue("font-family");
					System.out.println("PLACEHOLDER-FONT-FAMILY: "+actualElementfamily);
					String expectedElementFamily = "Roboto, sans-serif";
					testCase = extent.createTest("PLACEHOLDER-FONT-FAMILY");
					try {
						Assert.assertEquals(actualElementfamily, expectedElementFamily);
						testCase.log(Status.INFO, "ActualText :- " + actualElementfamily);
						testCase.log(Status.INFO, "ExpectedText :- " + expectedElementFamily);
						testCase.log(Status.INFO, "Correct Text");
						testCase.log(Status.PASS, "Correct Text");
					} catch (AssertionError e) {
						testCase.log(Status.INFO, "ActualText :- " + actualElementfamily);
						testCase.log(Status.INFO, "ExpectedText :- " + expectedElementFamily);
						testCase.log(Status.INFO, "wrong Text");
						testCase.log(Status.FAIL, "wrong Text");
					}
					Thread.sleep(2000);
					
					// check font color
					
					String Actualfontcolor = Placeholderpage.samplecodefield.getCssValue("color"); 
					System.out.println("Font Size: "+Actualfontcolor); 
					testCase = extent.createTest("PLACEHOLDER-FONT-COLOUR");
					String Expectedfontcolor ="rgba(0, 0, 0, 0.85)";
					boolean fontcolor = true;
					try {
						Assert.assertEquals(Actualfontcolor, Expectedfontcolor);
					} catch (AssertionError e) {
						fontcolor=false;
					}
					if (fontcolor) {
						testCase.log(Status.INFO,"ActualfontsSize :- " + Actualfontcolor);
						testCase.log(Status.INFO,"ExpectedfontsSize :- " + Expectedfontcolor);
						testCase.log(Status.INFO,"Correct font-size");
						testCase.log(Status.PASS,"Font-size Correct");
					} else {
						testCase.log(Status.INFO,"ActualfontsSize :- " + Actualfontcolor);
						testCase.log(Status.INFO,"ExpectedfontsSize :- " + Expectedfontcolor);
						testCase.log(Status.INFO,"Wrong font-size");
						testCase.log(Status.FAIL,"Font-size Wrong");
					}
						Thread.sleep(2000);	
			
					
					
}

}



