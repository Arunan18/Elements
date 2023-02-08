package TestCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;



public class ScrollTest1 {
	public static ExtentReports extent;
    public static ExtentHtmlReporter htmlreporter;
    public static ExtentTest testCase;

	public static WebDriver driver;
@BeforeTest
public void main() throws IOException {
		
		System.setProperty("WebDriver.chrome.driver","C:\\Program Files\\chromedriver_selenium/chromedriver.exe");
		 driver = new ChromeDriver();
		
		 driver.manage().window().maximize();
		 driver.get("https://webkit.org/demos/scroll-snap/");
			extentreport();
		}
		@AfterTest
		public void close() {
			extent.flush();
		}
		public static void extentreport() throws IOException {
			extent =new ExtentReports();
			htmlreporter = new ExtentHtmlReporter("C:\\Users\\hp\\eclipse-workspace\\scroll\\scrollreport.html\\report.html");
			extent.attachReporter(htmlreporter);
			
			
			
		}
		@Test
		public void name() throws IOException {
//			*****************scroll-snap-align***********************
			try {
				WebElement element = driver.findElement(By.xpath("//*[@id=\"snap-scroll-container\"]/div[2]"));
				String snapAlign = element.getCssValue("scroll-snap-align");
				
				String expectedalign = "start";	
					
					
					
					boolean scrollsnapAlign = true;
					testCase = extent.createTest("scroll-snap-align");
					try {
						AssertJUnit.assertEquals(snapAlign,expectedalign);
					} catch (AssertionError e) {
						scrollsnapAlign=false;
					}
					if (scrollsnapAlign) {
						testCase.log(Status.INFO,"ActualAlign :- " + snapAlign);
						testCase.log(Status.INFO,"ExpectedAlign :- " + expectedalign);
						testCase.log(Status.INFO,"Correct Align");
						testCase.log(Status.PASS,"Correct Align");
					} else {
						testCase.log(Status.INFO,"ActualAlign :- " + snapAlign);
						testCase.log(Status.INFO,"ExpectedAlign :- " + expectedalign);
						testCase.log(Status.INFO,"wrong Align");
						testCase.log(Status.FAIL,"wrong Align");
					}
			}catch(Exception e) {
				testCase.log(Status.INFO,"wrong Align");
				testCase.log(Status.FAIL,"wrong Align");
			}
			
			//*********************scroll-snap-type***************
			try {
				WebElement element = driver.findElement(By.xpath("//*[@id=\"snap-scroll-container-coordinates\"]"));
				String snaptype = element.getCssValue("scroll-snap-type");
				
				String expectedtype = "x mandatory";	
					
					
					
					boolean scrollsnapAlign = true;
					testCase = extent.createTest("scroll-snap-type");
					try {
						AssertJUnit.assertEquals(snaptype,expectedtype);
					} catch (AssertionError e) {
						scrollsnapAlign=false;
					}
					if (scrollsnapAlign) {
						testCase.log(Status.INFO,"ActualSize :- " + snaptype);
						testCase.log(Status.INFO,"ExpectedSize :- " + expectedtype);
						testCase.log(Status.INFO,"Correct Size");
						testCase.log(Status.PASS,"Correct Size");
					} else {
						testCase.log(Status.INFO,"ActualSize :- " + snaptype);
						testCase.log(Status.INFO,"ExpectedSize :- " + expectedtype);
						testCase.log(Status.INFO,"wrong Size");
						testCase.log(Status.FAIL,"wrong Size");
					}
			}catch(Exception e) {
				testCase.log(Status.INFO,"wrong Size");
				testCase.log(Status.FAIL,"wrong Size");
			}
			
			WebElement element = driver.findElement(By.xpath("//*[@id=\"snap-scroll-container-coordinates\"]"));
			String snapPointsX = element.getCssValue("scroll-snap-points-x");
			String snapPointsY = element.getCssValue("scroll-snap-points-y");
			System.out.println(snapPointsX);
			System.out.println(snapPointsY);
			
		}
}
		
		
		
		
		
		
		
		
		

