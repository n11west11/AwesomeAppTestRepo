package com.qa.pageobjectmodel;

import com.qa.utils.TestUtils;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class Dashboard extends LandingPage{

    TestUtils utils = new TestUtils();

    @AndroidFindBy(xpath = "//*[@resource-id='dashboard-title']")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther[`label == \"dashboard-title\"`]")
    private MobileElement title;

    public MobileElement title() {
        return Element(title);
    }
    public boolean isCurrentPage() {
        return title().isDisplayed();
    }
}
