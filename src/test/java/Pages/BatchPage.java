package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BatchPage {
//	@FindBy(id="usernameOrEmail")
//	public static WebElement username;
//	
//	@FindBy(id="password")
//	public static WebElement password;
//
//	@FindBy(xpath ="//*[@id=\"root\"]/div/div/div[2]/div/div/div[1]/form/div/div[3]/div/div/span/button")
//	public static WebElement loginButton;
	
	
	@FindBy(xpath ="//*[@class='ant-layout-header']/ul/div/div[1]/a/span/sup")
    public static WebElement Batch;
	
	@FindBy(xpath ="//*[@class='ant-layout-header']/ul/div/div[1]/a/span/span")
    public static WebElement Notification;
	 
	@FindBy(xpath ="//li[@class='ant-dropdown-menu-item ant-dropdown-menu-item-active ant-dropdown-menu-item-only-child']/span[1]")
    public static WebElement FirstNotification;
	
}
