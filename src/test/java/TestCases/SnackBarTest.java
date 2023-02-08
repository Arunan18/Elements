package TestCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import Base.DriverInitialization;
import Pages.SnackBarPage;

public class SnackBarTest extends DriverInitialization {
SnackBarPage snackpg = new SnackBarPage();
	
	@Test
	public void snackbar() throws InterruptedException {
		
	PageFactory.initElements(driver, snackpg);	
		
	/*SnackBarPage.username.sendKeys("admin");
	SnackBarPage.password.sendKeys("tokyo@admin");
	SnackBarPage.login.click();
	Thread.sleep(3000);*/
//	SnackBarPage.homebtn.click();
//	SnackBarPage.mastercard.click();
//	Thread.sleep(2000);
	SnackBarPage.plantheader.click();
	SnackBarPage.sbubtnsite.click();
	SnackBarPage.addsbubtn.click();
	Thread.sleep(2000);
	SnackBarPage.sbufiled.sendKeys("testy");
	SnackBarPage.desfield.sendKeys("snackbar testing descritpion1");
	SnackBarPage.savebtn.click();
	Thread.sleep(2000);
	SnackBarPage.addedsuggessmsg.click();
	
		
	
	// Snackbar Visible - Displayed
	
    boolean ExpectedsnackbarVisible=true;
    boolean ActualsnackbarVisible=SnackBarPage.addedsuggessmsg.isDisplayed();
    testCase = extent.createTest("SNACKBAR VISIBLE");
    try {
        Assert.assertEquals(ActualsnackbarVisible, ExpectedsnackbarVisible);
        testCase.log(Status.INFO, "Actual Snackbar Visible :- " + ActualsnackbarVisible);
        testCase.log(Status.INFO, "Expected Snackbar Visible :- " + ExpectedsnackbarVisible);
        testCase.log(Status.PASS, "Snackbar Visible is Correct");
    } catch (AssertionError e) {
        testCase.log(Status.INFO, "Actual Snackbar Visible :- " + ActualsnackbarVisible);
        testCase.log(Status.INFO, "Expected Snackbar Visible :- " + ExpectedsnackbarVisible);
        testCase.log(Status.FAIL, "Snackbar Visible is Wrong");
    }
    
    if (SnackBarPage.addedsuggessmsg.isDisplayed()) {
	    System.out.println("Snackbar is Visible");

	    // Get the text of the snackbar
	    String snackbarText = SnackBarPage.addedsuggessmsg.getText();
	    System.out.println("Snackbar text: " + snackbarText);

	    // Interact with buttons in the snackbar if present
	    List<WebElement> buttons = SnackBarPage.addedsuggessmsg.findElements(By.tagName("button"));
	    if (!buttons.isEmpty()) {
	        for (WebElement button : buttons) {
	            button.click();
	        }
	    }
	} else {
	    System.out.println("Snackbar is not displayed");
	}
    Thread.sleep(2000);
    

		
 // Snackbar  Enable
    
    boolean ExpectedsnackbarEnable=true;
    boolean ActualsnackbarEnable=SnackBarPage.addedsuggessmsg.isEnabled();
    testCase = extent.createTest("SNACKBAR ENABLE");
    try {
        Assert.assertEquals(ActualsnackbarEnable, ExpectedsnackbarEnable);
        testCase.log(Status.INFO, "Actual Snackbar Visible :- " + ActualsnackbarEnable);
        testCase.log(Status.INFO, "Expected Snackbar Visible :- " + ExpectedsnackbarEnable);
        testCase.log(Status.PASS, "Snackbar Visible is Correct");
    } catch (AssertionError e) {
        testCase.log(Status.INFO, "Actual Snackbar Visible :- " + ActualsnackbarEnable);
        testCase.log(Status.INFO, "Expected Snackbar Visible :- " + ExpectedsnackbarEnable);
        testCase.log(Status.FAIL, "Snackbar Visible is Wrong");
    }
   
    
  //Check Snackbar position
	
	Point ActualLocation = SnackBarPage.addedsuggessmsg.getLocation();
    
    int actual_x = ActualLocation.getX();
    int actual_y = ActualLocation.getY();
	
	System.out.println("X axis SNACKBAR: "+actual_x);
	System.out.println("Y axis SNACKBAR: "+actual_y);
	
	
	
	Point ExpectedLocation = new Point(1030, 40);
	
	
	 boolean position = true;
	 testCase = extent.createTest("SNACKBAR POSITION");
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
				
			
			
			// Check the Snackbar size
			Dimension ActualSize = SnackBarPage.addedsuggessmsg.getSize();
			System.out.println("Size :"+ActualSize);
			Dimension ExpectedSize = new Dimension(288, 24);
			
			
			boolean size = true;
			testCase = extent.createTest("SNACKBAR-SIZE");
			try {
				Assert.assertEquals(ActualSize,ExpectedSize);
			} catch (AssertionError e) {
				size=false;
			}
			if (size) {
				testCase.log(Status.INFO,"ActualSize :- " + ActualSize);
				testCase.log(Status.INFO,"ExpectedSize :- " + ExpectedSize);
				testCase.log(Status.INFO,"Correct Size");
				testCase.log(Status.PASS,"Correct Size");
			} else {
				testCase.log(Status.INFO,"ActualSize :- " + ActualSize);
				testCase.log(Status.INFO,"ExpectedSize :- " + ExpectedSize);
				testCase.log(Status.INFO,"wrong Size");
				testCase.log(Status.FAIL,"wrong Size");
			}
			Thread.sleep(2000);
			
			
			//Check Snackbar background color
			
			String ActualColour = SnackBarPage.addedsuggessmsg.getCssValue("background-color");
			System.out.println("rgb :"+ActualColour);
			
			
			//String hexcolour = Color.fromString(ActualColour).asHex();
			String ExpectedColour = "rgba(0, 0, 0, 0)";
			boolean colour = true;
			
			testCase = extent.createTest("SNACKBAR BG-COLOUR");
			System.out.println("SNACKBAR BG-COLOUR: "+ActualColour); 
			try {
				Assert.assertEquals(ActualColour,ExpectedColour);
			} catch (AssertionError e) {
				colour=false;
			}
			if (colour) {
				testCase.log(Status.INFO,"ActualColour :- " + ActualColour);
				testCase.log(Status.INFO,"ExpectedColour :- " + ExpectedColour);
				testCase.log(Status.INFO,"Correct Colour");
				testCase.log(Status.PASS,"Correct Colour");
			} else {
				testCase.log(Status.INFO,"ActualColour :- " + ActualColour);
				testCase.log(Status.INFO,"ExpectedColour :- " + ExpectedColour);
				testCase.log(Status.INFO,"wrong Colour");
				testCase.log(Status.FAIL,"wrong Colour");
			}
				Thread.sleep(2000);	
				
		
			
			// Text Snackbar of the element 
			
			
			String actualElementText = SnackBarPage.addedsuggessmsg.getText();
			String expectedElementText = "SubBusinessUnit Added Successfully";
			System.out.println("SNACKBAR-TEXT: "+actualElementText);
			testCase = extent.createTest("SNACKBAR-TEXT");
			try {
				Assert.assertEquals(actualElementText, expectedElementText);
				testCase.log(Status.INFO, "ActualText :- " + actualElementText);
				testCase.log(Status.INFO, "ExpectedText :- " + expectedElementText);
				testCase.log(Status.INFO, "Correct Text");
				testCase.log(Status.PASS, "Correct Text");
			} catch (AssertionError e) {
				testCase.log(Status.INFO, "ActualText :- " + actualElementText);
				testCase.log(Status.INFO, "ExpectedText :- " + expectedElementText);
				testCase.log(Status.INFO, "wrong Text");
				testCase.log(Status.FAIL, "wrong Text");
			}
						
			
//		 	Check snackbar border colour 
			String ActualBorderColour = SnackBarPage.addedsuggessmsg.getCssValue("border-color");
			System.out.println("SNACKBAR-BORDER-COLOUR: "+ActualBorderColour);
			String ExpectedBorderColour = "rgba(0, 0, 0, 0.85)";
			testCase = extent.createTest("SNACKBAR-BORDER-COLOUR");
			try {
				Assert.assertEquals(ActualBorderColour, ExpectedBorderColour);
				testCase.log(Status.INFO, "Actual Border Colour :- " + ActualBorderColour);
				testCase.log(Status.INFO, "Expected Border Colour :- " + ExpectedBorderColour);
				testCase.log(Status.INFO, "Correct Border Colour");
				testCase.log(Status.PASS, "Correct Border Colour");
			} catch (AssertionError e) {
				testCase.log(Status.INFO, "Actual Border Colour :- " + ActualBorderColour);
				testCase.log(Status.INFO, "Expected Border Colour :- " + ExpectedBorderColour);
				testCase.log(Status.INFO, "wrong border Colour");
				testCase.log(Status.FAIL, "wrong border Colour");
			}
		

//		 	Check snackbar font colour 
			String ActualfontColour = SnackBarPage.addedsuggessmsg.getCssValue("color");
			System.out.println("SNACKBAR-FONT-COLOUR: "+ActualfontColour);
			String ExpectedfontColour = "rgba(0, 0, 0, 0.85)";
			testCase = extent.createTest("SNACKBAR-FONT-COLOUR");
			try {
				Assert.assertEquals(ActualfontColour, ExpectedfontColour);
				testCase.log(Status.INFO, "Actual font Colour :- " + ActualfontColour);
				testCase.log(Status.INFO, "Expected font Colour :- " + ExpectedfontColour);
				testCase.log(Status.INFO, "Correct font Colour");
				testCase.log(Status.PASS, "Correct font Colour");
			} catch (AssertionError e) {
				testCase.log(Status.INFO, "Actual font Colour :- " + ActualfontColour);
				testCase.log(Status.INFO, "Expected font Colour :- " + ExpectedfontColour);
				testCase.log(Status.INFO, "wrong font Colour");
				testCase.log(Status.FAIL, "wrong font Colour");
			}
			
			
			// 	Check snackbar font variant 
			String Actualfontvariant = SnackBarPage.addedsuggessmsg.getCssValue("font-variant");
			System.out.println("SNACKBAR-FONT-VARIANT: "+Actualfontvariant);
			String Expectedfontvariant = "tabular-nums";
			testCase = extent.createTest("SNACKBAR-FONT-VARIANT");
			try {
				Assert.assertEquals(Actualfontvariant, Expectedfontvariant);
				testCase.log(Status.INFO, "Actual variant :- " + Actualfontvariant);
				testCase.log(Status.INFO, "Expected variant :- " + Expectedfontvariant);
				testCase.log(Status.INFO, "Correct variant");
				testCase.log(Status.PASS, "Correct variant");
			} catch (AssertionError e) {
				testCase.log(Status.INFO, "Actual variant :- " + Actualfontvariant);
				testCase.log(Status.INFO, "Expected variant :- " + Expectedfontvariant);
				testCase.log(Status.INFO, "wrong variant");
				testCase.log(Status.FAIL, "wrong variant");
			}
				
							
//				 	Check snackbar Padding 
							String Actualpadding = SnackBarPage.addedsuggessmsg.getCssValue("padding");
							System.out.println("SNACKBAR-PADDING: "+Actualpadding);
							String Expectedpadding = "0px 24px 0px 0px";
							testCase = extent.createTest("SNACKBAR-PADDING");
							try {
								Assert.assertEquals(Actualpadding, Expectedpadding);
								testCase.log(Status.INFO, "Actual padding :- " + Actualpadding);
								testCase.log(Status.INFO, "Expected padding :- " + Expectedpadding);
								testCase.log(Status.INFO, "Correct padding");
								testCase.log(Status.PASS, "Correct padding");
							} catch (AssertionError e) {
								testCase.log(Status.INFO, "Actual padding :- " + Actualpadding);
								testCase.log(Status.INFO, "Expected padding :- " + Expectedpadding);
								testCase.log(Status.INFO, "wrong padding");
								testCase.log(Status.FAIL, "wrong padding");
							}
							
							//Check snackbar Height 
							String Actualheight= SnackBarPage.addedsuggessmsg.getCssValue("height");
							System.out.println("SNACKBAR-HEIGHT: "+Actualheight);
							String Expectedheight = "24px";
							testCase = extent.createTest("SNACKBAR-HEIGHT");
							try {
								Assert.assertEquals(Actualheight, Expectedheight);
								testCase.log(Status.INFO, "Actual height :- " + Actualheight);
								testCase.log(Status.INFO, "Expected height :- " + Expectedheight);
								testCase.log(Status.INFO, "Correct height");
								testCase.log(Status.PASS, "Correct height");
							} catch (AssertionError e) {
								testCase.log(Status.INFO, "Actual height :- " + Actualheight);
								testCase.log(Status.INFO, "Expected height :- " + Expectedheight);
								testCase.log(Status.INFO, "wrong height");
								testCase.log(Status.FAIL, "wrong height");
							}
							//Check snackbar Width 
							String Actualwidth= SnackBarPage.addedsuggessmsg.getCssValue("width");
							System.out.println("SNACKBAR-WEIGHT: "+Actualwidth);
							String Expectedwidth = "288px";
							testCase = extent.createTest("SNACKBAR-WEIGHT");
							try {
								Assert.assertEquals(Actualwidth, Expectedwidth);
								testCase.log(Status.INFO, "Actual Width :- " + Actualwidth);
								testCase.log(Status.INFO, "Expected Width :- " + Expectedwidth);
								testCase.log(Status.INFO, "Correct Width");
								testCase.log(Status.PASS, "Correct Width");
							} catch (AssertionError e) {
								testCase.log(Status.INFO, "Actual Width :- " + Actualwidth);
								testCase.log(Status.INFO, "Expected Width :- " + Expectedwidth);
								testCase.log(Status.INFO, "wrong Width");
								testCase.log(Status.FAIL, "wrong Width");
							}
							//Check snackbar position 
							String Actualposition= SnackBarPage.addedsuggessmsg.getCssValue("position");
							System.out.println("SNACKBAR-POSITION: "+Actualposition);
							String Expectedposition = "static";
							testCase = extent.createTest("SNACKBAR-POSITION");
							try {
								Assert.assertEquals(Actualposition, Expectedposition);
								testCase.log(Status.INFO, "Actual position :- " + Actualposition);
								testCase.log(Status.INFO, "Expected position :- " + Expectedposition);
								testCase.log(Status.INFO, "Correct position");
								testCase.log(Status.PASS, "Correct position");
							} catch (AssertionError e) {
								testCase.log(Status.INFO, "Actual position :- " + Actualposition);
								testCase.log(Status.INFO, "Expected position :- " + Expectedposition);
								testCase.log(Status.INFO, "wrong position");
								testCase.log(Status.FAIL, "wrong position");
							}
							//Check snackbar border-radius 
							String Actualradius= SnackBarPage.addedsuggessmsg.getCssValue("border-radius");
							System.out.println("SNACKBAR-BORDER-RADIUS "+Actualradius);
							String Expectedradius = "0px";
							testCase = extent.createTest("SNACKBAR-BORDER-RADIUS");
							try {
								Assert.assertEquals(Actualradius, Expectedradius);
								testCase.log(Status.INFO, "Actual radius :- " + Actualradius);
								testCase.log(Status.INFO, "Expected radius :- " + Expectedradius);
								testCase.log(Status.INFO, "Correct radius");
								testCase.log(Status.PASS, "Correct radius");
							} catch (AssertionError e) {
								testCase.log(Status.INFO, "Actual radius :- " + Actualradius);
								testCase.log(Status.INFO, "Expected radius :- " + Expectedradius);
								testCase.log(Status.INFO, "wrong radius");
								testCase.log(Status.FAIL, "wrong radius");
							}
						
							
							
		
	}
	
}