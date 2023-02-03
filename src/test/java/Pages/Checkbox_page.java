package Pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Checkbox_page {

	@FindBy(xpath = "//*[@id ='usernameOrEmail']")
	public static WebElement username;
	
	@FindBy(xpath = "//input[@placeholder='Password']")
	public static WebElement password;
	
	
	@FindBy(xpath = "//button[@type]")
	public static WebElement login;
	
	@FindBy(xpath = "/html/body/div[1]/div/section/section/main/div/div/div/div[2]/a/div/div")
	public static WebElement testConfiguration;
	
	
	@FindBy(xpath = "/html/body/div[1]/div/section/section/main/div/div/div[1]/div/div[4]")
	public static WebElement ConfigGroupTest;
	
	@FindBy(xpath = "/html/body/div[1]/div/section/section/main/div/div/div[2]/div/form/div[3]/div[2]/div/div/div[1]/label/span[1]/span")
	public static WebElement checkboxvisible;
	
	@FindBy(xpath = "/html/body/div[1]/div/section/section/main/div/div/div[2]/div/form/div[3]/div[2]/div/div/div[1]/label/span[1]/input")
	public static WebElement checkboxenable;
	
	@FindBy(xpath = "/html/body/div[1]/div/section/section/main/div/div/div[2]/div/form/div[3]/div[2]/div/div/div[1]/label/span[2]")
	public static WebElement clicktext;
}