package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StatusCode200 {
    WebDriver driver;
    public StatusCode200(WebDriver driver) {
        this.driver = driver;
    }
    //Locators
    private By validationMessageToStatusCode = By.cssSelector("div[class=\"example\"]");

    public String getValditionMessageToStatusCode(){
        String StatusText = driver.findElement(validationMessageToStatusCode).getText();
        return StatusText;
    }

}
