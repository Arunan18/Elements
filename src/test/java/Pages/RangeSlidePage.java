package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;

public class RangeSlidePage {
	@FindBy(xpath  = "/html/body/div[2]/div/div/button")
	public static WebElement closebutton ;
			
	@FindBy(xpath  = "/html/body/div[1]/div/div[2]/div/div/div[2]")
	public static WebElement mobiles ;
	
	@FindBy(xpath = "/html/body/div[1]/div/div[3]/div[5]/div/div[1]/a/div/img[2]")
	public static WebElement rangebanner;
	
	@FindBy(xpath  = "/html/body/div[1]/div/div[3]/div/div[1]/div/div[1]/div/section[2]/div[3]/div[1]")
	public static WebElement rangeslidefull ;	
	
	@FindBy(xpath  = "//*[@id=\"container\"]/div/div[3]/div[2]/div[1]/div/section[2]/div[3]/div[1]")
	public static WebElement rangeslide;	
	
	@FindBy(xpath  = "//div[@class='_1YAKP4']/select/option[1]")
	public static WebElement minvalue;	
	
	@FindBy(xpath  = "//div[@class='_3uDYxP']/select/option[5]")
	public static WebElement maxvalue;	
	
	@FindBy(xpath  = "//div[@class='_3FdLqY']")
	public static WebElement minbutton;	
	
	@FindBy(xpath  = "//div[@class='_2IN3-t']")
	public static WebElement borderline;
	
	@FindBy(xpath = "//div[@class='_2IN3-t _1mRwrD']")
	public static WebElement selectedareacolor;

	
	public void until(ExpectedCondition<WebElement> elementToBeClickable) {
		// TODO Auto-generated method stub
}
}
