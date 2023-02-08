package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TogglebuttonPage {
	@FindBy (xpath = "//a[@class='sc-bdVaJa ieeiNp'][@href='#/testcreate']")
    public static WebElement testcongichomebutton;
	
	
	@FindBy (xpath = "//div[@class='sc-htoDjs jApeNY']/div[3]")
    public static WebElement testconfigbutton;
	
	@FindBy(xpath = "//button[@type='button'][@role='switch']")
	public static WebElement Duedaytoggle;
	
	
	@FindBy(xpath ="//*[@id=\"dueDay\"]")
	public static WebElement Duedayfield;
}
