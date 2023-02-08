package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ScrollPage {
	@FindBy(xpath = "//*[@id ='usernameOrEmail']")
	public static WebElement username;
	
	@FindBy(xpath = "//input[@placeholder='Password']")
	public static WebElement password;
	
	
	@FindBy(xpath = "//button[@type]")
	public static WebElement login;
	@FindBy(xpath = "//*[@id=\"root\"]/div/section/section/main/div/div/div/div[6]/a/div/div")
	public static WebElement testResult;
	//*[@id="root"]/div/section/section/main
	//*[@id="root"]/div/section/section/main/div/div/div/div[6]/a/div/div
	@FindBy(xpath = "//*[@id=\"root\"]/div/section/section/main")
	public static WebElement verticalscroll;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div[1]/div/div/div/div[2]/div[2]")
	public static WebElement scrollDiv;
	
}
