package com.virgingames.pages;

import com.virgingames.propertyreader.PropertyReader;
import com.virgingames.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.List;

public class Homepage extends Utility {

    private static final Logger log = LogManager.getLogger(Homepage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//div[@class='StyledNavigationMenuWrapper-sc-v46bks-0 jLmDjy']/ul/li")
   List<WebElement> headerTabs;

    @CacheLookup
    @FindBy(linkText = "Join Now")
    WebElement  joinNowTab;

    @CacheLookup
    @FindBy(xpath = "(//label[@class='dialog_button'])[2]")
    WebElement acceptAllCookies;

   

    public void clickOnHeaderTab(String option){
        for (WebElement op: headerTabs) {

            if(op.getText().equalsIgnoreCase(option)){
                op.click();
                log.info("CLicking on header tab : " + headerTabs.toString());
                break;
            }
        }
    }
    public void clickOnAcceptAllCookies() {
        clickOnElement(acceptAllCookies);
        log.info("Accepting cookies " + acceptAllCookies.toString());
    }
    public void getCurrentUrl(){
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = PropertyReader.getInstance().getProperty("baseUrl");
        Assert.assertEquals(actualUrl, expectedUrl);
        log.info("verifying Homepage Url");

    }







}
