package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SnackBarPage {

	@FindBy(xpath = "//*[@id ='usernameOrEmail']")
	public static WebElement username;
	
	@FindBy(xpath = "//input[@placeholder='Password']")
	public static WebElement password;
	
	
	@FindBy(xpath = "//button[@type]")
	public static WebElement login;
	
	@FindBy (xpath ="//div[@class='homebtn']")
	public static WebElement homebtn;
	
	@FindBy (xpath = "//a[@class='sc-bdVaJa ieeiNp'][@href='#/master/plantlevel']")
    public static WebElement mastercard;
	
	@FindBy (xpath = "//*[@id=\"root\"]/div/section/section/header/ul/li[1]")
	public static WebElement plantheader;
	
	@FindBy (xpath = "//*[@id=\"root\"]/div/section/section/main/div/div/div[1]/div/div[1]/div[1]")
	public static WebElement sbubtnsite;
	
	@FindBy (xpath = "//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div/div[1]/div/div[2]/button/span")
	public static WebElement addsbubtn;
	
	@FindBy(xpath = "//*[@id='sub_business_unit']")
	public static WebElement sbufiled;
	
	@FindBy(xpath = "//input[@id='description']")
	public static WebElement desfield;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[2]/div[3]/div/button[2]/span")
	public static WebElement savebtn;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[2]/div[3]/div/button[1]/span")
	public static WebElement cancelbtn;
	
	@FindBy(xpath = "//*[@id=\"rcDialogTitle1\"]/div/span/svg")
	public static WebElement closeicon;
	
	@FindBy(xpath = "/html/body/div[2]/div/div/div/div/div/div[1]")
				public static WebElement addedsuggessmsg;		
			
}
