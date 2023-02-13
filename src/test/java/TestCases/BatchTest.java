package TestCases;

import java.awt.Dimension;

import org.openqa.selenium.Point;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import Base.DriverInitialization;
import Pages.BatchPage;

public class BatchTest extends DriverInitialization{
	BatchPage pg = new BatchPage();

	@Test
	public void batch1() throws InterruptedException {
		PageFactory.initElements(driver, pg);

//		Thread.sleep(3000);
//		BatchPage.username.sendKeys("admin");
//		 
//		Thread.sleep(3000);
//		BatchPage.password.sendKeys("tokyo@admin");
//		
//		Thread.sleep(3000);
//		BatchPage.loginButton.click();
driver.navigate().refresh();
		Thread.sleep(5000);
		BatchPage.Batch.click();

//	   Thread.sleep(2000);
//     BatchPage.Batch.click();

		// CHECK VISIBILITY

		try {
			boolean Actualelement = BatchPage.Batch.isDisplayed();
			boolean expectedelement = true;

			boolean visible = true;
			testCase = extent.createTest("1.BATCH VISIBILED");

			try {
				Assert.assertEquals(expectedelement, Actualelement);
			} catch (AssertionError e) {
				visible = false;
			}
			if (visible) {
				testCase.log(Status.INFO, "ActualElement" + Actualelement);
				testCase.log(Status.INFO, "ExpectedElement" + expectedelement);
				testCase.log(Status.PASS, "visibled");
			} else {
				testCase.log(Status.INFO, "ActualElement" + Actualelement);
				testCase.log(Status.INFO, "ExpectedElement" + expectedelement);
				testCase.log(Status.FAIL, "Not visibled");
			}
		} catch (Exception e) {
			testCase = extent.createTest("1.BATCH VISIBILED");
			testCase.log(Status.FAIL, "No Element");
		}

		// CHECK WIDTH SIZE
		try {
			org.openqa.selenium.Dimension size = BatchPage.Batch.getSize();
			int actualWidth = size.getWidth();
			System.out.println("width  = " + actualWidth);
			int expectedWidth = 20;

			testCase = extent.createTest("2.BATCH WIDTH");
			boolean width1 = true;

			try {
				Assert.assertEquals(actualWidth, expectedWidth);
			} catch (AssertionError find) {
				width1 = false;
			}
			if (width1) {
				testCase.log(Status.INFO, "ActualElement :- " + actualWidth);
				testCase.log(Status.INFO, "ExpectedElement :- " + expectedWidth);
				testCase.log(Status.PASS, "Correct ");
			} else {
				testCase.log(Status.INFO, "ActualElement :- " + actualWidth);
				testCase.log(Status.INFO, "ExpectedElement :- " + expectedWidth);
				testCase.log(Status.FAIL, "wrong");
			}
		} catch (Exception e) {
			testCase = extent.createTest("2.BATCH WIDTH");
			testCase.log(Status.FAIL, "wrong");
		}

		// CHECK HEIGHT
		try {
			org.openqa.selenium.Dimension size = BatchPage.Batch.getSize();
			int actualHeight = size.getHeight();
			System.out.println("height  = " + actualHeight);
			int expectedHeight = 20;

			testCase = extent.createTest("3.BATCH HEIGHT");
			boolean Height1 = true;

			try {
				Assert.assertEquals(actualHeight, expectedHeight);
			} catch (AssertionError find) {
				Height1 = false;
			}
			if (Height1) {
				testCase.log(Status.INFO, "ActualElement :- " + actualHeight);
				testCase.log(Status.INFO, "ExpectedElement :- " + expectedHeight);
				testCase.log(Status.PASS, "Correct ");
			} else {
				testCase.log(Status.INFO, "ActualElement :- " + actualHeight);
				testCase.log(Status.INFO, "ExpectedElement :- " + expectedHeight);
				testCase.log(Status.FAIL, "wrong");
			}
		} catch (Exception e) {
			testCase = extent.createTest("3.BATCH HEIGHT");
			testCase.log(Status.FAIL, "wrong");
		}

		// CHECK BORDER COLOR

		try {
			String actualbordercolor = BatchPage.Batch.getCssValue("border-color");
			System.out.println("actual border color:" + actualbordercolor);
			String expectedbordercolor = "rgb(255, 255, 255)";

			boolean borderColor = true;
			testCase = extent.createTest("4.BATCH BORDER COLOR");

			try {
				Assert.assertEquals(expectedbordercolor, actualbordercolor);
			} catch (AssertionError e) {
				borderColor = false;
			}
			if (borderColor) {
				testCase.log(Status.INFO, "ActualElement" + actualbordercolor);
				testCase.log(Status.INFO, "ExpectedElement" + expectedbordercolor);
				testCase.log(Status.PASS, "correct");
			} else {
				testCase.log(Status.INFO, "ActualElement" + actualbordercolor);
				testCase.log(Status.INFO, "ExpectedElement" + expectedbordercolor);
				testCase.log(Status.FAIL, "wrong");
			}
		} catch (Exception e) {
			testCase = extent.createTest("4.BATCH BORDER COLOR");
			testCase.log(Status.FAIL, "No Element");
		}

		// CHECK VALUE SIZE

		try {
			String ActualeValueSize = BatchPage.Batch.getCssValue("font-size");
			System.out.println("actualFont Size:" + ActualeValueSize);
			String expectedeValueSize = "12px";

			boolean elementenabled = true;
			testCase = extent.createTest("5.BATCH VALUE SIZE");

			try {
				Assert.assertEquals(expectedeValueSize, ActualeValueSize);
			} catch (AssertionError e) {
				elementenabled = false;
			}
			if (elementenabled) {
				testCase.log(Status.INFO, "Actual" + ActualeValueSize);
				testCase.log(Status.INFO, "Expected" + expectedeValueSize);
				testCase.log(Status.PASS, "Enabled");
			} else {
				testCase.log(Status.INFO, "Actual" + ActualeValueSize);
				testCase.log(Status.INFO, "Expected" + expectedeValueSize);
				testCase.log(Status.FAIL, "Enabled");
			}
		} catch (Exception e) {
			testCase = extent.createTest("5.VALUE SIZE");
			testCase.log(Status.FAIL, "No Element");
		}

		// CHECK VALUE COLOR
		try {
			String actualcolor = BatchPage.Batch.getCssValue("color");
			String hex1 = Color.fromString(actualcolor).asHex();
			System.out.println("actualFontcolor:" + hex1);
			String expectedcolor = "#ffffff";

			boolean color1 = true;
			testCase = extent.createTest("6.VALUE COLOR");
			try {
				Assert.assertEquals(hex1, expectedcolor);
			} catch (AssertionError find) {
				color1 = false;
			}
			if (color1) {
				testCase.log(Status.INFO, "ActualElement :- " + hex1);
				testCase.log(Status.INFO, "ExpectedElement :- " + expectedcolor);
				testCase.log(Status.PASS, "Correct Element");
			} else {
				testCase.log(Status.INFO, "ActualElement :- " + hex1);
				testCase.log(Status.INFO, "ExpectedElement :- " + expectedcolor);
				testCase.log(Status.FAIL, "No Element");
			}
		} catch (Exception e) {
			testCase = extent.createTest("6.VALUE COLOR");
			testCase.log(Status.FAIL, "No Element");
		}
		Thread.sleep(2000);

		// CHECK BACKGROUND COLOR

		try {
			String actualbackgroundcolor = BatchPage.Batch.getCssValue("background-color");
			// String hex = Color.fromString(actualbackgroundcolor).asHex();
			System.out.println("actualbackgroundcolor:" + actualbackgroundcolor);
			String expectedfontcolor = "rgba(255, 77, 79, 1)";
			// "#ff4d4f";

			boolean bcolor1 = true;
			testCase = extent.createTest("7.BATCH BACKGROUND COLOR");
			try {
				Assert.assertEquals(actualbackgroundcolor, actualbackgroundcolor);
			} catch (AssertionError find) {
				bcolor1 = false;
			}
			if (bcolor1) {
				testCase.log(Status.INFO, "ActualElement :- " + actualbackgroundcolor);
				testCase.log(Status.INFO, "ExpectedElement :- " + expectedfontcolor);
				testCase.log(Status.PASS, "Correct Element");
			} else {
				testCase.log(Status.INFO, "ActualElement :- " + actualbackgroundcolor);
				testCase.log(Status.INFO, "ExpectedElement :- " + expectedfontcolor);
				testCase.log(Status.FAIL, "No Element");
			}
		} catch (Exception e) {
			testCase = extent.createTest("7.BATCH BACKGROUND COLOR");
			testCase.log(Status.FAIL, "No Element");
		}
		Thread.sleep(2000);

		// CHECK BOX SHADOW
		try {
			String actualboxshadow = BatchPage.Batch.getCssValue("box-shadow");
			// String hex = Color.fromString(actualbackgroundcolor).asHex();
			System.out.println("actual box shadow:" + actualboxshadow);
			String expectedboxshadow = "rgb(255, 255, 255) 0px 0px 0px 1px";

			boolean boxshadow1 = true;
			testCase = extent.createTest("8.BATCH BOX SHADOW");
			try {
				Assert.assertEquals(actualboxshadow, expectedboxshadow);
			} catch (AssertionError find) {
				boxshadow1 = false;
			}
			if (boxshadow1) {
				testCase.log(Status.INFO, "ActualElement :- " + actualboxshadow);
				testCase.log(Status.INFO, "ExpectedElement :- " + expectedboxshadow);
				testCase.log(Status.PASS, "Correct Element");
			} else {
				testCase.log(Status.INFO, "ActualElement :- " + actualboxshadow);
				testCase.log(Status.INFO, "ExpectedElement :- " + expectedboxshadow);
				testCase.log(Status.FAIL, "No Element");
			}
		} catch (Exception e) {
			testCase = extent.createTest("8.BATCH BOX SHADOW");
			testCase.log(Status.FAIL, "No Element");
		}
		Thread.sleep(2000);

		// CHECK ENABLED

		try {

			BatchPage.Batch.click();
			boolean Actualelement = BatchPage.Batch.isEnabled();
			boolean expectedelement = true;

			boolean elementenabled = true;
			testCase = extent.createTest("9.BATCH ENABLED");

			try {
				Assert.assertEquals(expectedelement, Actualelement);
			} catch (AssertionError e) {
				elementenabled = false;
			}
			if (elementenabled) {
				testCase.log(Status.INFO, "ActualElement" + Actualelement);
				testCase.log(Status.INFO, "ExpectedElement" + expectedelement);
				testCase.log(Status.PASS, "Enabled");
			} else {
				testCase.log(Status.INFO, "ActualElement" + Actualelement);
				testCase.log(Status.INFO, "ExpectedElement" + expectedelement);
				testCase.log(Status.FAIL, "Enabled");
			}
		} catch (Exception e) {
			testCase = extent.createTest("9.BATCH ENABLED");
			testCase.log(Status.FAIL, "No Element");
		}

		Thread.sleep(2000);

//CHECK PADDING
		try {
			String actualpadding = BatchPage.Batch.getCssValue("padding");
			System.out.println("padding = " + actualpadding);
			String expectedPadding = "0px 6px";

			boolean padding1 = true;
			testCase = extent.createTest("10.BATCH PADDING");
			try {
				Assert.assertEquals(actualpadding, expectedPadding);
			} catch (AssertionError find) {
				padding1 = false;

			}
			if (padding1) {
				testCase.log(Status.INFO, "ActualElement :- " + actualpadding);
				testCase.log(Status.INFO, "ExpectedElement :- " + expectedPadding);
				testCase.log(Status.PASS, "Correct ");
			} else {
				testCase.log(Status.INFO, "ActualElement :- " + actualpadding);
				testCase.log(Status.INFO, "ExpectedElement :- " + expectedPadding);
				testCase.log(Status.FAIL, "wrong");
			}
		} catch (Exception e) {
			testCase = extent.createTest("10.BATCH PADDING");
			testCase.log(Status.FAIL, "No Element");
		}
		Thread.sleep(2000);

		// CHECK BORDER RADIUS
		try {
			String actualBorderRadius = BatchPage.Batch.getCssValue("border-radius");
			System.out.println("border radius = " + actualBorderRadius);
			String expectedBorderRadius = "10px";

			boolean borderRadius = true;
			testCase = extent.createTest("11.BATCH BORDER RADIUS");
			try {
				Assert.assertEquals(actualBorderRadius, expectedBorderRadius);
			} catch (AssertionError find) {
				borderRadius = false;

			}
			if (borderRadius) {
				testCase.log(Status.INFO, "ActualElement :- " + actualBorderRadius);
				testCase.log(Status.INFO, "ExpectedElement :- " + expectedBorderRadius);
				testCase.log(Status.PASS, "Correct ");
			} else {
				testCase.log(Status.INFO, "ActualElement :- " + actualBorderRadius);
				testCase.log(Status.INFO, "ExpectedElement :- " + expectedBorderRadius);
				testCase.log(Status.FAIL, "wrong");
			}
		} catch (Exception e) {
			testCase = extent.createTest("11.BATCH BORDER RADIUS");
			testCase.log(Status.FAIL, "No Element");
		}
		Thread.sleep(2000);

		// CHECK FONT FAMILY
		try {
			String actualFontfamily = BatchPage.Batch.getCssValue("font-family");
			System.out.println("fontfamily = " + actualFontfamily);
			String expectedFontfamily = "Roboto, sans-serif";

			boolean fontfamily = true;
			testCase = extent.createTest("12.BATCH FONT FAMILY");
			try {
				Assert.assertEquals(actualFontfamily, expectedFontfamily);
			} catch (AssertionError find) {
				fontfamily = false;

			}
			if (fontfamily) {
				testCase.log(Status.INFO, "ActualElement :- " + actualFontfamily);
				testCase.log(Status.INFO, "ExpectedElement :- " + expectedFontfamily);
				testCase.log(Status.PASS, "Correct ");
			} else {
				testCase.log(Status.INFO, "ActualElement :- " + actualFontfamily);
				testCase.log(Status.INFO, "ExpectedElement :- " + expectedFontfamily);
				testCase.log(Status.FAIL, "wrong");
			}

		} catch (Exception e) {
			testCase = extent.createTest("12.BATCH FONT FAMILY");
			testCase.log(Status.FAIL, "No Element");
		}
		Thread.sleep(2000);

		// CHECK POSITION
		try {
			Point ActualLocation = BatchPage.Batch.getLocation();

			int actual_x = ActualLocation.getX();
			int actual_y = ActualLocation.getY();

			System.out.println("X axis : " + actual_x);
			System.out.println("Y axis : " + actual_y);

			Point ExpectedLocation = new Point(1194, 8);

			boolean position = true;
			testCase = extent.createTest("14.BATCH POSITION");
			try {
				Assert.assertEquals(ActualLocation, ExpectedLocation);
			} catch (AssertionError e) {
				position = false;
			}
			if (position) {
				testCase.log(Status.INFO, "ActualLocation :- " + ActualLocation);
				testCase.log(Status.INFO, "ExpectedLocation :- " + ExpectedLocation);
				testCase.log(Status.PASS, "Position correct");
			} else {
				testCase.log(Status.INFO, "ActualLocation :- " + ActualLocation);
				testCase.log(Status.INFO, "ExpectedLocation :- " + ExpectedLocation);
				testCase.log(Status.FAIL, "Position Wrong");
			}

		} catch (Exception e) {
			testCase = extent.createTest("14.BATCH POSITION");
			testCase.log(Status.FAIL, "No Element");
		}
		Thread.sleep(2000);

		// CHECK ALIGNMENT
		try {
			String actualalignment = BatchPage.Batch.getCssValue("text-align");
			System.out.println("text align = " + actualalignment);
			String expectedalignment = "center";

			boolean alignment = true;
			testCase = extent.createTest("15.BATCH ALIGNMENT");
			try {
				Assert.assertEquals(actualalignment, expectedalignment);
			} catch (AssertionError find) {
				alignment = false;

			}
			if (alignment) {
				testCase.log(Status.INFO, "ActualElement :- " + actualalignment);
				testCase.log(Status.INFO, "ExpectedElement :- " + expectedalignment);
				testCase.log(Status.PASS, "Correct ");
			} else {
				testCase.log(Status.INFO, "ActualElement :- " + actualalignment);
				testCase.log(Status.INFO, "ExpectedElement :- " + expectedalignment);
				testCase.log(Status.FAIL, "wrong");

			}
		} catch (Exception e) {
			testCase = extent.createTest("15.BATCH ALIGNMENT");
			testCase.log(Status.FAIL, "No Element");
		}
		Thread.sleep(2000);
		// CHECK NOTIFICATION COUNT WORKFLOW

		// Click the notification untill 0
		boolean passorfail = true;
		int count = 0;
		String countstr;
		try {
			countstr = BatchPage.Batch.getText();
			count = Integer.parseInt(countstr);
		} catch (Exception e) {
		}
		System.out.println(count);
		if (count > 0) {
			try {
				while (count > 0) {
					// click on notification button
					BatchPage.Notification.click();
					Thread.sleep(2000);
					// click on first notification
					BatchPage.FirstNotification.click();
					Thread.sleep(1000);

					driver.navigate().refresh();
					Thread.sleep(2000);
					try {
						countstr = BatchPage.Batch.getText();
						count = Integer.parseInt(countstr);
					} catch (Exception e) {
					}
				}
			} catch (Exception e) {
			}
		}
		System.out.println(passorfail);
		boolean workflow = true;
		testCase = extent.createTest("16.NOTIFICATION COUNT WORKFLOW");
		try {
			Assert.assertEquals(passorfail, true);
		} catch (AssertionError find) {
			workflow = false;

		}
		if (workflow) {
			testCase.log(Status.INFO, "ActualElement :- " + passorfail);
			testCase.log(Status.INFO, "ExpectedElement :- " + true);
			testCase.log(Status.PASS, "Correct ");
		} else {
			testCase.log(Status.INFO, "ActualElement :- " + passorfail);
			testCase.log(Status.INFO, "ExpectedElement :- " + true);
			testCase.log(Status.FAIL, "wrong");

			Thread.sleep(2000);
		}
	}

}
