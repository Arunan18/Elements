package TestCases;

import java.io.IOException;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import Base.DriverInitialization;
import Pages.ModalPage;

public class ModalTest extends DriverInitialization{
	ModalPage modalpg = new ModalPage();

	@Test
	public void modalCheck() throws InterruptedException, IOException {

		PageFactory.initElements(driver, modalpg);

		ModalPage.AddPlantButton.click();
		Thread.sleep(2000);

		// ***** element visible test

		boolean AcctualVisible = ModalPage.modal.isDisplayed();
		boolean ExpectedVisible = true;

		boolean elementvisible = true;
		testCase = extent.createTest("001-MODAL-VISIBLE");
		try {
			Assert.assertEquals(AcctualVisible, ExpectedVisible);
		} catch (AssertionError e) {
			elementvisible = false;
		}
		if (elementvisible) {
			testCase.log(Status.INFO, "ActualElement :- " + AcctualVisible);
			testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedVisible);
			testCase.log(Status.INFO, "Element Available");
			testCase.log(Status.PASS, "Correct element");
		} else {
			testCase.log(Status.INFO, "ActualElement :- " + AcctualVisible);
			testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedVisible);
			testCase.log(Status.INFO, "Element not available");
			testCase.log(Status.FAIL, "No Element");
		}
		Thread.sleep(2000);

		// ***** element position test 

		Point ActualLocation = ModalPage.modal.getLocation();

		int actual_x = ActualLocation.getX();
		int actual_y = ActualLocation.getY();

		System.out.println("X axis: " + actual_x);
		System.out.println("Y axis: " + actual_y);

		Point ExpectedLocation = new Point(378, 100);

		boolean Position = true;
		testCase = extent.createTest("002-MODAL-POSITION");
		try {
			Assert.assertEquals(ActualLocation, ExpectedLocation);

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

		// ***** element size

		Dimension ActualSize = ModalPage.modal.getSize();
		System.out.println("Size : " + ActualSize);
		Dimension ExpectedSize = new Dimension(600, 550);

		boolean size = true;
		testCase = extent.createTest("003-MODAL-SIZE");
		try {
			Assert.assertEquals(ActualSize, ExpectedSize);

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

		// ***** element background-color

		String ActualButtonColor = ModalPage.modal.getCssValue("background-color");
		System.out.println("rgb :" + ActualButtonColor);
		String ExpectedButtonColor = "rgba(0, 0, 0, 0)";

		boolean buttoncolor = true;
		testCase = extent.createTest("004-MODAL-BACKGROUND-COLOR");
		try {
			Assert.assertEquals(ActualButtonColor, ExpectedButtonColor);

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

		// ***** element border-color

		String ActualBorderColor = ModalPage.modal.getCssValue("border-colour");
		System.out.println("rgb :" + ActualBorderColor);

		String ExpectedBorderColor = "";

		boolean bordercolor = true;
		testCase = extent.createTest("005-MODAL-BORDER-COLOR");
		try {
			Assert.assertEquals(ActualBorderColor, ExpectedBorderColor);

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

		// ***** element overflow

		String ActualOverflow = ModalPage.modal.getCssValue("overflow");
		System.out.println("overflow :" + ActualOverflow);

		String ExpectedOverflow = "visible";

		boolean overflow = true;
		testCase = extent.createTest("006-MODAL-OVERFLOW-TYPE");
		try {
			Assert.assertEquals(ActualOverflow, ExpectedOverflow);

		} catch (AssertionError e) {
			overflow = false;
		}
		if (overflow) {
			testCase.log(Status.INFO, "ActualOverflow :- " + ActualOverflow);
			testCase.log(Status.INFO, "ExpectedOverflow :- " + ExpectedOverflow);
			testCase.log(Status.PASS, "Correct overflow");
		} else {
			testCase.log(Status.INFO, "ActualOverflow :- " + ActualOverflow);
			testCase.log(Status.INFO, "ExpectedOverflow :- " + ExpectedOverflow);
			testCase.log(Status.FAIL, "Wrong overflow");
		}
		Thread.sleep(2000);

		// ***** element margin

		String ActualMargin = ModalPage.modal.getCssValue("margin");
		System.out.println("margin :" + ActualMargin);

		String ExpectedMargin = "0px 378px";

		boolean margin = true;
		testCase = extent.createTest("007-MODAL-MARGIN-TYPE");
		try {
			Assert.assertEquals(ActualMargin, ExpectedMargin);

		} catch (AssertionError e) {
			margin = false;
		}
		if (margin) {
			testCase.log(Status.INFO, "ActualMargin :- " + ActualMargin);
			testCase.log(Status.INFO, "ExpectedMargin :- " + ExpectedMargin);
			testCase.log(Status.PASS, "Correct Margin");
		} else {
			testCase.log(Status.INFO, "ActualMargin :- " + ActualMargin);
			testCase.log(Status.INFO, "ExpectedMargin :- " + ExpectedMargin);
			testCase.log(Status.FAIL, "Wrong Margin");
		}
		Thread.sleep(2000);

		// ***** element cursor

		String ActualActions = ModalPage.modal.getCssValue("cursor");
		System.out.println("cursor :" + ActualActions);
		String ExpectedActions = "auto";

		boolean cursor = true;
		testCase = extent.createTest("008-MODAL-CURSOR-TYPE");
		try {
			Assert.assertEquals(ActualActions, ExpectedActions);

		} catch (AssertionError e) {
			cursor = false;
		}
		if (cursor) {
			testCase.log(Status.INFO, "ActualFontSize :- " + ActualActions);
			testCase.log(Status.INFO, "ExpectedFontSize :- " + ExpectedActions);
			testCase.log(Status.PASS, "correct cursor type");
		} else {
			testCase.log(Status.INFO, "ActualSize :- " + ActualActions);
			testCase.log(Status.INFO, "ExpectedSize :- " + ExpectedActions);
			testCase.log(Status.FAIL, "wrong cursor type");
		}
		Thread.sleep(2000);

		// ***** element z- index

		String ActualZindex = ModalPage.modal.getCssValue("z-index");
		System.out.println("z-index :" + ActualZindex);
		String ExpectedZindex = "auto";

		boolean z_index = true;
		testCase = extent.createTest("009-MODAL-Z-INDEX-TYPE");
		try {
			Assert.assertEquals(ActualZindex, ExpectedZindex);

		} catch (AssertionError e) {
			z_index = false;
		}
		if (z_index) {
			testCase.log(Status.INFO, "ActualZindex :- " + ActualZindex);
			testCase.log(Status.INFO, "ExpectedZ-index :- " + ExpectedZindex);
			testCase.log(Status.PASS, "correct z-index  type");
		} else {
			testCase.log(Status.INFO, "ActualZindex :- " + ActualZindex);
			testCase.log(Status.INFO, "ExpectedZ-index :- " + ExpectedZindex);
			testCase.log(Status.FAIL, "wrong z-index type");
		}
		Thread.sleep(2000);

		// ***** click-on element

		// identify modal header

		String modalActual = ModalPage.modalheader.getText();
		System.out.println("Modal Dialog header: " + modalActual);

		String modalExpected = "Add Plant";

		boolean modalHeader = true;
		testCase = extent.createTest("010-MODAL-HEADER");
		try {
			Assert.assertEquals(modalActual, modalExpected);

		} catch (AssertionError e) {
			modalHeader = false;
		}
		if (modalHeader) {
			testCase.log(Status.INFO, "modalActual :- " + modalActual);
			testCase.log(Status.INFO, "modalExpected :- " + ExpectedZindex);
			testCase.log(Status.PASS, "correct modal header");
		} else {
			testCase.log(Status.INFO, "modalActual :- " + modalActual);
			testCase.log(Status.INFO, "modalExpected :- " + ExpectedZindex);
			testCase.log(Status.FAIL, "wrong modal header");
		}
		Thread.sleep(2000);
		

		// identify modal content
		String ActualmodalContent= ModalPage.modalcontent.getText();
		System.out.println( ActualmodalContent);
		String ExpectedModalContent = "* Code:"+"\n"+"* Plant:"+"\n"+"Address:"+"\n"+"Contact No:"+"\n"+"Fax:"+"\n"+"* Sub Business Unit:"+"\n"+"Description:";

		boolean modalContent = true;
		testCase = extent.createTest("011-MODAL-CONTENT");
		try {
			Assert.assertEquals(ActualmodalContent, ExpectedModalContent);

		} catch (AssertionError e) {
			modalContent = false;
		}
		if (modalContent) {
			testCase.log(Status.INFO, "modalActualContent :- " + ActualmodalContent);
			testCase.log(Status.INFO, "modalExpectedcontent :- " + ExpectedModalContent);
			testCase.log(Status.PASS, "correct modal content");
		} else {
			testCase.log(Status.INFO, "modalActualContent :- " + ActualmodalContent);
			testCase.log(Status.INFO, "modalExpectedcontent :- " + ExpectedModalContent);
			testCase.log(Status.FAIL, "wrong modal content");
		}
		Thread.sleep(2000);

		//  click on inside of modal
		
		ModalPage.modal.click();
		Thread.sleep(2000);
		
		boolean AcctualAfterClickinside = ModalPage.modal.isDisplayed();
		boolean ExpectedAfterClickinside= true;
		
		boolean elementvisibleafterclickinside = true;
		testCase = extent.createTest("012-MODAL-INVISIBLE-ONCLICK-INSIDE");
		try {
			Assert.assertEquals(AcctualAfterClickinside, ExpectedAfterClickinside);
		} catch (AssertionError e) {
			elementvisibleafterclickinside = false;
		}
		if (elementvisibleafterclickinside) {
			testCase.log(Status.INFO, "ActualElement :- " + AcctualAfterClickinside);
			testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedAfterClickinside);
			
			testCase.log(Status.PASS, "Modal visible ");
		} else {
			testCase.log(Status.INFO, "ActualElement :- " + AcctualAfterClickinside);
			testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedAfterClickinside);
			
			testCase.log(Status.FAIL, "Modal invisible");
		}
		Thread.sleep(2000);
		//TextBox Length
		ModalPage.PlanAddress.sendKeys("123456789");
		String text = ModalPage.PlanAddress.getAttribute("value");
		int ActualtextLength = text.length();
		int ExpectedtextLength = 9;
		testCase = extent.createTest("TEXT-BOX-LENGTH");
		try {
			Assert.assertEquals(ActualtextLength, ExpectedtextLength);
			testCase.log(Status.INFO, "Actual Length :- " + ActualtextLength);
			testCase.log(Status.INFO, "Expected Length :- " + ExpectedtextLength);
			testCase.log(Status.PASS, "Correct Length  ");
		} catch (AssertionError e) {
			testCase.log(Status.INFO, "Actual Length :- " + ActualtextLength);
			testCase.log(Status.INFO, "Expected Length :- " + ExpectedtextLength);
			testCase.log(Status.FAIL, "Wrong Length  ");
		}
		
		//  click on outside of modal
		
		Actions action = new Actions(driver);
        action.moveByOffset(0, 0).click().build().perform();
        
    	boolean AcctualAfterClick = ModalPage.modal.isDisplayed();
		boolean ExpectedAfterClick= true;
		
		boolean elementvisibleafterclick = false;
		testCase = extent.createTest("013-MODAL-INVISIBLE-ONCLICK-OUTSIDE");
		try {
			Assert.assertEquals(AcctualAfterClick, ExpectedAfterClick);
		} catch (AssertionError e) {
			elementvisibleafterclick = true;
		}
		if (elementvisibleafterclick) {
			testCase.log(Status.INFO, "ActualElement :- " + AcctualAfterClick);
			testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedAfterClick);
			
			testCase.log(Status.FAIL, "Modal visible ");
		} else {
			testCase.log(Status.INFO, "ActualElement :- " + AcctualVisible);
			testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedAfterClick);
			
			testCase.log(Status.PASS, "Modal invisible");
		}
		Thread.sleep(2000);
		
		
		
		

        
        
        
		
	}
}