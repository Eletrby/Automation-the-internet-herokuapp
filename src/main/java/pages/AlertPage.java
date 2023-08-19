package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertPage {
    WebDriver driver;
    public AlertPage(WebDriver driver) {
        this.driver = driver;
    }
    private By javaScriptAlert = By.cssSelector("button[onclick=\"jsAlert()\"]");
    private By valdiationMessage = By.id("result");
    private By jSConfirmation = By.cssSelector("Button[onclick=\"jsConfirm()\"]");
    private By jSPromp = By.cssSelector("Button[onclick=\"jsPrompt()\"]");




  public void clickJavaAlertButton(){
     driver.findElement(javaScriptAlert).click();
}
public void AccptAlert (){
      driver.switchTo().alert().accept();

}
public void dissmissAlert(){
    driver.switchTo().alert().dismiss();
}
public String getValditionMessage(){
      return driver.findElement(valdiationMessage).getText();

}
public void clickOnjSConfirmation(){
      driver.findElement(jSConfirmation).click();


}
//public void insertOnAlert(String text){
//      driver.switchTo().alert().sendKeys(text);
//}
//public void clickonPromp(){
//      driver.findElement(jSPromp).click();
//}




    }


