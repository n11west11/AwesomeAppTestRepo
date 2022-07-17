package com.qa.pageobjectmodel;


import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LandingPage extends BasePage {
    @AndroidFindBy(xpath = "//*[@resource-id='Dashboard tab']")
    @iOSXCUITFindBy(accessibility = "Dashboard tab")
    private MobileElement dashboardTab;

    @AndroidFindBy(xpath = "//*[@resource-id='Settings tab']")
    @iOSXCUITFindBy(accessibility = "Settings tab")
    private MobileElement settingsTab;

    public LandingPage() {
        super();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        // Give app some time to settle before running this
        wait.until(ExpectedConditions.elementToBeClickable(dashboardTab));
    }

    public Dashboard getDashboardPage() {
        click(dashboardTab);
        return new Dashboard();
    }

    public Settings getSettingsPage() {
        click(settingsTab);
        return new Settings();
    }

    public UserMenu getUserMenu() throws InterruptedException {
        Dimension size = driver.manage().window().getSize();
        int ystart, yend;
        ystart = yend = (int) (size.height * 0.5);
        int xend = (int) (size.width *0.5);
        swipe(0, ystart, xend, yend, 500);
        return new UserMenu();
    }
}
