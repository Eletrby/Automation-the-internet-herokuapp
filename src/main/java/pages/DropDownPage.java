package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownPage {
    WebDriver driver;
    Select select;
    public DropDownPage(WebDriver driver) {
        this.driver = driver;

    }
    private By selectOption = By.cssSelector("select[id=\"dropdown\"]");

    //public void setSelectOption (int index){
   // public void setSelectOption (String value){
    public void setSelectOption (String visibleText){
        select = new Select(driver.findElement(selectOption));
        //select.selectByIndex(index);
       // select.selectByValue(value);
        select.selectByVisibleText(visibleText);
        //driver.findElement(selectOption).click();
    }
}
