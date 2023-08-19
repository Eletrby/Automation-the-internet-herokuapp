package pages;

import io.opentelemetry.api.trace.StatusCode;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StatusCodePage {
    WebDriver driver;
    public StatusCodePage(WebDriver driver) {
        this.driver = driver;
    }

    //Locator
    private By click200Status = By.cssSelector("a[href=\"status_codes/200\"]");

    //Actions
  public StatusCode200 statusclickButton (){
      driver.findElement(click200Status).click();
      return new StatusCode200(driver);
  }


}
