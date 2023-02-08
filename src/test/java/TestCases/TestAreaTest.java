package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import Base.DriverInitialization;
import Pages.ForgotLinkPage;
import Pages.TextAreapage;

public class TestAreaTest extends DriverInitialization {

	TextAreapage textAreapage = new TextAreapage();

	@Test
	public void TextArea() throws InterruptedException {

		PageFactory.initElements(driver, textAreapage);

		Thread.sleep(2000);

		TextAreapage.Usericon.click();
		TextAreapage.PlusIcon.click();

		// DISABLED

		try {
			boolean ExpectedButtonEnable = true;
			boolean actualButtonEnable = TextAreapage.textAreabox.isEnabled();
			testCase = extent.createTest("TEXTAREA-BOX");
			try {
				Assert.assertEquals(actualButtonEnable, ExpectedButtonEnable);
				testCase.log(Status.INFO, "ActualfontsSize :- " + actualButtonEnable);
				testCase.log(Status.INFO, "ExpectedfontsSize :- " + ExpectedButtonEnable);
				testCase.log(Status.INFO, "Correct font-size");
				testCase.log(Status.PASS, "Font-size Correct");
			} catch (AssertionError e) {
				testCase.log(Status.INFO, "ActualfontsSize :- " + actualButtonEnable);
				testCase.log(Status.INFO, "ExpectedfontsSize :- " + ExpectedButtonEnable);
				testCase.log(Status.INFO, "Wrong font-size");
				testCase.log(Status.FAIL, "Font-size Wrong");
			}
			Thread.sleep(2000);

		} catch (Exception e) {
			testCase = extent.createTest("TEXTAREA-BOX-VISBILITY-FAILED");
			testCase.log(Status.FAIL, "No Element");
		}

		// DISABLED

		try {
			boolean AcctualElement = TextAreapage.textAreabox.isDisplayed();
			boolean ExpectedElement = true;

			boolean elementvisible = true;
			testCase = extent.createTest("TEXTBOX-ELEMENT-VISIBLE");
			try {
				AssertJUnit.assertEquals(AcctualElement, ExpectedElement);
			} catch (AssertionError e) {
				elementvisible = false;
			}
			if (elementvisible) {
				testCase.log(Status.INFO, "ActualElement :- " + AcctualElement);
				testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedElement);
				testCase.log(Status.INFO, "Element Available");
				testCase.log(Status.PASS, "Correct element");
			} else {
				testCase.log(Status.INFO, "ActualElement :- " + AcctualElement);
				testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedElement);
				testCase.log(Status.INFO, "Element not available");
				testCase.log(Status.FAIL, "No Element");
			}
			Thread.sleep(2000);

		} catch (Exception e) {
			testCase = extent.createTest("TEXTAREA-BOX-DISABLED-FAILED");
			testCase.log(Status.FAIL, "No Element");
		}

		// POSITION

		try {

			Point ActualLocation = TextAreapage.textAreabox.getLocation();

			int actual_x = ActualLocation.getX();
			int actual_y = ActualLocation.getY();

			System.out.println("X axis: " + actual_x);
			System.out.println("Y axis: " + actual_y);

			Point ExpectedLocation = new Point(703, 246);

			testCase = extent.createTest("TEXTAREA-POSITION");

			boolean position = true;

			try {
				AssertJUnit.assertEquals(ActualLocation, ExpectedLocation);

			} catch (AssertionError e) {
				position = false;

			}
			if (position) {
				testCase.log(Status.INFO, "ActualLocation :- " + ActualLocation);
				testCase.log(Status.INFO, "ExpectedLocation :- " + ExpectedLocation);
				testCase.log(Status.INFO, "Correct Position");
				testCase.log(Status.PASS, "Position correct");
			} else {
				testCase.log(Status.INFO, "ActualLocation :- " + ActualLocation);
				testCase.log(Status.INFO, "ExpectedLocation :- " + ExpectedLocation);
				testCase.log(Status.INFO, "wrong Position");
				testCase.log(Status.FAIL, "Position Wrong");
			}
			Thread.sleep(2000);
		} catch (Exception e) {
			testCase = extent.createTest("TEXTAREA-BOX-POSITION-FAILED");
			testCase.log(Status.FAIL, "No Element");
		}

		// BACKGROUND-COLOR
		try {
			String Acctualbgcolor = TextAreapage.textAreabox.getCssValue("background-color");
			String Expectedbgcolor = "rgba(255, 255, 255, 1)";
			System.out.println("Background color:" + Acctualbgcolor);
			boolean cbgcolor = true;
			testCase = extent.createTest("TEXTAREA-BACKGROUND-COLOR");
			try {
				AssertJUnit.assertEquals(Acctualbgcolor, Expectedbgcolor);
			} catch (AssertionError e) {
				cbgcolor = false;

			}
			if (cbgcolor) {
				testCase.log(Status.INFO, "Actualbgcolor :- " + Acctualbgcolor);
				testCase.log(Status.INFO, "Expectedbgcolor :- " + Expectedbgcolor);
				testCase.log(Status.INFO, "Element Available");
				testCase.log(Status.PASS, "Correct element");
			} else {
				testCase.log(Status.INFO, "Actualbgcolor :- " + Acctualbgcolor);
				testCase.log(Status.INFO, "Expectedbgcolor :- " + Expectedbgcolor);
				testCase.log(Status.INFO, "Element not available");
				testCase.log(Status.FAIL, "No Element");
			}

		} catch (Exception e) {
			testCase = extent.createTest("TEXTAREA-BOX-POSITION-FAILED");
			testCase.log(Status.FAIL, "No Element");
		}
		Thread.sleep(2000);

		// BORDER-COLOR

		try {
			String actualbordercolor = TextAreapage.textAreabox.getCssValue("border");
			System.out.println("BorderColor: " + actualbordercolor);
			String expectedbordercolor = "1px solid rgb(217, 217, 217)";

			// 0px none rgb(255, 255, 255)
			boolean bordercolor1 = true;
			testCase = extent.createTest("TEXTAREA-BORDER-COLOR");
			try {
				AssertJUnit.assertEquals(actualbordercolor, expectedbordercolor);
			} catch (AssertionError find) {
				bordercolor1 = false;
			}
			if (bordercolor1) {
				testCase.log(Status.INFO, "ActualElement :- " + actualbordercolor);
				testCase.log(Status.INFO, "ExpectedElement :- " + expectedbordercolor);

				testCase.log(Status.PASS, "Correct ");
			} else {
				testCase.log(Status.INFO, "ActualElement :- " + actualbordercolor);
				testCase.log(Status.INFO, "ExpectedElement :- " + expectedbordercolor);

				testCase.log(Status.FAIL, "wrong");
			}
		} catch (Exception e) {
			testCase = extent.createTest("TEXTAREA-BOX-POSITION-FAILED");
			testCase.log(Status.FAIL, "No Element");
		}

		// SIZE

		Dimension ActualSize = TextAreapage.textAreabox.getSize();
		System.out.println("Size :" + ActualSize);
		Dimension ExpectedSize = new Dimension(298, 76);

		boolean size = true;
		testCase = extent.createTest("TEXTAREA-SIZE");
		try {
			AssertJUnit.assertEquals(ActualSize, ExpectedSize);
		} catch (AssertionError e) {
			size = false;
		}
		if (size) {
			testCase.log(Status.INFO, "ActualSize :- " + ActualSize);
			testCase.log(Status.INFO, "ExpectedSize :- " + ExpectedSize);
			testCase.log(Status.INFO, "Correct Size");
			testCase.log(Status.PASS, "Correct Size");
		} else {
			testCase.log(Status.INFO, "ActualSize :- " + ActualSize);
			testCase.log(Status.INFO, "ExpectedSize :- " + ExpectedSize);
			testCase.log(Status.INFO, "wrong Size");
			testCase.log(Status.FAIL, "wrong Size");
		}
		Thread.sleep(2000);

		// TEXTAREA-BOX-RESIZING 

		String ActualResizing = TextAreapage.textAreabox.getCssValue("resize");
		

		
		System.out.println("Font color of button: " + ActualResizing);
		String ExpectedfontColor = "vertical";

		boolean fontColour = true;

		testCase = extent.createTest("TEXTAREA-BOX-HEIGHT");
		try {
			AssertJUnit.assertEquals(ActualResizing, ExpectedfontColor);
		} catch (AssertionError e) {
			fontColour = false;
		}
		if (fontColour) {
			testCase.log(Status.INFO, "ActualColour :- " + ActualResizing);
			testCase.log(Status.INFO, "ExpectedColour :- " + ExpectedfontColor);
			testCase.log(Status.INFO, "Correct font Colour");
			testCase.log(Status.PASS, "Correct font Colour");
		} else {
			testCase.log(Status.INFO, "ActualColour :- " + ActualResizing);
			testCase.log(Status.INFO, "ExpectedColour :- " + ExpectedfontColor);
			testCase.log(Status.INFO, "wrong font Colour");
			testCase.log(Status.FAIL, "wrong font Colour");
		}
		Thread.sleep(2000);

		
		// TEXTAREA-BOX-RESIZING 
		
		        TextAreapage.textAreabox.sendKeys("Helloworld");
				String ActualText = TextAreapage.textAreabox.getAttribute("value");
				

				
				System.out.println("Font color of button: " + ActualResizing);
				String ExpectedText = "Helloworld";

				boolean textword = true;

				testCase = extent.createTest("TEXTAREA-BOX-VALUE");
				try {
					AssertJUnit.assertEquals(ActualResizing, ExpectedfontColor);
				} catch (AssertionError e) {
					fontColour = false;
				}
				if (textword) {
					testCase.log(Status.INFO, "ActualColour :- " + ActualResizing);
					testCase.log(Status.INFO, "ExpectedColour :- " + ExpectedfontColor);
					testCase.log(Status.INFO, "Correct font Colour");
					testCase.log(Status.PASS, "Correct font Colour");
				} else {
					testCase.log(Status.INFO, "ActualColour :- " + ActualResizing);
					testCase.log(Status.INFO, "ExpectedColour :- " + ExpectedfontColor);
					testCase.log(Status.INFO, "wrong font Colour");
					testCase.log(Status.FAIL, "wrong font Colour");
				}
				Thread.sleep(2000);

		
	}

}