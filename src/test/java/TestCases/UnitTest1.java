package TestCases;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.Point;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import Base.DriverInitialization;
import Pages.ImagePage;
import Pages.RadioButtonsPage;
import Pages.UnitPage;

public class UnitTest1 extends DriverInitialization {
	UnitPage up = new UnitPage();

	@Test
	public void Unit() throws InterruptedException {
		PageFactory.initElements(driver, up);
		Thread.sleep(2000);
		UnitPage.Unit.click();
		Thread.sleep(2000);
//		testCase = extent.createTest("ADD UNIT-DONT HAVE LOCATER");
		testCase = extent.createTest("UNIT-ELEMENT-VISIBLE");
		try {
//	 UnitPage.AddUnit.isDisplayed();
//			Check Button Displayed or not
			boolean ExpectedButtonVisible = true;
			boolean actualButtonVisible = UnitPage.AddUnit.isDisplayed();
			try {
				Assert.assertEquals(actualButtonVisible, ExpectedButtonVisible);
				testCase.log(Status.INFO, "ActualElement :- " + actualButtonVisible);
				testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedButtonVisible);
				testCase.log(Status.INFO, "Element Available");
				testCase.log(Status.PASS, "Correct element");
				Thread.sleep(2000);
			} catch (AssertionError e) {
				testCase.log(Status.INFO, "ActualElement :- " + actualButtonVisible);
				testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedButtonVisible);
				testCase.log(Status.INFO, "Element not available");
				testCase.log(Status.FAIL, "Not Visible Element");
			}
			Thread.sleep(2000);
			if (actualButtonVisible) {


//				Check Button enabled or not
				boolean ExpectedButtonEnable = true;
				boolean actualButtonEnable = UnitPage.AddUnit.isEnabled();
				testCase = extent.createTest("UNIT-ELEMENT-Enable");
				try {
					Thread.sleep(1000);
					Assert.assertEquals(actualButtonEnable, ExpectedButtonEnable);
					Thread.sleep(3000);
					testCase.log(Status.INFO, "Actual Button Enable :- " + actualButtonEnable);
					testCase.log(Status.INFO, "Expected Button Enable :- " + ExpectedButtonEnable);
					testCase.log(Status.INFO, "Correct  Button Enable");
					testCase.log(Status.PASS, " Button Enable Correct");
				} catch (AssertionError e) {
					testCase.log(Status.INFO, "Actual Button Enable :- " + actualButtonEnable);
					testCase.log(Status.INFO, "Expected Button Enable :- " + ExpectedButtonEnable);
					testCase.log(Status.INFO, "Wrong  Button Enable");
					testCase.log(Status.FAIL, " Button Enable Wrong");
				}
//				Check position
				Point ActualLocation = UnitPage.AddUnit.getLocation();
				Point ExpectedLocation = new Point(633, 93);
				testCase = extent.createTest("UNIT-POSITION");
				try {
					Assert.assertEquals(ActualLocation, ExpectedLocation);
					testCase.log(Status.INFO, "ActualLocation :- " + ActualLocation);
					testCase.log(Status.INFO, "ExpectedLocation :- " + ExpectedLocation);
					testCase.log(Status.INFO, "Correct Position");
					testCase.log(Status.PASS, "Position correct");
				} catch (AssertionError e) {
					testCase.log(Status.INFO, "ActualLocation :- " + ActualLocation);
					testCase.log(Status.INFO, "ExpectedLocation :- " + ExpectedLocation);
					testCase.log(Status.INFO, "wrong Position");
					testCase.log(Status.FAIL, "Position Wrong");
				}
				Thread.sleep(2000);

//				check font size
				String ActualfontsSize = UnitPage.AddUnit.getCssValue("font-size");
				String ExpectedfontsSize = "14px";
				testCase = extent.createTest("UNIT-FONT-SIZE");
				try {
					Assert.assertEquals(ActualfontsSize, ExpectedfontsSize);
					testCase.log(Status.INFO, "ActualfontsSize :- " + ActualfontsSize);
					testCase.log(Status.INFO, "ExpectedfontsSize :- " + ExpectedfontsSize);
					testCase.log(Status.INFO, "Correct font-size");
					testCase.log(Status.PASS, "Font-size Correct");
				} catch (AssertionError e) {
					testCase.log(Status.INFO, "ActualfontsSize :- " + ActualfontsSize);
					testCase.log(Status.INFO, "ExpectedfontsSize :- " + ExpectedfontsSize);
					testCase.log(Status.INFO, "Wrong font-size");
					testCase.log(Status.FAIL, "Font-size Wrong");
				}
				Thread.sleep(2000);

//				Check Button the size
				Dimension ActualSize = UnitPage.AddUnit.getSize();
				Dimension ExpectedSize = new Dimension (120, 32);
				testCase = extent.createTest("UNIT-BUTTON-SIZE");
				try {
					Assert.assertEquals(ActualSize, ExpectedSize);
					testCase.log(Status.INFO, "ActualSize :- " + ActualSize);
					testCase.log(Status.INFO, "ExpectedSize :- " + ExpectedSize);
					testCase.log(Status.INFO, "Correct Size");
					testCase.log(Status.PASS, "Correct Size");
				} catch (AssertionError e) {
					testCase.log(Status.INFO, "ActualSize :- " + ActualSize);
					testCase.log(Status.INFO, "ExpectedSize :- " + ExpectedSize);
					testCase.log(Status.INFO, "wrong Size");
					testCase.log(Status.FAIL, "wrong Size");
				}
				Thread.sleep(2000);

//				Check test button color
				String aa = UnitPage.AddUnit.getCssValue("background-color");
				String ActualColour = Color.fromString(aa).asHex();
				String ExpectedColour = "#001328";
				testCase = extent.createTest("UNIT-BUTTON-COLOUR");
				try {
					Assert.assertEquals(ActualColour, ExpectedColour);
					testCase.log(Status.INFO, "ActualColour :- " + ActualColour);
					testCase.log(Status.INFO, "ExpectedColour :- " + ExpectedColour);
					testCase.log(Status.INFO, "Correct Colour");
					testCase.log(Status.PASS, "Correct Colour");
				} catch (AssertionError e) {
					testCase.log(Status.INFO, "ActualColour :- " + ActualColour);
					testCase.log(Status.INFO, "ExpectedColour :- " + ExpectedColour);
					testCase.log(Status.INFO, "wrong Colour");
					testCase.log(Status.FAIL, "wrong Colour");
				}
				Thread.sleep(2000);

//				check font colour
				String fc = UnitPage.AddUnit.getCssValue("color");
				String ActualfontColor = Color.fromString(fc).asHex();
				String ExpectedfontColor = "#ffffff";
				testCase = extent.createTest("UNIT-BUTTON-FONT-COLOUR");
				try {
					Assert.assertEquals(ActualfontColor, ExpectedfontColor);
					testCase.log(Status.INFO, "ActualColour :- " + ActualfontColor);
					testCase.log(Status.INFO, "ExpectedColour :- " + ExpectedfontColor);
					testCase.log(Status.INFO, "Correct font Colour");
					testCase.log(Status.PASS, "Correct font Colour");
				} catch (AssertionError e) {
					testCase.log(Status.INFO, "ActualColour :- " + ActualfontColor);
					testCase.log(Status.INFO, "ExpectedColour :- " + ExpectedfontColor);
					testCase.log(Status.INFO, "wrong font Colour");
					testCase.log(Status.FAIL, "wrong font Colour");
				}
				Thread.sleep(2000);

//				Check border colour 
				String bc = UnitPage.AddUnit.getCssValue("border-color");
				String ActualBorderColour = Color.fromString(bc).asHex();
				String ExpectedBorderColour = "#ffffff";
				testCase = extent.createTest("UNIT-BORDER-COLOUR");
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
				Thread.sleep(2000);

//				Check Button Text 
				String ActualButtonText = UnitPage.AddUnit.getText();
				String ExpectedButtonText = "Add Unit";
				testCase = extent.createTest("UNIT-BUTTON-TEXT");
				try {
					Assert.assertEquals(ActualButtonText, ExpectedButtonText);
					testCase.log(Status.INFO, "Actual BUTTON-TEXT:- " + ActualButtonText);
					testCase.log(Status.INFO, "Expected BUTTON-TEXT:- " + ExpectedButtonText);
					testCase.log(Status.INFO, "Correct BUTTON-TEXT");
					testCase.log(Status.PASS, "Correct BUTTON-TEXT");
				} catch (AssertionError e) {
					testCase.log(Status.INFO, "Actual BUTTON-TEXT :- " + ActualButtonText);
					testCase.log(Status.INFO, "Expected BUTTON-TEXT :- " + ExpectedButtonText);
					testCase.log(Status.INFO, "wrong BUTTON-TEXT");
					testCase.log(Status.FAIL, "wrong BUTTON-TEXT");
				}
				
//				Check border Radius 
				String ActualBorderRadius = UnitPage.AddUnit.getCssValue("border-Radius");
				System.out.println(ActualBorderRadius);
				String ExpectedBorderRadius = "2px";
				testCase = extent.createTest("UNIT-BORDER-RADIUS");
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
				
//				 Cursor point
				String ActualCursor = UnitPage.AddUnit.getCssValue("cursor");
		        String ExpectedCursor = "pointer";
		        testCase = extent.createTest("UNIT CURSOR");
		        try {
		            Assert.assertEquals(ActualCursor, ExpectedCursor);
		            testCase.log(Status.INFO, "Actual Cursor point :- " + ActualCursor);
					testCase.log(Status.INFO, "Expected Cursor point :- " + ExpectedCursor);
					testCase.log(Status.PASS, "Cursor point is Correct");
				} catch (AssertionError e) {
					testCase.log(Status.INFO, "Actual Cursor point :- " + ActualCursor);
					testCase.log(Status.INFO, "Expected Cursor point :- " + ExpectedCursor);
					testCase.log(Status.FAIL, "Cursor point is Wrong");
		        }
		        
				Thread.sleep(3000);
				
//				 padding
				String Actualpadding = UnitPage.AddUnit.getCssValue("padding");
		        String Expectedpadding = "4px 15px";
		        testCase = extent.createTest("UNIT PADDING");
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
				Thread.sleep(3000);
				
//				 Font Style
				String ActualFontStyle = UnitPage.AddUnit.getCssValue("font-family");
		        String ExpectedFontStyle = "Roboto, sans-serif";
		        testCase = extent.createTest("UNIT FONT STYLE");
		        try {
		            Assert.assertEquals(ActualFontStyle, ExpectedFontStyle);
		            testCase.log(Status.INFO, "Actual Font Style :- " + ActualFontStyle);
					testCase.log(Status.INFO, "Expected Font Style :- " + ExpectedFontStyle);
					testCase.log(Status.PASS, "Font Style is Correct");
				} catch (AssertionError e) {
					testCase.log(Status.INFO, "Actual Font Style :- " + ActualFontStyle);
					testCase.log(Status.INFO, "Expected Font Style :- " + ExpectedFontStyle);
					testCase.log(Status.FAIL, "Font Style is Wrong");
		        }
				Thread.sleep(3000);
				
//				 Box-shadow
				String ActualBoxShadow = UnitPage.AddUnit.getCssValue("box-shadow");
		        String ExpectedBoxShadow = "rgba(0, 0, 0, 0.016) 0px 2px 0px 0px";
		        testCase = extent.createTest("UNIT BUTTON BOX SHADOW");
		        try {
		            Assert.assertEquals(ActualBoxShadow, ExpectedBoxShadow);
		            testCase.log(Status.INFO, "Actual Box-shadow :- " + ActualBoxShadow);
					testCase.log(Status.INFO, "Expected Box-shadow :- " + ExpectedBoxShadow);
					testCase.log(Status.PASS, "Box-shadow is Correct");
				} catch (AssertionError e) {
					testCase.log(Status.INFO, "Actual Box-shadow :- " + ActualBoxShadow);
					testCase.log(Status.INFO, "Expected Box-shadow:- " + ExpectedBoxShadow);
					testCase.log(Status.FAIL, "Box-shadow is Wrong");
		        }
				Thread.sleep(3000);
				
//				Check Opacity
				String elementOpacity = UnitPage.AddUnit.getCssValue("opacity");
				double ActualOpacity = Double.parseDouble(elementOpacity);
				double ExpectedOpacity = 1.0;
				testCase = extent.createTest("UNIT-OPACITY");
				try {
					Assert.assertEquals(ActualOpacity, ExpectedOpacity);
					testCase.log(Status.INFO, "Actual Opacity :- " + ActualOpacity);
					testCase.log(Status.INFO, "Expected Opacity :- " + ExpectedOpacity);
					testCase.log(Status.INFO, "Correct Opacity");
					testCase.log(Status.PASS, "Correct Opacity");
				} catch (AssertionError e) {
					testCase.log(Status.INFO, "Actual Opacity :- " + ActualOpacity);
					testCase.log(Status.INFO, "Expected Opacity :- " + ExpectedOpacity);
					testCase.log(Status.INFO, "wrong Opacity");
					testCase.log(Status.FAIL, "wrong Opacity");
				}
////				Check Font-weight
				String ActualFontWeight = UnitPage.AddUnit.getCssValue("font-weight");
				String ExpectedFontWeight = "400";
				testCase = extent.createTest("IMAGE-FONT-WEIGHT");
				try {
					Assert.assertEquals(ActualFontWeight, ExpectedFontWeight);
					testCase.log(Status.INFO, "Actual Font-weight :- " + ActualFontWeight);
					testCase.log(Status.INFO, "Expected Font-weight :- " + ExpectedFontWeight);
					testCase.log(Status.INFO, "Correct Font-weight");
					testCase.log(Status.PASS, "Correct Font-weight");
				} catch (AssertionError e) {
					testCase.log(Status.INFO, "Actual Font-weight :- " + ActualFontWeight);
					testCase.log(Status.INFO, "Expected Font-weight :- " + ExpectedFontWeight);
					testCase.log(Status.INFO, "wrong Font-weight");
					testCase.log(Status.FAIL, "wrong Font-weight");
				}
//				 
//				background color
				String bg1color = UnitPage.AddUnit.getCssValue("background-color");
				String Actualbgcolor = Color.fromString(bg1color).asHex();
		        String Expectedbgcolor = "#001328";

		        testCase = extent.createTest("UNIT BUTTON BACKGROUND COLOR");
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
		        
//				if (UnitPage.AddUnit.isEnabled()) {
//					UnitPage.AddUnit.click();
//					boolean ExpectedTextClick = true;
//					boolean actualTextClick = UnitPage.Add.isDisplayed();
//					testCase = extent.createTest("UNIT-BUTTON-CLICK");
//					try {
//						Assert.assertEquals(actualTextClick, ExpectedTextClick);
//						testCase.log(Status.INFO, "Actual TEXT:- " + actualTextClick);
//						testCase.log(Status.INFO, "Expected TEXT:- " + ExpectedTextClick);
//						testCase.log(Status.PASS, "Correct TEXT");
//					} catch (AssertionError e) {
//						testCase.log(Status.INFO, "Actual TEXT :- " + actualTextClick);
//						testCase.log(Status.INFO, "Expected TEXT :- " + ExpectedTextClick);
//						testCase.log(Status.FAIL, "wrong TEXT");
//					}
//				}
//				else {
//					testCase = extent.createTest("UNIT-CLICK-TEST");
//					testCase.log(Status.FAIL, "Add Unit Click Fail");
//				}
			}
			else {
				testCase = extent.createTest("UNIT-ELEMENT-VISIBLE");
				testCase.log(Status.INFO, "ActualElement :- " + UnitPage.AddUnit.isDisplayed());
				testCase.log(Status.INFO, "ExpectedElement :- " + true);
				testCase.log(Status.INFO, "Element not available");
				testCase.log(Status.FAIL, "Not Visible Element");
			}
		} catch (NoSuchElementException e) {
		testCase = extent.createTest("UNIT-LOCATER");
			testCase.log(Status.INFO, "Dont Have This Element Locater");
			testCase.log(Status.FAIL, "Unable to add SBU, So SMOKE FAIL");
		}

	}
} 