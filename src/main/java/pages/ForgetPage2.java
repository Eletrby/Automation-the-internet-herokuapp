package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgetPage2 {
    WebDriver driver;
    public ForgetPage2(WebDriver driver) {
        this.driver=driver;
    }
    //Locator
    private By validationMessageToForget = By.xpath("/html/body/h1");

    public String getValditionMessageToForget(){
        String forgetText = driver.findElement(validationMessageToForget).getText();
        return forgetText;
    }
}
