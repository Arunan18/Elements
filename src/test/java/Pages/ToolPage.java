package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ToolPage {
	
	@FindBy(xpath = "//a[@class='sc-bdVaJa ieeiNp'][@href=\"#/testcreate\"]")
	public static WebElement TestConfiguration;
	
	@FindBy(xpath = "//div[@class='sc-htoDjs jApeNY']/div[3]/div[1]")
	public static WebElement ConfigureTest;
	
	@FindBy(xpath = "//button[@type='button'][@role='switch']")
	public static WebElement DueDayButton;
	
	@FindBy(xpath = "//div[@class='ant-tooltip-inner']")
	public static WebElement ToolTips;
	
	@FindBy(xpath = "//input[@id='dueDay']")
	public static WebElement dueDayInputBox;
	
	@FindBy(xpath = "//div[@class='ant-col ant-col-4']")
	public static WebElement Unhover;
	
	@FindBy(xpath = "//div[@class='ant-tooltip-inner']")
	public static WebElement ToolTipsText;
}
