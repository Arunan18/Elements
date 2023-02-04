package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RadioButtonsPage {
@FindBy(xpath = "//a[@class='sc-bdVaJa ieeiNp'][@href=\"#/trialcards\"]")
public static WebElement TESTSCALIBRATIONS;

@FindBy(xpath = "//a[@class='sc-bdVaJa ieeiNp'][@href=\"#/equipmentcalibration\"]")
public static WebElement EquipmentCalibration;

@FindBy(xpath = "//button[@type='button'][@class='ant-btn sc-gZMcBi dMdnOw']")
public static WebElement AddCalibration;

@FindBy(xpath = "//form[@class='ant-legacy-form ant-legacy-form-horizontal sc-gqjmRU brqWbd']/div[6]/div/div/label")
public static WebElement RadioHeading;

@FindBy(xpath = "//form[@class='ant-legacy-form ant-legacy-form-horizontal sc-gqjmRU brqWbd']/div[6]/div/div/div[1]/label[1]/span[1]")
public static WebElement InternalRadioButton;
@FindBy(xpath = "//form[@class='ant-legacy-form ant-legacy-form-horizontal sc-gqjmRU brqWbd']/div[6]/div/div/div[1]/label[1]/span[2]")
public static WebElement InternalRadioText;

@FindBy(xpath = "//form[@class='ant-legacy-form ant-legacy-form-horizontal sc-gqjmRU brqWbd']/div[6]/div/div/div[1]/label[2]/span[1]")
public static WebElement ExternalRadioButton;
@FindBy(xpath = "//form[@class='ant-legacy-form ant-legacy-form-horizontal sc-gqjmRU brqWbd']/div[6]/div/div/div[1]/label[2]/span[2]")
public static WebElement ExternalRadioText;

@FindBy(xpath = "//form[@class='ant-legacy-form ant-legacy-form-horizontal sc-gqjmRU brqWbd']/div[6]/div/div/div[1]/label[1]")
public static WebElement InternalRadioButtonWithText;
@FindBy(xpath = "//form[@class='ant-legacy-form ant-legacy-form-horizontal sc-gqjmRU brqWbd']/div[6]/div/div/div[1]/label[2]")
public static WebElement ExternalRadioButtonWithText;

@FindBy(xpath = "//form[@class='ant-legacy-form ant-legacy-form-horizontal sc-gqjmRU brqWbd']/div[6]/div/div/div[1]/label[1]/span[1]/input")
public static WebElement InternalRadioButtonClick;
@FindBy(xpath = "//form[@class='ant-legacy-form ant-legacy-form-horizontal sc-gqjmRU brqWbd']/div[6]/div/div/div[1]/label[2]/span[1]/input")
public static WebElement ExternalRadioButtonClick;

@FindBy(xpath = "//form[@class='ant-legacy-form ant-legacy-form-horizontal sc-gqjmRU brqWbd']/div[6]/div/div/div[1]")
public static WebElement RadioButtonGroup;

@FindBy(xpath = "//button[@type='button'][@class='ant-btn']")
public static WebElement Cancel;
}
