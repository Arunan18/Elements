package Pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PaginationPage {

	@FindBy(xpath = "//a[@class='sc-bdVaJa ieeiNp'][@href='#/master/plantlevel']")
	public static WebElement masterBtn;
	@FindBy(xpath = "//a[@class='sc-bdVaJa ieeiNp'][@href='#/master/materiallevel']")
	public static WebElement MaterialSub;
	@FindBy(xpath = "//div[@class='sc-htoDjs jApeNY']/div[6]")
	public static WebElement unit;
	
	@FindBy(xpath = "//li[@class='ant-pagination-total-text']")
	public static WebElement totalText;
	@FindBy(xpath = "//ul[@class='ant-pagination mini ant-table-pagination ant-table-pagination-right']/li[7]")
	public static WebElement CurrentPaginationOpction;
	@FindBy(xpath = "//li[@title='1']/a")
	public static WebElement PageNumber;
	
//	@FindBy(xpath = "//tbody[@class='ant-table-tbody']/tr[")
//	public static List<WebElement> UnitColumnBefore;
//	@FindBy(xpath = "]/td[1]")
//	public static WebElement UnitColumnAfter;
	
	@FindBy(xpath = "//tbody[@class='ant-table-tbody']/tr/td[1]")
	public static List<WebElement> UnitColumn;
	@FindBy(xpath = "//li[@title='Next Page']/button")
	public static WebElement NextPageBtn;
	@FindBy(xpath = "//li[@title='Previous Page']/button")
	public static WebElement PreviousPageBtn;
	
	@FindBy(xpath = "//li[@title='1'][@class='ant-pagination-item ant-pagination-item-1 ant-pagination-item-active']")
	public static WebElement DefaultPaginationPage;
	@FindBy(xpath = "//li[@title='2'][@class='ant-pagination-item ant-pagination-item-2 ant-pagination-item-active']")
	public static WebElement PaginationSecoundPage;
	
	
}
