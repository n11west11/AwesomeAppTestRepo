package com.qa.pageobjectmodel;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class WidgetView extends BasePage{
    @AndroidFindBy(xpath = "//*[@resource-id='android:id/alertTitle']")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeAlert")
    private MobileElement answerValue;


    public MobileElement getAnswerValue() {
        return Element(answerValue);
    }

}
