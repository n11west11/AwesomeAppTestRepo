package com.qa.pageobjectmodel;

import com.qa.utils.TestUtils;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UserMenu extends BasePage{

    @AndroidFindBy(xpath = "//*[@resource-id='sidemenuButton']")
    @iOSXCUITFindBy(accessibility = "Get the ultimate answer")
    private MobileElement ultimateAnswerButton;

    public MobileElement getUltimateAnswerButton(){

        return Element(ultimateAnswerButton);
    }

}
