package TestCases;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import Base.DriverInitialization;
import Pages.RadioButtonsPage;
import Pages.UnitPage;

public class RadioButtonsTest extends DriverInitialization{
RadioButtonsPage rbp= new RadioButtonsPage();
	@Test
	public void RadioButtons() throws InterruptedException {
		PageFactory.initElements(driver, rbp);
		Thread.sleep(2000);
		RadioButtonsPage.TESTSCALIBRATIONS.click();
		Thread.sleep(1000);
		RadioButtonsPage.EquipmentCalibration.click();
		Thread.sleep(1000);
		RadioButtonsPage.AddCalibration.click();
		Thread.sleep(2000);
		
//		Calibrated Type Heading
		String ExpectedRadioHeading= "* Calibrated Type:";
		String ActualRadioHeading = RadioButtonsPage.RadioHeading.getText();
		testCase = extent.createTest("RADIO BUTTON HEADING");
		try {
			Assert.assertEquals(ActualRadioHeading, ExpectedRadioHeading);
			testCase.log(Status.INFO, "Actual Radio Button Heading :- " + ActualRadioHeading);
			testCase.log(Status.INFO, "Expected Radio Button Heading :- " + ExpectedRadioHeading);
			testCase.log(Status.INFO, "Correct Radio Button Heading");
			testCase.log(Status.PASS, "Radio Button Heading is Correct");
		} catch (AssertionError e) {
			testCase.log(Status.INFO, "Actual Radio Button Heading :- " + ActualRadioHeading);
			testCase.log(Status.INFO, "Expected Radio Button Heading :- " + ExpectedRadioHeading);
			testCase.log(Status.INFO, "Wrong Radio Button Heading");
			testCase.log(Status.FAIL, "Radio Button Heading is Wrong");
		}
		
//		Internal Radio Button Visible
		boolean ExpectedInternalRadioVisible=true;
		boolean ActualInternalRadioVisible=RadioButtonsPage.InternalRadioButton.isDisplayed();
		testCase = extent.createTest("INTERNAL RADIO BUTTON VISIBLE");
		try {
			Assert.assertEquals(ActualInternalRadioVisible, ExpectedInternalRadioVisible);
			testCase.log(Status.INFO, "Actual Internal Radio Button Visible :- " + ActualInternalRadioVisible);
			testCase.log(Status.INFO, "Expected Internal Radio Button Visible :- " + ExpectedInternalRadioVisible);
			testCase.log(Status.PASS, "Internal Radio Button Visible is Correct");
		} catch (AssertionError e) {
			testCase.log(Status.INFO, "Actual Internal Radio Button Visible :- " + ActualInternalRadioVisible);
			testCase.log(Status.INFO, "Expected Internal Radio Button Visible :- " + ExpectedInternalRadioVisible);
			testCase.log(Status.FAIL, "Internal Radio Button Visible is Wrong");
		}
		
//		External Radio Button Visible
		boolean ExpectedExternalRadioVisible=true;
		boolean ActualExternalRadioVisible=RadioButtonsPage.ExternalRadioButton.isDisplayed();
		testCase = extent.createTest("EXTERNAL RADIO BUTTON VISIBLE");
		try {
			Assert.assertEquals(ActualExternalRadioVisible, ExpectedExternalRadioVisible);
			testCase.log(Status.INFO, "Actual External Radio Button Visible :- " + ActualExternalRadioVisible);
			testCase.log(Status.INFO, "Expected External Radio Button Visible :- " + ExpectedExternalRadioVisible);
			testCase.log(Status.PASS, "External Radio Button Visible is Correct");
		} catch (AssertionError e) {
			testCase.log(Status.INFO, "Actual External Radio Button Visible :- " + ActualExternalRadioVisible);
			testCase.log(Status.INFO, "Expected External Radio Button Visible :- " + ExpectedExternalRadioVisible);
			testCase.log(Status.FAIL, "External Radio Button Visible is Wrong");
		}
		
//		Internal Radio Button Text
		String ExpectedInternalRadioText="Internal";
		String ActualInternalRadioText=RadioButtonsPage.InternalRadioText.getText();
		testCase = extent.createTest("INTERNAL RADIO BUTTON TEXT");
		try {
			Assert.assertEquals(ActualInternalRadioText, ExpectedInternalRadioText);
			testCase.log(Status.INFO, "Actual Internal Radio Button Text :- " + ActualInternalRadioText);
			testCase.log(Status.INFO, "Expected Internal Radio Button Text :- " + ExpectedInternalRadioText);
			testCase.log(Status.PASS, "Internal Radio Button Text is Correct");
		} catch (AssertionError e) {
			testCase.log(Status.INFO, "Actual Internal Radio Button Text :- " + ActualInternalRadioText);
			testCase.log(Status.INFO, "Expected Internal Radio Button Text :- " + ExpectedInternalRadioText);
			testCase.log(Status.FAIL, "Text Radio Button Visible is Wrong");
		}
		
//		External Radio Button Text
		String ExpectedExternalRadioText="External";
		String ActualExternalRadioText=RadioButtonsPage.ExternalRadioText.getText();
		testCase = extent.createTest("EXTERNAL RADIO BUTTON TEXT");
		try {
			Assert.assertEquals(ActualExternalRadioText, ExpectedExternalRadioText);
			testCase.log(Status.INFO, "Actual External Radio Text Visible :- " + ActualExternalRadioText);
			testCase.log(Status.INFO, "Expected External Radio Text Visible :- " + ExpectedExternalRadioText);
			testCase.log(Status.PASS, "External Radio Button Text is Correct");
		} catch (AssertionError e) {
			testCase.log(Status.INFO, "Actual External Radio Text Visible :- " + ActualExternalRadioText);
			testCase.log(Status.INFO, "Expected External Radio Text Visible :- " + ExpectedExternalRadioText);
			testCase.log(Status.FAIL, "External Radio Button Text is Wrong");
		}
//		Internal Radio Button Text Color
		 String InternalFontcolor = RadioButtonsPage.InternalRadioText.getCssValue("color");
	        String ActualInternalRadioTextColor = Color.fromString(InternalFontcolor).asHex();
	        String ExpectedInternalRadioTextColor = "#000000";
	        testCase = extent.createTest("INTERNAL RADIO BUTTON TEXT COLOR");
			try {
				Assert.assertEquals(ActualInternalRadioTextColor, ExpectedInternalRadioTextColor);
				testCase.log(Status.INFO, "Actual Internal Radio Text Color :- " + ActualInternalRadioTextColor);
				testCase.log(Status.INFO, "Expected Internal Radio Text Color :- " + ExpectedInternalRadioTextColor);
				testCase.log(Status.PASS, "Internal Radio Button Color is Correct");
			} catch (AssertionError e) {
				testCase.log(Status.INFO, "Actual Internal Radio Text Color :- " + ActualInternalRadioTextColor);
				testCase.log(Status.INFO, "Expected Internal Radio Text Color :- " + ExpectedInternalRadioTextColor);
				testCase.log(Status.FAIL, "Internal Radio Button Text Coloris Wrong");
			}
			
//			External Radio Button Text Color
			 String ExternalFontcolor = RadioButtonsPage.ExternalRadioText.getCssValue("color");
		        String ActualExternalRadioTextColor = Color.fromString(ExternalFontcolor).asHex();
		        String ExpectedExternalRadioTextColor = "#000000";
		        testCase = extent.createTest("EXTERNAL RADIO BUTTON TEXT COLOR");
				try {
					Assert.assertEquals(ActualExternalRadioTextColor, ExpectedExternalRadioTextColor);
					testCase.log(Status.INFO, "Actual External Radio Text Color :- " + ActualExternalRadioTextColor);
					testCase.log(Status.INFO, "Expected External Radio Text Color :- " + ExpectedExternalRadioTextColor);
					testCase.log(Status.PASS, "External Radio Button Color is Correct");
				} catch (AssertionError e) {
					testCase.log(Status.INFO, "Actual External Radio Text Color :- " + ActualExternalRadioTextColor);
					testCase.log(Status.INFO, "Expected External Radio Text Color :- " + ExpectedExternalRadioTextColor);
					testCase.log(Status.FAIL, "External Radio Button Text Coloris Wrong");
				}
				
//		Check Internal Radio Button Enable
		boolean ExpectedInternalRadioEnable=true;
		boolean ActualInternalRadioEnable=RadioButtonsPage.InternalRadioButtonClick.isEnabled();
		testCase = extent.createTest("INTERNAL RADIO BUTTON ENABLE");
		try {
			Assert.assertEquals(ActualInternalRadioEnable, ExpectedInternalRadioEnable);
			testCase.log(Status.INFO, "Actual Internal Radio Button Enable :- " + ActualInternalRadioEnable);
			testCase.log(Status.INFO, "Expected Internal Radio Button Enable :- " + ExpectedInternalRadioEnable);
			testCase.log(Status.PASS, "Internal Radio Button Enable is Correct");
		} catch (AssertionError e) {
			testCase.log(Status.INFO, "Actual Internal Radio Button Enable :- " + ActualInternalRadioEnable);
			testCase.log(Status.INFO, "Expected Internal Radio Button Enable :- " + ExpectedInternalRadioEnable);
			testCase.log(Status.FAIL, "Internal Radio Button Enable is Wrong");
		}
		
//		Check External Radio Button Enable
		boolean ExpectedExternalRadioEnable=true;
		boolean ActualExternalRadioEnable=RadioButtonsPage.ExternalRadioButtonClick.isEnabled();
		testCase = extent.createTest("EXTERNAL RADIO BUTTON ENABLE");
		try {
			Assert.assertEquals(ActualExternalRadioEnable, ExpectedExternalRadioEnable);
			testCase.log(Status.INFO, "Actual External Radio Button Enable :- " + ActualExternalRadioEnable);
			testCase.log(Status.INFO, "Expected External Radio Button Enable :- " + ExpectedExternalRadioEnable);
			testCase.log(Status.PASS, "External Radio Button Enable is Correct");
		} catch (AssertionError e) {
			testCase.log(Status.INFO, "Actual External Radio Button Enable :- " + ActualExternalRadioEnable);
			testCase.log(Status.INFO, "Expected External Radio Button Enable :- " + ExpectedExternalRadioEnable);
			testCase.log(Status.FAIL, "External Radio Button Enable is Wrong");
		}
		
//		Internal Radio Button Position
		Point ActualInternalLocation = RadioButtonsPage.InternalRadioButton.getLocation();
		Point ExpectedInternalLocation = new Point(312, 450);
		testCase = extent.createTest("INTERNAL RADIO BUTTON POSITION");
		try {
			Assert.assertEquals(ActualInternalLocation,ExpectedInternalLocation);
			testCase.log(Status.INFO, "Actual Internal Radio Button Position :- " + ActualInternalLocation);
			testCase.log(Status.INFO, "Expected Internal Radio Button Position :- " + ExpectedInternalLocation);
			testCase.log(Status.PASS, "Internal Radio Button Position is Correct");
		} catch (AssertionError e) {
			testCase.log(Status.INFO, "Actual Internal Radio Button Position :- " + ActualInternalLocation);
			testCase.log(Status.INFO, "Expected Internal Radio Button Position :- " + ExpectedInternalLocation);
			testCase.log(Status.FAIL, "Internal Radio Button Position is Wrong");
		}
		
//		External Radio Button Position
		Point ActualExternalLocation = RadioButtonsPage.ExternalRadioButton.getLocation();
		Point ExpectedExternalLocation = new Point(399, 450);
		testCase = extent.createTest("EXTERNAL RADIO BUTTON POSITION");
		try {
			Assert.assertEquals(ActualExternalLocation,ExpectedExternalLocation);
			testCase.log(Status.INFO, "Actual External Radio Button Position :- " + ActualExternalLocation);
			testCase.log(Status.INFO, "Expected External Radio Button Position :- " + ExpectedExternalLocation);
			testCase.log(Status.PASS, "External Radio Button Position is Correct");
		} catch (AssertionError e) {
			testCase.log(Status.INFO, "Actual External Radio Button Position :- " + ActualExternalLocation);
			testCase.log(Status.INFO, "Expected External Radio Button Position :- " + ExpectedExternalLocation);
			testCase.log(Status.FAIL, "External Radio Button Position is Wrong");
		}
//		Internal Radio Button Size
		Dimension ActualInternalRadioBtnSize = RadioButtonsPage.InternalRadioButton.getSize();
		Dimension ExpectedInternalRadioBtnSize = new Dimension(16, 16);
		testCase = extent.createTest("INTERNAL RADIO BUTTON SIZE");
		try {
			Assert.assertEquals(ActualInternalRadioBtnSize, ExpectedInternalRadioBtnSize);
			testCase.log(Status.INFO, "Actual Internal Radio Button Size :- " + ActualInternalRadioBtnSize);
			testCase.log(Status.INFO, "Expected Internal Radio Button Size :- " + ExpectedInternalRadioBtnSize);
			testCase.log(Status.PASS, "Internal Radio Button Size is Correct");
		} catch (AssertionError e) {
			testCase.log(Status.INFO, "Actual Internal Radio Button Size :- " + ActualInternalRadioBtnSize);
			testCase.log(Status.INFO, "Expected Internal Radio Button Size :- " + ExpectedInternalRadioBtnSize);
			testCase.log(Status.FAIL, "Internal Radio Button Size is Wrong");
		}
//		External Radio Button Size
		Dimension ActualExternalRadioBtnSize = RadioButtonsPage.ExternalRadioButton.getSize();
		Dimension ExpectedExternalRadioBtnSize = new Dimension(16, 16);
		testCase = extent.createTest("EXTERNAL RADIO BUTTON SIZE");
		try {
			Assert.assertEquals(ActualExternalRadioBtnSize, ExpectedExternalRadioBtnSize);
			testCase.log(Status.INFO, "Actual External Radio Button Size :- " + ActualExternalRadioBtnSize);
			testCase.log(Status.INFO, "Expected External Radio Button Size :- " + ExpectedExternalRadioBtnSize);
			testCase.log(Status.PASS, "External Radio Button Size is Correct");
		} catch (AssertionError e) {
			testCase.log(Status.INFO, "Actual External Radio Button Size :- " + ActualExternalRadioBtnSize);
			testCase.log(Status.INFO, "Expected External Radio Button Size :- " + ExpectedExternalRadioBtnSize);
			testCase.log(Status.FAIL, "External Radio Button Size is Wrong");
		}
		
//		Internal Radio Button Width
		Dimension InternalWidthSize = RadioButtonsPage.InternalRadioButton.getSize();
        int ActualInternalRadioBtnWidth = InternalWidthSize.getHeight();
        int ExpectedInternalRadioBtnWidth = 16;
        testCase = extent.createTest("INTERNAL RADIO BUTTON WIDTH");
		try {
			Assert.assertEquals(ActualInternalRadioBtnWidth, ExpectedInternalRadioBtnWidth);
			testCase.log(Status.INFO, "Actual Internal Radio Button Width :- " + ActualInternalRadioBtnWidth);
			testCase.log(Status.INFO, "Expected Internal Radio Button Width :- " + ExpectedInternalRadioBtnWidth);
			testCase.log(Status.PASS, "Internal Radio Button Width is Correct");
		} catch (AssertionError e) {
			testCase.log(Status.INFO, "Actual Internal Radio Button Width :- " + ActualInternalRadioBtnWidth);
			testCase.log(Status.INFO, "Expected Internal Radio Button Width :- " + ExpectedInternalRadioBtnWidth);
			testCase.log(Status.FAIL, "Internal Radio Button Width is Wrong");
		}
		
//		External Radio Button Width
		Dimension ExternalWidthSize = RadioButtonsPage.ExternalRadioButton.getSize();
        int ActualExternalRadioBtnWidth = ExternalWidthSize.getHeight();
        int ExpectedExternalRadioBtnWidth = 16;
        testCase = extent.createTest("EXTERNAL RADIO BUTTON WIDTH");
		try {
			Assert.assertEquals(ActualExternalRadioBtnWidth, ExpectedExternalRadioBtnWidth);
			testCase.log(Status.INFO, "Actual External Radio Button Width :- " + ActualExternalRadioBtnWidth);
			testCase.log(Status.INFO, "Expected External Radio Button Width :- " + ExpectedExternalRadioBtnWidth);
			testCase.log(Status.PASS, "External Radio Button Width is Correct");
		} catch (AssertionError e) {
			testCase.log(Status.INFO, "Actual External Radio Button Width :- " + ActualExternalRadioBtnWidth);
			testCase.log(Status.INFO, "Expected External Radio Button Width :- " + ExpectedExternalRadioBtnWidth);
			testCase.log(Status.FAIL, "External Radio Button Width is Wrong");
		}
		
		
//		Internal Radio Button Height
		 Dimension InternalHightSize = RadioButtonsPage.InternalRadioButton.getSize();
	        int ActualInternalRadioBtnHeight = InternalHightSize.getHeight();
	        int ExpectedInternalRadioBtnHeight = 16;
	        testCase = extent.createTest("INTERNAL RADIO BUTTON HEIGHT");
			try {
				Assert.assertEquals(ActualInternalRadioBtnHeight, ExpectedInternalRadioBtnHeight);
				testCase.log(Status.INFO, "Actual Internal Radio Button Height :- " + ActualInternalRadioBtnHeight);
				testCase.log(Status.INFO, "Expected Internal Radio Button Height :- " + ExpectedInternalRadioBtnHeight);
				testCase.log(Status.PASS, "Internal Radio Button Height is Correct");
			} catch (AssertionError e) {
				testCase.log(Status.INFO, "Actual Internal Radio Button Height :- " + ActualInternalRadioBtnHeight);
				testCase.log(Status.INFO, "Expected Internal Radio Button Height :- " + ExpectedInternalRadioBtnHeight);
				testCase.log(Status.FAIL, "Internal Radio Button Height is Wrong");
			}
		
//			External Radio Button Height
			Dimension ExternalHeightSize = RadioButtonsPage.ExternalRadioButton.getSize();
	        int ActualExternalRadioBtnHeight = ExternalHeightSize.getHeight();
	        int ExpectedExternalRadioBtnHeight = 16;
	        testCase = extent.createTest("EXTERNAL RADIO BUTTON HEIGHT");
			try {
				Assert.assertEquals(ActualExternalRadioBtnHeight, ExpectedExternalRadioBtnHeight);
				testCase.log(Status.INFO, "Actual External Radio Button Height :- " + ActualExternalRadioBtnHeight);
				testCase.log(Status.INFO, "Expected External Radio Button Height :- " + ExpectedExternalRadioBtnHeight);
				testCase.log(Status.PASS, "External Radio Button Height is Correct");
			} catch (AssertionError e) {
				testCase.log(Status.INFO, "Actual External Radio Button Height :- " + ActualExternalRadioBtnHeight);
				testCase.log(Status.INFO, "Expected External Radio Button Height :- " + ExpectedExternalRadioBtnHeight);
				testCase.log(Status.FAIL, "External Radio Button Height is Wrong");
			}
			
//		Internal Radio Button Color
		String InternalRadioBtnColour = RadioButtonsPage.InternalRadioButton.getCssValue("background-color");
		String ActualInternalRadioBtnColour = Color.fromString(InternalRadioBtnColour).asHex();
		String ExpectedInternalRadioBtnColour = "#000000";
		testCase = extent.createTest("INTERNAL RADIO BUTTON COLOR");
		try {
			Assert.assertEquals(ActualInternalRadioBtnColour, ExpectedInternalRadioBtnColour);
			testCase.log(Status.INFO, "Actual Internal Radio Button Color :- " + ActualInternalRadioBtnColour);
			testCase.log(Status.INFO, "Expected Internal Radio Button Color :- " + ExpectedInternalRadioBtnColour);
			testCase.log(Status.PASS, "Internal Radio Button Color is Correct");
		} catch (AssertionError e) {
			testCase.log(Status.INFO, "Actual Internal Radio Button Color :- " + ActualInternalRadioBtnColour);
			testCase.log(Status.INFO, "Expected Internal Radio Button Color :- " + ExpectedInternalRadioBtnColour);
			testCase.log(Status.FAIL, "Internal Radio Button Color is Wrong");
		}
		
//		External Radio Button Color
		String ExternalRadioBtnColour = RadioButtonsPage.ExternalRadioButton.getCssValue("background-color");
		String ActualExternalRadioBtnColour = Color.fromString(ExternalRadioBtnColour).asHex();
		String ExpectedExternalRadioBtnColour = "#000000";
		testCase = extent.createTest("INTERNAL RADIO BUTTON COLOR");
		try {
			Assert.assertEquals(ActualExternalRadioBtnColour, ExpectedExternalRadioBtnColour);
			testCase.log(Status.INFO, "Actual External Radio Button Color :- " + ActualExternalRadioBtnColour);
			testCase.log(Status.INFO, "Expected External Radio Button Color :- " + ExpectedExternalRadioBtnColour);
			testCase.log(Status.PASS, "External Radio Button Color is Correct");
		} catch (AssertionError e) {
			testCase.log(Status.INFO, "Actual External Radio Button Color :- " + ActualExternalRadioBtnColour);
			testCase.log(Status.INFO, "Expected External Radio Button Color :- " + ExpectedExternalRadioBtnColour);
			testCase.log(Status.FAIL, "External Radio Button Color is Wrong");
		}

//		Internal Radio Button not Selected before click
		boolean ActualInternalRadioBtnSelectedBeforeClick = RadioButtonsPage.InternalRadioButtonClick.isSelected();
		boolean ExpectedInternalRadioBtnSelectedBeforeClick = false;
		testCase = extent.createTest("INTERNAL RADIO BUTTON NOT SELECTED BEFORE CLICK");
		try {
			Assert.assertEquals(ActualInternalRadioBtnSelectedBeforeClick, ExpectedInternalRadioBtnSelectedBeforeClick);
			testCase.log(Status.INFO, "Actual Internal Radio Button not Selected before click :- " + ActualInternalRadioBtnSelectedBeforeClick);
			testCase.log(Status.INFO, "Expected Internal Radio Button not Selected before click :- " + ExpectedInternalRadioBtnSelectedBeforeClick);
			testCase.log(Status.PASS, "Internal Radio Button not Selected before click function is correct");
		} catch (AssertionError e) {
			testCase.log(Status.INFO, "Actual Internal Radio Button not Selected before click :- " + ActualInternalRadioBtnSelectedBeforeClick);
			testCase.log(Status.INFO, "Expected Internal Radio Button not Selected before click :- " + ExpectedInternalRadioBtnSelectedBeforeClick);
			testCase.log(Status.FAIL, "Internal Radio Button not Selected before click function is Wrong");
		}
		
//		External Radio Button not Selected before click
		boolean ActualExternalRadioBtnSelectedBeforeClick = RadioButtonsPage.ExternalRadioButtonClick.isSelected();
		boolean ExpectedExternalRadioBtnSelectedBeforeClick = false;
		testCase = extent.createTest("EXTERNAL RADIO BUTTON NOT SELECTED BEFORE CLICK");
		try {
			Assert.assertEquals(ActualExternalRadioBtnSelectedBeforeClick, ExpectedExternalRadioBtnSelectedBeforeClick);
			testCase.log(Status.INFO, "Actual External Radio Button not Selected before click :- " + ActualExternalRadioBtnSelectedBeforeClick);
			testCase.log(Status.INFO, "Expected External Radio Button not Selected before click :- " + ExpectedExternalRadioBtnSelectedBeforeClick);
			testCase.log(Status.PASS, "External Radio Button not Selected before click function is correct");
		} catch (AssertionError e) {
			testCase.log(Status.INFO, "Actual External Radio Button not Selected before click :- " + ActualExternalRadioBtnSelectedBeforeClick);
			testCase.log(Status.INFO, "Expected External Radio Button not Selected before click :- " + ExpectedExternalRadioBtnSelectedBeforeClick);
			testCase.log(Status.FAIL, "External Radio Button not Selected before click function is Wrong");
		}
		 
//		Internal Radio Button Selected after click
		RadioButtonsPage.InternalRadioButtonClick.click();
		Thread.sleep(2000);
		boolean ActualInternalRadioBtnSelectedAfterClick = RadioButtonsPage.InternalRadioButtonClick.isSelected();
		boolean ExpectedInternalRadioBtnSelectedAfterClick = true;
		testCase = extent.createTest("INTERNAL RADIO BUTTON SELECTED AFTER CLICK");
		try {
			Assert.assertEquals(ActualInternalRadioBtnSelectedAfterClick, ExpectedInternalRadioBtnSelectedAfterClick);
			testCase.log(Status.INFO, "Actual Internal Radio Button not Selected before click :- " + ActualInternalRadioBtnSelectedAfterClick);
			testCase.log(Status.INFO, "Expected Internal Radio Button not Selected before click :- " + ExpectedInternalRadioBtnSelectedAfterClick);
			testCase.log(Status.PASS, "Internal Radio Button Selected after click function is correct");
		} catch (AssertionError e) {
			testCase.log(Status.INFO, "Actual Internal Radio Button not Selected before click :- " + ActualInternalRadioBtnSelectedAfterClick);
			testCase.log(Status.INFO, "Expected Internal Radio Button not Selected before click :- " + ExpectedInternalRadioBtnSelectedAfterClick);
			testCase.log(Status.FAIL, "Internal Radio Button Selected after click function is Wrong");
		}
		Thread.sleep(2000);
		
//		External Radio Button Selected after click
		RadioButtonsPage.ExternalRadioButtonClick.click();
		Thread.sleep(2000);
		boolean ActualExternalRadioBtnSelectedAfterClick = RadioButtonsPage.ExternalRadioButtonClick.isSelected();
		boolean ExpectedExternalRadioBtnSelectedAfterClick = true;
		testCase = extent.createTest("EXTERNAL RADIO BUTTON SELECTED AFTER CLICK");
		try {
			Assert.assertEquals(ActualExternalRadioBtnSelectedAfterClick, ExpectedExternalRadioBtnSelectedAfterClick);
			testCase.log(Status.INFO, "Actual External Radio Button not Selected before click :- " + ActualExternalRadioBtnSelectedAfterClick);
			testCase.log(Status.INFO, "Expected External Radio Button not Selected before click :- " + ExpectedExternalRadioBtnSelectedAfterClick);
			testCase.log(Status.PASS, "External Radio Button Selected after click function is correct");
		} catch (AssertionError e) {
			testCase.log(Status.INFO, "Actual External Radio Button not Selected before click :- " + ActualExternalRadioBtnSelectedAfterClick);
			testCase.log(Status.INFO, "Expected External Radio Button not Selected before click :- " + ExpectedExternalRadioBtnSelectedAfterClick);
			testCase.log(Status.FAIL, "External Radio Button Selected after click function is Wrong");
		} 
		
//		if Internal Radio Button Clicked, Check External Radio Button Not Click
		RadioButtonsPage.InternalRadioButtonClick.click();
		Thread.sleep(1000);
		boolean ActualInternal=RadioButtonsPage.InternalRadioButtonClick.isSelected();
		boolean ExpectedInternal=true;
		boolean ActualExternal=RadioButtonsPage.ExternalRadioButtonClick.isSelected();
		boolean ExpectedExternal=false;
		boolean Result=true;
		if (ActualInternal==ExpectedInternal && ActualExternal==ExpectedExternal) {
			Result = true;
		}
		else {
			Result = false;
		}
		testCase = extent.createTest("IF CLICKED INTERNAL, CHECK INTERNAL SELECTED & EXTERNAL NOT SELECTED");
		try {
			Assert.assertEquals(Result,true);
			testCase.log(Status.INFO, "Actual Internal Radio Button Selected status after internal radio button clicked :- " + ActualInternal);
			testCase.log(Status.INFO, "Expected Internal Radio Button Selected status after internal radio button clicked :- " + ExpectedInternal);
			testCase.log(Status.INFO, "Actual External Radio Button Selected status after internal radio button clicked :- " + ActualExternal);
			testCase.log(Status.INFO, "Expected External Radio Button Selected status after internal radio button clicked :- " + ExpectedExternal);
			testCase.log(Status.PASS, "if Internal Radio Button Clicked, External Radio Button didnt Click function is correct");
		} catch (AssertionError e) {
			testCase.log(Status.INFO, "Actual Internal Radio Button Selected status after internal radio button clicked :- " + ActualInternal);
			testCase.log(Status.INFO, "Expected Internal Radio Button Selected status after internal radio button clicked :- " + ExpectedInternal);
			testCase.log(Status.INFO, "Actual External Radio Button Selected status after internal radio button clicked :- " + ActualExternal);
			testCase.log(Status.INFO, "Expected External Radio Button Selected status after internal radio button clicked :- " + ExpectedExternal);
			testCase.log(Status.PASS, "if Internal Radio Button Clicked, External Radio Button didnt Click function is Wrong");
		}
		
//		if External Radio Button Clicked, Check Internal Radio Button Not Click
		RadioButtonsPage.InternalRadioButtonClick.click();
		Thread.sleep(1000);
		boolean ActualInternal1=RadioButtonsPage.InternalRadioButtonClick.isSelected();
		boolean ExpectedInternal1=false;
		boolean ActualExternal1=RadioButtonsPage.ExternalRadioButtonClick.isSelected();
		boolean ExpectedExternal1=true;
		boolean Result1=true;
		if (ActualInternal1==ExpectedInternal1 && ActualExternal1==ExpectedExternal1) {
			Result1 = true;
		}
		else {
			Result1 = false;
		}
		testCase = extent.createTest("IF CLICKED EXTERNAL, CHECK EXTERNAL SELECTED & INTERNAL NOT SELECTED");
		try {
			Assert.assertEquals(Result1,true);
			testCase.log(Status.INFO, "Actual Internal Radio Button Selected status after External radio button clicked :- " + ActualInternal1);
			testCase.log(Status.INFO, "Expected Internal Radio Button Selected status after External radio button clicked :- " + ExpectedInternal1);
			testCase.log(Status.INFO, "Actual External Radio Button Selected status after External radio button clicked :- " + ActualExternal1);
			testCase.log(Status.INFO, "Expected External Radio Button Selected status after External radio button clicked :- " + ExpectedExternal1);
			testCase.log(Status.PASS, "if External Radio Button Clicked, External Radio Button didnt Click function is correct");
		} catch (AssertionError e) {
			testCase.log(Status.INFO, "Actual Internal Radio Button Selected status after External radio button clicked :- " + ActualInternal1);
			testCase.log(Status.INFO, "Expected Internal Radio Button Selected status after External radio button clicked :- " + ExpectedInternal1);
			testCase.log(Status.INFO, "Actual External Radio Button Selected status after External radio button clicked :- " + ActualExternal1);
			testCase.log(Status.INFO, "Expected External Radio Button Selected status after External radio button clicked :- " + ExpectedExternal1);
			testCase.log(Status.PASS, "if External Radio Button Clicked, Internal Radio Button didnt Click function is Wrong");
		}
		
//		Check Internal Radio Button Cursor point
		String ActualInternalRadioBtnCursor = RadioButtonsPage.InternalRadioButton.getCssValue("cursor");
        String ExpectedInternalRadioBtnCursor = "pointer";
        testCase = extent.createTest("INTERNAL RADIO BUTTON CURSOR");
        try {
            Assert.assertEquals(ActualInternalRadioBtnCursor, ExpectedInternalRadioBtnCursor);
            testCase.log(Status.INFO, "Actual Internal Radio Button Cursor point :- " + ActualInternalRadioBtnCursor);
			testCase.log(Status.INFO, "Expected Internal Radio Button Cursor point :- " + ExpectedInternalRadioBtnCursor);
			testCase.log(Status.PASS, "Internal Radio Button Cursor point is Correct");
		} catch (AssertionError e) {
			testCase.log(Status.INFO, "Actual Internal Radio Button Cursor point :- " + ActualInternalRadioBtnCursor);
			testCase.log(Status.INFO, "Expected Internal Radio Button Cursor point :- " + ExpectedInternalRadioBtnCursor);
			testCase.log(Status.FAIL, "Internal Radio Button Cursor point is Wrong");
        }
        
//		Check External Radio Button Cursor point
		String ActualExternalRadioBtnCursor = RadioButtonsPage.ExternalRadioButton.getCssValue("cursor");
        String ExpectedExternalRadioBtnCursor = "pointer";
        testCase = extent.createTest("EXTERNAL RADIO BUTTON CURSOR");
        try {
            Assert.assertEquals(ActualExternalRadioBtnCursor, ExpectedExternalRadioBtnCursor);
            testCase.log(Status.INFO, "Actual External Radio Button Cursor point :- " + ActualExternalRadioBtnCursor);
			testCase.log(Status.INFO, "Expected External Radio Button Cursor point :- " + ExpectedExternalRadioBtnCursor);
			testCase.log(Status.PASS, "External Radio Button Cursor point is Correct");
		} catch (AssertionError e) {
			testCase.log(Status.INFO, "Actual External Radio Button Cursor point :- " + ActualExternalRadioBtnCursor);
			testCase.log(Status.INFO, "Expected External Radio Button Cursor point :- " + ExpectedExternalRadioBtnCursor);
			testCase.log(Status.FAIL, "External Radio Button Cursor point is Wrong");
        }
        
//		Check internal border colour 
		String InternalBorderColour = RadioButtonsPage.InternalRadioButton.getCssValue("border-color");
		String ActualinternalBorderColour = Color.fromString(InternalBorderColour).asHex();
		String ExpectedinternalBorderColour = "#1890ff";
		testCase = extent.createTest("INTERNAL-BORDER-COLOUR");
		try {
			Assert.assertEquals(ActualinternalBorderColour, ExpectedinternalBorderColour);
			testCase.log(Status.INFO, "Actual internal Border Colour :- " + ActualinternalBorderColour);
			testCase.log(Status.INFO, "Expected internal Border Colour :- " + ExpectedinternalBorderColour);
			testCase.log(Status.PASS, "Correct internal Border Colour");
		} catch (AssertionError e) {
			testCase.log(Status.INFO, "Actual internal Border Colour :- " + ActualinternalBorderColour);
			testCase.log(Status.INFO, "Expected internal Border Colour :- " + ExpectedinternalBorderColour);
			testCase.log(Status.INFO, "wrong internal border Colour");
			testCase.log(Status.FAIL, "wrong border Colour");
		}

//		background color
		String bgcolor = RadioButtonsPage.InternalRadioButton.getCssValue("background-color");
		String Actualbgcolor = Color.fromString(bgcolor).asHex();
        String Expectedbgcolor = "#000000";

        testCase = extent.createTest("RADIO BUTTON BACKGROUND COLOR");
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
		RadioButtonsPage.Cancel.click();
		Thread.sleep(2000);
		
	}
}
