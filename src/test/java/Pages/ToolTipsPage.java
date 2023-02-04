package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ToolTipsPage {
	@FindBy(xpath = "//*[@id ='usernameOrEmail']")
	public static WebElement username;
	
	@FindBy(xpath = "//input[@placeholder='Password']")
	public static WebElement password;
	
	
	@FindBy(xpath = "//button[@type]")
	public static WebElement login;
	
	@FindBy(xpath = "/html/body/div[1]/div/section/section/main/div/div/div/div[2]/a/div/div")
	public static WebElement testConfiguration;
	
//	@FindBy (xpath = "//*[@id=\"root\"]/div/section/section/main/div/div/div/div[2]/a/div/div")
//    public static WebElement testcongichomebutton;
	
	
	@FindBy (xpath = "//*[@id=\"root\"]/div/section/section/main/div/div/div[1]/div/div[3]/div[1]")
    public static WebElement testconfigbutton;
	
	@FindBy(xpath = "//button[@type='button'][@role='switch']")
	public static WebElement Duedaytoggle;
	
	
     @FindBy(xpath = "/html/body/div[3]/div/div")
     public static WebElement tooltip;
     
     @FindBy(xpath = "/html/body/div[2]/div/div/div/div[1]/span")
     public static WebElement arrow;
     
     @FindBy(xpath = "//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div[2]/div/div/div[2]/div[4]/div[4]")
     public static WebElement tounhover;
}
