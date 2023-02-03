package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ForgotLinkPage {
//	@FindBy(xpath = "//*[@id=\"root\"]/div/div/div[2]/div/div/div[1]/form/div/a/a")
//	public static WebElement forgetlink;
	
	@FindBy(linkText  = "Forgot Password?")
	public static WebElement forgetlink;

//	@FindBy(xpath = "//*[@id=\"root\"]/div/div/div[2]/div/div/div[1]/form/div/div[2]/div/div/span/h4/a")
//	public static WebElement Backtolink;
	
	@FindBy(xpath = "//a[@href='#/login']")
	public static WebElement Backtolink;
}
