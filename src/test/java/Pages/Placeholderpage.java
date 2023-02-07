package Pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Placeholderpage {
	
	@FindBy(xpath="//*[@id ='usernameOrEmail']")
    public static WebElement username;
    
    @FindBy(id="password")
    public static WebElement password;
    
    @FindBy(xpath= "//button[@type]")
    public static WebElement login;
	
    @FindBy (xpath = "//*[@id=\"root\"]/div/section/section/main/div/div/div/div[3]/a/div/div")
    public static WebElement samplehomecard;
    
    @FindBy(xpath = "//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div[1]/div/div/div/div/div[1]/div/div[2]/button/span")
    public static WebElement incommingbtn;
    
    @FindBy(xpath = "//*[@id='finishProductCode']")
    public static WebElement samplecodefield;

}
