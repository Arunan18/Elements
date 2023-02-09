package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ModalPage {

	@FindBy (id = "addPlant")
	public static WebElement AddPlantButton;
	
	
	@FindBy (xpath = "/html/body/div[3]/div/div[2]/div")
	public static WebElement modal;
	
	@FindBy (xpath = "//*[@id=\"rcDialogTitle0\"]/div/p")
	public static WebElement modalheader;
	
	@FindBy (xpath = "/html/body/div[3]/div/div[2]/div/div[2]/div[2]")
	public static WebElement modalcontent;
	
	@FindBy (xpath = "/html/body/div[3]/div/div[2]/div/div[2]/div[3]/div/button[1]")
	public static WebElement modalclose;
	@FindBy (id="plant_address")
	public static WebElement PlanAddress;
	
	
}
