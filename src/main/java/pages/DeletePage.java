package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DeletePage {
    WebDriver driver;
    public DeletePage(WebDriver driver){
        this.driver=driver;

    }
    //Locators
    private By dleteButtonClick = By.cssSelector("button[onclick=\"addElement()\"]");
    private By deleteDisplay = By.cssSelector("button[class=\"added-manually\"]");

    //Actions
    public void setDleteButtonClick(){
        driver.findElement(dleteButtonClick).click();
    }
    public void setDeleteDisplay(){
        driver.findElement(deleteDisplay).isDisplayed();
    }



}
