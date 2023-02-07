package TestCases;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import Base.DriverInitialization;
import Pages.ToolTipsPage;

public class ToolTipsTest extends DriverInitialization{
		ToolTipsPage tool = new ToolTipsPage();
		@Test
		public void ToolTipsPage() throws InterruptedException {
			PageFactory.initElements(driver, tool);
			//**********************visible *********************
			testCase = extent.createTest("TOOL-TIP-VISIBLE");
			try {
			Actions action = new Actions(driver);
			action.moveToElement(ToolTipsPage.Duedaytoggle).perform();
			Thread.sleep(2000);
			action.moveByOffset(1,1).perform();
			
			//for unhover  
			
			
			
			boolean ActualElement = ToolTipsPage.tooltip.isDisplayed();
			boolean ExpectedElement=true;
	        
	               
		
	        boolean elementvisible = true;
	        
			try {
				AssertJUnit.assertEquals(ActualElement,ExpectedElement);
			} catch (AssertionError e) {
				elementvisible=false;
			}
			if (elementvisible) {
				testCase.log(Status.INFO,"ActualElement :- " + ActualElement);
				testCase.log(Status.INFO,"ExpectedElement :- " + ExpectedElement);
				testCase.log(Status.INFO,"Element Available");
				testCase.log(Status.PASS,"visible pass");
			} else {
				testCase.log(Status.INFO,"ActualElement :- " + ActualElement);
				testCase.log(Status.INFO,"ExpectedElement :- " + ExpectedElement);
				testCase.log(Status.INFO,"Element not available");
				testCase.log(Status.FAIL,"fail");
			}
				Thread.sleep(2000);	
			}catch(NoSuchElementException e) {
				
				testCase.log(Status.INFO,"Element not available");
				testCase.log(Status.FAIL,"No Element");
				
			}
			
			Thread.sleep(2000);
			//********************tool-tip-arrow********************
//			try {
//			boolean ActualElement1 = ToolTipsPage.arrow.isDisplayed();
//			boolean ExpectedElement1=true;
//	        
//	               
	//	
//	        boolean elementarrowvisible = true;
//	        testCase = extent.createTest("TOOL-TIP-ARROW-VISIBLE");
//			try {
//				AssertJUnit.assertEquals(ActualElement1,ExpectedElement1);
//			} catch (AssertionError e) {
//				elementarrowvisible=false;
//			}
//			if (elementarrowvisible) {
////				testCase.log(Status.INFO,"ActualElement :- " + ActualElement);
////				testCase.log(Status.INFO,"ExpectedElement :- " + ExpectedElement);
////				testCase.log(Status.INFO,"Element Available");
//				testCase.log(Status.PASS,"visible pass");
//			} else {
////				testCase.log(Status.INFO,"ActualElement :- " + ActualElement);
////				testCase.log(Status.INFO,"ExpectedElement :- " + ExpectedElement);
////				testCase.log(Status.INFO,"Element not available");
//				testCase.log(Status.FAIL,"fail");
//			}
//				Thread.sleep(2000);	
//			}catch(Exception e) {
//				
//				testCase.log(Status.INFO,"Element not available");
//				testCase.log(Status.FAIL,"No Element");
//				
//			}
			
			
			
			
			
			
			
			
			Thread.sleep(2000);
			
			
			//********************tool-tip-size********************
			
	try {
			Dimension ActualLengthSize = ToolTipsPage.tooltip.getSize();
			//System.out.println("Size :"+ActualLengthSize);
			Dimension ExpectedLengthSize = new Dimension (120, 42);
			
			
			boolean size = true;
			testCase = extent.createTest("TOOL-TIP-SIZE");
			try {
				AssertJUnit.assertEquals(ActualLengthSize,ExpectedLengthSize);
			} catch (AssertionError e) {
				size=false;
			}
			if (size) {
				testCase.log(Status.INFO,"ActualSize :- " + ActualLengthSize);
				testCase.log(Status.INFO,"ExpectedSize :- " + ExpectedLengthSize);
				testCase.log(Status.INFO,"Correct Size");
				testCase.log(Status.PASS,"Correct Size");
			} else {
				testCase.log(Status.INFO,"ActualSize :- " + ActualLengthSize);
				testCase.log(Status.INFO,"ExpectedSize :- " + ExpectedLengthSize);
				testCase.log(Status.INFO,"wrong Size");
				testCase.log(Status.FAIL,"wrong Size");
			}
	}catch(AssertionError e) {
		testCase.log(Status.INFO,"wrong Size");
		testCase.log(Status.FAIL,"wrong Size");
	}
				Thread.sleep(2000);	
				
			try {	
				String ActualColour = ToolTipsPage.tooltip.getCssValue("background-color");
				System.out.println("rgb :"+ActualColour);
				
				
				//String hexcolour = Color.fromString(ActualColour).asHex();
				String ExpectedColour = "rgba(0, 0, 0, 0)";
				boolean colour = true;
				
				testCase = extent.createTest("TOOL-TIP-BACKGROUND COLOR");
				//System.out.println("CUSTOMER BG-COLOUR: "+ActualColour); 
				try {
					AssertJUnit.assertEquals(ActualColour,ExpectedColour);
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
			}catch(Exception e) {
				testCase.log(Status.INFO,"wrong Colour");
				testCase.log(Status.FAIL,"wrong Colour");
			}
			
			//*******************text spelling****************	
			try {
				Thread.sleep(2000);
				String text = ToolTipsPage.tooltip.getText();
				//System.out.println(text);
				String text1 = "Turn on Due Day";
				boolean txt1 = true;
				testCase = extent.createTest("Spelling on text");
				try {
					AssertJUnit.assertEquals(text, text1);
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
				}
				catch(NoSuchElementException e) {
			//		testCase = extent.createTest("Spelling on text");
					testCase.log(Status.FAIL, "No Element");
				}
				
				Thread.sleep(3000);
				
				//****************position***************
				
				Point ActualLocation = ToolTipsPage.tooltip.getLocation();
//		        int actual_x = ActualLocation.getX();
//		        int actual_y = ActualLocation.getY();
//				System.out.println("X axis TOGGLE-BUTTON: "+actual_x);
//				System.out.println("Y axis TOGGLE-BUTTON: "+actual_y);
				Point ExpectedLocation = new Point(643, 529);
				
				
				 boolean position = true;
				 testCase = extent.createTest("TOOL-TIP-POSITION");
					try {
						AssertJUnit.assertEquals(ActualLocation,ExpectedLocation);
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
				
				//**********************font color***********************
						try {	
							String ActualColour = ToolTipsPage.tooltip.getCssValue("font-color");
							System.out.println("font :"+ ActualColour);
							
							
							//String hexcolour = Color.fromString(ActualColour).asHex();
							String ExpectedColour = "rgba(0, 0, 0, 0)";
							boolean colour = true;
							Thread.sleep(2000);
							testCase = extent.createTest("TOOL-TIP-font COLOR");
							//System.out.println("CUSTOMER BG-COLOUR: "+ActualColour); 
							try {
								AssertJUnit.assertEquals(ActualColour,ExpectedColour);
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
						}catch(Exception e) {
							testCase.log(Status.INFO,"wrong Colour");
							testCase.log(Status.FAIL,"wrong Colour");
						}
				
				
				
			
			//***************unhover********************
			
	try {
		ToolTipsPage.tounhover.click();
			boolean ActualElement = ToolTipsPage.tooltip.isDisplayed();
			boolean ExpectedElement=true;
	        boolean elementvisible = true;
	        testCase = extent.createTest("TOOL-TIP- SHOULD NOT VISIBLE");
			try {
				AssertJUnit.assertEquals(ActualElement,ExpectedElement);
			} catch (AssertionError e) {
				elementvisible=false;
			}
			if (!elementvisible) {
//				testCase.log(Status.INFO,"ActualElement :- " + ActualElement);
//				testCase.log(Status.INFO,"ExpectedElement :- " + ExpectedElement);
		//		testCase.log(Status.INFO,"Element Available");
				testCase.log(Status.PASS,"SHOULD NOT BE VISIBLE");
			} else {
//				testCase.log(Status.INFO,"ActualElement :- " + ActualElement);
//				testCase.log(Status.INFO,"ExpectedElement :- " + ExpectedElement);
//				testCase.log(Status.INFO,"Element not available");
				testCase.log(Status.FAIL,"fail");
			}
				Thread.sleep(2000);	
			}catch(Exception e) {
				
				testCase.log(Status.INFO,"Element not available");
				testCase.log(Status.FAIL,"No Element");
				
			}
			

			
			
			
			
			
			
//			String actualTooltip = ToolTipsPage.tooltip.getAttribute("title");
//			System.out.println(actualTooltip);
//			String expectedTooltip = "Turn on Due Day";
//			assertEquals(actualTooltip, expectedTooltip);
	Thread.sleep(1500);
	WebElement Home= driver.findElement(By.xpath("//a[@class='sc-bdVaJa ieeiNp'][@href='#/']"));
			Home.click();
	Thread.sleep(2000);
	}
	}
