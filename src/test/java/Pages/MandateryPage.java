package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MandateryPage {
	@FindBy(xpath="//*[@id ='usernameOrEmail']")
	public static WebElement username;
	
	@FindBy(id="password")
	public static WebElement password;
	
	@FindBy(xpath= "//button[@type]")
	public static WebElement login;
	
	@FindBy(xpath  = "//*[@id=\"root\"]/div/section/section/main/div/div/div/div[1]/a/div/div")
	public static WebElement master;
	
	@FindBy (xpath = "/html/body/div[1]/div/section/section/header/ul/li[2]/span/a")
	public static WebElement Equipment;
	
	@FindBy(xpath = "/html/body/div[1]/div/section/section/main/div/div/div[2]/div/div/div/div/div[1]/div/div[3]/button")
	public static WebElement addEquipment;
	
	@FindBy(xpath = "//label[@for='equipment_name']")
	public static WebElement equipmentNamelabel;
	
	
	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[2]/div[2]/form/div[1]/div/div/label/span")
	public static WebElement star;
	@FindBy(xpath ="/html/body/div[3]/div/div[2]/div/div[2]/div[2]/form/div[1]/div/div/label")
	
	public static WebElement title;

	@FindBy(xpath = "//*[@id=\"equipment_name\"]")
	public static WebElement equipmentName;
	
	@FindBy(xpath =  "/html/body/div[3]/div/div[2]/div/div[2]/div[3]/button[2]")
	public static WebElement savebutton;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[2]/div[2]/form/div[1]/div/div/div[1]")
	public static WebElement errormessage;
	
	@FindBy(xpath = "//*[@id=\"type\"]")
	public static WebElement equipmenttype;
	
	@FindBy(xpath = "/html/body/div[4]/div/div/div/div[2]/div[1]/div/div/div[1]/div")
	public static WebElement selectequipmenttype;
	
	@FindBy(xpath = "//*[@id=\"equipment_name\"]")
	public static WebElement placeholder;
//	//*[@id=\"equipment_name\"]
}
