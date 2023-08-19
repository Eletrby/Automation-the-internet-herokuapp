package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WYSIWYGEditorPage {
    WebDriver driver;
    String frame = "mce_0_ifr";
    private By field =By.id("tinymce");
    public WYSIWYGEditorPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clearText(){
        switchToFrame();
        driver.findElement(field).clear();
        seitxhToParent();
    }
    public void insertText(String text){
        switchToFrame();
        driver.findElement(field).sendKeys(text);
        seitxhToParent();
    }
    public String getText(){
        switchToFrame();
        String text = driver.findElement(field).getText();
        seitxhToParent();
        return text;
    }
    public void clickOnIndex(){
        driver.findElement(field).click();

    }
  private void switchToFrame(){
        driver.switchTo().frame(frame);
  }
  private void seitxhToParent(){
        driver.switchTo().parentFrame();
  }
}
