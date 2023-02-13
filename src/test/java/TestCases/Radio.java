package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import Base.DriverInitialization;
import Pages.RadioButtonsPage;

public class Radio extends DriverInitialization {
	RadioButtonsPage rbp = new RadioButtonsPage();

	@Test
	public void Radio() throws InterruptedException {
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
		
WebElement inter= driver.findElement(By.xpath("//div[@class='ant-radio-group ant-radio-group-outline']/label[1]"));
System.out.println(inter.getText());
System.out.println(inter.isSelected());
inter.click();
Thread.sleep(1000);
System.out.println(inter.isSelected());

System.out.println("***************************");
WebElement ext= driver.findElement(By.xpath("//input[@name='calibrated_by'][@value='EXTERNAL']"));
System.out.println(ext.isSelected());
ext.click();
Thread.sleep(1000);
System.out.println(ext.isSelected());

	}
}
