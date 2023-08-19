package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckBoxPage {
    WebDriver driver;
    public CheckBoxPage(WebDriver driver){
        this.driver=driver;

    }
    //Locators
    private By checkBoxClick = By.cssSelector("input[type=\"checkbox\"]");

    //Action
    public void setCheckBoxClick(){
        driver.findElement(checkBoxClick).click();
    }

}
