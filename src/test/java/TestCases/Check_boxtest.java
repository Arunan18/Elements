package TestCases;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import Base.DriverInitialization;
import Pages.Checkbox_page;
import Pages.UnitPage;

import java.io.IOException;


	public class Check_boxtest extends DriverInitialization {
		
		Checkbox_page checkbox = new Checkbox_page();

		@Test
		public void adminButton() throws InterruptedException, IOException {

			PageFactory.initElements(driver, checkbox);

			
			Checkbox_page.testConfiguration.click();
			Thread.sleep(2000);
			Checkbox_page.ConfigGroupTest.click();
			Thread.sleep(2000);
			
			//WebElement box = Checkbox_page.checkboxvisible;
			
			
				
			
			//System.out.println("Element found");
			try {
			boolean ActualElement = Checkbox_page.checkboxvisible.isDisplayed();
			boolean ExpectedElement = true;
			
			boolean elementvisible = true;
			testCase = extent.createTest("1.Element-visible");
			try {
				AssertJUnit.assertEquals(ActualElement, ExpectedElement);
			} catch (AssertionError e) {
				elementvisible = false;
			}
			if (elementvisible) {
				testCase.log(Status.INFO, "ActualElement :- " + ActualElement);
				testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedElement);
				testCase.log(Status.INFO, "Element Available");
				testCase.log(Status.PASS, "Correct element");
			} else {
				testCase.log(Status.INFO, "ActualElement :- " + ActualElement);
				testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedElement);
				testCase.log(Status.INFO, "Element not available");
				testCase.log(Status.FAIL, "No Element");
			}
			
			}
			catch(Exception e){
			
				//boolean elementvisible = true;
				testCase = extent.createTest("1.Element-visible");
				testCase.log(Status.FAIL, "No Element");
//				try {
//					//AssertJUnit.assertEquals("1", "2");
//				} catch (AssertionError e1) {
//					boolean elementvisible = false;
//				}
//				testCase.log(Status.FAIL, "No Element");
				}

			
			
			Thread.sleep(2000);
			
			
			try {
			boolean Actualelement = Checkbox_page.checkboxenable.isEnabled();
			boolean expectedelement =true;
			
			boolean elementenabled = true;
			testCase =  extent.createTest("2.Element-enabled");
			
			try {
				AssertJUnit.assertEquals(expectedelement, Actualelement);
			}
			catch (AssertionError e) {
				elementenabled= false;
			}
			if(elementenabled) {
				testCase.log(Status.INFO,"Actual" + Actualelement );
				testCase.log(Status.INFO, "Expected" + expectedelement);
				testCase.log(Status.PASS,"Enabled");
			}
			else {
				testCase.log(Status.INFO,"Actual" + Actualelement );
				testCase.log(Status.INFO, "Expected" + expectedelement);
				testCase.log(Status.FAIL,"Enabled");
			}
			}
			catch(Exception e) {
				testCase = extent.createTest("2.Element-enabled");
				testCase.log(Status.FAIL, "No Element");
			}
			
			Thread.sleep(2000);
			
			
//			Checkbox_page.clicktext.click();
			
//			boolean actualclick = Checkbox_page.checkboxenable.isDisplayed();
//			boolean Expectedclick = true;
//			
//			boolean clcikvisible = true;
//			testCase = extent.createTest("*.tick visible");
//			try {
//				AssertJUnit.assertEquals(actualclick, Expectedclick);
//			} catch (AssertionError e) {
//				clcikvisible = false;
//			}
//			if (clcikvisible) {
//				testCase.log(Status.INFO, "ActualElement :- " + actualclick);
//				testCase.log(Status.INFO, "ExpectedElement :- " + Expectedclick);
//				testCase.log(Status.INFO, "Element Available");
//				testCase.log(Status.PASS, "tick visible");
//			} else {
//				testCase.log(Status.INFO, "ActualElement :- " + actualclick);
//				testCase.log(Status.INFO, "ExpectedElement :- " + Expectedclick);
//				testCase.log(Status.INFO, "Element not available");
//				testCase.log(Status.FAIL, "tick no visible");
//			}
//			Thread.sleep(2000);
			
			
			
			
			try {
			boolean Actualselect = Checkbox_page.checkboxenable.isSelected();
			
			Checkbox_page.checkboxenable.click();
			boolean expectedselect =Checkbox_page.checkboxenable.isSelected();
			testCase = extent.createTest("3.test function");
			if(Actualselect){
				if(!expectedselect) {
					testCase.log(Status.INFO,"Actual" + Actualselect );
					testCase.log(Status.INFO, "Expected" + expectedselect);
					testCase.log(Status.PASS,"Pass");
					
				}
				else {
					testCase.log(Status.INFO,"Actual" + Actualselect );
					testCase.log(Status.INFO, "Expected" + expectedselect);
					testCase.log(Status.FAIL,"Fail");
				}
			}
			else if(!Actualselect){
				if(expectedselect) {
				testCase.log(Status.INFO,"Actual" + Actualselect );
				testCase.log(Status.INFO, "Expected" + expectedselect);
				testCase.log(Status.PASS,"Pass");
				}
				else{
					testCase.log(Status.INFO,"Actual" + Actualselect );
					testCase.log(Status.INFO, "Expected" + expectedselect);
					testCase.log(Status.FAIL,"Fail");
				}
			}
			}
				catch(Exception e) {
					testCase = extent.createTest("3.test function");
					testCase.log(Status.FAIL, "No Element");
				}
			
			try {
			Thread.sleep(2000);
			boolean actualtext = Checkbox_page.checkboxenable.isEnabled();
			boolean expectedtext =true;
			
			boolean textenabled = true;
			testCase =  extent.createTest("4.clickability on text");
			
			try {
				AssertJUnit.assertEquals(actualtext, expectedtext);
			}
			catch (AssertionError e) {
				textenabled= false;
			}
			if(textenabled) {
				testCase.log(Status.INFO,"Actual" + actualtext );
				testCase.log(Status.INFO, "Expected" + expectedtext);
				testCase.log(Status.PASS,"Enabled");
			}
			else {
				testCase.log(Status.INFO,"Actual" + actualtext );
				testCase.log(Status.INFO, "Expected" + expectedtext);
				testCase.log(Status.FAIL,"Enabled");
			}
			}
				catch(Exception e){
					testCase = extent.createTest("4.clickability on text");
					testCase.log(Status.FAIL, "No Element");
				}
			Thread.sleep(2000);
			
			try {
			String text = Checkbox_page.clicktext.getText();
			//System.out.println(text);
			String text1 = "Report Type";
			boolean txt1 = true;
			testCase = extent.createTest("5.Spelling on text");
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
			catch(Exception e) {
				testCase = extent.createTest("5.Spelling on text");
				testCase.log(Status.FAIL, "No Element");
			}
			
			Thread.sleep(2000);
			try {
	        Dimension size = Checkbox_page.checkboxenable.getSize();
	        int actualWidth = size.getWidth();
	        System.out.println("width  = " + actualWidth);
	        int expectedSize = 14;
	        
	        testCase = extent.createTest("6.Checkbox Width");
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
			}
				catch(Exception e) {
					 testCase = extent.createTest("7.Checkbox Width");
					 testCase.log(Status.FAIL, "wrong");
				}
			
	

	
	        Thread.sleep(2000);
	        try {
	        Dimension hightsize = Checkbox_page.checkboxenable.getSize();
	        int actualHeight = hightsize.getHeight();
	        System.out.println("height = " + actualHeight);
	        int expectedHeight = 14;

	        boolean height1 = true;
	        testCase = extent.createTest("Check box Height");
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
	        }
	        catch(Exception e) {
	        	testCase = extent.createTest("Check box Height");
	        	testCase.log(Status.FAIL, "wrong");
	        }
			try {
	        String backgroundColor = Checkbox_page.checkboxenable.getCssValue("background-color");
			String hexa = Color.fromString(backgroundColor).asHex();
			System.out.println("backgroundclr = " + hexa);
			//String bgc = "rgba(135, 138, 133, 1)";
			
			String bgc = "#000000";		
			//AssertJUnit.assertEquals(backgroundColor, bgc);
			boolean backgroundColor1 = true;
			testCase = extent.createTest("background-color");
			try {
				AssertJUnit.assertEquals(hexa, bgc);
			} catch (AssertionError e) {
				backgroundColor1 = false;

			}
				if (backgroundColor1) {
					testCase.log(Status.INFO, "ActualElement :- " + hexa);
					testCase.log(Status.INFO, "ExpectedElement :- " + bgc);
					testCase.log(Status.INFO, "correct backgroundColor");
					testCase.log(Status.PASS, "Correct ");
				} else {
					testCase.log(Status.INFO, "ActualElement :- " + hexa);
					testCase.log(Status.INFO, "ExpectedElement :- " + bgc);
					testCase.log(Status.INFO, "wrong backgroundColor");
					testCase.log(Status.FAIL, "wrong");
				}
			}
			catch(Exception e) {
				 testCase = extent.createTest("Backgroundcolor");
				 testCase.log(Status.FAIL, "wrong");
			}
			
		//*****************cursor start*******************	
			// CURSOR
			try {
				String actualCursorPoint = Checkbox_page.checkboxvisible.getCssValue("cursor");
				String expectedCursorPoint = "pointer";

				boolean elementCursor = true;
				testCase = extent.createTest("CHECKBOX-POINTER");
				try {
					AssertJUnit.assertEquals(actualCursorPoint, expectedCursorPoint);
				} catch (AssertionError e) {
					elementCursor = false;
				}
				if (elementCursor) {
					testCase.log(Status.INFO, "ActualAlignment :- " + actualCursorPoint);
					testCase.log(Status.INFO, "ExpectedAlignment :- " + expectedCursorPoint);
					testCase.log(Status.INFO, "Element Available");
					testCase.log(Status.PASS, "Correct element");
				} else {
					testCase.log(Status.INFO, "ActualAlignment :- " + actualCursorPoint);
					testCase.log(Status.INFO, "ExpectedAlignment :- " + expectedCursorPoint);
					testCase.log(Status.INFO, "Element not available");
					testCase.log(Status.FAIL, "No Element");
				}

			} catch (Exception e) {
				testCase = extent.createTest("CHECKBOX-POINTER");
				testCase.log(Status.FAIL, "No Element");
			}
			 Thread.sleep(2000);
			//*****************cursor end*******************	
			 
//			 padding
			String Actualpadding = Checkbox_page.checkboxvisible.getCssValue("padding");
	        String Expectedpadding = "0px";
	        testCase = extent.createTest("CHECKBOX-Padding");
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
			//*****************position start*******************	
			 
			 try {
					String actualAlignment = Checkbox_page.checkboxvisible.getCssValue("text-align");
					//System.out.println(actualAlignment);
					String expectedAlignment = "center";

					boolean elementAlignment = true;
					testCase = extent.createTest("CHECKBOX-ALIGN");
					try {
						AssertJUnit.assertEquals(actualAlignment, expectedAlignment);
					} catch (AssertionError e) {
						elementAlignment = false;
					}
					if (elementAlignment) {
						testCase.log(Status.INFO, "ActualAlignment :- " + actualAlignment);
						testCase.log(Status.INFO, "ExpectedAlignment :- " + expectedAlignment);
						testCase.log(Status.INFO, "Element Available");
						testCase.log(Status.PASS, "Correct element");
					} else {
						testCase.log(Status.INFO, "ActualAlignment :- " + actualAlignment);
						testCase.log(Status.INFO, "ExpectedAlignment :- " + expectedAlignment);
						testCase.log(Status.INFO, "Element not available");
						testCase.log(Status.FAIL, "No Element");
					}

				} catch (Exception e) {
					testCase = extent.createTest("CHECKBOX-ALIGN");
					testCase.log(Status.FAIL, "No Element");
				}
			//*****************position start*******************	
//			//*****************highlight start*******************
//			 Checkbox_page.checkboxenable.click();
//			 String beforeClickBgColor = Checkbox_page.checkboxvisible.getCssValue("background-color");
//			 Checkbox_page.checkboxenable.click();
//			 String afterClickBgColor = Checkbox_page.checkboxvisible.getCssValue("background-color");
//			 boolean highlight = true;
//			 testCase = extent.createTest("highlight");
//			 try {
//					AssertJUnit.assertEquals(beforeClickBgColor, afterClickBgColor);
//				} catch (AssertionError e) {
//					highlight = false;
//				}
//			
//			 if (!beforeClickBgColor.equals(afterClickBgColor)) {
//				 testCase.log(Status.INFO, "ActualElement :- " + beforeClickBgColor);
//					testCase.log(Status.INFO, "ExpectedElement :- " + afterClickBgColor);
//					testCase.log(Status.INFO, "correct backgroundColor");
//					testCase.log(Status.PASS, "Correct ");
//			   System.out.println("Highlight is working properly");
//			 } else {
//				 testCase.log(Status.INFO, "ActualAlignment :- " + beforeClickBgColor);
//					testCase.log(Status.INFO, "ExpectedAlignment :- " + afterClickBgColor);
//					testCase.log(Status.INFO, "Element not available");
//					testCase.log(Status.FAIL, "No Element");
//			   System.out.println("Highlight is not working");
//			 }
//			//*****************highlight start*******************
}
}





