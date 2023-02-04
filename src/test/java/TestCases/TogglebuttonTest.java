package TestCases;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import Base.DriverInitialization;
import Pages.TogglebuttonPage;
public class TogglebuttonTest  extends DriverInitialization{



	TogglebuttonPage testconfig = new TogglebuttonPage();
		@Test
		public void testconfiguration() throws InterruptedException {
			PageFactory.initElements(driver, testconfig);
			
			
//			Thread.sleep(2000);
//			TogglebuttonPage.testcongichomebutton.click();
			Thread.sleep(2000);
			TogglebuttonPage.testconfigbutton.click();
			Thread.sleep(2000);
			TogglebuttonPage.Duedaytoggle.click();
			
			//check if element visible
			
			boolean ActualElement = TogglebuttonPage.Duedaytoggle.isDisplayed();
			boolean ExpectedElement=true;
	        
	               
		
	        boolean elementvisible = true;
	        testCase = extent.createTest("TOGGLE-BUTTON-VISIBLE");
			try {
				AssertJUnit.assertEquals(ActualElement,ExpectedElement);
			} catch (AssertionError e) {
				elementvisible=false;
			}
			if (elementvisible) {
				testCase.log(Status.INFO,"ActualElement :- " + ActualElement);
				testCase.log(Status.INFO,"ExpectedElement :- " + ExpectedElement);
				testCase.log(Status.INFO,"Element Available");
				testCase.log(Status.PASS,"Correct element");
			} else {
				testCase.log(Status.INFO,"ActualElement :- " + ActualElement);
				testCase.log(Status.INFO,"ExpectedElement :- " + ExpectedElement);
				testCase.log(Status.INFO,"Element not available");
				testCase.log(Status.FAIL,"No Element");
			}
				Thread.sleep(2000);	
			
				// check Button size
				
				Dimension ActualLengthSize = TogglebuttonPage.Duedaytoggle.getSize();
				System.out.println("Size :"+ActualLengthSize);
				Dimension ExpectedLengthSize = new Dimension(44, 22);
				
				
				boolean size = true;
				testCase = extent.createTest("TOGGLE-BUTTON-LENGTH");
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
					Thread.sleep(2000);	
				
				
				
					// check Button Width
					
					Dimension sizes = TogglebuttonPage.Duedaytoggle.getSize();
			        int actualWidth = sizes.getWidth();
			        System.out.println("width  = " + actualWidth);
			        int expectedSize = 44;
			        
			        testCase = extent.createTest("TOGGLE-BUTTON-WIDTH");
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
			        
			        
			      //check Button Width
			        Dimension hightsize = TogglebuttonPage.Duedaytoggle.getSize();
			        int actualHeight = hightsize.getHeight();
			        System.out.println("height = " + actualHeight);
			        int expectedHeight = 22;

			        boolean height1 = true;
			        testCase = extent.createTest("TOGGLE-BUTTON-THICKNESS");
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
			        Thread.sleep(2000);
			        
			        // Check Toggle Button Position
			        
			        
	//Check TOGGLE-BUTTON-POSITION
					
					Point ActualLocation = TogglebuttonPage.Duedaytoggle.getLocation();
			        
			        int actual_x = ActualLocation.getX();
			        int actual_y = ActualLocation.getY();
					
					System.out.println("X axis TOGGLE-BUTTON: "+actual_x);
					System.out.println("Y axis TOGGLE-BUTTON: "+actual_y);
					
					
					
					Point ExpectedLocation = new Point(680, 502);
					
					
					 boolean position = true;
					 testCase = extent.createTest("TOGGLE-BUTTON-POSITION");
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
			        
							
							// Check Toggle button Background Colour
							
							String ActualColour = TogglebuttonPage.Duedaytoggle.getCssValue("background-color");
							System.out.println("rgb :"+ActualColour);
							
							
							//String hexcolour = Color.fromString(ActualColour).asHex();
							String ExpectedColour = "rgba(24, 144, 255, 1)";
							boolean colour = true;
							
							testCase = extent.createTest("TOGGLE-BUTTON BG-COLOUR");
							System.out.println("CUSTOMER BG-COLOUR: "+ActualColour); 
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
								Thread.sleep(2000);	
								
								// Toggle Button Enable
							      boolean ExpectedInternalRadioEnable=true;
							      boolean ActualInternalRadioEnable=TogglebuttonPage.Duedaytoggle.isEnabled();
							      testCase = extent.createTest("TOGGLE BUTTON ENABLE");
							      try {
							          Assert.assertEquals(ActualInternalRadioEnable, ExpectedInternalRadioEnable);
							          testCase.log(Status.INFO, "Actual Button Visible :- " + ActualInternalRadioEnable);
							          testCase.log(Status.INFO, "Expected Button Visible :- " + ExpectedInternalRadioEnable);
							          testCase.log(Status.PASS, "Button Visible is Correct");
							      } catch (AssertionError e) {
							          testCase.log(Status.INFO, "Actual Button Visible :- " + ActualInternalRadioEnable);
							          testCase.log(Status.INFO, "Expected Button Visible :- " + ExpectedInternalRadioEnable);
							          testCase.log(Status.FAIL, "Button Visible is Wrong");
							      }
////							      ******************toggle switch function confirm****************
//
//									try {
//										TogglebuttonPage.Duedaytoggle.click();
//										String beforeClickBgColor = TogglebuttonPage.Duedaytoggle.getCssValue("background-color");
//										TogglebuttonPage.Duedaytoggle.click();
//										String afterClickBgColor = TogglebuttonPage.Duedaytoggle
//												.getCssValue("background-color");
//										boolean highlight = true;
//										testCase = extent.createTest("highlight");
//										try {
//											AssertJUnit.assertEquals(beforeClickBgColor, afterClickBgColor);
//										} catch (AssertionError e) {
//											highlight = false;
//										}
//
//										if (!beforeClickBgColor.equals(afterClickBgColor)) {
////							                                              testCase.log(Status.INFO, "ActualElement :- " + beforeClickBgColor);
////							                                                 testCase.log(Status.INFO, "ExpectedElement :- " + afterClickBgColor);
//											testCase.log(Status.INFO, "correct backgroundColor");
//											testCase.log(Status.PASS, "Correct ");
//											// System.out.println("Highlight is working properly");
//										} else {
////							                                              testCase.log(Status.INFO, "ActualAlignment :- " + beforeClickBgColor);
////							                                                 testCase.log(Status.INFO, "ExpectedAlignment :- " + afterClickBgColor);
//											testCase.log(Status.INFO, "Element not available");
//											testCase.log(Status.FAIL, "fail");
//											// System.out.println("Highlight is not working");
//										}
//									} catch (NoSuchElementException e) {
//										testCase = extent.createTest("Locator");
//										testCase.log(Status.INFO, "Element not available");
//										testCase.log(Status.FAIL, "No Element");
//									}
						
		}
}
