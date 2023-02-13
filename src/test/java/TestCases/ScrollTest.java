package TestCases;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import Base.DriverInitialization;
import Pages.ScrollPage;

public class ScrollTest extends DriverInitialization {
	   ScrollPage scroll = new ScrollPage();
	   @Test
	   public void mainn() throws IOException, InterruptedException {
		   PageFactory.initElements(driver, scroll);
		   Thread.sleep(1500);
//		   ScrollPage.username.sendKeys("admin");
//		   ScrollPage.password.sendKeys("tokyo@admin");
//		   ScrollPage.login.click();
//			Thread.sleep(3000);
		
			ScrollPage.testResult.click();
			
			 
			 JavascriptExecutor js = (JavascriptExecutor) driver;
			 
			
		

//			 js.executeScript("arguments[0].scrollIntoView();", ScrollPage.verticalscroll);
//			 
//			 Point location = ScrollPage.verticalscroll.getLocation();
//			 int x = location.getX();
//			 int y = location.getY();
//			 System.out.println(x);
//			 System.out.println(y);
//			 if (y == 0) {
//			   System.out.println("Element is aligned with the top of the viewport");
//			 }
			 



//			 ((JavascriptExecutor) driver).executeScript("arguments[0].style.scrollSnapType = 'proximity'", ScrollPage.scrollDiv);
//			 String scrollSnapType = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].style.scrollSnapType", ScrollPage.scrollDiv);
//			 Assert.assertEquals("proximity", scrollSnapType);
//			 ScrollPage.scrollDiv.sendKeys(Keys.PAGE_DOWN);

			 
//			 String script = "document.body.style.setProperty(\"--scrollbar-thumb-hover-color\", \"#999999\");";
//			    js.executeScript(script);
			  

			// scroll horizontally by 500 pixels
			// js.executeScript("window.scrollBy(20,0)");

			 // verify the horizontal scrolling by getting the page source
			// String pageSource = ((WebDriver) ScrollPage.scrollDiv).getPageSource();
//			
//			 Thread.sleep(3000);
//			 js.executeScript("window.scrollBy(0,20)");            //Scroll Down(+ve)
//	         Thread.sleep(3000);
//	         System.out.println("Scrolled down..");          
	//
//	         js.executeScript("window.scrollBy(0,-20)");           //Scroll Up (-ve)
//	         Thread.sleep(3000);
//	         System.out.println("Scrolled up..");
//			 int clientWidth = Integer.parseInt(ScrollPage.verticalscroll.getAttribute("clientWidth"));
//			 System.out.println(clientWidth);
//			 int scrollWidth = Integer.parseInt(ScrollPage.verticalscroll.getAttribute("scrollWidth"));
//			 System.out.println(scrollWidth);
			 
//			 int clientHeight = Integer.parseInt(ScrollPage.verticalscroll.getAttribute("clientHeight"));
//			 System.out.println(clientHeight);
		
			 
			 
			
			
			
//			 int  scrollHeight1 = Integer.parseInt(ScrollPage.scrollDiv.getAttribute("scrollHeight"));
//			 System.out.println(scrollHeight1);
			 
			 
			 //vertical scroll(height)full
			 int  scrollHeight = Integer.parseInt(ScrollPage.verticalscroll.getAttribute("scrollHeight"));
			 int clientHeight = Integer.parseInt(ScrollPage.scrollDiv.getAttribute("clientHeight"));
			 
			 System.out.println(scrollHeight);
			 System.out.println(clientHeight);
			
//			 boolean elementhorizontal = true;
				testCase = extent.createTest("Vertical scroll");
//				try {
//					Assert.assertEquals(clientHeight, scrollHeight);
//				} catch (AssertionError find) {
//					elementhorizontal = false;
//				}
			 if (clientHeight < scrollHeight) {
			  // System.out.println("Horizontal scroll bar is present ");
			   testCase.log(Status.INFO, "clientWidth :- " + clientHeight);
				testCase.log(Status.INFO, "scrollWidth :- " + scrollHeight);
				testCase.log(Status.INFO, "vertical scroll Available");
				testCase.log(Status.PASS, "pass");
			 } else {
			 //  System.out.println("Horizontal scroll bar is not present ");
			   testCase.log(Status.INFO, "clientWidth :- " + clientHeight);
				testCase.log(Status.INFO, "scrollWidth :- " + scrollHeight);
				testCase.log(Status.INFO, "vertical scroll not available");
//				testCase.log(Status.PASS, "pass");
				testCase.log(Status.FAIL, " fail");
			 }
			 
			 
			 //horizontal(width)full screen
			 int clientWidth = Integer.parseInt(ScrollPage.scrollDiv.getAttribute("clientWidth"));
			 System.out.println(clientWidth);
			 int scrollWidth = Integer.parseInt(ScrollPage.scrollDiv.getAttribute("scrollWidth"));
			 System.out.println(scrollWidth);
			 testCase = extent.createTest("Horizontal scroll");
			
			 if (clientWidth < scrollWidth) {
//			   System.out.println("vertical scroll bar is present");
			   testCase.log(Status.INFO, "clientWidth :- " + clientWidth);
				testCase.log(Status.INFO, "scrollWidth :- " + scrollWidth);
				testCase.log(Status.INFO, "horizontal scroll Available");
				testCase.log(Status.PASS, "pass");
			 } else {
//			   System.out.println("vertical scroll bar is not present");
			   testCase.log(Status.INFO, "clientWidth :- " + clientWidth);
				testCase.log(Status.INFO, "scrollWidth :- " + scrollWidth);
				testCase.log(Status.INFO, "horizontal scroll not available");
//				testCase.log(Status.PASS, "pass");
				testCase.log(Status.FAIL, " fail");
			 }
			

			 
			 
			 
			 
			//padding
//			 System.out.println("scroll-padding value: " + scrollPaddingValue);
			 try {
				 String scrollPaddingValue =ScrollPage.scrollDiv.getCssValue("scroll-padding");
				// System.out.println("1" + actualoverflow);
				 String Expectedpadding = "auto";

					boolean elementpadding = true;
					testCase = extent.createTest("scroll-padding");
					try {
						Assert.assertEquals(scrollPaddingValue, Expectedpadding);
					} catch (AssertionError find) {
						elementpadding = false;
					}
					if (elementpadding) {
						testCase.log(Status.INFO, "ActualElement padding :- " + scrollPaddingValue);
						testCase.log(Status.INFO, "ExpectedElement padding :- " + Expectedpadding);
						testCase.log(Status.INFO, "Element Available");
						testCase.log(Status.PASS, "padding pass");
					} else {
						testCase.log(Status.INFO, "ActualElement padding :- " + scrollPaddingValue);
						testCase.log(Status.INFO, "ExpectedElement padding :- " + Expectedpadding);
						testCase.log(Status.INFO, "Element not available");
						testCase.log(Status.FAIL, "padding fail");
					}
				  
				}catch(Exception e) {
					testCase.log(Status.FAIL, "no element");
				}
	//
	// 
			//margin 
			 
			 try {
				 String scrollMarginValue = ScrollPage.scrollDiv.getCssValue("scroll-margin");
				 System.out.println("scroll-margin value: " + scrollMarginValue);
				 
				 String Expectedmargin = "0px";

					boolean elementmargin = true;
					testCase = extent.createTest("scroll-margin");
					try {
						Assert.assertEquals(scrollMarginValue, Expectedmargin);
					} catch (AssertionError find) {
						elementmargin = false;
					}
					if (elementmargin) {
						testCase.log(Status.INFO, "ActualElement margin :- " + scrollMarginValue);
						testCase.log(Status.INFO, "ExpectedElement margin :- " + Expectedmargin);
						testCase.log(Status.INFO, "Element Available");
						testCase.log(Status.PASS, "scroll margin pass");
					} else {
						testCase.log(Status.INFO, "ActualElement margin :- " + scrollMarginValue);
						testCase.log(Status.INFO, "ExpectedElement margin :- " + Expectedmargin);
						testCase.log(Status.INFO, "Element not available");
						testCase.log(Status.FAIL, "scroll margin fail");
					}
				  
				}catch(Exception e) {
					testCase.log(Status.FAIL, "no element");
				}

			 
			 
			 
//			 Boolean isScrollBarPresent = (Boolean) js.executeScript("return arguments[0].scrollWidth>arguments[0].clientWidth;", ScrollPage.scrollDiv);
//			 
//			 
//			 if (isScrollBarPresent) {
//				  System.out.println("Scroll bar is present");
//				} else {
//				  System.out.println("Scroll bar is not present");
//				}
			 
			 
			 
			 
			 
			 
			 
			
			 //track color(for vertical & horizontal)
			 try {
				 String scrollbarcolor = (String)((JavascriptExecutor)driver).executeScript("return window.getComputedStyle(arguments[0], '::-webkit-scrollbar-track').getPropertyValue('background-color');", ScrollPage.scrollDiv);
					//String hexa = Color.fromString(scrollbarcolor).asHex();
					System.out.println("scroll color = " + scrollbarcolor);
					//String bgc = "rgba(135, 138, 133, 1)";
					
					String bgc = "rgb(241, 241, 241)";		
					//Assert.assertEquals(backgroundColor, bgc);
					boolean backgroundColor1 = true;
					testCase = extent.createTest("track color");
					try {
						Assert.assertEquals(scrollbarcolor, bgc);
					} catch (AssertionError e) {
						backgroundColor1 = false;

					}
						if (backgroundColor1) {
							testCase.log(Status.INFO, "ActualElement track color :- " + scrollbarcolor);
							testCase.log(Status.INFO, "ExpectedElement :- " + bgc);
							testCase.log(Status.INFO, "correct track color");
							testCase.log(Status.PASS, "Correct ");
						} else {
							testCase.log(Status.INFO, "ActualElement track color :- " + scrollbarcolor);
							testCase.log(Status.INFO, "ExpectedElement :- " + bgc);
							testCase.log(Status.INFO, "wrong track color");
							testCase.log(Status.FAIL, "wrong");
						}
					}catch(Exception e) {
						testCase.log(Status.FAIL, "no element");
					}
			//knob color(for vertical and horizontal)		  
			 try {
				 String scrollbarcolor = (String)((JavascriptExecutor)driver).executeScript("return window.getComputedStyle(arguments[0], '::-webkit-scrollbar-thumb').getPropertyValue('background-color');", ScrollPage.scrollDiv);
					//String hexa = Color.fromString(scrollbarcolor).asHex();
					System.out.println("scroll knob color = " + scrollbarcolor);
					//String bgc = "rgba(135, 138, 133, 1)";
					
					String bgc = "rgb(136, 136, 136)";		
					//Assert.assertEquals(backgroundColor, bgc);
					boolean backgroundColor1 = true;
					testCase = extent.createTest("knob color");
					try {
						Assert.assertEquals(scrollbarcolor, bgc);
					} catch (AssertionError e) {
						backgroundColor1 = false;

					}
						if (backgroundColor1) {
							testCase.log(Status.INFO, "ActualElement knob color :- " + scrollbarcolor);
							testCase.log(Status.INFO, "ExpectedElement :- " + bgc);
							testCase.log(Status.INFO, "correct knob color");
							testCase.log(Status.PASS, "Correct ");
						} else {
							testCase.log(Status.INFO, "ActualElement knob color :- " + scrollbarcolor);
							testCase.log(Status.INFO, "ExpectedElement :- " + bgc);
							testCase.log(Status.INFO, "wrong knob color");
							testCase.log(Status.FAIL, "wrong");
						}
					}catch(Exception e) {
						testCase.log(Status.FAIL, "no element");
					}
			 //width  (for horizontal)
			 try {
				 String scrollbarwidth = (String)((JavascriptExecutor)driver).executeScript("return window.getComputedStyle(arguments[0], '::-webkit-scrollbar').getPropertyValue('width');", ScrollPage.scrollDiv);
					System.out.println(scrollbarwidth);
					String expectedwidth = "10px";		
					
					boolean width = true;
					testCase = extent.createTest("width");
					try {
						Assert.assertEquals(scrollbarwidth, expectedwidth);
					} catch (AssertionError e) {
						width = false;

					}
						if (width) {
							testCase.log(Status.INFO, "ActualElement width :- " + scrollbarwidth);
							testCase.log(Status.INFO, "ExpectedElement width :- " + expectedwidth);
							testCase.log(Status.INFO, "correct width");
							testCase.log(Status.PASS, "Correct ");
						} else {
							testCase.log(Status.INFO, "ActualElement width :- " + scrollbarwidth);
							testCase.log(Status.INFO, "ExpectedElement width :- " + expectedwidth);
							testCase.log(Status.INFO, "wrong track color");
							testCase.log(Status.FAIL, "wrong");
						}
					}catch(Exception e) {
						testCase.log(Status.FAIL, "no element");
					}
			   
			 //height(for vertical)
			 
			 try {
				 String scrollbarheight = (String)((JavascriptExecutor)driver).executeScript("return window.getComputedStyle(arguments[0], '::-webkit-scrollbar').getPropertyValue('height');", ScrollPage.scrollDiv);
					
					
					String expectedheight = "10px";		
					
					boolean width = true;
					testCase = extent.createTest("height");
					try {
						Assert.assertEquals(scrollbarheight, expectedheight);
					} catch (AssertionError e) {
						width = false;

					}
						if (width) {
							testCase.log(Status.INFO, "ActualElement track color :- " + scrollbarheight);
							testCase.log(Status.INFO, "ExpectedElement :- " + expectedheight);
							testCase.log(Status.INFO, "correct track color");
							testCase.log(Status.PASS, "Correct ");
						} else {
							testCase.log(Status.INFO, "ActualElement track color :- " + scrollbarheight);
							testCase.log(Status.INFO, "ExpectedElement :- " + expectedheight);
							testCase.log(Status.INFO, "wrong track color");
							testCase.log(Status.FAIL, "wrong");
						}
					}catch(Exception e) {
						testCase.log(Status.FAIL, "no element");
					}
			   
			   
//			 JavascriptExecutor js = (JavascriptExecutor) driver;
//			    
//			    // Scroll down to the bottom of the page
//			    js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			    
		//************************vertical**************************	
			Thread.sleep(2000);
			
			try {
			testCase = extent.createTest("Scroll up and down performed");
			Actions act = new Actions(driver);
			act.sendKeys(Keys.PAGE_DOWN).build().perform(); //Page Down
	        //System.out.println("Scroll down perfomed");
			Thread.sleep(3000);
			act.sendKeys(Keys.PAGE_UP).build().perform();       //Page Up
		    //System.out.println("pass");
		    Thread.sleep(3000);
				
		    
		   
	        testCase.log(Status.PASS, "Scroll up and down perfomed");
			}catch(Exception e) {
				testCase.log(Status.FAIL, "fail");
			}
	        
			
			try {
				testCase = extent.createTest("Scroll right and left performed");
				Actions act = new Actions(driver);
				ScrollPage.scrollDiv.click();
			    act.sendKeys(Keys.RIGHT).build().perform();
			    act.sendKeys(Keys.RIGHT).build().perform();
			    act.sendKeys(Keys.RIGHT).build().perform();
			    Thread.sleep(3000);
			    testCase.log(Status.PASS, "Scroll right perfomed");	
			    act.sendKeys(Keys.LEFT).build().perform();
			    act.sendKeys(Keys.LEFT).build().perform();
			    act.sendKeys(Keys.LEFT).build().perform();
			    Thread.sleep(3000);
			    testCase.log(Status.PASS, "Scroll left perfomed");	
			    
		        
				}catch(Exception e) {
					testCase.log(Status.FAIL, "fail");
				}
			
		//overflow	
			
			
			try {
			 String actualoverflow = ScrollPage.scrollDiv.getCssValue("overflow-y");
		//	System.out.println("1" + actualoverflow);
			 String Expectedoverflow = "scroll";

				boolean elementoverflow = true;
				testCase = extent.createTest("scroll overflow");
				try {
					Assert.assertEquals(actualoverflow, Expectedoverflow);
				} catch (AssertionError find) {
					elementoverflow = false;
				}
				if (elementoverflow) {
//					testCase.log(Status.INFO, "ActualElement :- " + actualoverflow);
//					testCase.log(Status.INFO, "ExpectedElement :- " + Expectedoverflow);
//					testCase.log(Status.INFO, "Element Available");
					testCase.log(Status.PASS, "overflow pass");
				} else {
//					testCase.log(Status.INFO, "ActualElement :- " + actualoverflow);
//					testCase.log(Status.INFO, "ExpectedElement :- " + Expectedoverflow);
//					testCase.log(Status.INFO, "Element not available");
					testCase.log(Status.FAIL, "overflow fail");
				}
			  
			}catch(Exception e) {
				testCase.log(Status.FAIL, "no element");
			}
			
			//scroll snap behavior
			
			
			
			
			
			
	    
			 String snapXValue = ScrollPage.scrollDiv.getCssValue("scroll-snap-points-x");
			 String expectedSnapXValue = "repeat(100%)";

			 if(snapXValue.equals(expectedSnapXValue)) {
			    System.out.println("scroll-snap-points-x value is as expected");
			 } else {
			    System.out.println("scroll-snap-points-x value is not as expected");
			 }

			 String snapYValue = ScrollPage.scrollDiv.getCssValue("scroll-snap-points-y");
			 String expectedSnapYValue = "repeat(100%)";

			 if(snapYValue.equals(expectedSnapYValue)) {
			    System.out.println("scroll-snap-points-y value is as expected");
			 } else {
			    System.out.println("scroll-snap-points-y value is not as expected");
			 } 

			
			    
//			try {
//			    boolean AcctualElementDisplayed = ScrollPage.verticalscroll.isDisplayed();
//				//homeicon_page.home.isDisplayed();
//				boolean ExpectedElementDisplayed = true;
	//
//				boolean elementvisible = true;
//				testCase = extent.createTest("Element Visible");
//				try {
//					Assert.assertEquals(AcctualElementDisplayed, ExpectedElementDisplayed);
//				} catch (AssertionError find) {
//					elementvisible = false;
//				}
//				if (elementvisible) {
//					testCase.log(Status.INFO, "ActualElement :- " + AcctualElementDisplayed);
//					testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedElementDisplayed);
//					testCase.log(Status.INFO, "Element Available");
//					testCase.log(Status.PASS, "Correct Element");
//				} else {
//					testCase.log(Status.INFO, "ActualElement :- " + AcctualElementDisplayed);
//					testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedElementDisplayed);
//					testCase.log(Status.INFO, "Element not available");
//					testCase.log(Status.FAIL, "No Element");
//				}
//			  
//		Thread.sleep(2500);
	//}
//			catch(Exception e) {
//				testCase.log(Status.INFO, "Element not available");
//				testCase.log(Status.FAIL, "No Element");
//				}
			
			
			

			
		
			
			
			
			//***************************horizontal*********************
	//   try {
//		    boolean AcctualElementDisplayed = ScrollPage.scrollDiv.isDisplayed();
//			//homeicon_page.home.isDisplayed();
//			boolean ExpectedElementDisplayed = true;
	//
//			boolean elementvisible = true;
//			testCase = extent.createTest("Element Visible");
//			try {
//				Assert.assertEquals(AcctualElementDisplayed, ExpectedElementDisplayed);
//			} catch (AssertionError find) {
//				elementvisible = false;
//			}
//			if (elementvisible) {
//				testCase.log(Status.INFO, "ActualElement :- " + AcctualElementDisplayed);
//				testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedElementDisplayed);
//				testCase.log(Status.INFO, "Element Available");
//				testCase.log(Status.PASS, "Correct Element");
//			} else {
//				testCase.log(Status.INFO, "ActualElement :- " + AcctualElementDisplayed);
//				testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedElementDisplayed);
//				testCase.log(Status.INFO, "Element not available");
//				testCase.log(Status.FAIL, "No Element");
//			}
//		  
	//Thread.sleep(2500);
	//}
//		catch(Exception e) {
//			testCase.log(Status.INFO, "Element not available");
//			testCase.log(Status.FAIL, "No Element");
//			}
	//   try {
//			Point ExpectedImageLocation = new Point(173, 184);
//			Point actualImageLocation = ScrollPage.scrollDiv.getLocation();
//			System.out.println(actualImageLocation);
//			testCase = extent.createTest("horizontalscroll-position");
//			try {
//				Thread.sleep(1000);
//				Assert.assertEquals(actualImageLocation, ExpectedImageLocation);
//				Thread.sleep(3000);
//				testCase.log(Status.INFO, "Ectual horizontalscroll position :- " + actualImageLocation);
//				testCase.log(Status.INFO, "Expected horizontalscroll Position :- " + ExpectedImageLocation);
//				testCase.log(Status.INFO, "Correct horizontalscroll Position");
//				testCase.log(Status.PASS, " horizontalscroll-position");
//			} catch (AssertionError e) {
//				testCase.log(Status.INFO, "Actual horizontalscroll Position :- " + actualImageLocation);
//				testCase.log(Status.INFO, "Expected horizontalscroll Position :- " + ExpectedImageLocation);
//				testCase.log(Status.INFO, "Wrong  horizontalscroll Position");
//				testCase.log(Status.FAIL, "horizontalscroll-position Wrong");
//			}
//			}catch(Exception e) {
//				testCase.log(Status.FAIL, "no element");
//			}
	//   //horizontal size
	//   try {
//			Dimension ActualImageSize = ScrollPage.scrollDiv.getSize();
//			Dimension ExpectedImageSize = new Dimension (1178, 609);
//			testCase = extent.createTest("horizontalscroll-size");
//			try {
//				Assert.assertEquals(ActualImageSize, ExpectedImageSize);
//				testCase.log(Status.INFO, "Actual horizontalscroll Size :- " + ActualImageSize);
//				testCase.log(Status.INFO, "Expected horizontalscroll Size :- " + ExpectedImageSize);
//				testCase.log(Status.INFO, "Correct horizontalscroll Size");
//				testCase.log(Status.PASS, "Correct horizontalscroll Size");
//			} catch (AssertionError e) {
//				testCase.log(Status.INFO, "Actual horizontalscroll Size :- " + ActualImageSize);
//				testCase.log(Status.INFO, "Expected horizontalscroll Size :- " + ExpectedImageSize);
//				testCase.log(Status.INFO, "wrong horizontalscroll Size");
//				testCase.log(Status.FAIL, "wrong horizontalscroll Size");
//			}
//			}catch(Exception e) {
//				testCase.log(Status.FAIL, "no  element");
//			}
	//   Thread.sleep(2000);
	//   Actions act = new Actions(driver);
	//   act.sendKeys(Keys.PAGE_UP).build().perform();
	//   Thread.sleep(3000);
	//   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", ScrollPage.scrollDiv);
	//
	//   int elementYPosition = ScrollPage.scrollDiv.getLocation().getY();
	//
	//   // Verify that the element is in the correct position
	//   if (elementYPosition == 200) {
//	       System.out.println("scroll-snap-align is working as expected");
	//   } else {
//	       System.out.println("scroll-snap-align is not working as expected");
	//   }
//			 WebElement scrollableElement = driver.findElement(By.xpath("//*[@id=\\\"root\\\"]/div/section/section/main/div/div/div[2]/div/div[1]/div/div/div/div[2]/div[2]"));
//			 ((JavascriptExecutor) driver).executeScript("arguments[0].scroll(0, 200);",scrollableElement);
//			// Refresh the page
//			 driver.navigate().refresh();
	//
//			 // Check the position of the scroll bar after the refresh
//			 int currentScrollPosition = (int) ((JavascriptExecutor) driver).executeScript("return arguments[0].scrollTop;",scrollableElement);
//			 if (currentScrollPosition == 200) {
//				    System.out.println("The scroll bar is in the correct position after the refresh");
//				} else {
//				    System.out.println("The scroll bar is not in the correct position after the refresh");
//				}
	//   
	   
		}
	}
