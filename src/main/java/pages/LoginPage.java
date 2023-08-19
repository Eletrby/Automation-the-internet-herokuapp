package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;
    public LoginPage(WebDriver driver) {
        this.driver=driver;
    }
    //Locators
    private By userNameField = By.cssSelector("input[id=\"username\"]");
    private By passwordField = By.cssSelector("input[id=\"password\"]");
    private By loginButton = By.xpath("//button[@type=\"submit\"]");

    //Actions
    public void insertUserName(String userName){
        driver.findElement(userNameField).sendKeys(userName);
    }
    public void insertPassword(String password){
        driver.findElement(passwordField).sendKeys(password);
    }
    public ScureAreaPage LoginButtonClick(){
        driver.findElement(loginButton).click();
        return new ScureAreaPage (driver);
    }


}
