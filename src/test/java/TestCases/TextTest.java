package TestCases;

import org.openqa.selenium.Point;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import Base.DriverInitialization;
import Pages.TextPage;

public class TextTest extends DriverInitialization{
	TextPage Text = new TextPage(); 
	@Test
	public void Text() throws InterruptedException {
		PageFactory.initElements(driver, Text);
		
		Thread.sleep(2000);
//		TextPage.master1.click();
		
	//Text Visible
		boolean ExpectedTextVisible=true;
		System.out.println("IsVisible");
		boolean ActualTextVisible=TextPage.PlantText.isDisplayed();
		testCase = extent.createTest("1-Test Visible");
		try {
			Assert.assertEquals(ActualTextVisible, ExpectedTextVisible);
			testCase.log(Status.INFO, "Actual Internal Radio Button Visible :- " + ActualTextVisible);
			testCase.log(Status.INFO, "Expected Internal Radio Button Visible :- " + ExpectedTextVisible);
			testCase.log(Status.PASS, "Internal Radio Button Visible is Correct");
		} catch (AssertionError e) {
			testCase.log(Status.INFO, "Actual Internal Radio Button Visible :- " + ActualTextVisible);
			testCase.log(Status.INFO, "Expected Internal Radio Button Visible :- " + ExpectedTextVisible);
			testCase.log(Status.FAIL, "Internal Radio Button Visible is Wrong");
		}
//FONT COLOR
        
        String ActualTitleFontColor = TextPage.PlantText.getCssValue("color");
        System.out.println("Font color of button: " + ActualTitleFontColor);
        String ExpectedTitleFontColor ="rgba(0, 0, 0, 0.85)";

        boolean fontColour = true;

        testCase = extent.createTest("TITLE-FONT-COLOUR");
        try {
            Assert.assertEquals(ActualTitleFontColor, ExpectedTitleFontColor);

        } catch (AssertionError e) {
            // TODO: handle exception

            fontColour = false;
        }
        if (fontColour) {
            testCase.log(Status.INFO, "ActualColour :- " + ActualTitleFontColor);
            testCase.log(Status.INFO, "ExpectedColour :- " + ExpectedTitleFontColor);
            testCase.log(Status.INFO, "Correct font Colour");
            testCase.log(Status.PASS, "Correct font Colour");

        } else {
            testCase.log(Status.INFO, "ActualColour :- " + ActualTitleFontColor);
            testCase.log(Status.INFO, "ExpectedColour :- " + ExpectedTitleFontColor);
            testCase.log(Status.INFO, "wrong font Colour");
            testCase.log(Status.FAIL, "wrong font Colour");
        }
//FONTSIZE
        String ActualTitleFontsSize = TextPage.PlantText.getCssValue("font-size");
        System.out.println("Font Size: " + ActualTitleFontsSize);
        String ExpectedTitleFontsSize = "16px";

        boolean fontsize = true;
        testCase = extent.createTest("TITLE-FONT- SIZE");

        try {
            Assert.assertEquals(ActualTitleFontsSize, ExpectedTitleFontsSize);
        } catch (AssertionError e) {
            // TODO: handle exception
            fontsize = false;

        }
        if (fontsize) {
            testCase.log(Status.INFO, "ActualfontSize :-" + ActualTitleFontsSize);
            testCase.log(Status.INFO, "ExpectedfontSize:-" + ExpectedTitleFontsSize);
            testCase.log(Status.PASS, "Correct font-size");
            testCase.log(Status.PASS, " Font-size Correct");
        } else {
            testCase.log(Status.INFO, "ActualfontsSize :- " + ActualTitleFontsSize);
            testCase.log(Status.INFO, "ExpectedfontsSize :- " + ExpectedTitleFontsSize);
            testCase.log(Status.INFO, "Wrong font-size");
            testCase.log(Status.FAIL, "Font-size Wrong");

        }
//Font Family (Specifies the font family for text //family-name, generic-family, inherit)
	
        String ActualElementfamily = TextPage.PlantText.getCssValue("FONT-FAMILY");
        System.out.println("FONT-FAMILY: "+ActualElementfamily);
        String ExpectedElementFamily = "Roboto, sans-serif";
        testCase = extent.createTest("FONT-FAMILY");
        try {
            Assert.assertEquals(ActualElementfamily, ExpectedElementFamily);
            testCase.log(Status.INFO, "ActualText :- " + ActualElementfamily);
            testCase.log(Status.INFO, "ExpectedText :- " + ExpectedElementFamily);
            testCase.log(Status.INFO, "Correct Text");
            testCase.log(Status.PASS, "Correct Text");
        } catch (AssertionError e) {
            testCase.log(Status.INFO, "ActualText :- " + ActualElementfamily);
            testCase.log(Status.INFO, "ExpectedText :- " + ExpectedElementFamily);
            testCase.log(Status.INFO, "wrong Text");
            testCase.log(Status.FAIL, "wrong Text");
        }
        Thread.sleep(2000);
 //Enable
        boolean ExpectedTextEnable=true;
		boolean ActualTextEnable=TextPage.PlantText.isEnabled();
		System.out.println("TEXT EABLE: "+ActualTextEnable);
		testCase = extent.createTest("TEXT ENABLE");
		try {
			Assert.assertEquals(ActualTextEnable, ExpectedTextEnable);
			testCase.log(Status.INFO, "Actual External Radio Button Enable :- " + ActualTextEnable);
			testCase.log(Status.INFO, "Expected External Radio Button Enable :- " + ExpectedTextEnable);
			testCase.log(Status.PASS, "External Radio Button Enable is Correct");
		} catch (AssertionError e) {
			testCase.log(Status.INFO, "Actual External Radio Button Enable :- " + ActualTextEnable);
			testCase.log(Status.INFO, "Expected External Radio Button Enable :- " + ExpectedTextEnable);
			testCase.log(Status.FAIL, "External Radio Button Enable is Wrong");
	}
//Spelling		
		try {
            String AcctualTitleText = TextPage.PlantText.getText();
            String ExpectedTitleText = "Plant";
            System.out.println(" Text:" + AcctualTitleText);
            boolean Titletext = true;
            testCase = extent.createTest("TITLE-SPELLING-TEXT");
            try {
                Assert.assertEquals(AcctualTitleText, ExpectedTitleText);
            } catch (AssertionError e) {
                Titletext = false;
            }
            if (Titletext) {
                testCase.log(Status.INFO, "AcctualTitleText :- " + AcctualTitleText);
                testCase.log(Status.INFO, "ExpectedTitleText :- " + ExpectedTitleText);
                testCase.log(Status.INFO, "Element Available");
                testCase.log(Status.PASS, "Correct element");
            } else {
                testCase.log(Status.INFO, "AcctualTitleText :- " + AcctualTitleText);
                testCase.log(Status.INFO, "ExpectedTitleText :- " + ExpectedTitleText);
                testCase.log(Status.INFO, "Element not available");
                testCase.log(Status.FAIL, "No Element");
            }
        } catch (Exception e) {
            testCase = extent.createTest("TITLE-SPELLING-TEXT");
            testCase.log(Status.FAIL, "No Element");
        }
		
//Position
		Point ActulaTitleLocation = TextPage.PlantText.getLocation();        
        int actual_x = ActulaTitleLocation.getX();
        int actual_y = ActulaTitleLocation.getY();
        System.out.println("X axis: " + actual_x);
        System.out.println("Y axis: " + actual_y);
        
        Point ExpectedTitleLocation = new Point(186, 88);
        boolean Position = true; 
        testCase = extent.createTest("TITLE-POSITION");
        try {
            Assert.assertEquals(ActulaTitleLocation, ExpectedTitleLocation);

        } catch (AssertionError e) {
            Position = false; 
        }
        if (Position) {
            testCase.log(Status.INFO, "ActualFontSize :- " + ActulaTitleLocation);
            testCase.log(Status.INFO, "ExpectedFontSize :- " + ExpectedTitleLocation);
            testCase.log(Status.PASS, "Correct Location");
        } else {
            testCase.log(Status.INFO, "ActualSize :- " + ActulaTitleLocation);
            testCase.log(Status.INFO, "ExpectedSize :- " + ExpectedTitleLocation);
            testCase.log(Status.FAIL, "Wrong Location");
        }
//Padding   
        
        String ActualTitlepadding = TextPage.PlantText.getCssValue("padding");
        System.out.println("PADING: "+ActualTitlepadding);
        String ExpectedTitlepadding = "10px";
        testCase = extent.createTest("TEXT PADDING");
        try {
            Assert.assertEquals(ActualTitlepadding, ExpectedTitlepadding);
            testCase.log(Status.INFO, "Actual padding :- " + ActualTitlepadding);
            testCase.log(Status.INFO, "Expected padding :- " + ExpectedTitlepadding);
            testCase.log(Status.PASS, "padding is Correct");
        } catch (AssertionError e) {
            testCase.log(Status.INFO, "Actual padding :- " + ActualTitlepadding);
            testCase.log(Status.INFO, "Expected padding :- " + ExpectedTitlepadding);
            testCase.log(Status.FAIL, "padding is Wrong");
        }
        
//Shadow
        String ActualTitleShadow = TextPage.PlantText.getCssValue("box-shadow");
        System.out.println("Text Shadow :" + ActualTitleShadow);

        String ExpectedTitleShadow = "none";

        boolean boxshadow = true;
        testCase = extent.createTest("TEXT-SHADOW");
        try {
            Assert.assertEquals(ActualTitleShadow, ExpectedTitleShadow);

        } catch (AssertionError e) {
            boxshadow = false;
        }
        if (boxshadow) {
            testCase.log(Status.INFO, "ActualTitleShadow :- " + ActualTitleShadow);
            testCase.log(Status.INFO, "ExpectedTitleShadow :- " + ExpectedTitleShadow);
            testCase.log(Status.PASS, "Shadow text available");
        } else {
            testCase.log(Status.INFO, "ActualBorderColor :- " + ActualTitleShadow);
            testCase.log(Status.INFO, "ExpectedBorderColor :- " + ExpectedTitleShadow);
            testCase.log(Status.FAIL, "Shadow text not available");
        }
        
//Margin
        String ActualTitleMargin = TextPage.PlantText.getCssValue("margin");
        System.out.println("Text Margin :" + ActualTitleMargin);

      String ExpectedTitleMargin = "-5px 0px 16px -10px";

    boolean textmargin = true;
    testCase = extent.createTest("TEXT-MARGIN");
    try {
    Assert.assertEquals(ActualTitleMargin, ExpectedTitleMargin);
    }
    catch (AssertionError e) { 
        // TODO: handle exception
        textmargin =false;
        
    }if (textmargin) {
        testCase.log(Status.INFO, "ActualTitleMargin :- " + ActualTitleMargin);
        testCase.log(Status.INFO, "ExpectedTitleMargin :- " + ExpectedTitleMargin);
        testCase.log(Status.PASS, "Text margin available");
    } else {
        testCase.log(Status.INFO, "ActualTitleMargin :- " + ActualTitleMargin);
        testCase.log(Status.INFO, "ExpectedTitleMargin :- " + ExpectedTitleMargin);
        testCase.log(Status.FAIL, "Text margin text not available");
    } 
//LETTER SPACING
    String ActualLetterSpacing = TextPage.PlantText.getCssValue("letter-spacing");
    System.out.println("Letter Spacing :" + ActualLetterSpacing);

    String ExpectedLetterSpacing = "normal";

    boolean letterspacing = true;
    testCase = extent.createTest("LETTER-SPACING");
    try {
        Assert.assertEquals(ActualLetterSpacing, ExpectedLetterSpacing);

    } catch (AssertionError e) {
        letterspacing = false; 
    }
    if (letterspacing) {
        testCase.log(Status.INFO, "ActualLetterSpacing :- " + ActualLetterSpacing);
        testCase.log(Status.INFO, "ExpectedLetterSpacing :- " + ExpectedLetterSpacing);
        testCase.log(Status.PASS, "Letter spacing is as expected");
    } else {
        testCase.log(Status.INFO, "ActualLetterSpacing :- " + ActualLetterSpacing);
        testCase.log(Status.INFO, "ExpectedLetterSpacing :- " + ExpectedLetterSpacing);
        testCase.log(Status.FAIL, "Letter spacing is not as expected");
    }
    
// WORD SPACING
    String ActualWordSpacing = TextPage.PlantText.getCssValue("word-spacing");
    System.out.println("Word Spacing :" + ActualWordSpacing);

    String ExpectedWordSpacing = "0px";

    boolean wordspacing = true;
    testCase = extent.createTest("WORD-SPACING");
    try {
    Assert.assertEquals(ActualWordSpacing, ExpectedWordSpacing);

    } catch (AssertionError e) {
    wordspacing = false;
    }
    if (wordspacing) {
    testCase.log(Status.INFO, "ActualWordSpacing :- " + ActualWordSpacing);
    testCase.log(Status.INFO, "ExpectedWordSpacing :- " + ExpectedWordSpacing);
    testCase.log(Status.PASS, "Word spacing is as expected");
    } else {
    testCase.log(Status.INFO, "ActualWordSpacing :- " + ActualWordSpacing);
    testCase.log(Status.INFO, "ExpectedWordSpacing :- " + ExpectedWordSpacing);
    testCase.log(Status.FAIL, "Word spacing is not as expected");
    }
// ALIGNMENT (CENTER/LEFT/RIGHT)
    String ActualAlignment = TextPage.PlantText.getCssValue("text-align");
    System.out.println("Text Alignment :" + ActualAlignment);

    String ExpectedAlignment = "center";

    boolean alignment = true;
    testCase = extent.createTest("TEXT-ALIGNMENT");
    try {
    Assert.assertEquals(ActualAlignment, ExpectedAlignment);

    } catch (AssertionError e) {
    alignment = false;
    }
    if (alignment) {
    testCase.log(Status.INFO, "ActualAlignment :- " + ActualAlignment);
    testCase.log(Status.INFO, "ExpectedAlignment :- " + ExpectedAlignment);
    testCase.log(Status.PASS, "Alignment is as expected");
    } else {
    testCase.log(Status.INFO, "ActualAlignment :- " + ActualAlignment);
    testCase.log(Status.INFO, "ExpectedAlignment :- " + ExpectedAlignment);
    testCase.log(Status.FAIL, "Alignment is not as expected");
    }
// TEXT TRANSFORMATION (UPERCASE/ LOWECASE)
    
    String ActualTextTransformation = TextPage.PlantText.getCssValue("text-transform");
    System.out.println("Text Transformation :" + ActualTextTransformation);

    String ExpectedTextTransformation = "none";

    boolean texttransformation = true;
    testCase = extent.createTest("TEXT-TRANSFORMATION");
    try {
        Assert.assertEquals(ActualTextTransformation, ExpectedTextTransformation);

    } catch (AssertionError e) {
        texttransformation = false;
    }
    if (texttransformation) {
        testCase.log(Status.INFO, "ActualTextTransformation :- " + ActualTextTransformation);
        testCase.log(Status.INFO, "ExpectedTextTransformation :- " + ExpectedTextTransformation);
        testCase.log(Status.PASS,  "Transformation expected");
    }
    else {
         testCase.log(Status.INFO, "ActualTextTransformation :- " + ActualTextTransformation);
         testCase.log(Status.INFO, "ExpectedTextTransformation :- " + ExpectedTextTransformation);
          testCase.log(Status.FAIL,  "Transformation unexpected");
    }
// LINE HEIGHT
    String ActualLineHeight =TextPage.PlantText.getCssValue("line-height");
    System.out.println("Line Height :" + ActualLineHeight);

    String ExpectedLineHeight = "25.144px";

    boolean lineheight = true;
    testCase = extent.createTest("LINE-HEIGHT");
    try {
        Assert.assertEquals(ActualLineHeight, ExpectedLineHeight);

    } catch (AssertionError e) {
        lineheight = false;
    }
    if (lineheight) {
        testCase.log(Status.INFO, "ActualLineHeight :- " + ActualLineHeight);
        testCase.log(Status.INFO, "ExpectedLineHeight :- " + ExpectedLineHeight);
        testCase.log(Status.PASS, "Line height is as expected");
    } else {
        testCase.log(Status.INFO, "ActualLineHeight :- " + ActualLineHeight);
        testCase.log(Status.INFO, "ExpectedLineHeight :- " + ExpectedLineHeight);
        testCase.log(Status.FAIL, "Line height is not as expected");
    }
    
//Text Decoration
    String ActualTextDecoration = TextPage.PlantText.getCssValue("text-decoration");
    System.out.println("Text Decoration :" + ActualTextDecoration);

    String ExpectedTextDecoration = "none solid rgba(0, 0, 0, 0.85)";

    boolean textdecoration = true;
    testCase = extent.createTest("TEXT-DECORATION");
    try {
        Assert.assertEquals(ActualTextDecoration, ExpectedTextDecoration);

    } catch (AssertionError e) {
        textdecoration = false;
    }
    if (textdecoration) {
        testCase.log(Status.INFO, "ActualTextDecoration :- " + ActualTextDecoration);
        testCase.log(Status.INFO, "ExpectedTextDecoration :- " + ExpectedTextDecoration);
        testCase.log(Status.PASS, "Text decoration is as expected");
    } else {
        testCase.log(Status.INFO, "ActualTextDecoration :- " + ActualTextDecoration);
        testCase.log(Status.INFO, "ExpectedTextDecoration :- " + ExpectedTextDecoration);
        testCase.log(Status.FAIL, "Text decoration is not as expected");
    }
    
//VERTICAL ALIGN
    
    
    String actualVerticalAlignment = TextPage.PlantText.getCssValue("vertical-align");
    System.out.println("Actual Vertical Alignment: " + actualVerticalAlignment);

    String expectedVerticalAlignment = "baseline";

    boolean verticalAlignment = true;
    testCase = extent.createTest("TEXT-VERTICAL-ALIGNMENT");
    try {
        Assert.assertEquals(actualVerticalAlignment, expectedVerticalAlignment);
    } catch (AssertionError e) {
        verticalAlignment = false;
    }

    if (verticalAlignment) {
        testCase.log(Status.INFO, "actualVerticalAlignment :- " + actualVerticalAlignment);
        testCase.log(Status.INFO, "expectedVerticalAlignment :- " + expectedVerticalAlignment);
        testCase.log(Status.PASS, "Text vertical Align is as expected");
       
    } else {
        testCase.log(Status.INFO, "actualVerticalAlignment :- " + actualVerticalAlignment);
        testCase.log(Status.INFO, "expectedVerticalAlignment :- " + expectedVerticalAlignment);
        testCase.log(Status.PASS, "Text vertical Align is as expected");
        
    }
    
  //TEXT INDENT  (To indent is to begin text with a blank space between it and the margin)
    
    	String ActualTextIndent = TextPage.PlantText.getCssValue("text-indent");
    	System.out.println("Text Indent :" + ActualTextIndent);

    	String ExpectedTextIndent = "0px";

    	boolean textindent = true;
    	testCase = extent.createTest("TEXT-INDENT");
    	try {
        Assert.assertEquals(ActualTextIndent, ExpectedTextIndent);

    	} catch (AssertionError e) {
        textindent = false;}
        if (textindent) {
            testCase.log(Status.INFO, "ActualTextIndent :- " + ActualTextIndent);
            testCase.log(Status.INFO, "ExpectedTextIndent :- " + ExpectedTextIndent);
            testCase.log(Status.PASS, "Text Indent is as expected");
           
        } else {
            testCase.log(Status.INFO, "ActualTextIndent :- " + ActualTextIndent);
            testCase.log(Status.INFO, "expectedVerticalAlignment :- " + expectedVerticalAlignment);
            testCase.log(Status.PASS, "Text Indent is as expected");
            
        }
//TEXT - ORIENTATION(text characters in a line. It only affects text in vertical mode)
        
        String ActualTextOrientation = TextPage.PlantText.getCssValue("text-orientation");
        System.out.println("Text Orientation :" + ActualTextOrientation);

        String ExpectedTextOrientation = "mixed";

        boolean textorientation = true;
        testCase = extent.createTest("TEXT-ORIENTATION");
        try {
            Assert.assertEquals(ActualTextOrientation, ExpectedTextOrientation);

        } catch (AssertionError e) {
            textorientation = false;
        }
        if (textorientation) {
            testCase.log(Status.INFO, "ActualTextOrientation :- " + ActualTextOrientation);
            testCase.log(Status.INFO, "ExpectedTextOrientation :- " + ExpectedTextOrientation);
            testCase.log(Status.PASS, "Text orientation is as expected");
        } else {
            testCase.log(Status.INFO, "ActualTextOrientation :- " + ActualTextOrientation);
            testCase.log(Status.INFO, "ExpectedTextOrientation :- " + ExpectedTextOrientation);
            testCase.log(Status.PASS, "Text orientation is as unxpected");
        }
//FONT STYLE
        String ActualFontStyle = TextPage.PlantText.getCssValue("font-style");
        System.out.println("Font Style :" + ActualFontStyle);

        String ExpectedFontStyle = "normal";

        boolean fontstyle = true;
        testCase = extent.createTest("FONT-STYLE");
        try {
        Assert.assertEquals(ActualFontStyle, ExpectedFontStyle);

        } catch (AssertionError e) {
        fontstyle = false;
        }
        if (fontstyle) {
        testCase.log(Status.INFO, "ActualFontStyle :- " + ActualFontStyle);
        testCase.log(Status.INFO, "ExpectedFontStyle :- " + ExpectedFontStyle);
        testCase.log(Status.PASS, "Font style is as expected");
        } else {
        testCase.log(Status.INFO, "ActualFontStyle :- " + ActualFontStyle);
        testCase.log(Status.INFO, "ExpectedFontStyle :- " + ExpectedFontStyle);
        testCase.log(Status.FAIL, "Font style is not as expected");
        }
}
}