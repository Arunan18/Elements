package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TextAreapage {

	@FindBy(xpath = "//*[@id=\"root\"]/section/section/main/div[2]/div/div/div/div/div/div[2]/table/tbody/tr[3]/td[7]")
	public static WebElement Usericon;
	@FindBy(xpath = "//*[@id=\"rc-tabs-0-panel-1\"]/div/div[5]/div/div[1]/div/button")
	public static WebElement PlusIcon;
    @FindBy(id = "refereeAddress")
	public static WebElement textAreabox;

}
