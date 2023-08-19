package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicLoadingPage {
    WebDriver driver;
    public DynamicLoadingPage(WebDriver driver) {
        this.driver = driver;

    }
    private By clickOnElementOne = By.xpath("//a[contains(text(),'Example 1')]");
    private By clickElementTow = By.xpath("//a[contains(text(),'Example 2: Element rendered after the fact')]");

    public OnePage clickOnElement1(){
        driver.findElement(clickOnElementOne).click();
        return new OnePage(driver);

    }
    public TwoPage clickOnElement (){
        driver.findElement(clickElementTow).click();
        return new TwoPage (driver);

    }
}
