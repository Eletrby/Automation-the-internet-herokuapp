package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ScureAreaPage {
    WebDriver driver;
    public ScureAreaPage(WebDriver driver) {
        this.driver=driver;

    }
  //Assertion

    //Locator
    private By validationMessageToLogin = By.cssSelector("div[id=\"flash\"]");

    //Actions
    public String getValidationMessageToLogin(){
       String loginText =  driver.findElement(validationMessageToLogin).getText();
       return loginText;

    }



}
