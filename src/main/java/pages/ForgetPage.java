package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgetPage {
    WebDriver driver;
    public ForgetPage(WebDriver driver) {

        this.driver=driver;
    }
    //Locators
    private By insertEmail = By.cssSelector("input[id=\"email\"]");

    private By clickSubmitButton = By.cssSelector("button[id=\"form_submit\"]");

    //Actions
    public void emailName (String email){
        driver.findElement(insertEmail).sendKeys(email);
    }
    public ForgetPage2 clickButton (){
        driver.findElement(clickSubmitButton).click();
        return new ForgetPage2(driver);
    }

}
