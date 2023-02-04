package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ImagePage {

	@FindBy(xpath = "//img[@src='/static/media/image-asset.029550c6.jpeg'][@class='logo_login']")
	public static WebElement image;
	
}
