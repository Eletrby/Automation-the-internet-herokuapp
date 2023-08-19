package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class OnePage {
    WebDriver driver;
    WebDriverWait wait;
    public OnePage(WebDriver driver) {
        this.driver = driver;
    }
   private By startlink = By.xpath("//button[contains(text(),'Start')]");

    private By helloWorld = By.xpath("//div[@id=\"finish\"]/h4");

    public void startButtonClick (){
        driver.findElement(startlink).click();
    }
    public String getText (){
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(helloWorld)));
       String helloText = driver.findElement(helloWorld).getText();
        return helloText;
    }

}
