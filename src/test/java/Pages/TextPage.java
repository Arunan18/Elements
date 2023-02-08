package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TextPage {
	@FindBy(xpath = "(//h1[normalize-space()='MASTER'])[1]")
	public static WebElement master1;
	@FindBy(xpath = "//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div/div[1]/div/div[1]")
	public static WebElement PlantText;
}
