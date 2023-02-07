package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TogglebuttonPage {
	@FindBy (xpath = "//a[@class='sc-bdVaJa ieeiNp'][@href='#/testcreate']")
    public static WebElement testcongichomebutton;
	
	
	@FindBy (xpath = "//*[@id=\"root\"]/div/section/section/main/div/div/div[1]/div/div[3]/div[1]")
    public static WebElement testconfigbutton;
	
	@FindBy(xpath = "//button[@type='button'][@role='switch']")
	public static WebElement Duedaytoggle;
	
	
	@FindBy(xpath ="//*[@id=\"dueDay\"]")
	public static WebElement Duedayfield;
}
