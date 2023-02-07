package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PaginationPage {

	@FindBy(xpath = "//a[@class='sc-bdVaJa ieeiNp'][@href='#/master/plantlevel']")
	public static WebElement masterBtn;
	@FindBy(xpath = "//div[@class='sc-dnqmqq hnktPT']")
	public static WebElement Plant;
}
