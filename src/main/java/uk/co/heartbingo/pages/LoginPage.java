package uk.co.heartbingo.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import uk.co.heartbingo.utility.Utility;

public class LoginPage extends Utility {

    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    @CacheLookup
    @FindBy(css = ".buttons__login_bar--create-account.bvs-button.is-primary")
    WebElement signUpLink;

    @CacheLookup
    @FindBy(id = "first_name")
    WebElement firstName;

    @CacheLookup
    @FindBy(id = "last_name")
    WebElement lastName;

    @CacheLookup
    @FindBy(css = "button[type='regpath-button-next']")
    WebElement continueButton;

    @CacheLookup
    @FindBy(xpath = "//button[@id='save']/span/div/span")
    WebElement acceptAll;

    public void clickOnSignUp() {
        log.info("Click on signup button " + signUpLink.toString());
        clickOnElement(signUpLink);
    }

    public void enterFirstName(String name){
        log.info("Enter first name " + firstName.toString());
        sendTextToElement(firstName, name);
    }

    public void enterLastName(String name){
        log.info("Enter last name " + lastName.toString());
        sendTextToElement(lastName, name);
    }

    public void clickOnContinueButton(){
        log.info("Click on continue button " + continueButton.toString());
        clickOnElement(continueButton);
    }

    public void acceptCookies() {
        driver.switchTo().frame("gdpr-consent-notice");
        log.info("acceptCookies " + acceptAll.toString());
        clickOnElement(acceptAll);
    }


}
