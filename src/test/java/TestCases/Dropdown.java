package TestCases;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import Base.DriverInitialization;

public class Dropdown extends DriverInitialization {

	@Test

	public void MaterialDropDown() throws InterruptedException {

//		Thread.sleep(2000);
//
//		WebElement Master = driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/section/main/div/div/div/div[1]/a/div/div"));
//		Master.click();
//
//		WebElement Meterial = driver.findElement(
//				By.xpath("//li[@class='ant-menu-overflow-item ant-menu-item ant-menu-item-only-child'][3]"));
//		Meterial.click();

		WebElement AddMeterialMainCategoryButton = driver.findElement(By.xpath(
				"//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div/div[1]/div/div[3]/button/span"));
		AddMeterialMainCategoryButton.click();

		WebElement dropdown = driver.findElement(By.xpath("//input[@id='mainType']"));
		Thread.sleep(2000);
		dropdown.click();

		WebElement DropDownArrow = driver.findElement(
				By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div[2]/form/div[2]/div[3]/div/div[1]/div"));

		WebElement DropDownBox = driver
				.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div[2]/form/div[2]/div[3]/div"));

		Thread.sleep(2000);

		
		
		WebElement rawmaterial = driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div[2]/div[1]/div/div/div[2]"));
		Thread.sleep(2000); 
		
		WebElement finishproduct = driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div[2]/div[1]/div/div/div[1]"));
		Thread.sleep(2000); 
		
		List<WebElement> options = dropdown
				.findElements(By.xpath("/html/body/div[4]/div/div/div/div[2]/div[1]/div/div"));

		Thread.sleep(2000);

//    	Select se = new Select(DropDownBox);
//    	se.selectByIndex(1);

		for (WebElement option : options) {

			if (option.getText().contains("")) {
				System.out.println("Selected option : " + option.getText());
				option.click();

//		        break;
			}
//ArrayList<String> array = new ArrayList();
//   array.add("FINISH_PRODUCT");
//   array.add("RAW_MATERIAL");
			
//			ArrayList<String> ActualPick = new ArrayList();
			for (WebElement ext : options) {
			String ActualPick = finishproduct.getText();
//				List<String> ExpectedPick = new ArrayList<String>();
			String	ExpectedPick= ("FINISH_PRODUCT");

				boolean data = true;
				testCase = extent.createTest("001-DROPDOWN DATA PICK");

				try {
					AssertJUnit.assertEquals(ActualPick, ExpectedPick);
				} catch (AssertionError e) {
					data = false;
				}

				if (data) {
					testCase.log(Status.INFO, "ActualElement :- " + ActualPick);
					testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedPick);

					testCase.log(Status.PASS, "picked correctly ");
				} else {
					testCase.log(Status.INFO, "ActualElement :- " + ActualPick);
					testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedPick);

					testCase.log(Status.FAIL, "wrong pick");

				}

			}

		}

//		for (WebElement option : options) {
//			// System.out.println("data" );
//			// System.out.println(option.getText());
//
//			List<String> strArr = new ArrayList<String>();
//			for (WebElement ex : options) {
//				strArr.add(ex.getText());
//
//				List<String> Expectedtext = new ArrayList<String>();
//				Expectedtext.add("FINISH_PRODUCT"
//						+ "RAW_MATERIAL");
//				// Expectedtext.add("RAW_MATERIAL");
//
//				boolean txt = true;
//				testCase = extent.createTest("002-DROPDOWN DATA");
//				try {
//					AssertJUnit.assertEquals(strArr, Expectedtext);
//				} catch (AssertionError e) {
//					txt = false;
//				}
//				if (txt) {
//					testCase.log(Status.INFO, "ActualElement :- " + strArr);
//					testCase.log(Status.INFO, "ExpectedElement :- " + Expectedtext);
//
//					testCase.log(Status.PASS, "data match ");
//				} else {
//					testCase.log(Status.INFO, "ActualElement :- " + strArr);
//					testCase.log(Status.INFO, "ExpectedElement :- " + Expectedtext);
//
//					testCase.log(Status.FAIL, "data not match");
//				}
//			}
//		}

		
		
//		WebElement originalDropdown = driver.findElement(By.className("rc-virtual-list-holder-inner"));
//		Select original = new  Select(originalDropdown);
//		List<WebElement> originalListElements = original.getOptions();
//		List<String> originalList = new ArrayList<String>();
//		for (WebElement webElement : originalListElements) {
//			originalList.add(webElement.getText());
//		}
//
//		// target dropdown
//		WebElement targetDropdown = driver.findElement(By.id("order-same"));
//		Select target = new  Select(targetDropdown);
//		List<WebElement> targetListElements = target.getOptions();
//		List<String> targetList = new ArrayList<String>();
//		for (WebElement webElement : targetListElements) {
//			targetList.add(webElement.getText());
//		}
//		Assert.assertEquals(originalList, targetList);
		
		
		
		
		
		
		
		
		
		
		
		
//		check the dropdown visibility

		boolean AcctualElement = DropDownBox.isDisplayed();
		boolean ExpectedElement = true;

		boolean elementvisible = true;
		testCase = extent.createTest("003-MAINTYPE-DROPDOWN-VISIBLE");
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

//			Check the visibility of arrow in dropdown

		boolean AcctualArrow = DropDownArrow.isDisplayed();
		boolean ExpectedArrow = true;

		boolean arrowvisible = true;
		testCase = extent.createTest("004-MAINTYPE-DROPDOWN-ARROW-VISIBLE");
		try {
			AssertJUnit.assertEquals(AcctualArrow, ExpectedArrow);
		} catch (AssertionError e) {
			arrowvisible = false;
		}
		if (arrowvisible) {
			testCase.log(Status.INFO, "ActualElement :- " + AcctualArrow);
			testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedArrow);

			testCase.log(Status.PASS, "Arrow is available");
		} else {
			testCase.log(Status.INFO, "ActualElement :- " + AcctualElement);
			testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedArrow);

			testCase.log(Status.FAIL, "Arrow is not available");
		}
		Thread.sleep(2000);

		// dropdown box enable

		boolean AcctualEnable = DropDownBox.isEnabled();
		boolean ExpectedEnable = true;

		boolean boxenable = true;
		testCase = extent.createTest("005-MAINTYPE-DROPDOWN-ENABLE");
		try {
			AssertJUnit.assertEquals(AcctualEnable, ExpectedEnable);
		} catch (AssertionError e) {
			boxenable = false;
		}
		if (boxenable) {
			testCase.log(Status.INFO, "ActualElement :- " + AcctualEnable);
			testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedEnable);

			testCase.log(Status.PASS, "Correct element");
		} else {
			testCase.log(Status.INFO, "ActualElement :- " + AcctualEnable);
			testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedEnable);

			testCase.log(Status.FAIL, "No Element");
		}
		Thread.sleep(2000);

		// check the position

		Point ActualLocation = DropDownBox.getLocation();

		int actual_x = ActualLocation.getX();
		int actual_y = ActualLocation.getY();

		System.out.println("X axis: " + actual_x);
		System.out.println("Y axis: " + actual_y);

		Point ExpectedLocation = new Point(502, 330);

		boolean Position = true;
		testCase = extent.createTest("006-MAINTYPE-DROPDOWN-POSITION");
		try {
			AssertJUnit.assertEquals(ActualLocation, ExpectedLocation);

		} catch (AssertionError e) {
			Position = false;
		}
		if (Position) {
			testCase.log(Status.INFO, "ActualFontSize :- " + ActualLocation);
			testCase.log(Status.INFO, "ExpectedFontSize :- " + ExpectedLocation);
			testCase.log(Status.PASS, "Correct Location");
		} else {
			testCase.log(Status.INFO, "ActualSize :- " + ActualLocation);
			testCase.log(Status.INFO, "ExpectedSize :- " + ExpectedLocation);
			testCase.log(Status.FAIL, "Wrong Location");
		}
		Thread.sleep(2000);

		// check cursor

		String ActualActions = DropDownArrow.getCssValue("cursor");
		System.out.println("cursor :" + ActualActions);
		String ExpectedActions = "pointer";

		boolean cursor = true;
		testCase = extent.createTest("007-MAINTYPE-DROPDOWN-CURSOR-AUTO");
		try {
			AssertJUnit.assertEquals(ActualActions, ExpectedActions);

		} catch (AssertionError e) {
			Position = false;
		}
		if (Position) {
			testCase.log(Status.INFO, "ActualFontSize :- " + ActualActions);
			testCase.log(Status.INFO, "ExpectedFontSize :- " + ExpectedActions);
			testCase.log(Status.PASS, "drop down auto");
		} else {
			testCase.log(Status.INFO, "ActualSize :- " + ActualActions);
			testCase.log(Status.INFO, "ExpectedSize :- " + ExpectedActions);
			testCase.log(Status.FAIL, "drop dow not auto");
		}
		Thread.sleep(2000);

		// check the size of dropdown box

		Dimension ActualSize = DropDownArrow.getSize();
		System.out.println("Size : " + ActualSize);
		Dimension ExpectedSize = new Dimension(342, 32);

		boolean size = true;
		testCase = extent.createTest("008-MAINTYPE-DROPDOWN-SIZE");
		try {
			AssertJUnit.assertEquals(ActualSize, ExpectedSize);

		} catch (AssertionError e) {
			size = false;
		}
		if (size) {
			testCase.log(Status.INFO, "ActualSize :- " + ActualSize);
			testCase.log(Status.INFO, "ExpectedSize :- " + ExpectedSize);
			testCase.log(Status.PASS, "Correcrt size");
		} else {
			testCase.log(Status.INFO, "ActualSize :- " + ActualSize);
			testCase.log(Status.INFO, "ExpectedSize :- " + ExpectedSize);
			testCase.log(Status.FAIL, "Wrong Size");
		}
		Thread.sleep(2000);

		// check the color

		String ActualButtonColor = DropDownBox.getCssValue("background-color");
		System.out.println("rgb :" + ActualButtonColor);
		String ExpectedButtonColor = "rgba(0, 0, 0, 0)";

		boolean buttoncolor = true;
		testCase = extent.createTest("009-MAINTYPE-DROPDOWN-COLOR");
		try {
			AssertJUnit.assertEquals(ActualButtonColor, ExpectedButtonColor);

		} catch (AssertionError e) {
			buttoncolor = false;
		}
		if (buttoncolor) {
			testCase.log(Status.INFO, "ActualButtonColor :- " + ActualButtonColor);
			testCase.log(Status.INFO, "ExpectedButtonColor :- " + ExpectedButtonColor);
			testCase.log(Status.PASS, "Correct Button Color");
		} else {
			testCase.log(Status.INFO, "ActualButtonColor :- " + ActualButtonColor);
			testCase.log(Status.INFO, "ExpectedButtonColor :- " + ExpectedButtonColor);
			testCase.log(Status.FAIL, "Wrong Button Color");
		}
		Thread.sleep(2000);

		// check the border color

		String ActualBorderColor = DropDownBox.getCssValue("border-colour");
		System.out.println("rgb :" + ActualBorderColor);

		String ExpectedBorderColor = "";

		boolean bordercolor = true;
		testCase = extent.createTest("010-MAINTYPE-BORDER-COLOR");
		try {
			AssertJUnit.assertEquals(ActualBorderColor, ExpectedBorderColor);

		} catch (AssertionError e) {
			bordercolor = false;
		}
		if (bordercolor) {
			testCase.log(Status.INFO, "ActualBorderColor :- " + ActualBorderColor);
			testCase.log(Status.INFO, "ExpectedBorderColor :- " + ExpectedBorderColor);
			testCase.log(Status.PASS, "Correct Border Color");
		} else {
			testCase.log(Status.INFO, "ActualBorderColor :- " + ActualBorderColor);
			testCase.log(Status.INFO, "ExpectedBorderColor :- " + ExpectedBorderColor);
			testCase.log(Status.FAIL, "Wrong Border Color");
		}
		Thread.sleep(2000);

		// check the box shadow

		String ActualBoXShadow = DropDownBox.getCssValue("box-shadow");
		System.out.println("Box Shadow :" + ActualBoXShadow);

		String ExpectedBoxShadow = "none";

		boolean boxshadow = true;
		testCase = extent.createTest("011-MAINTYPE-BOX-SHADOW");
		try {
			AssertJUnit.assertEquals(ActualBoXShadow, ExpectedBoxShadow);

		} catch (AssertionError e) {
			boxshadow = false;
		}
		if (boxshadow) {
			testCase.log(Status.INFO, "ActualBorderColor :- " + ActualBoXShadow);
			testCase.log(Status.INFO, "ExpectedBorderColor :- " + ExpectedBoxShadow);
			testCase.log(Status.PASS, "box shadow available");
		} else {
			testCase.log(Status.INFO, "ActualBorderColor :- " + ActualBoXShadow);
			testCase.log(Status.INFO, "ExpectedBorderColor :- " + ExpectedBoxShadow);
			testCase.log(Status.FAIL, "box shadow not available");
		}
		Thread.sleep(2000);

		// check the placeholder text

//		WebElement placeholderText = driver.findElement(By.xpath("//form[@class='ant-legacy-form ant-legacy-form-horizontal sc-gqjmRU brqWbd']/div[2]/div[3]/div/div/div"));
//
//		Thread.sleep(2000);
//		
//		String Actualtxt = placeholderText.getText();
//		System.out.println("text = " + Actualtxt);
//		String Expectedtxt = "Enter Main Type";
//		AssertJUnit.assertEquals(Actualtxt, Expectedtxt);
//
//		boolean txt1 = true;
//		testCase = extent.createTest("012-PLACEHOLDER-TEXT");
//		try {
//			AssertJUnit.assertEquals(Actualtxt, Expectedtxt);
//		} catch (AssertionError e) {
//			txt1 = false;
//		}
//		if (txt1) {
//			testCase.log(Status.INFO, "ActualElement :- " + Actualtxt);
//			testCase.log(Status.INFO, "ExpectedElement :- " + Expectedtxt);
//
//			testCase.log(Status.PASS, "test match ");
//		} else {
//			testCase.log(Status.INFO, "ActualElement :- " + Actualtxt);
//			testCase.log(Status.INFO, "ExpectedElement :- " + Expectedtxt);
//
//			testCase.log(Status.FAIL, "test not match");
//		}
//           Thread.sleep(2000);
//           
//        
//           WebElement valueraw = driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[2]/div[1]/div/div/div[2]"));
//           String Actualvalue = valueraw.getText();
//           
//           Select solutions = new Select(valueraw);
//           solutions.selectByValue("RAW_MATERIAL");
//           Thread.sleep(2000); 
//          
//   		String Expectedvalue = "RAW_MATERIAL";
//   		AssertJUnit.assertEquals(Actualvalue, Expectedvalue);
//
//   		boolean dropvalue = true;
//   		testCase = extent.createTest("012-PLACEHOLDER-TEXT");
//   		try {
//   			AssertJUnit.assertEquals(Actualvalue, Expectedvalue);
//   		} catch (AssertionError e) {
//   			dropvalue = false;
//   		}
//   		if (dropvalue) {
//   			testCase.log(Status.INFO, "Actualvalue :- " + Actualvalue);
//   			testCase.log(Status.INFO, "Expectedvalue :- " + Expectedvalue);
//
//   			testCase.log(Status.PASS, "value match ");
//   		} else {
//   			testCase.log(Status.INFO, "Actualvalue :- " + Actualvalue);
//   			testCase.log(Status.INFO, "Expectedvalue :- " + Expectedvalue);
//
//   			testCase.log(Status.FAIL, "value not match");
//   		}
//              Thread.sleep(2000);
		WebElement canacelBtn = driver.findElement(By.xpath("//button[@type='button'][@class='ant-btn']"));
		canacelBtn.click();
	}
}
