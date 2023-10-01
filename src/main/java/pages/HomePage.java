package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;
    public HomePage(WebDriver driver){
        this.driver=driver;
    }
    private By formAuthanticationLink = By.cssSelector("a[href=\"/login\"]");

    private By checkBoxLink = By.cssSelector("a[href=\"/checkboxes\"]");

    private By deleteLink = By.cssSelector("a[href=\"/add_remove_elements/\"]");

    private By forgetLink = By.cssSelector("a[href=\"/forgot_password\"]");

    private By statusCodeLink = By.cssSelector("a[href=\"/status_codes\"]");

    private By uploadLink = By.cssSelector("a[href=\"/upload\"]");

    private By dynamicLoadinLink = By.cssSelector("a[href=\"/dynamic_loading\"]");

    private By dropDownLink = By.cssSelector("a[href=\"/dropdown\"]");

    private By alertPage = By.cssSelector("a[href=\"/javascript_alerts\"]");

    private By WYSIWYGEditorLink = By.cssSelector("a[href=\"/tinymce\"]");

    private void clickOnLink(By ByLinkText){
        driver.findElement(ByLinkText).click();
    }



        public LoginPage formAuthanticationClick (){
           clickOnLink(formAuthanticationLink);
            return new LoginPage(driver);

        }

    public CheckBoxPage checkBoxClick (){
        clickOnLink(checkBoxLink);
        return new CheckBoxPage(driver);
    }

    public DeletePage deleteClick (){
        clickOnLink(deleteLink);
        return new DeletePage(driver);
    }

    public ForgetPage forgetClick(){
        clickOnLink(forgetLink);
        return new ForgetPage(driver);
    }

    public StatusCodePage statusCodeClick (){
       clickOnLink(statusCodeLink);
        return new StatusCodePage (driver);
    }

    public UploadPage uploadClick(){
        clickOnLink(uploadLink);
        return new UploadPage (driver);
    }

    public DynamicLoadingPage dynamicLoadingClick(){
       clickOnLink(dynamicLoadinLink);
        return new DynamicLoadingPage (driver);
    }
    public DropDownPage dropDownClick (){
        clickOnLink(dropDownLink);
        return new DropDownPage (driver);
    }
    public AlertPage  alertLink(){
        clickOnLink(alertPage);
        return new AlertPage (driver);
    }
    public WYSIWYGEditorPage WYSIWYGEditorPageClickOn(){
        clickOnLink(WYSIWYGEditorLink);
        return new WYSIWYGEditorPage (driver);
    }
}
