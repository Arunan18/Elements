package TestCases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import Base.DriverInitialization;

public class TransferListTest extends DriverInitialization{
	
	

	public static void TestCasePrint(String TestCaseName, String expectedValue, String actualValue) {
		boolean position = true;
		 testCase = extent.createTest(TestCaseName);
		try {
			Assert.assertEquals(actualValue, expectedValue);
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


	@Test
	public static void testBasicItems() throws InterruptedException {

		//Get Link
		driver.get("https://ant.design/components/transfer");
		Thread.sleep(4000);

////  Test Whether data is present
//// -----------------------------------------------------------------------------------------------

		try {
			String content1 = driver.findElement(By
					.xpath("/html/body/div[1]/main/div[2]/article/div[2]/div/section/section[1]/section[1]/div/div[1]"))
					.getText();
			Thread.sleep(2000);

			System.out.println(content1);

			boolean pass = content1.contains("content");

			System.out.println("test - Contains Data status :- " + pass);

			TestCasePrint("TRANSFER LIST - CHECK DATA", "true", String.valueOf(pass));

		} catch (Exception e) {
			TestCasePrint("TRANSFER LIST - CHECK DATA", "true", String.valueOf(e));

		}

// Check whether one element passes on right side


		try {

			boolean pass = false;

			// Select content01
			driver.findElement(By
					.xpath("/html/body/div[1]/main/div[2]/article/div[2]/div/section/section[1]/section[1]/div/div[1]"))
					.findElement(By.xpath(
							"//section[@id='components-transfer-demo-basic']//span[@class='ant-transfer-list-content-item-text'][normalize-space()='content1']"))
					.click();
			Thread.sleep(2000);

			// click on move
			driver.findElement(By.xpath(
					"/html/body/div[1]/main/div[2]/article/div[2]/div/section/section[1]/section[1]/div/div[2]/button[1]"))
					.click();
			Thread.sleep(2000);

			// check whether component01 is not present in Content left
			String content1 = driver.findElement(By
					.xpath("/html/body/div[1]/main/div[2]/article/div[2]/div/section/section[1]/section[1]/div/div[1]"))
					.getText();
			Thread.sleep(2000);

			boolean checksrtringleft = content1.contains("content1\n");
			System.out.println(checksrtringleft);

			// check whether component01 is not present in Content right
			String content2 = driver.findElement(By
					.xpath("/html/body/div[1]/main/div[2]/article/div[2]/div/section/section[1]/section[1]/div/div[3]"))
					.getText();
			Thread.sleep(2000);

			boolean checksrtringright = content2.contains("content1\n");

			System.out.println(checksrtringright);

			if (checksrtringleft == false && checksrtringright == true) {
				pass = true;
			}

			System.out.println("test - Right to Left :- " + pass);

			TestCasePrint("TRANSFER LIST - RIGHT SIDE TRANSFER", "true", String.valueOf(pass));

		} catch (Exception e) {
			TestCasePrint("TRANSFER LIST - RIGHT SIDE TRANSFER", "true", String.valueOf(e));

		}

//// Check whether one element passes on right side
//// -------------------------------------------------------------------------------------------------

		try {

			boolean pass = false;

			// Select content01
			driver.findElement(By
					.xpath("/html/body/div[1]/main/div[2]/article/div[2]/div/section/section[1]/section[1]/div/div[3]"))
					.findElement(By.xpath(
							"//section[@id='components-transfer-demo-basic']//span[@class='ant-transfer-list-content-item-text'][normalize-space()='content1']"))
					.click();
			Thread.sleep(2000);

			// click on move
			driver.findElement(By.xpath(
					"/html/body/div[1]/main/div[2]/article/div[2]/div/section/section[1]/section[1]/div/div[2]/button[2]"))
					.click();
			Thread.sleep(2000);

			// check whether component01 is not present in Content left
			String content1 = driver.findElement(By
					.xpath("/html/body/div[1]/main/div[2]/article/div[2]/div/section/section[1]/section[1]/div/div[1]"))
					.getText();
			Thread.sleep(2000);

			boolean checksrtringleft = content1.contains("content1\n");
			System.out.println(checksrtringleft);

			// check whether component01 is not present in Content right
			String content2 = driver.findElement(By
					.xpath("/html/body/div[1]/main/div[2]/article/div[2]/div/section/section[1]/section[1]/div/div[3]"))
					.getText();
			Thread.sleep(2000);

			boolean checksrtringright = content2.contains("content1\n");

			System.out.println(checksrtringright);

			if (checksrtringleft == true && checksrtringright == false) {
				pass = true;
			}

			System.out.println("test - Left to Right Pass :- " + pass);

			TestCasePrint("TRANSFER LIST - LEFT SIDE TRANSFER", "true", String.valueOf(pass));

		} catch (Exception e) {
			TestCasePrint("TRANSFER LIST - LEFT SIDE TRANSFER", "true", String.valueOf(e));

		}

//// ------------------------------------------------------------------------------------------------

	}

}