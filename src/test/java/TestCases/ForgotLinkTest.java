package TestCases;

import java.util.Set;

import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.PageFactory;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import Base.DriverInitialization;
import Pages.ForgotLinkPage;

public class ForgotLinkTest extends DriverInitialization {

	ForgotLinkPage forgetlink = new ForgotLinkPage();

	@Test
	public void ForgetLink() throws InterruptedException {

		PageFactory.initElements(driver, forgetlink);
		Thread.sleep(2000);
		// SoftAssert sa = new SoftAssert();

		// ELEMENT-VISIBLITY

		try {
			boolean AcctualElement = ForgotLinkPage.forgetlink.isDisplayed();

			boolean ExpectedElement = true;

			boolean elementvisible = true;
			testCase = extent.createTest("FORGET-ELEMENT-VISIBLE");
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

		} catch (Exception e) {
			testCase = extent.createTest("FORGET-ELEMENT-VISIBLE");
			testCase.log(Status.FAIL, "No Element");
		}
		// Thread.sleep(2000);

//		// CHECK LINK TEXT

		try {
			String AcctualLinkText = ForgotLinkPage.forgetlink.getText();
			String ExpectedLinkText = "Forgot Password?";
			System.out.println("Link Text:" + AcctualLinkText);
			boolean ForgetLink = true;
			testCase = extent.createTest("FORGET-LINK-TEXT");
			try {
				AssertJUnit.assertEquals(AcctualLinkText, ExpectedLinkText);
			} catch (AssertionError e) {
				ForgetLink = false;
			}
			if (ForgetLink) {
				testCase.log(Status.INFO, "ActualLinkText :- " + AcctualLinkText);
				testCase.log(Status.INFO, "ExpectedLinkText :- " + ExpectedLinkText);
				testCase.log(Status.INFO, "Element Available");
				testCase.log(Status.PASS, "Correct element");
			} else {
				testCase.log(Status.INFO, "ActualLinkText :- " + AcctualLinkText);
				testCase.log(Status.INFO, "ExpectedLinkText :- " + ExpectedLinkText);
				testCase.log(Status.INFO, "Element not available");
				testCase.log(Status.FAIL, "No Element");
			}
		} catch (Exception e) {
			testCase = extent.createTest("FORGET-LINK-TEXT");
			testCase.log(Status.FAIL, "No Element");
		}

		// Thread.sleep(2000);

		// ACTIVE
		try {
			boolean AcctualEelementActive = ForgotLinkPage.forgetlink.isEnabled();
			boolean ExpectedEelementActive = true;

			boolean elementActive = true;
			testCase = extent.createTest("FORGET-ACTIVE");
			try {
				AssertJUnit.assertEquals(AcctualEelementActive, ExpectedEelementActive);
			} catch (AssertionError e) {
				elementActive = false;
			}
			if (elementActive) {
				testCase.log(Status.INFO, "ActualElementActive :- " + AcctualEelementActive);
				testCase.log(Status.INFO, "ExpectedElementActive :- " + ExpectedEelementActive);
				testCase.log(Status.INFO, "Element Available");
				testCase.log(Status.PASS, "Correct element");
			} else {
				testCase.log(Status.INFO, "ActualElementActive :- " + AcctualEelementActive);
				testCase.log(Status.INFO, "ExpectedElementActive :- " + ExpectedEelementActive);
				testCase.log(Status.INFO, "Element not available");
				testCase.log(Status.FAIL, "No Element");
			}

		} catch (Exception e) {
			testCase = extent.createTest("FORGET-ACTIVE");
			testCase.log(Status.FAIL, "No Element");
		}

		// Thread.sleep(2000);

		// LINK COLOR

		try {
			String ActualLinkColor = ForgotLinkPage.forgetlink.getCssValue("color");
			String hex = Color.fromString(ActualLinkColor).asHex();
			String ExpectedLinkColor = "#1890ff";

			boolean elementcolor = true;
			testCase = extent.createTest("FORGET-LINK-COLOR");
			try {
				AssertJUnit.assertEquals(hex, ExpectedLinkColor);
			} catch (AssertionError e) {
				elementcolor = false;
			}
			if (elementcolor) {
				testCase.log(Status.INFO, "ActualLinkColor :- " + hex);
				testCase.log(Status.INFO, "ExpectedLinkColor :- " + ExpectedLinkColor);
				testCase.log(Status.INFO, "Element Available");
				testCase.log(Status.PASS, "Correct element");
			} else {
				testCase.log(Status.INFO, "ActualLinkColor :- " + hex);
				testCase.log(Status.INFO, "ExpectedLinkColor :- " + ExpectedLinkColor);
				testCase.log(Status.INFO, "Element not available");
				testCase.log(Status.FAIL, "No Element");
			}

		} catch (Exception e) {
			testCase = extent.createTest("FORGET-LINK-COLOR");
			testCase.log(Status.FAIL, "No Element");
		}

		// Thread.sleep(2000);

		// BACKGROUND COLOR

		try {
			String ActualBgColor = ForgotLinkPage.forgetlink.getCssValue("background-color");
			String hex1 = Color.fromString(ActualBgColor).asHex();
			String ExpectedBgColor = "#000000";

			boolean elementbgcolor = true;
			testCase = extent.createTest("FORGET-LINK-BACKGROUND-COLOR");
			try {
				AssertJUnit.assertEquals(hex1, ExpectedBgColor);
			} catch (AssertionError e) {
				elementbgcolor = false;
			}
			if (elementbgcolor) {
				testCase.log(Status.INFO, "ActualBgColor :- " + hex1);
				testCase.log(Status.INFO, "ExpectedBgCOlor :- " + ExpectedBgColor);
				testCase.log(Status.INFO, "Element Available");
				testCase.log(Status.PASS, "Correct element");
			} else {
				testCase.log(Status.INFO, "ActualBgColor :- " + hex1);
				testCase.log(Status.INFO, "ExpectedBgCOlor :- " + ExpectedBgColor);
				testCase.log(Status.INFO, "Element not available");
				testCase.log(Status.FAIL, "No Element");
			}

		} catch (Exception e) {
			testCase = extent.createTest("FORGET-LINK-BACKGROUND-COLOR");
			testCase.log(Status.FAIL, "No Element");
		}
		// Thread.sleep(2000);

//		// LINK ALIGN

		try {
			String actualAlignment = ForgotLinkPage.forgetlink.getCssValue("text-align");
			String expectedAlignment = "center";

			boolean elementAlignment = true;
			testCase = extent.createTest("FORGET-TEXT-ALIGN");
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
			testCase = extent.createTest("FORGET-TEXT-ALIGN");
			testCase.log(Status.FAIL, "No Element");
		}
		// Thread.sleep(2000);

		// CURSOR
		try {
			String actualCursorPoint = ForgotLinkPage.forgetlink.getCssValue("cursor");
			String expectedCursorPoint = "pointer";

			boolean elementCursor = true;
			testCase = extent.createTest("FORGET-CURSOR-POINTER");
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
			testCase = extent.createTest("FORGET-CURSOR-POINTER");
			testCase.log(Status.FAIL, "No Element");
		}
		// Thread.sleep(2000);

		// LINK REDIRECT TO THE CORRECT LINK

		try {
			String currTabBefore = driver.getWindowHandle();

			ForgotLinkPage.forgetlink.click();

			String ExpectedLink = "http://qa-automation-release.s3-website-us-east-1.amazonaws.com/#/forgot";
			Set<String> browserTabs = driver.getWindowHandles();
			for (String str : browserTabs) {
				if (!currTabBefore.equals(str)) {
					driver.switchTo().window(str);
					System.out.println("Actural Link " + str);
				}
			}

			String ActualLink = driver.getCurrentUrl();
			System.out.println("ActualLink------" + ActualLink);
			boolean elementLink = true;
			testCase = extent.createTest("FORGET-REDIRECT-LINK");
			try {
				AssertJUnit.assertEquals(ActualLink, ExpectedLink);
			} catch (AssertionError e) {
				elementLink = false;
			}
			if (elementLink) {
				testCase.log(Status.INFO, "ActualRedirectLink :- " + ActualLink);
				testCase.log(Status.INFO, "ExpectedRedirectLink :- " + ExpectedLink);
				testCase.log(Status.INFO, "Element Available");
				testCase.log(Status.PASS, "Correct element");
			} else {
				testCase.log(Status.INFO, "ActualRedirectLink :- " + ActualLink);
				testCase.log(Status.INFO, "ExpectedRedirectLink :- " + ExpectedLink);
				testCase.log(Status.INFO, "Element not available");
				testCase.log(Status.FAIL, "No Element");
			}
			Thread.sleep(2000);
			ForgotLinkPage.Backtolink.click();
		} catch (Exception e) {
			testCase = extent.createTest("FORGET-REDIRECT-LINK");
			testCase.log(Status.FAIL, "No Element");
		}
		// Thread.sleep(2000);

		// GET WINDOW HANDLES

		try {
		ForgotLinkPage.forgetlink.click();
		Set<String> allWindows = driver.getWindowHandles();
		String testLink = "";
		if (allWindows.size() > 1) {
			System.out.println("Link opens in a new tab");
			testLink = "new tab";
		} else {
			testLink = "same tab";
			System.out.println("Link opens in the same tab");
		}

		
		String Expec = "same tab";
		// String str = allWindows.toString();
		// System.out.println("string check :" + str);

		boolean elementwindow = true;
		testCase = extent.createTest("FORGET-WINDOW");
		try {
			AssertJUnit.assertEquals(testLink, Expec);
		} catch (AssertionError e) {
			elementwindow = false;
		}
		if (elementwindow) {
			testCase.log(Status.INFO, "ActualAlignment :- " + testLink);
			testCase.log(Status.INFO, "ExpectedAlignment :- " + Expec);
			testCase.log(Status.INFO, "Element Available");
			testCase.log(Status.PASS, "Correct element");
		} else {
			testCase.log(Status.INFO, "ActualAlignment :- " + testLink);
			testCase.log(Status.INFO, "ExpectedAlignment :- " + Expec);
			testCase.log(Status.INFO, "Element not available");
			testCase.log(Status.FAIL, "No Element");
		}
		} catch (Exception e) {
			testCase = extent.createTest("FORGET-Window");
			testCase.log(Status.FAIL, "No Element");
		}
		

		Thread.sleep(2000);

		ForgotLinkPage.Backtolink.click();

	}
}