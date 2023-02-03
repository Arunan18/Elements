package TestCases;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import Base.DriverInitialization;
import Pages.MandateryPage;

public class MandateryTest extends DriverInitialization{
	MandateryPage addequ = new MandateryPage();

	@Test
	public void MandateryPage() throws InterruptedException, IOException {

		PageFactory.initElements(driver, addequ);

		// Thread.sleep(2000);
		MandateryPage.username.sendKeys("admin");

		MandateryPage.password.sendKeys("tokyo@admin");
		MandateryPage.login.click();
		Thread.sleep(2000);

		MandateryPage.master.click();
		Thread.sleep(2000);
		MandateryPage.Equipment.click();
		Thread.sleep(2000);
		MandateryPage.addEquipment.click();
		Thread.sleep(2000);

		// ********************place holder spelling start*********************
		try {
			String spelling = MandateryPage.placeholder.getAttribute("placeholder");

			// Print the shape of the mandatory field
			System.out.println("place holder name : " + spelling);
			String spelling1 = "Enter Equipment Name";
//			try {
			boolean txt1 = true;
			testCase = extent.createTest("place holder-spelling");
			try {
				Assert.assertEquals(spelling, spelling1);
			} catch (AssertionError e) {
				txt1 = false;
			}
			if (txt1) {
				testCase.log(Status.INFO, "ActualElement :- " + spelling);
				testCase.log(Status.INFO, "ExpectedElement :- " + spelling1);
				testCase.log(Status.INFO, "correct text");
				testCase.log(Status.PASS, "Correct ");
			} else {
				testCase.log(Status.INFO, "ActualElement :- " + spelling);
				testCase.log(Status.INFO, "ExpectedElement :- " + spelling1);
				testCase.log(Status.INFO, "wrong text");
				testCase.log(Status.FAIL, "wrong");
			}
		} catch (Exception e) {
			testCase = extent.createTest("place holder-spelling");
			testCase.log(Status.FAIL, "No Element");
		}

		// ********************place holder spelling end*********************

		// ********************Enable start*********************
		try {
			boolean Actualelement = MandateryPage.equipmentName.isEnabled();
			boolean expectedelement = true;

			boolean elementenabled = true;
			testCase = extent.createTest("Element-enabled");

			try {
				Assert.assertEquals(expectedelement, Actualelement);
			} catch (AssertionError e) {
				elementenabled = false;
			}
			if (elementenabled) {
				testCase.log(Status.INFO, "Actual" + Actualelement);
				testCase.log(Status.INFO, "Expected" + expectedelement);
				testCase.log(Status.PASS, "Enabled");
			} else {
				testCase.log(Status.INFO, "Actual" + Actualelement);
				testCase.log(Status.INFO, "Expected" + expectedelement);
				testCase.log(Status.FAIL, "Enabled");
			}
		} catch (Exception e) {
			testCase = extent.createTest("Element-enabled");
			testCase.log(Status.FAIL, "No Element");
		}
		// ********************Enable end*********************

		// ********************visibility label start*********************

		try {
			boolean ActualElement = MandateryPage.equipmentNamelabel.isDisplayed();
			boolean ExpectedElement = true;

			boolean elementvisible = true;
			testCase = extent.createTest("mandotory-label-visible");
			try {
				Assert.assertEquals(ActualElement, ExpectedElement);
			} catch (AssertionError e) {
				elementvisible = false;
			}
			if (elementvisible) {
				testCase.log(Status.INFO, "ActualElement :- " + ActualElement);
				testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedElement);
				testCase.log(Status.INFO, "Element Available");
				testCase.log(Status.PASS, "Correct element");
			} else {
				testCase.log(Status.INFO, "ActualElement :- " + ActualElement);
				testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedElement);
				testCase.log(Status.INFO, "Element not available");
				testCase.log(Status.FAIL, "No Element");
			}

		} catch (Exception e) {

			testCase = extent.createTest("mandotory-label-visible");
			testCase.log(Status.FAIL, "No Element");

		}
//		//********************visibility label end*********************

		// ********************visibility star start*********************
		try {
			boolean ActualElement = MandateryPage.star.isDisplayed();
			boolean ExpectedElement = true;

			boolean elementvisible = true;
			testCase = extent.createTest("mandotory-star-visible");
			try {
				Assert.assertEquals(ActualElement, ExpectedElement);
			} catch (AssertionError e) {
				elementvisible = false;
			}
			if (elementvisible) {
				testCase.log(Status.INFO, "ActualElement :- " + ActualElement);
				testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedElement);
				testCase.log(Status.INFO, "Element Available");
				testCase.log(Status.PASS, "Correct element");
			} else {
				testCase.log(Status.INFO, "ActualElement :- " + ActualElement);
				testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedElement);
				testCase.log(Status.INFO, "Element not available");
				testCase.log(Status.FAIL, "No Element");
			}

		} catch (Exception e) {

			testCase = extent.createTest("mandotory-star-visible");
			testCase.log(Status.FAIL, "No Element");

		}
		// ********************visibility star end*********************
		//********************title visible  start*********************
		try {
			boolean ActualElement = MandateryPage.title.isDisplayed();
			boolean ExpectedElement = true;

			boolean elementvisible = true;
			testCase = extent.createTest("title visible");
			try {
				Assert.assertEquals(ActualElement, ExpectedElement);
			} catch (AssertionError e) {
				elementvisible = false;
			}
			if (elementvisible) {
				testCase.log(Status.INFO, "ActualElement :- " + ActualElement);
				testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedElement);
				testCase.log(Status.INFO, "Element Available");
				testCase.log(Status.PASS, "Correct element");
			} else {
				testCase.log(Status.INFO, "ActualElement :- " + ActualElement);
				testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedElement);
				testCase.log(Status.INFO, "Element not available");
				testCase.log(Status.FAIL, "No Element");
			}

		} catch (Exception e) {

			testCase = extent.createTest("title visible");
			testCase.log(Status.FAIL, "No Element");

		}
		//********************title visible end*********************
		//********************title spelling start*********************/
		
		//
		
		/**
		 * 
		 */
		
		
		try {
			// Get the shape of the mandatory field
			String shape = MandateryPage.title.getText();
			
				// Print the shape of the mandatory field
				System.out.println("The shape of the mandatory field is: " + shape);
				String shape1 = "* Equipment:";
				// AssertJUnit.assertEquals(shape, shape1);

//	      try {
				boolean txt1 = true;
				testCase = extent.createTest("title spelling");
				try {
					Assert.assertEquals(shape, shape1);
				} catch (AssertionError e) {
					txt1 = false;
				}
				if (txt1) {
					testCase.log(Status.INFO, "ActualElement :- " + shape);
					testCase.log(Status.INFO, "ExpectedElement :- " + shape1);
					testCase.log(Status.INFO, "correct text");
					testCase.log(Status.PASS, "Correct ");
				} else {
					testCase.log(Status.INFO, "ActualElement :- " + shape);
					testCase.log(Status.INFO, "ExpectedElement :- " + shape1);
					testCase.log(Status.INFO, "wrong text");
					testCase.log(Status.FAIL, "wrong");
				}
			} catch (Exception e) {
				testCase = extent.createTest("title spelling");
				testCase.log(Status.FAIL, "No Element");
			}

		//********************title spelling end*********************
		
		
		
//		//********************confirm star-shape start*********************
		try {
		// Get the shape of the mandatory field
		String shape = MandateryPage.star.getText();
		
			// Print the shape of the mandatory field
			System.out.println("The shape of the mandatory field is: " + shape);
			String shape1 = "*";
			// AssertJUnit.assertEquals(shape, shape1);

//      try {
			boolean txt1 = true;
			testCase = extent.createTest("Starshape");
			try {
				Assert.assertEquals(shape, shape1);
			} catch (AssertionError e) {
				txt1 = false;
			}
			if (txt1) {
				testCase.log(Status.INFO, "ActualElement :- " + shape);
				testCase.log(Status.INFO, "ExpectedElement :- " + shape1);
				testCase.log(Status.INFO, "correct text");
				testCase.log(Status.PASS, "Correct ");
			} else {
				testCase.log(Status.INFO, "ActualElement :- " + shape);
				testCase.log(Status.INFO, "ExpectedElement :- " + shape1);
				testCase.log(Status.INFO, "wrong text");
				testCase.log(Status.FAIL, "wrong");
			}
		} catch (Exception e) {
			testCase = extent.createTest("Starshape");
			testCase.log(Status.FAIL, "No Element");
		}

		// ********************confirm star-shape end*********************
		// ********************place holder visible start*********************
		try {
			boolean ActualElement = MandateryPage.placeholder.isDisplayed();
			boolean ExpectedElement = true;

			boolean elementvisible = true;
			testCase = extent.createTest("place holder-visible");
			try {
				Assert.assertEquals(ActualElement, ExpectedElement);
			} catch (AssertionError e) {
				elementvisible = false;
			}
			if (elementvisible) {
				testCase.log(Status.INFO, "ActualElement :- " + ActualElement);
				testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedElement);
				testCase.log(Status.INFO, "Element Available");
				testCase.log(Status.PASS, "Correct element");
			} else {
				testCase.log(Status.INFO, "ActualElement :- " + ActualElement);
				testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedElement);
				testCase.log(Status.INFO, "Element not available");
				testCase.log(Status.FAIL, "No Element");
			}

		} catch (Exception e) {

			testCase = extent.createTest("place holder-visible");
			testCase.log(Status.FAIL, "No Element");
		}

		// ********************place holder visible end*********************
//    //********************place holder spelling start*********************
//      String spelling = MandateryPage.placeholder.getText();
//
//		// Print the shape of the mandatory field
//		System.out.println("place holder name : " + spelling);
//		String spelling1 = "Enter Equipment Name";
//		try {
//			boolean txt1 = true;
//			testCase = extent.createTest("place holder-spelling");
//			try {
//				AssertJUnit.assertEquals(spelling, spelling1);
//			} catch (AssertionError e) {
//				txt1 = false;
//			}
//			if (txt1) {
//				testCase.log(Status.INFO, "ActualElement :- " + spelling);
//				testCase.log(Status.INFO, "ExpectedElement :- " + spelling1);
//				testCase.log(Status.INFO, "correct text");
//				testCase.log(Status.PASS, "Correct ");
//			} else {
//				testCase.log(Status.INFO, "ActualElement :- " + spelling);
//				testCase.log(Status.INFO, "ExpectedElement :- " + spelling1);
//				testCase.log(Status.INFO, "wrong text");
//				testCase.log(Status.FAIL, "wrong");
//			}
//		} catch (Exception e) {
//			testCase = extent.createTest("place holder-spelling");
//			testCase.log(Status.FAIL, "No Element");
//		}
//		
//		  //********************place holder spelling end*********************

		try {

			// **********************for empty value start***********************
			MandateryPage.equipmentName.click();
			MandateryPage.equipmenttype.click();
			Thread.sleep(2000);
			MandateryPage.selectequipmenttype.click();
			Thread.sleep(2000);
			MandateryPage.savebutton.click();

//		try {
			boolean ActualElement = MandateryPage.errormessage.isDisplayed();
			boolean ExpectedElement = true;

			boolean elementvisible = true;
			testCase = extent.createTest("Error-message-visible");
			try {
				Assert.assertEquals(ActualElement, ExpectedElement);
			} catch (AssertionError e) {
				elementvisible = false;
			}
			if (elementvisible) {
				testCase.log(Status.INFO, "ActualElement :- " + ActualElement);
				testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedElement);
				testCase.log(Status.INFO, "Element Available");
				testCase.log(Status.PASS, "Correct element");
			} else {
				testCase.log(Status.INFO, "ActualElement :- " + ActualElement);
				testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedElement);
				testCase.log(Status.INFO, "Element not available");
				testCase.log(Status.FAIL, "No Element");
			}

		} catch (Exception e) {

			testCase = extent.createTest("Error-message-visible");
			testCase.log(Status.FAIL, "No Element");

		}
		// ********************verify the error message visible end*********************

		// ********************verify the error message spelling
		// start*********************
		try {
			String spellingv = MandateryPage.errormessage.getText();

			// Print the shape of the mandatory field
			System.out.println("The error message is : " + spellingv);
			String spelling12 = "Name can't be empty";
//		try {
			boolean txt1 = true;
			testCase = extent.createTest("1.error-message-spelling");
			try {
				Assert.assertEquals(spellingv, spelling12);
			} catch (AssertionError e) {
				txt1 = false;
			}
			if (txt1) {
				testCase.log(Status.INFO, "ActualElement :- " + spellingv);
				testCase.log(Status.INFO, "ExpectedElement :- " + spelling12);
				testCase.log(Status.INFO, "correct text");
				testCase.log(Status.PASS, "Correct ");
			} else {
				testCase.log(Status.INFO, "ActualElement :- " + spellingv);
				testCase.log(Status.INFO, "ExpectedElement :- " + spelling12);
				testCase.log(Status.INFO, "wrong text");
				testCase.log(Status.FAIL, "wrong");
			}
		} catch (Exception e) {
			testCase = extent.createTest("error-message-spelling");
			testCase.log(Status.FAIL, "No Element");
		}

		// **********************for empty value end***********************

		// **********************for numbers,symbols,two letters value error
		// start***********************
//		try {
			if (MandateryPage.savebutton.isDisplayed()) {

				FileInputStream file = new FileInputStream(
						"C:\\Users\\hp\\eclipse-workspace\\QDMS_Auto\\src\\test\\java\\base\\excel\\excel_qdms.xlsx");
				XSSFWorkbook workbook = new XSSFWorkbook(file);
				XSSFSheet sheet = workbook.getSheet("field");

				int rowcount = sheet.getLastRowNum();
				for (int i = 0; i <= rowcount; i++) {
					XSSFRow row = sheet.getRow(i);

					String numbers = (String) row.getCell(0).getStringCellValue();
					String validation = (String) row.getCell(1).getStringCellValue();

					Thread.sleep(2000);
					MandateryPage.equipmentName.click();
					Thread.sleep(2000);
					MandateryPage.equipmentName.sendKeys(Keys.CONTROL + "a");
					MandateryPage.equipmentName.sendKeys(Keys.DELETE);
					Thread.sleep(2000);
					MandateryPage.equipmentName.sendKeys(numbers);

					MandateryPage.savebutton.click();

					try {
						boolean ActualElement = MandateryPage.errormessage.isDisplayed();
						boolean ExpectedElement = true;

						boolean elementvisible = true;
						testCase = extent.createTest("Validation-message-visible");
						try {
							Assert.assertEquals(ActualElement, ExpectedElement);
						} catch (AssertionError e) {
							elementvisible = false;
						}
						if (elementvisible) {
							testCase.log(Status.INFO, "ActualElement :- " + ActualElement);
							testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedElement);
							testCase.log(Status.INFO, "Element Available");
							testCase.log(Status.PASS, "Correct element");
						} else {
							testCase.log(Status.INFO, "ActualElement :- " + ActualElement);
							testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedElement);
							testCase.log(Status.INFO, "Element not available");
							testCase.log(Status.FAIL, "No Element");
						}

					} catch (Exception e) {

						testCase = extent.createTest("Validation-message-visible");
						testCase.log(Status.FAIL, "No Element");

					}
					// ********************verify the error message visible end*********************

					// ********************verify the error message spelling
					// start*********************
					try {
						String spelling2 = MandateryPage.errormessage.getText();

						// Print the shape of the mandatory field
						System.out.println("The error message is : " + spelling2);
						String spelling3 = validation;
//			try {
						boolean txt1 = true;
						testCase = extent.createTest("Validation-message-spelling");
						try {
							Assert.assertEquals(spelling2, spelling3);
						} catch (AssertionError e) {
							txt1 = false;
						}
						if (txt1) {
							testCase.log(Status.INFO, "ActualElement :- " + spelling2);
							testCase.log(Status.INFO, "ExpectedElement :- " + spelling3);
							testCase.log(Status.INFO, "correct text");
							testCase.log(Status.PASS, "Correct ");
						} else {
							testCase.log(Status.INFO, "ActualElement :- " + spelling2);
							testCase.log(Status.INFO, "ExpectedElement :- " + spelling3);
							testCase.log(Status.INFO, "wrong text");
							testCase.log(Status.FAIL, "wrong");
						}
					} catch (Exception e) {
						testCase = extent.createTest("Validation-message-spelling");
						testCase.log(Status.FAIL, "No Element");
					}

					// ********************visibility field start*********************
//		try {
//			boolean ActualElement = MandateryPage.equipmentName.isDisplayed();
//			boolean ExpectedElement = true;
//			
//			boolean elementvisible = true;
//			testCase = extent.createTest("1.mandotory-field-visible");
//			try {
//				AssertJUnit.assertEquals(ActualElement, ExpectedElement);
//			} catch (AssertionError e) {
//				elementvisible = false;
//			}
//			if (elementvisible) {
//				testCase.log(Status.INFO, "ActualElement :- " + ActualElement);
//				testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedElement);
//				testCase.log(Status.INFO, "Element Available");
//				testCase.log(Status.PASS, "Correct element");
//			} else {
//				testCase.log(Status.INFO, "ActualElement :- " + ActualElement);
//				testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedElement);
//				testCase.log(Status.INFO, "Element not available");
//				testCase.log(Status.FAIL, "No Element");
//			}
//			
//			}
//			catch(Exception e){
//			
//				
//				testCase = extent.createTest("1.mandotory-field-visible");
//				testCase.log(Status.FAIL, "No Element");
//		
//			}
					// ********************visibility field end*********************

					// ********************visibility label start*********************

//		try {
//			boolean ActualElement = MandateryPage.equipmentNamelabel.isDisplayed();
//			boolean ExpectedElement = true;
//			
//			boolean elementvisible = true;
//			testCase = extent.createTest(i + "mandotory-label-visible");
//			try {
//				AssertJUnit.assertEquals(ActualElement, ExpectedElement);
//			} catch (AssertionError e) {
//				elementvisible = false;
//			}
//			if (elementvisible) {
//				testCase.log(Status.INFO, "ActualElement :- " + ActualElement);
//				testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedElement);
//				testCase.log(Status.INFO, "Element Available");
//				testCase.log(Status.PASS, "Correct element");
//			} else {
//				testCase.log(Status.INFO, "ActualElement :- " + ActualElement);
//				testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedElement);
//				testCase.log(Status.INFO, "Element not available");
//				testCase.log(Status.FAIL, "No Element");
//			}
//			
//			}
//			catch(Exception e){
//			
//				
//				testCase = extent.createTest(i + "mandotory-label-visible");
//				testCase.log(Status.FAIL, "No Element");
//		
//			}
//		//********************visibility label end*********************
//		
//		//********************visibility star start*********************
//		try {
//			boolean ActualElement = MandateryPage.star.isDisplayed();
//			boolean ExpectedElement = true;
//			
//			boolean elementvisible = true;
//			testCase = extent.createTest(i + "mandotory-star-visible");
//			try {
//				AssertJUnit.assertEquals(ActualElement, ExpectedElement);
//			} catch (AssertionError e) {
//				elementvisible = false;
//			}
//			if (elementvisible) {
//				testCase.log(Status.INFO, "ActualElement :- " + ActualElement);
//				testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedElement);
//				testCase.log(Status.INFO, "Element Available");
//				testCase.log(Status.PASS, "Correct element");
//			} else {
//				testCase.log(Status.INFO, "ActualElement :- " + ActualElement);
//				testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedElement);
//				testCase.log(Status.INFO, "Element not available");
//				testCase.log(Status.FAIL, "No Element");
//			}
//			
//			}
//			catch(Exception e){
//			
//				
//				testCase = extent.createTest(i + "mandotory-star-visible");
//				testCase.log(Status.FAIL, "No Element");
//		
//			}
//		//********************visibility star end*********************

////		//********************confirm star-shape start*********************
//		
//		 // Get the shape of the mandatory field
//        String shape =  MandateryPage.star.getText();
//
//        // Print the shape of the mandatory field
//        System.out.println("The shape of the mandatory field is: " + shape);
//        String shape1 = "*";
//		//AssertJUnit.assertEquals(shape, shape1);
//
//        try {
//		boolean txt1 = true;
//		testCase = extent.createTest(i + "Starshape");
//		try {
//			AssertJUnit.assertEquals(shape, shape1);
//		} catch (AssertionError e) {
//			txt1 = false;
//		}
//			if (txt1) {
//				testCase.log(Status.INFO, "ActualElement :- " + shape);
//				testCase.log(Status.INFO, "ExpectedElement :- " + shape1);
//				testCase.log(Status.INFO, "correct text");
//				testCase.log(Status.PASS, "Correct ");
//			} else {
//				testCase.log(Status.INFO, "ActualElement :- " + shape);
//				testCase.log(Status.INFO, "ExpectedElement :- " + shape1);
//				testCase.log(Status.INFO, "wrong text");
//				testCase.log(Status.FAIL, "wrong");
//			}
//        }catch(Exception e) {
//        	testCase = extent.createTest(i + "Starshape");
//			testCase.log(Status.FAIL, "No Element");
//        }
//        
//      //********************confirm star-shape end*********************
//        
//      //********************Enable start********************* 
//        try {
//			boolean Actualelement = MandateryPage.equipmentName.isEnabled();
//			boolean expectedelement =true;
//			
//			boolean elementenabled = true;
//			testCase =  extent.createTest("5.Element-enabled");
//			
//			try {
//				AssertJUnit.assertEquals(expectedelement, Actualelement);
//			}
//			catch (AssertionError e) {
//				elementenabled= false;
//			}
//			if(elementenabled) {
//				testCase.log(Status.INFO,"Actual" + Actualelement );
//				testCase.log(Status.INFO, "Expected" + expectedelement);
//				testCase.log(Status.PASS,"Enabled");
//			}
//			else {
//				testCase.log(Status.INFO,"Actual" + Actualelement );
//				testCase.log(Status.INFO, "Expected" + expectedelement);
//				testCase.log(Status.FAIL,"Enabled");
//			}
//			}
//			catch(Exception e) {
//				testCase = extent.createTest("5.Element-enabled");
//				testCase.log(Status.FAIL, "No Element");
//			}
					// ********************Enable end*********************

//    	 //********************verify the error message with numbers start*********************
//    	 MandateryPage.equipmentName.clear();
//         MandateryPage.equipmentName.click();
//         
//         
//         MandateryPage.equipmentName.sendKeys("09876");
//         MandateryPage.savebutton.click();
//         
//         try {
// 			boolean ActualElement = MandateryPage.errormessage.isDisplayed();
// 			boolean ExpectedElement = true;
// 			
// 			boolean elementvisible = true;
// 			testCase = extent.createTest("3.Error-message-visible");
// 			try {
// 				AssertJUnit.assertEquals(ActualElement, ExpectedElement);
// 			} catch (AssertionError e) {
// 				elementvisible = false;
// 			}
// 			if (elementvisible) {
// 				testCase.log(Status.INFO, "ActualElement :- " + ActualElement);
// 				testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedElement);
// 				testCase.log(Status.INFO, "Element Available");
// 				testCase.log(Status.PASS, "Correct element");
// 			} else {
// 				testCase.log(Status.INFO, "ActualElement :- " + ActualElement);
// 				testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedElement);
// 				testCase.log(Status.INFO, "Element not available");
// 				testCase.log(Status.FAIL, "No Element");
// 			}
// 			
// 			}
// 			catch(Exception e){
// 			
// 				
// 				testCase = extent.createTest("3.Error-message-visible");
// 				testCase.log(Status.FAIL, "No Element");
// 		
// 			}
//     	  //********************verify the error message visible end*********************
//     	
//     	
					// ********************verify the error message spelling
					// start*********************
//    	 String spelling =  MandateryPage.errormessage.getText();
//
//          // Print the shape of the mandatory field
//          System.out.println("The error message is : " + spelling);
//          String spelling1 = "Name can't be empty";
//     	try {
//     			boolean txt1 = true;
//     			testCase = extent.createTest("4.error-message-spelling");
//     			try {
//     				AssertJUnit.assertEquals(spelling, spelling1);
//     			} catch (AssertionError e) {
//     				txt1 = false;
//     			}
//     				if (txt1) {
//     					testCase.log(Status.INFO, "ActualElement :- " + spelling);
//     					testCase.log(Status.INFO, "ExpectedElement :- " + spelling1);
//     					testCase.log(Status.INFO, "correct text");
//     					testCase.log(Status.PASS, "Correct ");
//     				} else {
//     					testCase.log(Status.INFO, "ActualElement :- " + spelling);
//     					testCase.log(Status.INFO, "ExpectedElement :- " + spelling1);
//     					testCase.log(Status.INFO, "wrong text");
//     					testCase.log(Status.FAIL, "wrong");
//     				}
//     	        }catch(Exception e) {
//     	        	testCase = extent.createTest("4.error-message-spelling");
//     				testCase.log(Status.FAIL, "No Element");
//     	        }

				}
			}
//		} catch (Exception e) {
//			testCase = extent.createTest("fail");
//			testCase.log(Status.FAIL, "No Element");
//		}
	}
}
