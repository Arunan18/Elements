package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.ExtentReports;

//import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import Base.DriverInitialization;

public class MandatoryFieldTest extends DriverInitialization{

//	



	public static void TestCasePrint(String TestCaseName, String expectedValue, String actualValue) {
		boolean position = true;
		ExtentTest testCase = extent.createTest(TestCaseName);
		try {
			AssertJUnit.assertEquals(actualValue, expectedValue);
		} catch (AssertionError e) {
			position = false;
		}
		if (position) {
			testCase.log(Status.INFO, "Actualvalue :- " + actualValue);
			testCase.log(Status.INFO, "Expectedvalue :- " + expectedValue);
			testCase.log(Status.INFO, "Correct value");
			testCase.log(Status.PASS, actualValue);
		} else {
			testCase.log(Status.INFO, "Actualvalue :- " + actualValue);
			testCase.log(Status.INFO, "ExpectedValue :- " + expectedValue);
			testCase.log(Status.INFO, "wrong value");
			testCase.log(Status.FAIL, actualValue);
		}
	}

	@Test(priority = 0)
	public static void testBasicItems() throws InterruptedException {

		driver.findElement(By.xpath("//a[@class='sc-bdVaJa ieeiNp'][@href='#/master/equipmentlevel']")).click();
		Thread.sleep(4000);
		// Click Add Equipment
//		try {
			driver.findElement(By.xpath(
					"//button[@type='button'][@class='ant-btn sc-gZMcBi dMdnOw']"))
					.click();
			Thread.sleep(2000);
//		} catch (Exception e) {
//			TestCasePrint("NO ADD EQUIPMENT BUTTON", "", String.valueOf(e));
//
//		}
////-----------------------------------------------------------------------------------------------
		// Test title name
		try {
			String value = driver
					.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div[2]/form/div[1]/div/div/label"))
					.getText();
			Thread.sleep(2000);

			TestCasePrint("TEST TITLE NAME", "* Equipment:", value);
		} catch (Exception e) {
			TestCasePrint("TEST TITLE NAME", "* Equipment:", String.valueOf(e));

		}
////-----------------------------------------------------------------------------------------------
		// Test Placeholder Name
		try {
			String value = driver.findElement(By.xpath("//*[@id=\"equipment_name\"]")).getAttribute("placeholder");

			TestCasePrint("TEST PLACEHOLDER NAME", "Enter Equipment Name", value);
		} catch (Exception e) {
			TestCasePrint("TEST PLACEHOLDER NAME", "Enter Equipment Name", String.valueOf(e));

		}
////-----------------------------------------------------------------------------------------------
		// test Enabled
		try {
			boolean value = driver.findElement(By.xpath("//*[@id=\"equipment_name\"]")).isEnabled();

			TestCasePrint("TEST ENABLE", "true", String.valueOf(value));
		} catch (Exception e) {
			TestCasePrint("TEST ENABLE", "true", String.valueOf(e));

		}

////-----------------------------------------------------------------------------------------------
		// test Visibility
		try {
			boolean value = driver.findElement(By.xpath("//*[@id=\"equipment_name\"]")).isDisplayed();

			TestCasePrint("TEST DISPLAYED", "true", String.valueOf(value));
		} catch (Exception e) {
			TestCasePrint("TEST DISPLAYED", "true", String.valueOf(e));

		}

		// test Position
		try {
			String value = driver.findElement(By.xpath("//*[@id=\"equipment_name\"]")).getLocation().toString();
			System.out.println("TEST POSITION" + value);
			TestCasePrint("TEST POSITION", "(527, 189)", String.valueOf(value));
		} catch (Exception e) {
			TestCasePrint("TEST POSITION", "(527, 189)", String.valueOf(e));

		}

		// test width
		try {
			int value = driver.findElement(By.xpath("//*[@id=\"equipment_name\"]")).getSize().getWidth();
			System.out.println("TEST WIDTH" + value);
			TestCasePrint("TEST WIDTH", String.valueOf(312), String.valueOf(value));
		} catch (Exception e) {
			TestCasePrint("TEST WIDTH", String.valueOf(312), String.valueOf(e));

		}

		// test BG COLOR
		try {
			String value = driver.findElement(By.xpath("//*[@id=\"equipment_name\"]")).getCssValue("background-color").toString();
			System.out.println("TEST BG COLOR" + value);
			TestCasePrint("TEST BG COLOR", "rgba(255, 255, 255, 1)", String.valueOf(value));
		} catch (Exception e) {
			TestCasePrint("TEST BG COLOR", "rgba(255, 255, 255, 1)", String.valueOf(e));

		}
		
		// test FONT COLOR
		try {
			String value = driver.findElement(By.xpath("//*[@id=\"equipment_name\"]")).getCssValue("color").toString();
			System.out.println("TEST FONT COLOR" + value);
			TestCasePrint("TEST FONT COLOR", "rgba(0, 0, 0, 0.85)", String.valueOf(value));
		} catch (Exception e) {
			TestCasePrint("TEST FONT COLOR", "rgba(0, 0, 0, 0.85)", String.valueOf(e));

		}

//// #############################################################################################
//// #############################################################################################

		// Test space Value Validation

//		try {
//			driver.findElement(By.xpath("//*[@id=\"equipment_name\"]")).sendKeys("     ");
//			Thread.sleep(2000);
//
//			// Validation message
//			String validMsg = driver
//					.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div[2]/form/div[1]/div")).getText();
//			Thread.sleep(2000);
//
//			// Print check
//			boolean testvalidation = validMsg.contains("Equipment Name allow only letters & Number");
//
//			if (testvalidation == true) {
//				validMsg = "Equipment Name allow only letters & Number";
//			}
//			
//			TestCasePrint("TEST SPACE VALIDATION", "Equipment Name allow only letters & Number", String.valueOf(validMsg));
//			
//		} catch (Exception e) {
//			TestCasePrint("TEST SPACE VALIDATION", "Equipment Name allow only letters & Number", String.valueOf(e));
//
//		}

//		Click Cancel
		driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div[3]/button[1]")).click();

		testSpaceValidation();
		testMinCharValidations();
		testEmptyValid();
		testInvNum();
		testInvSym();
		EmptySave();
		SpaceSve();
		NumberSave();
		SymbolSave();
		MinCharSave();
		
		
		
	}

//	@Test(priority = 1)
	public static void testSpaceValidation() throws InterruptedException {
		driver.findElement(By.xpath("//a[@class='sc-bdVaJa ieeiNp'][@href='#/master/equipmentlevel']")).click();
		Thread.sleep(4000);
		// Click Add Equipment
		try {
			driver.findElement(By.xpath(
					"/html/body/div[1]/div/section/section/main/div/div/div[2]/div/div/div/div/div[1]/div/div[3]/button"))
					.click();
			Thread.sleep(2000);
		} catch (Exception e) {

		} 

////--------------------------------------------------------------------------------------------

		// Test space Value Validation

		try {
			driver.findElement(By.xpath("//*[@id=\"equipment_name\"]")).sendKeys("     ");
			Thread.sleep(2000);

			// Validation message
			String validMsg = driver
					.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div[2]/form/div[1]/div")).getText();
			Thread.sleep(2000);

			// Print check
			boolean testvalidation = validMsg.contains("Equipment Name allow only letters & Number");

			if (testvalidation == true) {
				validMsg = "Equipment Name allow only letters & Number";
			}

			TestCasePrint("TEST SPACE VALIDATION", "Equipment Name allow only letters & Number",
					String.valueOf(validMsg));
			driver.findElement(By.xpath("//*[@id=\"equipment_name\"]")).clear();
		} catch (Exception e) {
			TestCasePrint("TEST SPACE VALIDATION", "Equipment Name allow only letters & Number", String.valueOf(e));

		}

////---------------------------------------------------------------------------------------------

//		Click Cancel
		driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div[3]/button[1]")).click();

	}

//	@Test(priority = 2)
	public static void testMinCharValidations() throws InterruptedException {
	
		// Click Add Equipment
		try {
			driver.findElement(By.xpath(
					"/html/body/div[1]/div/section/section/main/div/div/div[2]/div/div/div/div/div[1]/div/div[3]/button"))
					.click();
			Thread.sleep(2000);
		} catch (Exception e) {

		}

////---------------------------------------------------------------------------------------------

		//// MIMIMUM CHARECTORS Validation
		try {
			driver.findElement(By.xpath("//*[@id=\"equipment_name\"]")).sendKeys("eq");
			Thread.sleep(2000);

			// Validation message
			String validMsg = driver
					.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div[2]/form/div[1]/div")).getText();
			Thread.sleep(2000);

			boolean testvalidation = validMsg.contains("At least 3 characters long!");

			if (testvalidation == true) {
				validMsg = "At least 3 characters long!";
			}
			TestCasePrint("TEST MINIMUM CHARECTORS VALIDATION", "At least 3 characters long!",
					String.valueOf(validMsg));

		} catch (Exception e) {
			TestCasePrint("TEST MINIMUM CHARECTORS VALIDATION", "At least 3 characters long!", String.valueOf(e));

		}
////----------------------------------------------------------------------------------------------
//		Click Cancel
		driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div[3]/button[1]")).click();

	}

//	@Test(priority = 3)
	public static void testEmptyValid() throws InterruptedException {
	
		// Click Add Equipment
		try {
			driver.findElement(By.xpath(
					"/html/body/div[1]/div/section/section/main/div/div/div[2]/div/div/div/div/div[1]/div/div[3]/button"))
					.click();
			Thread.sleep(2000);
		} catch (Exception e) {

		}

////---------------------------------------------------------------------------------------------
		try {
			driver.findElement(By.xpath("//*[@id=\"equipment_name\"]")).sendKeys("eq");
			driver.findElement(By.xpath("//*[@id=\"equipment_name\"]")).sendKeys(Keys.BACK_SPACE);
			driver.findElement(By.xpath("//*[@id=\"equipment_name\"]")).sendKeys(Keys.BACK_SPACE);
			Thread.sleep(2000);

			String validMsg = driver
					.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div[2]/form/div[1]/div")).getText();
			Thread.sleep(2000);

			boolean testvalidation = validMsg.contains("Name can't be empty");

			if (testvalidation == true) {
				validMsg = "Name can't be empty";
			}
			TestCasePrint("TEST EMPTY VALIDATION", "Name can't be empty", String.valueOf(validMsg));

		} catch (Exception e) {
			TestCasePrint("TEST EMPTY VALIDATION", "Name can't be empty", String.valueOf(e));

		}

////----------------------------------------------------------------------------------------------
//		Click Cancel
		driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div[3]/button[1]")).click();

	}

//	@Test(priority = 4)
	public static void testInvNum() throws InterruptedException {

		// Click Add Equipment
		try {
			driver.findElement(By.xpath(
					"/html/body/div[1]/div/section/section/main/div/div/div[2]/div/div/div/div/div[1]/div/div[3]/button"))
					.click();
			Thread.sleep(2000);
		} catch (Exception e) {

		}

////---------------------------------------------------------------------------------------------
		try {
			driver.findElement(By.xpath("//*[@id=\"equipment_name\"]")).sendKeys("123");
			Thread.sleep(2000);

			String validMsg = driver
					.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div[2]/form/div[1]/div")).getText();
			Thread.sleep(2000);

			boolean testvalidation = validMsg.contains("Invalid Characters");

			if (testvalidation == true) {
				validMsg = "Invalid Characters";
			}
			TestCasePrint("TEST INVALID VALIDATION-NUMBER", "Invalid Characters", String.valueOf(validMsg));

		} catch (Exception e) {
			TestCasePrint("TEST INVALID VALIDATION-NUMBER", "Invalid Characters", String.valueOf(e));

		}

////----------------------------------------------------------------------------------------------
//		Click Cancel
		driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div[3]/button[1]")).click();

	}

//	@Test(priority = 5)
	public static void testInvSym() throws InterruptedException {

		// Click Add Equipment
		try {
			driver.findElement(By.xpath(
					"/html/body/div[1]/div/section/section/main/div/div/div[2]/div/div/div/div/div[1]/div/div[3]/button"))
					.click();
			Thread.sleep(2000);
		} catch (Exception e) {

		}

////---------------------------------------------------------------------------------------------
		try {
			driver.findElement(By.xpath("//*[@id=\"equipment_name\"]")).sendKeys("@@@");
			Thread.sleep(2000);

			String validMsg = driver
					.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div[2]/form/div[1]/div")).getText();
			Thread.sleep(2000);

			boolean testvalidation = validMsg.contains("Equipment Name allow only letters & Number");

			if (testvalidation == true) {
				validMsg = "Equipment Name allow only letters & Number";
			}
			TestCasePrint("TEST INVALID VALIDATION-SYMBOLS", "Equipment Name allow only letters & Number",
					String.valueOf(validMsg));

		} catch (Exception e) {
			TestCasePrint("TEST INVALID VALIDATION-SYMBOLS", "Equipment Name allow only letters & Number",
					String.valueOf(e));

		}

////----------------------------------------------------------------------------------------------
//		Click Cancel
		driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div[3]/button[1]")).click();

	}

	public static void TestNegativeSave(String NegativeTestCaseName, String inputValue) throws InterruptedException {

		// Click Add Equipment
		try {
			driver.findElement(By.xpath(
					"/html/body/div[1]/div/section/section/main/div/div/div[2]/div/div/div/div/div[1]/div/div[3]/button"))
					.click();
			Thread.sleep(2000);

			driver.findElement(By.xpath("//*[@id=\"equipment_description\"]")).sendKeys("Sample Comment");
			Thread.sleep(2000);

//			Click EQ type button
			driver.findElement(By.xpath("//*[@id=\"type\"]")).click();
			Thread.sleep(2000);

//			Select EQ type
			driver.findElement(By
					.xpath("//div[@class='ant-select-item-option-content'][normalize-space()='PRODUCTION_EQUIPMENT']"))
					.click();
			Thread.sleep(2000);

		} catch (Exception e) {

		}

////---------------------------------------------------------------------------------------------
//	test space Save
		try {
			driver.findElement(By.xpath("//*[@id=\"equipment_name\"]")).sendKeys(inputValue);
			Thread.sleep(2000);

			driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div[3]/button[2]")).click();
			Thread.sleep(2000);

			boolean saveButtonPresent = driver
					.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div[3]/button[2]")).isDisplayed();

			TestCasePrint(NegativeTestCaseName, "true", String.valueOf(saveButtonPresent));

		} catch (Exception e) {
			TestCasePrint(NegativeTestCaseName, "true", String.valueOf(e));

		}

////----------------------------------------------------------------------------------------------
//		Click Cancel
		driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div[3]/button[1]")).click();

	}

//	@Test(priority = 6)
	public static void EmptySave() throws InterruptedException { 
		TestNegativeSave("TEST EMPTY SAVE", "");
	}

//	@Test(priority = 7)
	public static void SpaceSve() throws InterruptedException {
		TestNegativeSave("TEST SPACE SAVE", "   ");
	}

//	@Test(priority = 8)
	public static void NumberSave() throws InterruptedException {
		TestNegativeSave("TEST NUMBER SAVE", "");
	}

//	@Test(priority = 9)
	public static void SymbolSave() throws InterruptedException {
		TestNegativeSave("TEST SYMBOL SAVE", "");
	}

//	@Test(priority = 10)
	public static void MinCharSave() throws InterruptedException {
		TestNegativeSave("TEST MINIMUM CHARECTORS SAVE", "eq");
	}

}
