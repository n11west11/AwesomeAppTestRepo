package com.qa.pageobjectmodel;

import com.qa.utils.TestUtils;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import io.cucumber.java.jv.Lan;

public class Settings extends LandingPage {
    TestUtils utils = new TestUtils();

    @AndroidFindBy(accessibility = "settings-title")
    @iOSXCUITFindBy(accessibility = "settings-title")
    private MobileElement title;

    @AndroidFindBy(xpath = "//*[@resource-id='Settings tab']")
    @iOSXCUITFindBy(accessibility = "Only show \"Bitcoin\" coins")
    private MobileElement bitcoinFilter;

    @AndroidFindBy(xpath = "//*[@resource-id='Settings tab']")
    @iOSXCUITFindBy(accessibility = "Only show winners")
    private MobileElement winnerFilter;

    @AndroidFindBy(xpath = "//*[@resource-id='Settings tab']")
    @iOSXCUITFindBy(accessibility = "Only show losers")
    private MobileElement loserFilter;

    public MobileElement title() {
        return Element(title);
    }

    public MobileElement getBitcoinFilter() {
        return Element(bitcoinFilter);
    }

    public MobileElement getWinnerFilter() {
        return Element(winnerFilter);
    }

    public MobileElement getLoserFilter() {
        return Element(loserFilter);
    }

}
