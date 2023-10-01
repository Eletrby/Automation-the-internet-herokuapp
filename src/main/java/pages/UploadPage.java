package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class    UploadPage {
    WebDriver driver;
    public UploadPage(WebDriver driver) {
        this.driver=driver;
    }

    //Locators
    private By chooseFileButton = By.cssSelector("input[id=\"file-upload\"]");
    private By clickUploadButton = By.cssSelector("input[id=\"file-submit\"]");

    //Actions


    public void insertFileLink(String FileLink){
        driver.findElement(chooseFileButton).sendKeys(FileLink);

    }
  public void setClickUploadButtonButton (){
        driver.findElement(clickUploadButton).click();
  }

}
